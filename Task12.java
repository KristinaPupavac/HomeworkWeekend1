
public class Task12 {
//Implementirati kod koji odredjuje da li je lopta sa datim poluprecnikom 
//„dobre kvalitete“. U ovom slucaju „dobra kvaliteta“ znaci da lopta ima volumen 
//od 6.014 sa odstupanjem od ±0.05%.

	public static void main(String[] args) {
		double diameter = 2.395829;
		double radius = diameter / 2;
		double pi = 3.14;
		double volume = (4 * radius * radius * radius * pi) / 3;
		double volumeStandard = 6.014;
		
		double volumeUpperLimit = volumeStandard + (volumeStandard * 0.05) / 100;
		double volumeLowerLimit = volumeStandard - (volumeStandard * 0.05) / 100;
		
		if (volume >= volumeLowerLimit && volume <= volumeUpperLimit ) {
			System.out.println("Dati poluprecnik " + diameter + " je dobre kvalitete.");	
		} else {
			System.out.println("Dati poluprecnik " + diameter + " je lose kvalitete.");
			
		}
	}

}
