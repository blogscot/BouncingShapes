package com.diamond.iain.shapes;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class MainProgram extends JFrame {
	private static final long serialVersionUID = 1L;

	ShapePanel shapePanel;

	public static void main(String[] args) {
		MainProgram mp = new MainProgram();

		mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp.init();
		mp.setSize(800, 400);
		mp.setVisible(true);
	}

	private void init() {

		shapePanel = new ShapePanel(this);
		Circle circle = new Circle(40, 40, 150);
		shapePanel.addShape(circle);

		Square square = new Square(140, 40, 70);
		shapePanel.addShape(square);

		Triangle triangle = new Triangle(40, 140, 70, 70);
		shapePanel.addShape(triangle);
		
		Rectangle rectangle = new Rectangle(140, 140, 140, 70);
		shapePanel.addShape(rectangle);

		Container pane = this.getContentPane();
		pane.add(shapePanel, BorderLayout.CENTER);
	}
}
