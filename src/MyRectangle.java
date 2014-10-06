import java.awt.Graphics;


public class MyRectangle extends MyShape{
	private int x, y, width, height;

	public MyRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}
}
