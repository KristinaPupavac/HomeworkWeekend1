
public class Task6 {
//Napraviti program koji sadrzi dvije varijable koje predstavljaju vrijeme u 
//formatu 24:00h (military time). Ispisati na ekran u formatu AM/PM.

	public static void main(String[] args) {
		int hour = 23;
		int minute = 45;
		
		if (hour <=12) { 
			System.out.println( hour + ":" + minute + "h AM");	
		} else if (hour == 24) {
			System.out.println("00:" + minute + "h AM" );		
		} else {
			hour = hour % 12;
			System.out.println( hour + ":" + minute + "h PM");			
		}
	}

}
