package oopss;

class Test{
	private int a;
	private int b;
	public void setData() {
		a=45;
		b=56;
	}
    public void getData() {
    	System.out.println("a :" + a);
    	System.out.println("b :" + b);
    }
	
	
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test t1 = new Test();
      t1.setData();
      t1.getData();
      
	}

}