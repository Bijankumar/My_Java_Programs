package com.technoelevate.springcoretest.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.springcoretest.data.Tree;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
		Tree tree = (Tree) applicationContext.getBean("tree");
		tree.name();
	}
}
