package com.diamond.iain.shapes;

import java.awt.Graphics;

public class Rectangle extends Shape implements Flashable {
	private int count = 5;
	private boolean isVisible = true;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void flash(Graphics g) {
		count++;
		if (count % 10 == 0) {
			isVisible = !isVisible;
		}

		if (isVisible) {
			g.fillRect(x, y, width, height);
		}
	}
}
