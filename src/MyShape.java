import java.awt.Graphics;

public class MyShape {

	protected int x = 0;
	protected int y = 0;
	protected int width = 0;
	protected int height = 0;

	protected int xspeed = 3;
	protected int yspeed = 3;

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}

	public void move(int width, int height) {

		if (x >= width - this.width || x <= 0) {
			xspeed *= -1;
		}
		if (y >= height - this.height|| y <= 0) {
			yspeed *= -1;
		}

		x += (xspeed);
		y += (yspeed);
	}

	@Override
	public String toString() {
		return "MyShape [xspeed=" + xspeed + ", yspeed=" + yspeed + "]";
	}
}
