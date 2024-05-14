package com.excel.spring.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excel.spring.Student;

public class MainRunner {
public static void main(String[] args)
{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/spring/collections/config.xml");
    Employee employee = (Employee)context.getBean("employee");

	System.err.println(employee.getName());
	System.err.println(employee.getPhones());
	System.err.println(employee.getNominees());
	System.err.println(employee.getSkills());

  }
}
