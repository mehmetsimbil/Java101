import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Bir sayi girin :");
		n = scanner.nextInt();
		for(int i=1;i<=n;i++) {
			if ((i%4==0) && (i%5==0)) {
				System.out.println("Bu sayi dört ve beþin katýdýr.. Sayi : "+i );
			}
			else {
				System.out.println("Bu sayi dört ve beþin katý deðildir.");
			}
		}
	}

}
