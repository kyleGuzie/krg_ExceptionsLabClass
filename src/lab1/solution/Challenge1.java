package lab1.solution;

import javax.swing.JOptionPane;

/**

 * 
 * @author  Kyle Guzikowski kguzikowski@my.wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) throws Exception {
        
        String errmsg1 = "Please enter name in the format " + " FIRST LAST " + "with a space";
        String errmsg2 = "Invalid Input Pleast try Again";
        String errmsg3 = "Need a Last Name";
         
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String fn[] = fullName.split(" ");
        if (fn.length > LAST_NAME_IDX){
            JOptionPane.showMessageDialog(null, errmsg3);
            System.exit(0);
        }
        try{
            String lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        }catch ( ArrayIndexOutOfBoundsException e){
                       JOptionPane.showMessageDialog(null, errmsg1);

        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, errmsg2);
            
        }
            
        
        
       
        
    }
    
    public String extractLastName(String fullName) throws ArrayIndexOutOfBoundsException  {
        

        try{
            String[] nameParts = fullName.split(" ");
            return nameParts[LAST_NAME_IDX];
        }catch(ArrayIndexOutOfBoundsException d){
            throw new ArrayIndexOutOfBoundsException();
             
        }
    }


}
