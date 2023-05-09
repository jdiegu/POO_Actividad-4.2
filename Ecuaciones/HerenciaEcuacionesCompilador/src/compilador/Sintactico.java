
package compilador;


import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sintactico {
    
    private String constantesEc1[];
    private String constantesEc2[];
    private String[] variablesEc1;
    private String[] variablesEc2;
    
    public boolean analiza(String vEcu[]){
        System.out.println("Analizando....");
        String delimitadoresConstante="[xyzXYZ]+[+|=]+";
        this.constantesEc1=obtieneConstantes(vEcu[0], delimitadoresConstante,1);
        this.constantesEc2=obtieneConstantes(vEcu[1], delimitadoresConstante,2);
        
        String delimitadorIncog = "[0123456789]+[+|-|=]+";
        variablesEc1 = obtieneIncog(vEcu[0],delimitadorIncog,1);
        variablesEc2 = obtieneIncog(vEcu[1],delimitadorIncog,2);
        
        return verificaIncog(variablesEc1 , variablesEc2);
       
    }
    
    public boolean verificaIncog(String[] incog1, String[] incog2){
        
        if( incog1[0].equals(incog2[0]) && incog1[1].equals(incog2[1]) ){
            //System.out.println("SIIIIII son iguales" );
            System.out.println("variables = "+ incog1[0] +" , " + incog2[1]);
            return true;
        }
        else
            if(incog1[0].equals(incog2[1]) && incog1[1].equals(incog2[0]))
                System.out.println("Cambia el orden de las incognitas");
            else
                System.out.println("Incognitas diferentes");
        return false;
    }

    public String[] obtieneConstantes(String ecuacion,String delimitadores,int noEcuacion){
        StringTokenizer tokens=new StringTokenizer(ecuacion,delimitadores);
        
        
         int i=0; 
         String constantes[]=new String [3];
         try{
                while(tokens.hasMoreTokens()){
                        System.out.println("i   "+i);
                        constantes[i++]=tokens.nextToken();
                    }
        
                for (int j = 0; j < constantes.length; j++) 
                    System.out.println("CONSTANTE:"+constantes[j]);
        
            }
         catch(java.lang.ArrayIndexOutOfBoundsException e){
             System.out.println("ERROR en el numero de constantes!! en la ecuación  "+noEcuacion);
             for (int j = 0; j < constantes.length-1; j++) 
                    System.out.println("CONSTANTE:"+constantes[j]);
         }
         
      return constantes;  
    }
   
    
    public String[] obtieneIncog(String ecuacion,String delimitadores,int noEcuacion){
        StringTokenizer tokens=new StringTokenizer(ecuacion,delimitadores);
        
        
         int i=0; 
         String variables[] = new String[2];
         try{
                while(tokens.hasMoreTokens()){
                        System.out.println("i   "+i);
                        variables[i++] = tokens.nextToken();
                    }
        
                for (int j = 0; j < variables.length; j++) {
                    if (variables[j].length()==1) 
                        System.out.println("INCOGNITA:"+variables[j]);
                    else
                        System.out.println("ERROR EN LA DECLARACION DE INCOGNITA:"+variables[j]);
                }
        
            }
         catch(java.lang.ArrayIndexOutOfBoundsException e){
             System.out.println("ERROR en el numero de variables!! en la ecuación  "+noEcuacion);
             for (int j = 0; j < variables.length-1; j++) 
                    System.out.println("Variable:"+variables[j]);
         }
         
      return variables;  
    }

    public String[] getConstantesEc1() {
        return constantesEc1;
    }

    public String[] getConstantesEc2() {
        return constantesEc2;
    }

    public String[] getVariablesEc1() {
        return variablesEc1;
    }

    public String[] getVariablesEc2() {
        return variablesEc2;
    }
   
    
}