package listadeexercicios;

import java.util.Scanner;
import java.math.BigInteger;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=0, x2=0, y1=0, y2=0, d=0;
		x1 = new Scanner(System.in).nextFloat();
		y1 = new Scanner(System.in).nextFloat();
		x2 = new Scanner(System.in).nextFloat();
		y2 = new Scanner(System.in).nextFloat();
		d = Math.sqrt ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("x1 = "+x1+"\ny1 = "+y1+"\nx2 = "+x2+"\ny2 = "+y2+"\nd = "+d);
	}

}
