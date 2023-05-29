package miniProjeAsalSayi;

public class main {
	public static void main(String[] args) {
		int number = 19;
		int remainder = number % 2;
		System.out.println(remainder);
		System.out.println("-------------");
		boolean isPrime = true;
		if (number==1) {
			System.out.println("Asal sayı değildir");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı");
			
		}

		for (int i = 2; i < number; i++) {
			if (number / i == 0) {
				isPrime = false;

			}

		}
		if (isPrime == true) {
			System.out.println("Sayı asaldır");

		} else {
			System.out.println("Sayı asal değildir.");

		}

		
	}

}
