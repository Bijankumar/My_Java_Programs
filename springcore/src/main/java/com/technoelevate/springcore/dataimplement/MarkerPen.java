package com.technoelevate.springcore.dataimplement;

import com.technoelevate.springcore.data.Pen;

public class MarkerPen implements Pen {

	@Override
	public void write() {
		System.out.println("Write with MarkerPen..!");
	}

}
