
public class Main {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		double sum = 0;
		for(double i:numbers) {
			sum+=1/i;
		}
		double avarage = numbers.length/sum;
		System.out.println(avarage);

	}

}
