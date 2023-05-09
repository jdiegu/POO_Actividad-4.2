package sEcuaciones;
import java.util.StringTokenizer;

public class Sistema {
	private Ecuacion ec1;
	private Ecuacion ec2;
	
	public Sistema(Ecuacion ec1 , Ecuacion ec2) {
            this.ec1 = ec1;
            this.ec2 = ec2;
	}
        
        public Sistema(){}
        
	public Ecuacion getEc1() {
		return ec1;
	}
	public void setEc1(Ecuacion ec1) {
		this.ec1 = ec1;
	}
	public Ecuacion getEc2() {
		return ec2;
	}
	public void setEc2(Ecuacion ec2) {
		this.ec2 = ec2;
	}
	
	public int sarrusA() {
		int s;
		s = ec1.getCoef1() * ec2.getCoef2();
		s-= ec1.getCoef2() * ec2.getCoef1();		
		return s;
	}
        
	public int sarrusX() {
		int s;
		s = ec1.getVarInd() * ec2.getCoef2();
		s-= ec1.getCoef2() * ec2.getVarInd();
		return s;
	}
	
        
	public int sarrusY() {
		int s;
		s = ec1.getCoef1() * ec2.getVarInd();
		s-= ec1.getVarInd() * ec2.getCoef1();
		return s;
	}
	
	public boolean isMultiplos() {
		if( this.sarrusA() == 0) 
			return true;
		else
			return false;
	}

    
		
}
