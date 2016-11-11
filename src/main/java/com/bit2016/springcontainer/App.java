package com.bit2016.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
	
    public static void main( String[] args ) {
    	// testBeanFactory();
    	testApplicationContext();
    }
    
    public static void testBeanFactory() {
    	// annotation(@)설정인 경우에는 id가 자동으로 만들어짐 User1 -> user1
    	BeanFactory bf1 = new XmlBeanFactory( new ClassPathResource( "config/applicationContext2.xml" ) );
    	
    	User1 user = (User1)bf1.getBean("user1");
    	System.out.println(user.getName());
    	
    	// bean설정인 경우에는 id를 주지 않으면 에러!!
    	// 반드시 타입으로 가져와야 함
    	BeanFactory bf2 = new XmlBeanFactory( new ClassPathResource( "config/applicationContext.xml" ) );
    	
    	user = (User1)bf2.getBean(User1.class);
    	System.out.println(user.getName());
    }
    
    public static void testApplicationContext() {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    	
    	User1 user1 = ac.getBean(User1.class);
    	System.out.println(user1.getName());
    	
    	// 오류 비설정은 id 또는 name 설정을 해야 함
    	// user1 = (User1)ac.getBean("user1");
    	// System.out.println(user1.getName());
    	
    	// id로 가져오기
    	User user = (User)ac.getBean("user");
    	System.out.println(user.getName());
    	// name으로 가져오기
    	user = (User)ac.getBean("usr");
    	System.out.println(user.getName());
    	
    	// 오류: 같은 타입의 bean이 존재하는 경우 타입으로 빈을 가져올 수 없다.
    	// ac.getBean(User.class);
    	
    	User user2 = (User)ac.getBean("usr2");
    	System.out.println(user2);

    	User user3 = (User)ac.getBean("usr3");
    	System.out.println(user3);
    	
    	User user4 = (User)ac.getBean("usr4");
    	System.out.println(user4);
    }
}
