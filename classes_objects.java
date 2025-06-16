//package object_oriented_programming;

class Animal{//these can be the data or attribute
	String color;
	String name;
	int no_of_legs;
	String gender;
	
	public void sound(String name) {
//		this.name=name;
		System.out.println(name+" is making a sound");
	}
	
	public void animal(String name) {
//		this.name=name;
		System.out.println(name+"is  making a sound");
	}
}

class Pen{
	String color;
	String brand;
	int price;
	String category;
	
	public void write(String brand) {//function of pen, where a brand is assigned
		this.brand=brand;//if we use the parameter in the function then we have to use this this, to call the function to run
		System.out.println(brand +" thuni kadai");
	}
	public void draw() {
		System.out.println( "vedha is dancing");
	}
	public void category() {
		System.out.println(category+" is the catogory");
	}
}

class classes_objects {
	public static void main(String[]args) {
		
		Animal a1=new Animal();
		a1.sound("Rabbit");//this.name=name
		
		Pen p1=new Pen();
		p1.write("vedha");//passing function
		p1.category="vedha ball point pen";//initiating the value
		p1.write("hema");
		p1.draw();//passing nothing
		p1.category="pooja";
		p1.category();
	}
}

