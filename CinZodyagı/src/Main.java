import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dogumYili;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doðum yýlýnýzý girin: ");
		dogumYili=scanner.nextInt();
		if(dogumYili%12==0) {
			System.out.println("Çin Zodyaðý = Maymun");
		}
		else if(dogumYili%12==1) {
			System.out.println("Çin Zodyaðý = Horoz");
		}
		else if (dogumYili%12==2) {
			System.out.println("Çin Zodyaðý = Köpek");
		}
		else if (dogumYili%12==3) {
			System.out.println("Çin Zodyaðý = Domuz");
		}
		else if (dogumYili%12==4) {
			System.out.println("Çin Zodyaðý = Fare");
		}
		else if (dogumYili%12==5) {
			System.out.println("Çin Zodyaðý = Öküz");
		}
		else if (dogumYili%12==6) {
			System.out.println("Çin Zodyaðý = Kaplan");
		}
		else if (dogumYili%12==7) {
			System.out.println("Çin Zodyaðý = Tavþan");
		}
		else if (dogumYili%12==8) {
			System.out.println("Çin Zodyaðý = Ejderha");
		}
		else if (dogumYili%12==9) {
			System.out.println("Çin Zodyaðý = Yýlan");
		}
		else if (dogumYili%12==10) {
			System.out.println("Çin Zodyaðý = At");
			}	
		else if (dogumYili%12==11) {
			System.out.println("Çin Zodyaðý = Koyun");
			}
		}
	}


