package com.vzionsys.ssm.controller.converter;


import org.springframework.core.convert.converter.Converter;

/**
 * 
 * <p>Title: CustomDateConverter</p>
 * <p>Description: NULl转换器</p>
 * <p>Company: www.vzionsys.com</p> 
 * @author  刘政
 * @date    2015-12-2下午5:57:50
 * @version 1.0
 */
public class CustomNullConverter implements Converter<Object,String>{

/*	@Override
	public Date convert(String source) {
		
		//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			//转成直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果参数绑定失败返回null
		return null;
	}
*/
	@Override
	public String convert(Object arg0) {
		// TODO Auto-generated method stub
		if(arg0==null)
			return "";
		else return (String) arg0;
	}

}
