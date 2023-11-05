package com.autowired.demo.crackIT;

import com.autowired.demo.crackIT.configuration.CrackIT;
import com.autowired.demo.crackIT.configuration.CrackIT1;
import com.autowired.demo.crackIT.configuration.CrackITBeans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CrackItApplication {


	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CrackITBeans.class);
		CrackIT crackIT =  context.getBean("crackIT",CrackIT.class);
		System.out.println(crackIT.getId());
		System.out.println(crackIT.getName());
		System.out.println(crackIT.getJavaPlayList().getPlayListName());

		CrackIT1 crackIT1 =  context.getBean("crackIT1", CrackIT1.class);
		System.out.println(crackIT1.getId());
		System.out.println(crackIT1.getName());
		System.out.println(crackIT1.getJavaPlayList().getPlayListName());


	}

}
