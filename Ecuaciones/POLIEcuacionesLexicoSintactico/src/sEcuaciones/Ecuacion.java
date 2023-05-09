package sEcuaciones;


public class Ecuacion{
	TerminoInd[] ecua;

	public Ecuacion( Object term1 , Object term2 , Object varInd) {
            ecua = new TerminoInd[3];
                this.ecua[0] = (Termino) term1;
		this.ecua[1] = (Termino) term2;
                this.ecua[2] = (TerminoInd) varInd;
	}
       	
	public Ecuacion(){
            
        }
	
        public int getCoef1(){
            return ecua[0].getCoef();
        }
        
        public int getCoef2(){
            return ecua[1].getCoef();
        }
        
        public int getVarInd(){
            return ecua[2].getCoef();
        }
        
        public char getVar1(){
            Termino ter = (Termino) ecua[0];
            return ter.getIncog();
        }
        public char getVar2(){
            Termino ter = (Termino) ecua[1];
            return ter.getIncog();
        }
}
