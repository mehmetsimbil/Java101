import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dogumYili;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do�um y�l�n�z� girin: ");
		dogumYili=scanner.nextInt();
		if(dogumYili%12==0) {
			System.out.println("�in Zodya�� = Maymun");
		}
		else if(dogumYili%12==1) {
			System.out.println("�in Zodya�� = Horoz");
		}
		else if (dogumYili%12==2) {
			System.out.println("�in Zodya�� = K�pek");
		}
		else if (dogumYili%12==3) {
			System.out.println("�in Zodya�� = Domuz");
		}
		else if (dogumYili%12==4) {
			System.out.println("�in Zodya�� = Fare");
		}
		else if (dogumYili%12==5) {
			System.out.println("�in Zodya�� = �k�z");
		}
		else if (dogumYili%12==6) {
			System.out.println("�in Zodya�� = Kaplan");
		}
		else if (dogumYili%12==7) {
			System.out.println("�in Zodya�� = Tav�an");
		}
		else if (dogumYili%12==8) {
			System.out.println("�in Zodya�� = Ejderha");
		}
		else if (dogumYili%12==9) {
			System.out.println("�in Zodya�� = Y�lan");
		}
		else if (dogumYili%12==10) {
			System.out.println("�in Zodya�� = At");
			}	
		else if (dogumYili%12==11) {
			System.out.println("�in Zodya�� = Koyun");
			}
		}
	}


