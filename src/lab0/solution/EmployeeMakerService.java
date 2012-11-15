
package lab0.solution;

/**
 *
 * @author Kyle Guzikowski <k.guzikowski@my.wctc.edu>
 */
public class EmployeeMakerService {
    
    public void assignVacationDays(int days) {
        Employee em = new Employee();
        try {
            em.setDaysVacationAllowed(days);
        } catch (Exception e) {
        }
        
    }

}
