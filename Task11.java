
public class Task11 {
//Implementirati kod koji odredjuje u koliko sati i minuta avion slijece na 
//aerodrom ukoliko vam je poznato u koliko sati i minuta avion uzlijece i koliko
//minuta bude u letu. Avion uzlijece i slijece u istoj vremenskoj zoni.

	public static void main(String[] args) {
		int hour = 13;
		int min = 45;
		int flayMin = 56;
		
		int sumMin = min + flayMin;
		
		if (sumMin >= 60) {
			hour++;
			sumMin = sumMin %60;
			System.out.println("Avion slijece u: " + hour + ":" + sumMin + " h");
		} else {
			System.out.println("Avion slijece u: " + hour + ":" + sumMin + " h");		
			
		}

	}

}
