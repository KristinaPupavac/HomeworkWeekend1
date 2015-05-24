
public class Task3 {
//Napisati program koji sadrzi sest varijabli koje predstavljaju dva datuma. 
//Ispisati na konzolu datum koji od ta dva datuma dodje prije drugoga

	public static void main(String[] args) {
		int day1 = 1; int month1 = 3; int year1 = 2015;
		int day2 = 13; int month2 = 3; int year2 = 2014;
		
		 if( day1 < day2 && month1 < month2 && year1 < year2){
			 System.out.println(day1 + "." + month1 + "." + year1 + ".");
		 } else if (day1 == day2 && month1 == month2 && year1 == year2) {
			 System.out.println("Datumi su isti."); 
		 } else if (day1 == day2 && month1 < month2 &&  year1 < year2) {
			 System.out.println(day1 + "." + month1 + "." + year1 + "." );	 
		 } else if (day1 == day2 && month1 == month2 &&  year1 < year2) {
			 System.out.println(day1 + "." + month1 + "." + year1 + "." );			 
		 } else if (day1 < day2 && month1 == month2 &&  year1 < year2) {
			 System.out.println(day1 + "." + month1 + "." + year1 + "." );			 
		 } else if (day1 < day2 && month1 == month2 &&  year1 == year2) {
			 System.out.println(day1 + "." + month1 + "." + year1 + "." );			 
		 } else if (day1 > 31 || day2 > 31){
			 System.out.println("Greska! Unesi ponovo!");
		 } else if (month1 > 12 || month2 > 12) {
			 System.out.println("Greska! Unesi ponovo!");	 
		 } else {
			 System.out.println(day2 + "." + month2 + "." + year2 + "." );
			 
		 }

	}

}
