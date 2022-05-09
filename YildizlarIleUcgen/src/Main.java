import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayiyi girin.");
		int x = scanner.nextInt();
		for (int i = 1; i <= x; i++) {
            for (int k = 1; k <= (x-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

		for (int i = x; 1 <= i ; i--) {
            for (int k = 1; k <= (x-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
