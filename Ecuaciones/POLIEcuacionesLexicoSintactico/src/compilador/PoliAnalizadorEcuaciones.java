
package compilador;

import java.util.StringTokenizer;
import sEcuaciones.*;
public class PoliAnalizadorEcuaciones {
    
    public Termino creaTermino(String constante, char vari){
        
        int cons = Integer.parseInt(constante);
        
        return new Termino(cons , vari);
    }
    public TerminoInd creaTerminoInd(String constante){
        
        int cons = Integer.parseInt(constante);
        
        return new TerminoInd(cons);
    }
    
    public Ecuacion creaEcuacion(String[] constantes , String[] variables){
        
        Termino ter1 = creaTermino( constantes[0] , variables[0].charAt(0));
        Termino ter2 = creaTermino( constantes[1] , variables[1].charAt(0));
        TerminoInd ter3 = creaTerminoInd(constantes[2]);
        return new Ecuacion(ter1 , ter2 , ter3);
    }
    
    public Sistema creaSistema(String[] constantesEc1 , String[] constantesEc2 , String[] variables ){
        
        Ecuacion ec1 = creaEcuacion(constantesEc1 , variables );
        Ecuacion ec2 = creaEcuacion(constantesEc2 , variables );
        
        return new Sistema(ec1 , ec2);
    }
    
    public Sistema compila(String ecuas) {
        Lexico analisis=new Lexico();
        
        String vEcuaciones[] = analisis.analisisLexico(ecuas);
        
        if(vEcuaciones != null){
            Sintactico sintactico = new Sintactico();
            boolean a = sintactico.analiza(vEcuaciones);
            
             if(a){
                sintactico.getConstantesEc1();
                sintactico.getConstantesEc2();
                sintactico.getVariablesEc1();
                return creaSistema( sintactico.getConstantesEc1() , sintactico.getConstantesEc2() , sintactico.getVariablesEc1() );
            } 
        }
        return null;
    }
    
}
