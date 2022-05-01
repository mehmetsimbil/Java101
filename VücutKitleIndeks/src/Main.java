import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu girin :");
		double boy= scanner.nextDouble();
		System.out.println("Lütfen kilonuzu girin :");
		double kilo= scanner.nextDouble();
		double indeks = kilo / (boy*boy);
		System.out.println("Vücut Kitle Ýndeksiniz : "+indeks);
	}

}
