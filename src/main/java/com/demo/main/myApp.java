package com.demo.main;
//import java.util.List;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//import com.demo.controller.MyControllerDAO;
//import com.demo.model.UserInfo;
//
//public class myApp {
//public static void main(String[] args) {
//	ApplicationContext appContext =new FileSystemXmlApplicationContext("C:\\Users\\vs295\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\basicwebapp1\\src\\main\\webapp\\WEB-INF\\appContext.xml");
//	MyControllerDAO MyControllerDAO =appContext.getBean("MyControllerDAO",MyControllerDAO.class);
//	
//	List<UserInfo> myUserInfo=MyControllerDAO.getData();
//	for(UserInfo ui:myUserInfo) {
//		System.out.println(ui.getUsername());
//		System.out.println(ui.getPassword());
//	}
//	
//}
//}



import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.demo.model.UsersDAO;

public class myApp {
	
	public static String main(String[] args) {
		ApplicationContext appContext =new FileSystemXmlApplicationContext("C:\\Users\\sr485\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\newApp\\src\\main\\webapp\\WEB-INF\\appContext.xml");
		UsersDAO myUIDAO = appContext.getBean("UsersDAO",UsersDAO.class);
		
		String user=args[0];
		String pwd=args[1];
		System.out.println("calling Validate user method from myApp to UIDAO");
		String res=myUIDAO.validateuser(user,pwd);
		System.out.println("Received result From UIDAO to MyApp");
		return res;
}
}