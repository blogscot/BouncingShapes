package com.diamond.iain.shapes;

import java.awt.Graphics;

public class Square extends Shape implements Flashable {

	private int count = 0;
	private boolean isVisible = true;

	public Square(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.width = length;
		this.height = length;
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
