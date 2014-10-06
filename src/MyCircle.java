import java.awt.Graphics;

public class MyCircle extends MyShape {

	private int x, y, diameter;

	public MyCircle(int x, int y, int diameter) {
		this.x = x;
		this.y = y;
		this.diameter = diameter;
	}

	@Override
	public void draw(Graphics g){
		g.fillOval(x, y, diameter/2, diameter/2);
	}
	
	@Override
	public void move(int width, int height) {

		if (x >= width - diameter/2 || x <= 0) {
			xspeed *= -1;
		}
		if (y >= height - diameter/2 || y <= 0) {
			yspeed *= -1;
		}

		x += (xspeed);
		y += (yspeed);
	}

}
