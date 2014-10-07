import java.awt.Graphics;
import java.awt.Polygon;


public class MyTriangle extends MyShape{
	final int numberSides = 3;
	final int[] xpoints = new int[numberSides];
	final int[] ypoints = new int[numberSides];
	final int npoints = numberSides;

	public MyTriangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g){
		int pointNum = 0;

		xpoints[pointNum] = x;
		ypoints[pointNum++] = y;
		xpoints[pointNum] = x+width;
		ypoints[pointNum++] = y;
		xpoints[pointNum] = x+width/2;
		ypoints[pointNum] = y+height;
		
		Polygon p = new Polygon(xpoints, ypoints, npoints);
		g.fillPolygon(p);
	}
}
