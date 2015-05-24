
public class Task8 {
//Dizajnirati program koji za date koordinate x, y i z tacke A u 3D prostoru 
//odredjuje koliko je tacka daleko od koordinatnog pocetka (0,0,0)
	public static void main(String[] args) {
		double x = 4;
		double y = 5;
		double z = 10;
		
		double distance = Math.sqrt((x*x + y*y + z*z));
		System.out.println("Tacka A(" + x +"," + y + "," + z +"," + ")u 3D prostoru udaljena je od koordintnog pocetka za: " + distance);	

	}

}
