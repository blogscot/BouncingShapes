import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;

public class MainProgram extends JFrame {
	private static final long serialVersionUID = 1L;

	ShapePanel shapePanel;
	Random rnd = new Random();

	public static void main(String[] args) {
		MainProgram mp = new MainProgram();

		mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp.init();
		mp.setSize(800, 400);
		mp.setVisible(true);
	}

	private void init() {

		shapePanel = new ShapePanel(this);
		MyCircle circle = new MyCircle(40, 40, 150);
		shapePanel.addShape(circle);

		MySquare square = new MySquare(140, 40, 70);
		shapePanel.addShape(square);

		MyTriangle triangle = new MyTriangle(40, 140, 70, 70);
		shapePanel.addShape(triangle);
		
		MyRectangle rectangle = new MyRectangle(140, 140, 140, 70);
		shapePanel.addShape(rectangle);

		Container pane = this.getContentPane();
		pane.add(shapePanel, BorderLayout.CENTER);
	}
}
