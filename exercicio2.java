package listadeexercicios;
import java.util.Scanner;
public class exercicio2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float segundos, horas, minutos, seg;
		System.out.println("Digite a duração do eventos e segundos (s): ");
		segundos = new Scanner(System.in).nextFloat();
		horas=(segundos/3600);
		minutos=((segundos/3600)/60);
		seg=((segundos%3600)%60);
		System.out.println("A duração do evento foi de \n(h) = "+horas+"\n(m) = "+ minutos+"\n(s) = "+seg+" segundos.");
	}

}
