package com.medipol.odevlerim;
import java.util.Scanner;

public class ikinciDerecedenKokBulma {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	     System.out.println("(a²+bx+x) ikinci dereceden birdenklemdir. \n Denklemdeki Sabitleri Aþaðýdaki Gibi Sýrayla Girin :" );
		 
	     System.out.println("a degerini girin");
		 double a = sc.nextInt();
		 
		 System.out.println("b degerini girin");
		 double b = sc.nextInt();
		 
		 System.out.println("c degerini girin");
		 double c = sc.nextInt();
		 
		 double delta=(b*b)-(4*a*c);
		 if(delta >0) {
			 double x1= ((-1*b)- Math.sqrt(delta))/(2*a);
			 double x2= ((-1*b)+ Math.sqrt(delta))/(2*a);
			 System.out.println("x1 =" + x1 +"\n x2 =" + x2);
		 }
		if(delta <0) {
			System.out.println("denklemin gerçel kökü yoktur");
		
			 }
		if(delta == 0) {
			double x = (-1*b)/(2*a);
			System.out.println("çakisik kökü vardir x1=x2"+x);
		}
	}

}
