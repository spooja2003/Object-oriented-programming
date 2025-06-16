//package object_oriented_programming;
class shape {
	shape(){
		System.out.println("constructor called");
	}
}
class addition {
	addition(int a,int b,int c){
	
     System.out.println(a+b+c);
	
}
}
public class constructor {

	public static void main(String[] args) {
		shape s1=new shape();
		addition a1=new addition(10,20,30);
		//a1.addition(10,20,30);
	}

}
