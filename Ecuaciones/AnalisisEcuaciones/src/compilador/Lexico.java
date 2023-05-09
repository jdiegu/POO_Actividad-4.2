
package compilador;

import java.util.StringTokenizer;

public class Lexico {

    public String[] analisisLexico(String ecuaciones){
        String sistema=ecuaciones.replace(" ","");//busca espacios en blanco y los sustituye ""
        String ecuacion[]=separaEcuaciones(sistema);
        boolean a = true;
        
        for (String ec:ecuacion) {
            System.out.println(ec); 
            /*if(!lexico(ec)){
                a = false;
            }*/
            a = lexico(ec);
        }
        
        return a?ecuacion:null;
    }
    
    public  String[] separaEcuaciones(String sistema){
        StringTokenizer tokens=new StringTokenizer(sistema, ";");
        
        
         int i=0; 
         String ecuaciones[]=new String [2];
        while(tokens.hasMoreTokens()){
            ecuaciones[i]=tokens.nextToken();
           i++;
        }
        return ecuaciones;
    }
    
    
    public  boolean lexico(String ecuacion){
        System.out.println("LEXICO");
        boolean okLexico = true;
        char ec[]=ecuacion.toCharArray();
        for (int i = 0; i <= ec.length-1; i++) {
                if (esDigito(ec[i]) || esOperador(ec[i]) || esID(ec[i]) )
                    System.out.println(ec[i]+"  TOKEN correcto");
                else{
                   System.out.println(ec[i]+" TOKEN  incorrecto"); 
                    okLexico=false;
                }
        }
        
        return okLexico;
    }
        
    public  boolean esDigito(char digito){
        String dig=digito+"";
        
       // if(digito=='0' || digito=='1' || digito=='2' || digito=='3' || digito=='4' || digito=='5' || 
       //         digito=='6' || digito=='7' || digito=='8' || digito=='9')
       if(dig.matches("[0-9]+") )
             return true;
       return false;
    }
    
    public  boolean esOperador(char operador){
        String op=operador+"";
        
       // if(op=='=' || op=='+' || op=='-' )
        if(op.matches("[+|=|-]+"))
            return true;
        return false;
    }
    
    public  boolean esID(char letra){
        String id=letra+"";
      
        if(id.matches("[X-Z]+") || id.matches("[x-z]+"))
            return true;
        return false;
    }

   
    
}
