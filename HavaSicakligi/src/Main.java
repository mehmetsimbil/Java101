import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hava s�cakl�g� g�r�n:");
		double sicaklik=scanner.nextDouble();
		if(sicaklik<5) {
			System.out.println("Bu s�cakl�kta kayak yap�labilir.");
		}
		else if (sicaklik>=5 && sicaklik<15) {
			System.out.println("Sinemaya gidilebilir.");
		}
		else if ( sicaklik >=15 && sicaklik <25) {
			System.out.println("Piknik yap�labilir.");
		}
		else if(sicaklik>=25) {
			System.out.println("Y�zmeye gidilebilir.");
		}
	}

}
