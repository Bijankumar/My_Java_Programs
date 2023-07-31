package com.technoelevate.springcore.dataimplement;

import com.technoelevate.springcore.data.Pen;

public class BallPen implements Pen {

	@Override
	public void write() {
		System.out.println("Write with BallPen..!");
	}

}
