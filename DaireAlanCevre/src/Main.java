import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi=3.14;
		double r;
		System.out.println("L�tfen yar� �ap giriniz.");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextDouble();
		double alan = pi*r*r;
		double cevre = 2 * pi * r;
		double aci;
		System.out.println("L�tfen Merkez a�� girin:");
		aci = scanner.nextDouble();
		double dilimAlan=(pi*(r*r)*aci)/360;
		
		System.out.println("Dairenin alan� : "+alan);
		System.out.println("Dairenin �evresi : "+cevre);
		System.out.println("Daire Dilim Alan� : "+dilimAlan);
	}

}
