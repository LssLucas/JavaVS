package listadeexercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1=0, n2=0, n3=0, media=0;
		System.out.println("Digite três numeros: ");
		n1 = new Scanner(System.in).nextFloat();
		n2 = new Scanner(System.in).nextFloat();
		n3 = new Scanner(System.in).nextFloat();
		media = ((n1/10)*2+(n2/10)*3+(n3/10)*5);
		System.out.println("Suas notas são: \n1ª avaliação - "+n1+"\n2ª avaliação - "+n2+"\n2ª avaliação - "+n3+"\nSua media é - "+media);
	}

}
