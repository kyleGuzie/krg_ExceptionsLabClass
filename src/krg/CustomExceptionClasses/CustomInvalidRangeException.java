
package krg.CustomExceptionClasses;

/**
 *
 * @author Kyle Guzikowski <k.guzikowski@my.wctc.edu>
 */
public class CustomInvalidRangeException extends Exception {
    private  String ERR_MSG = "Invalid Numaric Value For Feilds Range";

    
    
    
    
    public CustomInvalidRangeException(Throwable cause) {
        super(cause);
    }

    public CustomInvalidRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomInvalidRangeException(String message) {
        super(message);
    }

    public CustomInvalidRangeException() {
    }

    
    
    
    // generated to set and call the custome Err Message
    public String getERR_MSG() {
        return ERR_MSG;
    }

    public void setERR_MSG(String ERR_MSG) {
        this.ERR_MSG = ERR_MSG;
    }

}
