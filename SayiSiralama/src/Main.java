import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayi:");
		a=scanner.nextInt();
		System.out.print("�kinci sayi:");
		b=scanner.nextInt();
		System.out.print("���nc� sayi:");
		c=scanner.nextInt();
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("a>b>c");
			}
			else {
				System.out.println("a>c>b");
			}
		}
		else if (b>a && b>c) {
			if(a>c) {
				System.out.println("b>a>c");
			}
			else {
				System.out.println("b>c>a");
			}
		}
		else if(c>a&&c>b) {
			if(a>b) {
				System.out.println("c>a>b");
			}
			else {
				System.out.println("c>b>a");
			}
		}
	}

}
