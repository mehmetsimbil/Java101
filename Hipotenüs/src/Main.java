import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;
		double alan;
		double cevre;
		double hipo;
	
		System.out.println("Birinci kenar� girin.");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		System.out.println("�kinci  kenar� girin.");
		b= scanner.nextDouble();
		System.out.println("���nc� kenar� girin.");
		c = scanner.nextDouble();
		
		cevre = (a+b+c);
		hipo = Math.sqrt((a*a)+(b*b));
		alan = (cevre/2)*((cevre/2)-a)*((cevre/2)-b)*((cevre/2)-c);
		System.out.println("�evre = "+cevre+"hipoten�s = "+hipo+"alan = "+alan);
	}

}
