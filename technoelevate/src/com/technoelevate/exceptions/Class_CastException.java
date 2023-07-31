package com.technoelevate.exceptions;
class Sample{
	int x=20;
}
class Demo extends Sample{
	int y=10;
}
public class Class_CastException {
	public static void main(String[] args) {
//without upcast if we do downcast we'll get exception
		Demo demo = (Demo) new Sample();//Downcast 
			System.out.println(demo.x+""+demo.y);//throw exception
	}
}
