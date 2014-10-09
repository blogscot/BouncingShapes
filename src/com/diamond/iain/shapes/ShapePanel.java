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
	private List<Shape> shapes;

	public ShapePanel(MainProgram mp) {
		shapes = new ArrayList<>();

		t = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shapes.stream().forEach(s -> s.move(mp.getWidth(), mp.getHeight()));
				repaint();
			}
		});
		t.start();
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
		repaint();
	}

	public void removeShape(Shape s) {
		if (shapes.contains(s)) {
			shapes.remove(s);
			repaint();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		shapes.stream().forEach(s -> {
			g.setColor(Color.RED);
			if (s instanceof Flashable) {
				((Flashable) s).flash(g);
			} else {
				s.draw(g);
			}
		});
	}
}
