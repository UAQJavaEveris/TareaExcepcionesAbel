/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.tallerJava.clases;

/**
 *
 * @author Abel
 */
public class TareaException {

    
    public static void main(String[] args) throws MiException {
        byte exception=0;
        try{
           
            int valores[]={1,3,5,7,9,2};
            
            //codigo para revisar el array
            if (valores.length>5){
                exception=0;
                throw new MiException();
                
            }
            
            
            for (int i:valores){
                if (i>9){
                    exception=1;
                    throw new MiException();
                }
                if (i<0){
                    exception=2;
                    throw new MiException();
                }
            } 
            
            
        }catch(MiException e){
            switch(exception){
                case 0:
                    e.exception1();
                    break;
                case 1:
                    e.exception2();
                    break;
                case 2:
                    e.exception3();
                    break;
            }
            
        }
        
    }
    
}
