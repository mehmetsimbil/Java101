
public class Main {

	static boolean isPalindrome(int num) {
		int sayi = num;
		int tersSayi = 0;
		while(sayi != 0) {
			int sonBasamak = sayi % 10;
			tersSayi=tersSayi*10+sonBasamak;
			sayi/=10;
		}
		if(num==tersSayi) 
			return true;
		
		else 
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(1021));

	}

}
