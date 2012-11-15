
package krg.CustomExceptionClasses;

//import lab0.*;

/**
 *
 * @author Kyle Guzikowski <k.guzikowski@my.wctc.edu>
 * 
 * 
 */

// extends the Exception Class it uses a RunTimeException or checked exception
//illegalargument is an unchecked exception that can end a program
//
public class IllegalVacationDaysException extends Exception {
    
    // static final so the vairaible exsist so the 
    // cant create an object  using a 
    //passes the non final static  errMsg to the class generated constructor
    
    private String  errMsg = "Wrong";
    
     // static final the varable 
    // making it global and Static exsist outside of the creation of the object
    //so the pass an aproved msg into  
    private static final String MSG  = "Yepp Wrong";
    
    
    // unchecked can be ignored without the program Crashing
    
    // checked exception_ problems that can End a program Fatal/ -
    //--- you are forced to deal with problem to prevent 
    //error cannot

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    
    
    
    //-------------> @TODO constructors generated from the API
    // Exception api;
    // Constructor Summary
    
    
    public IllegalVacationDaysException(Throwable cause) {
        super(cause);
    }

    public IllegalVacationDaysException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalVacationDaysException(String message) {
        //throws the Strin from constructor 
        super(message);
    }

    public IllegalVacationDaysException() {
    }

}
