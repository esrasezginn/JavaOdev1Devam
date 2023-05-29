package mukemmelSayi;

public class main {
public static void main(String[] args) {
	//6 28 gibi bölünenlerinin toplamı sayıyı veriyorsa mükemmel sayı
	
	int number = 496;
	int total = 0;
	
	for(int i=1;i<number;i++) {
		if( number % i ==0) {
			total = total +i;
			
		}
	}
	
	if (total == number) {
		System.out.println("Mukemmel Sayidir");
	}else{
		System.out.println("Mukemmel sayi değildir.");
		
	}
}
}
