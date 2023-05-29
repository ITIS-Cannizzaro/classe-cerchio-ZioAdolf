import java.util.Scanner;

public class UsoCerchio {

	public static void main(String[] args) {
		
		double n = 0;
		Scanner sc = new Scanner(System.in);
		
		Cerchio MJ = new Cerchio(n);
		System.out.println("Inserire il raggio: ");
		n = sc.nextInt();
		
		System.out.println("Area: ");
		MJ.calcolaArea(n);
		System.out.println("Diametro: ");
		MJ.calcolaDiametro(n);
		System.out.println("Perimetro: ");
		MJ.calcolaPerimetro(n);
		
	}

}
