import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen boyunuzu girin :");
		double boy= scanner.nextDouble();
		System.out.println("L�tfen kilonuzu girin :");
		double kilo= scanner.nextDouble();
		double indeks = kilo / (boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz : "+indeks);
	}

}
