import java.awt.Graphics;

public class MySquare extends MyShape{

	private int x, y, length;

	public MySquare(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.length = length;
	}

	@Override
	public void draw(Graphics g){
		g.fillRect(x, y, length, length);
	}
	
	public void move(int width, int height) {

		if (x >= width - length || x <= 0) {
			xspeed *= -1;
		}
		if (y >= height - length || y <= 0) {
			yspeed *= -1;
		}

		x = x + (xspeed);
		y = y + (yspeed);
	}

}
