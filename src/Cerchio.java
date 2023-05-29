
public class Cerchio {
	private double r;
	private double area;
	private double diametro;
	private double perimetro;
	public Cerchio(double r) {
		this.r= 0;
	}
	public void calcolaDiametro(double r) {
		System.out.println(r*2); 
	}
	public void calcolaPerimetro(double r) {
		System.out.println((2*Math.PI)*r);
	}
	public void calcolaArea(double r) {
		System.out.println(Math.PI*r*r); 
	}
	public double getArea() {
		return area;
	}
	public double getDiametro() {
		return diametro;
	}
	public double getPerimetro() {
		return diametro;
	}
	
	public String toString() {
		return "Area: "+area+"\n"+"Diametro: "+diametro+"\n"+"Perimetro: "+perimetro;
	}
}
