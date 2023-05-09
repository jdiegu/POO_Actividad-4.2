package administra;
import sEcuaciones.*;
import javax.swing.JOptionPane;
import jopi.JOPI;
import compilador.PoliAnalizadorEcuaciones;

public class Administra {
	Sistema sistema;
        
        public Administra(){
        }
	
	public Sistema creaSistema() {
            
            String sis = JOPI.cadena("Sistema? ");
            PoliAnalizadorEcuaciones comp = new PoliAnalizadorEcuaciones();
            
            return comp.compila(sis);
	}
	
	private int gcd(int a , int b){
		int x;
		
		while(b != 0) {
			x = b;
			b = a%b;
			a = x;
		}
		
		return a;
	}
	
	private String simplifica(int a , int b){
		String res="";
		
		if(a < 0 ^ b < 0 ) {
			res ="- ";
			a = Math.abs(a);
			b = Math.abs(b);
		}
		
		if(a%b == 0)
			res += (a/b) ;
		else{
			int div = gcd(a, b);
			res += (a/div) +" / " + (b/div);
		}
		return res;
		
		
	}
	
	public void solucion() {
		Sistema sistema = creaSistema(); 
                if(sistema == null)
                    return;
                
		if(sistema.isMultiplos())
			JOptionPane.showMessageDialog(null, "sin solucion \n o \n infinitas soluciones !");
		else
			JOptionPane.showMessageDialog(null, sistema.getEc1().getVar1()+" = "+ simplifica( sistema.sarrusX() , sistema.sarrusA()) +
					" , "+ sistema.getEc1().getVar2() + " = "+ simplifica( sistema.sarrusY() , sistema.sarrusA()));
	}
}
