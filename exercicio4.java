package listadeexercicios;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		float d=0, r=0, s=0;
		System.out.println("Digite tr�s numeros inteiros e positivos: ");
		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
		c = new Scanner(System.in).nextInt();
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\nr ( (a+b)^2 ) = "+r+"\ns ( (b+c)^2 ) = "+s);
		
	}

}
