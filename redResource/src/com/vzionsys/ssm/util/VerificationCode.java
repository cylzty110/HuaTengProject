package com.vzionsys.ssm.util;

import java.util.Random;
import java.util.Scanner;

public class VerificationCode {
	 public String verificationCode()  
	    {  
	        String str = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";  
	        String str2[] = str.split(",");//将字符串以,分割  
	        int sum = 0;//计数器  
//	        for (int i=0; i<str2.length; ++i)  
//	        {  
//	            ++sum;  
//	            if (0 == sum % 10)  
//	            {  
//	                System.out.println("");//没十个数据换行  
//	            }  
//	            System.out.print(str2[i] + " ");  
//	        }  
//	        System.out.println("");  
	        Random rand = new Random();//创建Random类的对象rand  
	        int index = 0;  
	        String randStr = "";//创建内容为空字符串对象randStr  
//	        Scanner scan = new Scanner(System.in);//创建Scanner类的对象  
//	        while (!scan.next().equals("#"))//判断从键盘输入的是否是字符#  
//	        {  
//	            randStr = "";//清空字符串对象randStr中的值  
//	            for (int i=0; i<4; ++i)  
//	            {  
//	                index = rand.nextInt(str2.length-1);//在0到str2.length-1生成一个伪随机数赋值给index  
//	                randStr += str2[index];//将对应索引的数组与randStr的变量值相连接  
//	            }  
//	            System.out.println("验证码：" + randStr);//输出所求的验证码的值  
//	        }
	        for (int i=0; i<4; ++i)  
            {  
                index = rand.nextInt(str2.length-1);//在0到str2.length-1生成一个伪随机数赋值给index  
                randStr += str2[index];//将对应索引的数组与randStr的变量值相连接  
            }  
//            System.out.println("验证码：" + randStr);//输出所求的验证码的值 
			return randStr;  
	    }  
}
