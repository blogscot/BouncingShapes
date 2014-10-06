import java.awt.Graphics;

public class MyRectangle extends MyShape {
	private int x, y, width, height;

	public MyRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}

	public void move(int width, int height) {

		if (x >= width - this.width || x <= 0) {
			xspeed *= -1;
		}
		if (y >= height - this.height || y <= 0) {
			yspeed *= -1;
		}

		x = x + (xspeed);
		y = y + (yspeed);
	}
}
