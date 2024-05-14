package com.excel.spring.autowire.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excel.spring.autowire.Employee;

public class MainRunner {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/excel/spring/autowire/annotation/config.xml");
	    Employee employee = context.getBean("employee",Employee.class);
      System.out.println(employee);
	}
}
