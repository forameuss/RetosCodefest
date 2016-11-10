package reto;

import java.util.ArrayList;
import java.util.List;


public class Reto {

  
    public static void main(String[] args) {        
        System.out.println(laFuncion(10000000));
    }
    
    
    public static int laFuncion (int num){
        Integer res = 0;
        
        
        int aux;
        for (int i = 1; i <= num; i++) {
           aux = i;
            while(aux!=1 && aux!=89){
              aux = operacion(aux);
           }
           if(aux==89)
           res++; 
        }
        
        
        return res; 
    }
    
    public static int operacion(Integer num){
        int suma=0;
       
        List<Integer> digitos = digitos(num);
        
        for (int dig : digitos){
            suma+=dig*dig;
        }        
               
        return suma;
    }
    
    
    
    

    public static List<Integer> digitos(int i) {
        List<Integer> digits = new ArrayList<>();
        while(i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        return digits;
    }   
 }
    
   
    