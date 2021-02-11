package com.shape;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon p=new Square();
		p.calcArea(20);
		p.calcPeri(25);
		Polygon p1=new Rectangle();
		p1.calcArea(40, 50);
		p1.calcPeri(10, 20);
		
	}

}
