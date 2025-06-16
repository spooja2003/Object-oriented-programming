//package object_oriented_programming;

interface StreamingPlatform{
	void watch2();
	void download2();
}

interface Downloadable{
	void dowmload();
	void watch2();
}

class Netflix_5 implements StreamingPlatform, Downloadable{
	public void watch2() {
		System.out.println("Netflix Watching");
	}
	public void download2() {
		System.out.println("Netflix Downoloading");
	}
	@Override
	public void dowmload() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Inheritance {
	public static void main(String [] args) {
		Netflix_5 c1=new Netflix_5();
	c1.watch2();
		c1.download2();
		
	}
}
