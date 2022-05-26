import java.util.Scanner;

public class Main {

	static void Desen(int num,int n) {
		if(num<=0) {
			while(num!=n) {
				num+=5;
				System.out.println(num);
				if(num>=0) {
					while(num!=n) {
						num-=5;
						System.out.println(num);
						
					}
				break;}
							}
			}
		
		if(num>0) {
			while(num!=0) {
			num-=5;
			System.out.println(num);
			if(num<=0) {
				while(num!=n) {
					num+=5;
					System.out.println(num);
					
				}
			break;}
			}
		}
	}
		
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayı girin:");
		int sayi= scan.nextInt();
		Desen(sayi,sayi);
		
	}

}
