import java.util.Scanner;

public class Codigo5 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
    		System.out.print("Introduzca un número: ");
    		String ni = scan.nextLine();
    		
    		int n = Integer.parseInt(ni);
    		int afo = 0;
    		int noAfo = 0;
    		int num = n;
    		
   while (num > 0) {
	  int digito = num % 10;
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  } 
      
      num/=10;
      
   }// while
      
      if (afo > noAfo) {
          System.out.println("El " + n + " es un número afortunado.");
        } else {
          System.out.println("El " + n + " no es un número afortunado.");
        }//else
    
      scan.close();
   
	}//main

}//class Codigo5
