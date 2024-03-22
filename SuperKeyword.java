package oopss;
//super class or parent class
 class superClass {
	int a = 21;
	void display() {
		System.out.println("21 is an Odd number");
		
	}
 }
//	subclass
	class subClass extends superClass{
		int b = 24;
		void show() {
			
	super.display();
	System.out.println("24 is an even number");
		}
	}
	public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subClass s1=new subClass();
		s1.show();

	
	}
	}

