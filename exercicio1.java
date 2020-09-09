package listadeexercicios;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nosso código aqui
		
		int anos=0, meses=0, dias=0, total_dias=0;
		System.out.println("Digite sua data de nascimento: (xx/xx/xxxx)");
		dias = new Scanner(System.in).nextInt();
		meses = new Scanner(System.in).nextInt(); 
		anos = new Scanner(System.in).nextInt();
		anos=2020-anos;
		total_dias=(anos*356+(meses*30)+dias);
		System.out.println("Você viveu "+total_dias+" dias.");
	}

}
