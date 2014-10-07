import java.awt.Graphics;

public class MySquare extends MyShape implements Flashable{

	private int x, y;
	private int length;
	private int count = 0;
	private boolean isVisible = true;

	public MySquare(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.length = length;
	}

	@Override
	public void draw(Graphics g){
		count++;
		if (count%10==0) { isVisible = !isVisible; }
		
		if (isVisible)
		{
			g.fillRect(x, y, length, length);
		}
	}
	
	@Override
	public void move(int width, int height) {

		if (x >= width - length || x <= 0) {
			xspeed *= -1;
		}
		if (y >= height - length || y <= 0) {
			yspeed *= -1;
		}

		x += (xspeed);
		y += (yspeed);
	}

}
