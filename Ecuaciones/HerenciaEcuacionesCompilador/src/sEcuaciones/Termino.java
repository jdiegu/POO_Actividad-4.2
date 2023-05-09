package sEcuaciones;

public class Termino extends TerminoInd{

    private char incog;
    
    public Termino(int coef , char var){
        super(coef);
        this.incog = var;
    }
    
    public void setIncog(char var){
        this.incog = var;
    }
    
    public char getIncog(){
        return incog;
    }
   
	
}
