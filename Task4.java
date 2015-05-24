
public class Task4 {
//Napraviti program koji za dati datum odredi horoskopski znak koji pripada tom datumu.

	public static void main(String[] args) {
		int day =22;
		int month = 6;
		
		if (month == 12 && day >= 22) {
				System.out.println("Jarac.");	
		} else if (month == 12 && day <= 21) {
				System.out.println("Strelac.");	
		} else if (month == 11 && day >= 23 ) {
					System.out.println("Strelac.");		
		} else if (month == 11 && day <= 22) {
				System.out.println("Skorpion.");				
		} else if (month == 10 && day >= 23) {
					System.out.println("Skorpion.");		
			} else if (month == 10 && day <= 22) {
				System.out.println("Vaga.");		
		} else if (month == 9 && day >= 23) {
					System.out.println("Vaga.");	
			} else if (month == 9 && day <= 22) {
				System.out.println("Djevica.");			
		} else if (month == 8 && day >= 23) {
					System.out.println("Djevica.");	
			} else if (month ==8 && day <= 22) { 
				System.out.println("Lav.");	
		} else if (month == 7 && day >= 23) {
				System.out.println("Lav.");		
			} else if (month == 7 && day <= 22) {
				System.out.println("Rak.");	
		} else if (month == 6 && day >= 23) {
			System.out.println("Rak.");	
		    } else if (month == 6 && day <=22){
		    	System.out.println("Blizanac.");	
		} else if (month == 5 && day >= 23) {
				System.out.println("Blizanac.");	
		} else if (month == 5 && day <= 22) {
				System.out.println("Bik.");		
		} else if (month == 4 && day >= 23) {
				System.out.println("Bik.");		
			} else if (month ==4 && day <= 22) {
				System.out.println("Ovan.");		
		} else if (month == 3 && day >= 23){
				System.out.println("Ovan.");		
			} else if (month == 3 && day <= 22) {
				System.out.println("Ribe.");
		} else if (month == 2 && day >= 23) {
				System.out.println("Ribe.");	
			} else if (month == 2 && day <= 22) {
				System.out.println("Vodolija.");	
		} else if (month ==1 && day >= 23) {
				System.out.println("Vodolija.");	
			} else if (month == 1 && day <= 22) {
				System.out.println("Jarac.");	
			}
		}

			
			}

