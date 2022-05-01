import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi=3.14;
		double r;
		System.out.println("Lütfen yarý çap giriniz.");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextDouble();
		double alan = pi*r*r;
		double cevre = 2 * pi * r;
		double aci;
		System.out.println("Lütfen Merkez açý girin:");
		aci = scanner.nextDouble();
		double dilimAlan=(pi*(r*r)*aci)/360;
		
		System.out.println("Dairenin alaný : "+alan);
		System.out.println("Dairenin çevresi : "+cevre);
		System.out.println("Daire Dilim Alaný : "+dilimAlan);
	}

}
