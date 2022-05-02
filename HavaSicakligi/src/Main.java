import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hava sýcaklýgý gýrýn:");
		double sicaklik=scanner.nextDouble();
		if(sicaklik<5) {
			System.out.println("Bu sýcaklýkta kayak yapýlabilir.");
		}
		else if (sicaklik>=5 && sicaklik<15) {
			System.out.println("Sinemaya gidilebilir.");
		}
		else if ( sicaklik >=15 && sicaklik <25) {
			System.out.println("Piknik yapýlabilir.");
		}
		else if(sicaklik>=25) {
			System.out.println("Yüzmeye gidilebilir.");
		}
	}

}
