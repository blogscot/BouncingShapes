import java.awt.Graphics;


public class MyCircle extends MyShape {

	private int x, y, diameter;

	public MyCircle(int x, int y, int diameter) {
		this.x = x;
		this.y = y;
		this.diameter = diameter;
	}

	public void draw(Graphics g){
		g.fillOval(x, y, diameter/2, diameter/2);
	}
	
}
