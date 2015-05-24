
public class Task2 {
//Napisati program koji sadrži varijablu a. Ispisati da li se varijabla a nalazi 
//izmedju 5 i 7.5, izmedju 7.5 i 10 ili je van opsega.

	public static void main(String[] args) {
        double a = 5.5;
		
		if ( a > 5 && a <= 7.5) {
			System.out.println("Broj se nalazi izmedju 5 i 7.5.");
		} else if ( a > 7.5 && a <= 10) {
			System.out.println("Broj se nalazi izmedju 7.5 i 10.");
		} else {
			System.out.println("Broj je van opsega.");
		}	
			

	}

}
