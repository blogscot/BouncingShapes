package com.diamond.iain.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ShapePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	Timer t;
	private List<Shape> myShapes;

	public ShapePanel(MainProgram mp) {
		myShapes = new ArrayList<Shape>();

		t = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Shape s : myShapes) {
					s.move(mp.getWidth(), mp.getHeight());
				}
				repaint();
			}
		});
		t.start();
	}

	public void addShape(Shape shape) {
		myShapes.add(shape);
		repaint();
	}

	public void removeShape(Shape s) {
		if (myShapes.contains(s)) {
			myShapes.remove(s);
			repaint();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		for (Shape s : myShapes) {
			g.setColor(Color.red);
			if (s instanceof Flashable) {
				((Flashable) s).flash(g);
			} else {
				s.draw(g);
			}
		}
	}
}
