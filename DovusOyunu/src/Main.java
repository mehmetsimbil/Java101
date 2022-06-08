
public class Main {

	public static void main(String[] args) {
		Dovuscu d1= new Dovuscu("A",10,120,100,30);
		Dovuscu d2= new Dovuscu("B",20,85,85,20);
		
		musabaka m1=new musabaka(d1,d2,80,120);
		m1.run();
 	}

}
