import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Eleman sayýsýný girin:");
		int n= scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i =2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
