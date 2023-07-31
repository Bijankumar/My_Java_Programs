package com.technoelevate.springcore.datarun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.springcore.data.Pen;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
		Pen pen = (Pen) applicationContext.getBean("pen");
		pen.write();
	}
}
