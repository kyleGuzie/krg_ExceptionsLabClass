package lab2.solution;

import javax.swing.JOptionPane;
import java.util.*;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Kyle Guzikowski kguzikowski@my.wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() throws Exception{
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        
        String lastName = null;
        
        try{
           lastName = nameService.extractLastName(fullName);
        
        }catch (InvalidNameException ex){
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Input Error", 
                    JOptionPane.ERROR_MESSAGE);
             
        }catch (ArrayIndexOutOfBoundsException e){
             JOptionPane.showMessageDialog(null, e.getMessage(), "Check Names", JOptionPane.ERROR_MESSAGE);
             
        }
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
          
        if(fullName == "exit") {
            
            System.exit(0);
        }
        
    }
     
}
