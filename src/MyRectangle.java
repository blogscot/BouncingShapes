import java.awt.Graphics;

public class MyRectangle extends MyShape implements Flashable{
	private int x, y; 
	private int width, height;
	private int count = 0;
	private boolean isVisible = true;


	public MyRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		count++;
		if (count%11==0) { isVisible = !isVisible; }
		
		if (isVisible)
		{
			g.fillRect(x, y, width, height);
		}
	}

	@Override
	public void move(int width, int height) {

		if (x >= width - this.width || x <= 0) {
			xspeed *= -1;
		}
		if (y >= height - this.height || y <= 0) {
			yspeed *= -1;
		}

		x += (xspeed);
		y += (yspeed);
	}
}
