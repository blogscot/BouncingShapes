import java.awt.Graphics;

public class MyCircle extends MyShape {

	public MyCircle(int x, int y, int diameter) {
		this.x = x;
		this.y = y;
		this.width = diameter/2;
		this.height = diameter/2;
	}

	@Override
	public void draw(Graphics g){
		g.fillOval(x, y, width, height);
	}
}
