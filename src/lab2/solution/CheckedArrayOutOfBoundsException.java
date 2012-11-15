/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2.solution;

/**
 *
 * @author  Kyle Guzikowski kguzikowski@my.wctc.edu
 * @version 1.00
 */
public class CheckedArrayOutOfBoundsException extends Exception {
     private static final String ERR_MSG = "Please enter only 2 Names,"+ " in the format First Last, Thank You" ;

  
    public CheckedArrayOutOfBoundsException(String message, Throwable cause){
         super(ERR_MSG, cause);
    }
    
    
    public CheckedArrayOutOfBoundsException(String message){
         super(ERR_MSG);
    }
    
    
    public CheckedArrayOutOfBoundsException(){
         super(ERR_MSG);
    }

}
