package listadeexercicios;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=(float) (0.00 + (Math.random() * 9.00)), 
			b=(float) (0.00 + (Math.random() * 9.00)),
			c=(float) (0.00 + (Math.random() * 9.00)),
			d=(float) (0.00 + (Math.random() * 9.00)),
			e=(float) (0.00 + (Math.random() * 9.00)),
			f=(float) (0.00 + (Math.random() * 9.00)),
			x=0,
			y=0;
		x = (c*f)-(b*e)/(a*f)-(b*d);
		y = (a*e)-(c*d)/(a*f)-(b*d);
		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\nd = "+d+"\ne = "+e+"\nf = "+f+"\nx ((a*f)-(c*d))/((a*g)-(b*d)) = "+x+"\ny ((c*f)-(b*e)/(a*f)-(b*d)) = "+y);
	}

}
