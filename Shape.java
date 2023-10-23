package lab3;

import java.awt.Color;

abstract class Shape {
	protected double side;
	protected Color color;
	
	
	
	
	public Shape(double side, Color color) {
		super();
		this.side = side;
		this.color = color;
		
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", side=" + side + ", getColor()=" + getColor() + ", getSide()=" + getSide()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	
	}