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
public class MiException extends Exception {
    public String exception1(){
        return "Tiene mas de 5 elementos";
    }
    
    public String exception2(){
        return "Tiene valores mayores a 9";
    }
    
    public String exception3(){
        return "tiene valores negativos";
    }
}
