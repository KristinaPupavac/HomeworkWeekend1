
public class Task7 {
//Dizajnirati program koji sadrzi jednu cetverocifrenu varijablu int tipa. 
//Ispisati na konzolu sumu njezinih cifara, npr. ukoliko je varijabla 1815 onda je
	//rezultat 1+8+1+5=15.
	public static void main(String[] args) {
		int var = 1816;
		
		int thousand = var / 1000;
		int hundred = (var/ 100) % 10;
		int ten = (var / 10) % 10;
		int num = var % 10; 
		
		System.out.println("Rezultat je: " + (thousand + hundred + ten + num) );
	
	}

}
