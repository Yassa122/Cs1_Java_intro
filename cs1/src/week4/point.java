package week4;

public class point {

	double x;
	double y;
	static int count=0;
	
	public point() {
		this(0,0);
	}
	public point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public void add(point p) {
		p.x+=x;
		p.y+=y;
	}
	public static point add(point p1,point p2) {
		return new point(p1.x+p2.x,p1.y+p2.y);
	}
	public void swap (point p) {
		double tempX = p.x ;
		double tempY = p.y ;
		p.x = this.x ;
		p.y = this.y ;
		this.x = tempX ;
		this.y = tempY ;

		
	}
}
