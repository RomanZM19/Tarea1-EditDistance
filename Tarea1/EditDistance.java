/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author romanzm
 */
public class EditDistance {
    
    //metodo auxiliar para calcular un minimo de enteros 
    private static int min(int x,int y, int z){
        int res;
        
        if(x <= y && x <= z)
            return x;
        if(y <= x && y <= z)
            return y;
        else
            return z;
    }
    
    public static int editDistance(String s1, String s2){
        int ls1, ls2;
        ls1 = s1.length();
        ls2 = s2.length();
        int res = 0;
        
        if(ls1 == 0){
            res = ls2;
        }else 
            if(ls2 == 0){
                res = ls1;
            }else{
                res = editDistance(s1,s2,0);
            }
        
        return res;
    }
    
    private static int editDistance(String s1,String s2,int cont){
        int sus,ins,borr;
        
        //Estado base
        if(s1.length() == 0 || s2.length() == 0){
            return cont + s1.length() + s2.length();
        }
        
        //Caso donde no se hace nada (los caracteres son iguales)
        if(s1.charAt(0) == s2.charAt(0)){
            return editDistance(s1.substring(1),s2.substring(1),cont);
        }
        
        //Caso donde se debe hacer algo (sustituir, insertar o borrar)
        sus = editDistance(s1.substring(1),s2.substring(1),cont + 1); // sustituir
        ins = editDistance(s1.substring(1),s2,cont + 1); //insertar
        borr = editDistance(s1,s2.substring(1),cont + 1); //borrar
        return min(sus,ins,borr);
    }
    
    public static void main(String[] args) {
        
        int res1,res2,res3;
        res1 = editDistance("horse","ros");
        res2 = editDistance("intention","execution");
        res3 = editDistance("ernandof","fernando ");
        System.out.println("La distancia entre horse y ros es: "+res1);
        System.out.println("La distancia enre intention y execution es: "+res2);
        System.out.println("La distancia entre ernandof y fernando es: "+res3);
    }
    
}
