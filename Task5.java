
public class Task5 {
// Napraviti program koji sadrzi cetiri varijable. Ispisati na konzolu varijable
//tako da su sortirane od najmanje ka najvecoj.

	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 2;
		int var3 = 14;
		int var4 = 7;
		
		int min; int min1; int min2;
		int max; int max1; int max2;
		int m1; int m2;
		
		if (var1 < var2) {
			min1 = var1;
			max1 = var2;	
		} else {
			min1 = var2;
			max1= var1;
		} if (var3 < var4) {
			min2 = var3;
			max2 = var4;
		} else {
			min2 = var4;
			max2 = var3;
		} if (min1 < min2) {
			min = min1;
			m1 = min2;      
		} else {             
			min = min2;
			m1 = min1;
		} if (max1 > max2) {
			max = max1;
			m2 = max2;
		} else {            
			max = max2;
			m2 = max1;
		} if (m1 < m2) {
			System.out.println("Sortirani brojevi: " + min + " "+ m1 + " " + m2 + " " + max);
		} else {
			System.out.printf("Sortirani brojevi: " + min + " " + m2 + " " + m1 + " " + max);
		}

	}

}
