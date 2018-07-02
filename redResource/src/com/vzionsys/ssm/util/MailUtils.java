package com.vzionsys.ssm.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class MailUtils {

	/**
	 * 邮件服务器地址
	 */
	private String host = "smtp.126.com";
	/**
	 * 发件人用户名
	 */
	private String userName = "ab@163.com";
	/**
	 * 发件人密码
	 */
	private String password = "123456";
	/**
	 * 发件人昵称
	 */
	private String nick = "";
	/**
	 * 是否需要权限验证
	 */
	private boolean auth = true;

	/**
	 * 是否需要代理
	 */
	private boolean isProxy = false;
	/**
	 * 代理服务器地址
	 */
	private String socksProxyHost;
	/**
	 * 代理服务器端口
	 */
	private String socksProxyPort;

	private MimeMessage message;

	/**
	 * 构造函数一（使用默认发送设置）
	 */
	public MailUtils() {

	}

	/**
	 * 构造函数二（指定发送设置）
	 * 
	 * @param host
	 * @param userName
	 * @param password
	 */
	public MailUtils(String host, String userName, String password) {
		this.host = host;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * 构造函数三（指定发送设置）
	 * 
	 * @param host
	 * @param userName
	 * @param password
	 * @param nick
	 * @param auth
	 */
	public MailUtils(String host, String userName, String password,
			String nick, boolean auth) {
		this.host = host;
		this.userName = userName;
		this.password = password;
		this.nick = nick;
		this.auth = auth;
	}

	/**
	 * 设置邮件代理服务器
	 * 
	 * @param socksProxyHost
	 * @param socksProxyPort
	 */
	public void setProxy(String socksProxyHost, String socksProxyPort) {
		this.isProxy = true;
		this.socksProxyHost = socksProxyHost;
		this.socksProxyPort = socksProxyPort;
	}

	/**
	 * 发送邮件(构造方法一)
	 * 
	 * @param to
	 * @param title
	 * @param content
	 * @return
	 */
	public boolean send(String[] to, String title, String content) {
		return send(to, title, content, null);
	}

	/**
	 * 发送邮件(构造方法二)
	 * 
	 * @param to
	 * @param title
	 * @param content
	 * @param filePath
	 * @return
	 */
	public boolean send(String[] to, String title, String content,
			String[] filePath) {
		boolean result = false;

		try {
			// 邮件发送设置（邮件服务器、发件人）
			setMailInfo();

			// 设置邮件标题
			message.setSubject(title);

			// 设置邮件内容体
			message.setContent(getContent(content, filePath));

			// 设置接收者(多个接收者)
			Address[] address = new Address[to.length];
			for (int i = 0; i < to.length; i++) {
				address[i] = new InternetAddress(to[i]);
			}
			/*
			 * 正常（Message.RecipientType.TO） 抄送（Message.RecipientType.CC）
			 * 密送（Message.RecipientType.BCC）
			 */
			message.addRecipients(Message.RecipientType.TO, address);

			// 发送邮件
			Transport.send(message);

			result = true;
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * 邮件发送设置（邮件服务器、发件人）
	 * 
	 * @throws AddressException
	 * @throws MessagingException
	 */
	private void setMailInfo() throws AddressException, MessagingException {
		Properties props = new Properties();
		if (this.isProxy) {
			props.setProperty("proxySet", "true");
			props.setProperty("socksProxyHost", this.socksProxyHost);
			props.setProperty("socksProxyPort", this.socksProxyPort);
		}

		// 邮件服务器地址
		props.put("mail.smtp.host", this.host);
		// 发件人账号
		props.put("mail.user", this.userName);
		// 发件人密码
		props.put("mail.password", this.password);
		// 是否需要身份验证
		props.put("mail.smtp.auth", auth ? "true" : "false");

		// 创建Session实例
		Session session = null;
		if (auth) {
			// 构建授权信息，进行SMTP身份验证
			Authenticator authenticator = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, password);
				}
			};
			session = Session.getDefaultInstance(props, authenticator);
		} else {
			session = Session.getDefaultInstance(props);
		}

		// 创建邮件消息
		message = new MimeMessage(session);

		// 设置发件人
		if (nick != null && !nick.equals("")) { // 如果昵称不为空，则设置昵称
			// 设置昵称
			try {
				nick = MimeUtility.encodeText(nick);
				message.setFrom(new InternetAddress(nick + " <" + this.userName
						+ ">"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		} else {
			// 设置发件人
			message.setFrom(new InternetAddress(this.userName));
		}

		// 设置发送日期
		message.setSentDate(new Date());
	}

	/**
	 * 构造邮件内容体
	 * 
	 * @param content
	 * @param filePath
	 * @return
	 * @throws MessagingException
	 */
	private MimeMultipart getContent(String content, String[] filePath)
			throws MessagingException {
		// 构造邮件内容体
		MimeMultipart mmp = new MimeMultipart();
		// 设置邮件的内容体
		BodyPart bodyPart = new MimeBodyPart();
		bodyPart.setContent(
				"<meta http-equiv=Content-Type content=text/html; charset=UTF-8>"
						+ content, "text/html;charset=UTF-8");
		mmp.addBodyPart(bodyPart);

		// 添加多个附件
		if (filePath != null) {
			FileDataSource fileds;
			File file;
			for (int i = 0; i < filePath.length; i++) {
				bodyPart = new MimeBodyPart();
				file = new File(filePath[i]);
				if (!file.exists()) {
					continue;
				}
				fileds = new FileDataSource(file);
				// 添加附件
				bodyPart.setDataHandler(new DataHandler(fileds));
				// 设置附件名称
				bodyPart.setFileName(fileds.getName());
				// 把附件添加到 MimeMultipart
				mmp.addBodyPart(bodyPart);
			}
		}

		return mmp;
	}

	/**
	 * 基本的测试（邮件设置配置死的，实用过程中可以从配置文件中读取）
	 */
	public static void test1() {
		/****************** | 发送设置 | *****************/
		// 实例化邮件发送工具类（有三个构造函数）
		MailUtils mu = new MailUtils();

		/****************** | 邮件内容设置 | *****************/
		// 1、设置收件人，必填项（数组，支持过个收件人）
		String[] to = { "aa@163.com", "bb@163.com" };
		// 2、设置邮件标题，必填项
		String title = "这是邮件标题";
		// 3、设置邮件内容，必填项(支持HTML格式与普通文本)
		String content = "这是邮件内容";
		// 4、发送邮件
		if (mu.send(to, title, content)) {
			System.out.println("发送成功~");
		} else {
			System.out.println("发送失败~");
		}
	}

	/**
	 * 基本的测试（邮件设置配置死的，实用过程中可以从配置文件中读取） 包含附件
	 */
	public static void test2() {
		/****************** | 发送设置 | *****************/
		// 实例化邮件发送工具类（有三个构造函数）
		MailUtils mu = new MailUtils();

		/****************** | 邮件内容设置 | *****************/
		// 1、设置收件人，必填项（数组，支持过个收件人）
		String[] to = { "790512128@qq.com" };
		// 2、设置邮件标题，必填项
		String title = "这是邮件标题";
		// 3、设置邮件内容，必填项(支持HTML格式与普通文本)
		String content = "这是邮件内容";
		// 4、设置附件，选填项（数组，支持多附件）
		String[] filePath = { "/Users/qmxl/1.jpg", "/Users/qmxl/2.jpg" };
		// 5、发送邮件
		if (mu.send(to, title, content, filePath)) {
			System.out.println("发送成功~");
		} else {
			System.out.println("发送失败~");
		}
	}

	/**
	 * 完整的邮件发送设置方法
	 */
	public static void test3() {
		/****************** | 发送设置 | *****************/
		// 邮件服务器地址
		String host = "smtp.163.com";
		// 发件人用户名
		String userName = "18649758872@163.com";
		// 发件人密码
		String password = "wojianwei";
		// 发件人昵称
		String nick = "XXX共享信息平台";
		// 是否需要权限验证
		boolean auth = true;
		// 实例化邮件发送工具类（有三个构造函数）
		MailUtils mu = new MailUtils(host, userName, password, nick, auth);

		/****************** | 设置代理 | *****************/
		// 代理服务器地址
		String socksProxyHost = "192.168.168.168";
		// 代理服务器端口
		String socksProxyPort = "1080";
		mu.setProxy(socksProxyHost, socksProxyPort);

		/****************** | 邮件内容设置 | *****************/
		// 1、设置收件人，必填项（数组，支持过个收件人）
		String[] to = { "306376383@qq.com" };
		// 2、设置邮件标题，必填项
		String title = "这是邮件标题";
		// 3、设置邮件内容，必填项(支持HTML格式与普通文本)
		String content = "这是邮件内容";
		// 4、设置附件，选填项（数组，支持多附件）
		String[] filePath = { "/Users/qmxl/1.jpg", "/Users/qmxl/2.jpg" };
		// 5、发送邮件
		if (mu.send(to, title, content, filePath)) {
			System.out.println("发送成功~");
		} else {
			System.out.println("发送失败~");
		}
	}

	/**
	 * 测试发送邮件
	 * 
	 * @param args
	 */
//	public static void main(String[] args) {
//		// MailUtils.test1();
//		// MailUtils.test2();
//		//MailUtils.test3();
//
//	}

	public static boolean sendmail(String username, String pwd, String nick,
			String[] to, String title, String content) {
		String host = "smtp.163.com";
		boolean auth = true;
		// 实例化邮件发送工具类（有三个构造函数）
		MailUtils mu = new MailUtils(host, username, pwd, nick, auth);

		/****************** | 设置代理 | *****************/
		// 代理服务器地址
		String socksProxyHost = "192.168.168.168";
		// 代理服务器端口
		String socksProxyPort = "1080";
		mu.setProxy(socksProxyHost, socksProxyPort);
		/****************** | 邮件内容设置 | *****************/

		

		if (mu.send(to, title, content)) {
			System.out.println("发送成功~");
			return true;
		} else {
			System.out.println("发送失败~");
			return false;
		}

	}
}
