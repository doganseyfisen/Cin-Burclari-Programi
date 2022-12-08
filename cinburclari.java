import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Çin Zodyağına göre burcunuzu öğrenin.\nDoğduğunuz yıl: ");
		year = input.nextInt();
		
		if(year%12==0) {
			System.out.println("Burcunuz: Maymun");
		}	else if(year%12==1) {
				System.out.println("Burcunuz: Horoz");
		}	else if(year%12==2) { 
				System.out.println("Burcunuz: Köpek");
		}	else if(year%12==3) {
				System.out.println("Burcunuz: Domuz");
		}	else if(year%12==4) {
				System.out.println("Burcunuz: Fare");
		}	else if(year%12==5) {
				System.out.println("Burcunuz: Öküz");
		}	else if(year%12==6) {
				System.out.println("Burcunuz: Kaplan");
		}	else if(year%12==7) {
				System.out.println("Burcunuz: Tavşan");
		}	else if(year%12==8) {
				System.out.println("Burcunuz: Ejderha");
		}	else if(year%12==9) {
				System.out.println("Burcunuz: Yılan");
		}	else if(year%12==10) {
				System.out.println("Burcunuz: At");
		}	else if(year%12==11) {
				System.out.println("Burcunuz: Koyun");
		}
		
	}
}
