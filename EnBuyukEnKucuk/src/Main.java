import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 0 ;
		int min = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� say� gireceksiniz :");
		int n = scan.nextInt();
		for ( int i =1;i<=n;i++) {
			System.out.println(i+". say�y� girin:");
			int sayi = scan.nextInt();
			 if (i==1){
	                max=sayi;
	                min=sayi;}
	                else {
			if(sayi>max) {
				max=sayi;
			}
			else if (sayi<min) {
				min=sayi;
			}
	                }
		}
		System.out.println("En b�y�k say� : "+max);
		System.out.println("En k���k say� : "+min);
	}

}
