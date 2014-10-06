import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ShapePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	Timer t;
	private MyShape[] shapes;

	public ShapePanel(MainProgram mp) {
		shapes = new MyShape[0];
		
		t=new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<shapes.length;i++){
					shapes[i].move(mp.getWidth(), mp.getHeight());
				}
				repaint();
			}
		});
		t.start();

	}

	public void addShape(MyShape shape) {

		MyShape[] temp = new MyShape[shapes.length + 1];
		for (int i = 0; i < shapes.length; i++) {
			temp[i] = shapes[i];
		}
		temp[shapes.length] = shape;
		shapes = temp;
		repaint();
		
	}

	public void removeShape(Shape s) {
		// you are going to do this!
	}

	@Override
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		for (int i = 0; i < shapes.length; i++) {
			g.setColor(Color.red);
			(shapes[i]).draw(g);
		}
	}
}
