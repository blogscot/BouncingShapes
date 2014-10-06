import java.awt.Graphics;


public class MySquare extends MyShape{

	private int x, y, length;

	public MySquare(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.length = length;
	}

	public void draw(Graphics g){
		
		g.fillRect(x, y, length, length);
	}
}
