package sEcuaciones;


public class Ecuacion {
	private Termino term1;
	private Termino term2;
	private int varInd;

	public Ecuacion(Termino term1 , Termino term2 , int varInd) {
		this.term1 = term1;
		this.term2 = term2;
                this.varInd = varInd;
	}
       	
	public Ecuacion(){
            
        }
	
	public Termino getTerm1() {
		return term1;
	}
	public void setTerm1(Termino term1) {
		this.term1 = term1;
	}
	public Termino getTerm2() {
		return term2;
	}
	public void setTerm2(Termino term2) {
		this.term2 = term2;
	}
	public int getVarInd() {
		return varInd;
	}
	public void setVarInd(int varInd) {
		this.varInd = varInd;
	}
	
}
