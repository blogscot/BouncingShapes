import java.awt.Graphics;

public abstract class MyShape {
	
	public static int x = 0;
	public static int y = 0;
	public static int width = 0;
	public static int height = 0;
	


	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}
}
