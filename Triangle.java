package lab3;

import java.awt.Color;

class Triangle extends Shape implements Function {

	public Triangle(double side, Color color) {
		super(side, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*3;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		 return side * side / 2;
	}

	}