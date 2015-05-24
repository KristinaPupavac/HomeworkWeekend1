
public abstract class Task10 {
//Implementirati kod koji odredjuje da li je dati broj jedan od rjesenja date 
//kubne jednacine oblika ax3+bx2+cx+d=0 Vas kod treba da ima pet varijabli: 
//vrijednosti a, b, c, i d kao i dato (potencijalno) rjesenje

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 0;
		int x = 0;
		
		if ( a*x*x*x* + b*x*x + c*x + d == 0) {
			System.out.println("x= " + x + " je rjesenje kubne jednacine.");
		} else {
			System.out.println("x= " + x + " nije rjesenje kubne jednacine.");
		}	
		
	}

}
