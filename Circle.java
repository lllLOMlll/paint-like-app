package lab3;

import java.awt.Color;


class Circle extends Shape implements Function {

	public Circle(double radius, Color color) {
		super(radius, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimeter() {
		 return 2 * Math.PI * super.getSide();

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(super.getSide(), 2);
	}


	}