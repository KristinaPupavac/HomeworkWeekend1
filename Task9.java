
public class Task9 {
//Dizajnirati program koji za dati trocifreni broj odredi da li je taj broj 
//djeljiv sa zbirom svojih cifara.

	public static void main(String[] args) {
		int number = 224;
		
		int hundred = (number / 100) % 10;
		int ten = (number / 10) % 10;
		int num = number % 10; 
		
		int sum = hundred + ten + num;
		
		if (number % sum  == 0) {
			System.out.println(number + "/" + sum + " Broj dijeljiv sa zbirom svojih cifara.");
		} else {
			System.out.println(number + "/" + sum + " Broj nije dijeljiv sa zbirom svojih cifara.");
		}
	
		
		
		
	}

}
