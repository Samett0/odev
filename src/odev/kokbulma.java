package odev;

import java.util.Scanner;

public class kokbulma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(ax�+bx+c)�kinci Dereceden Bir Denklemdir. \n Denklemin De�erlerini S�rayla Giriniz...");
		System.out.println("a De�erini Giriniz: ");
		double a=sc.nextInt();
		System.out.println("b De�erini Giriniz: ");
		double b=sc.nextInt();						
		System.out.println("c De�erini Giriniz: ");
		double c=sc.nextInt();
		
		
		double delta =(b * b)-(4 * a * c);
		if (delta >0) {
			double x1=((-1*b)- Math.sqrt(delta))/(2 * a);
			double x2=((-1*b)+ Math.sqrt(delta))/(2 * a);
			System.out.println(" x1="+ x1 +  "\n x2="+ x2);						
		}
		if (delta <0) {
			System.out.println("Denklemin Ger�el K�k� Yoktur!");	
}
		if(delta==0) {
			double x= (-1 * b)/(2 * a);
			System.out.println("�ak���k K�k� Vard�r: x1=x2"+x);
		}

	}

}
