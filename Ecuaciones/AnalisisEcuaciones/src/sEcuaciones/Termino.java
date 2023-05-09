package sEcuaciones;

public class Termino {
	private int coef;
	private char incog;
	
	public Termino(int coef, char incog) {
		this.coef = coef;
		this.incog = incog;
	}
	public Termino() {} 
	
	public int getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	public char getIncog() {
		return incog;
	}
	public void setIncog(char incog) {
		this.incog = incog;
	}
	
	
	
}
