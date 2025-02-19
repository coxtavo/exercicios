package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
	
	   for (int i=0; i<a; i++) {
		 float x = sc.nextFloat();
		 float y = sc.nextFloat();
		 if (y == 0) {
			 System.out.println("divisao impossivel");
		 }
		 else {
		 float divisao = x / y;
		 System.out.printf("%.1f%n", divisao);
		 }
	   }
	   
	   sc.close();
      }   
	}

