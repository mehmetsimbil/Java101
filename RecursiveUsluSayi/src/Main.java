import java.util.Scanner;

public class Main {

	static int usluSayi(int n,int m) {
		if(m==0) 
			return 1;
		return n*usluSayi(n,m-1);
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban de�erini girin:");
		int n = scan.nextInt();
		System.out.println("�s de�erini girin :");
		int m = scan.nextInt();
		System.out.println(usluSayi(n,m));

	}

}
