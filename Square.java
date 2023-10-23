package lab3;

import java.awt.Color;

import lab3.Function;
import lab3.Shape;

class Square extends Shape implements Function {



	public Square(double side, Color color) {
		super(side, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}



	}

