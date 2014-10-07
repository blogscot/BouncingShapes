import java.awt.Graphics;

public class MySquare extends MyShape implements Flashable{

	private int count = 0;
	private boolean isVisible = true;

	public MySquare(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.width = length;
		this.height = length;
	}

	@Override
	public void draw(Graphics g){
		count++;
		if (count%10==0) { isVisible = !isVisible; }
		
		if (isVisible)
		{
			g.fillRect(x, y, width, height);
		}
	}
}
