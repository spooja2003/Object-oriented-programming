//package object_oriented_programming;

class car{
	String brand;
	String modelname;
	int noofseats;
	int cc;
	
	 public car(car c1){  //constructor
		this.brand=c1.brand;
		this.noofseats=c1.noofseats;
	}

	public car() {
		
	}

	
	
}
public class copy {
  public static void main(String []args) {
	  car c1=new car();
	  c1.brand="bmw";
	  c1.noofseats=5;
	  car c2=new car(c1);
	  System.out.println(c2.brand+" "+c2.noofseats);
	  
	  
  }
}
