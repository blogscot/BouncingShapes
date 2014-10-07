package com.diamond.iain.shapes;
import java.awt.Graphics;
import java.awt.Polygon;


public class Triangle extends Shape{
	final int numberSides = 3;
	final int[] xpoints = new int[numberSides];
	final int[] ypoints = new int[numberSides];
	final int npoints = numberSides;

	public Triangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g){
		int pointNum = 0;

		xpoints[pointNum] = x;
		ypoints[pointNum++] = y;
		xpoints[pointNum] = x+width;
		ypoints[pointNum++] = y;
		xpoints[pointNum] = x+width/2;
		ypoints[pointNum] = y+height;
		
		Polygon p = new Polygon(xpoints, ypoints, npoints);
		g.fillPolygon(p);
	}
}
