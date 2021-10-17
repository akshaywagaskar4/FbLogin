package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties p;
	 public ReadConfig() {
		 File f=new File("E:\\Velocity\\Eclipse_Workspace_2021_03\\FB\\Configuration\\Config.properties");
	
	 try {
		 FileInputStream input= new FileInputStream(f);
		 p=new Properties();
		 p.load(input);
	 }catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	 }
	 public String getKey() {
		 String ChromeKey=p.getProperty("key");
		 return ChromeKey;
	 }
	 public String getValue() {
		 String ChromeValue =p.getProperty("value");
		 return ChromeValue;
	 }
	 public String getUrl() {
		 String url=p.getProperty("baseURL");
		 return url;
	 }
	 public String getPassword() {
		 String password=p.getProperty("password");
		 return password;
	 }
	 public String getUsername() {
		 String username = p.getProperty("username");
		 return username;
	 }

}
