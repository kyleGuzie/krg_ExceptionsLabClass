package lab0.alt.solution;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid. <p> For example, String
 * arguments may be null or empty; other objects may be null; or primitive
 * numbers may be out of acceptable range. <p> You need to validate ALL method
 * parameters to make sure any and all arguments are valid. The only exception
 * is when any argument is acceptable based on requirements. Fix the code below
 * using if logic to validate method arguments and throw
 * IllegalArgumentException or a custom exception if the validation fails.
 *
 * @author Kyle Guzikowski, k.guzikowski@gmail.com
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final String VACATION_MSG = "Invalid Vacation Days must be < 28";
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacationAllowed;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacationAllowed = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacationAllowed = daysVacation;
    }

    public int getDaysVacationAllowed() {
        return daysVacationAllowed;
    }

    //throws ... automatically an unchecked exception
    //must fix a checked exception
    /**
     * uses a custom IllegalArgumentException class with custom private static
     * final Error Message for the custom class that custom class Must extend
     * the Exception class because that will allow
     *
     *
     * @param daysVacation
     * @throws IllegalVacationDaysException
     */
    public void setDaysVacationAllowed(int daysVacation) throws IllegalVacationDaysException {
        if (daysVacation < MIN_VACATION_DAYS
                || daysVacation > MAX_VACATION_DAYS) {
            //can use custom message that displays to user when invalid input wants
            //unchecked maybe fatal to program can crash
            //throw new IllegalArgumentException(VACATION_MSG);
            throw new IllegalVacationDaysException();
        }
        this.daysVacationAllowed = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        //illegalArgument Index
        this.ssn = ssn;
    }

    public void setLastName(String lastName) {
        //illegalArgument Index
        this.lastName = lastName;
    }

    public void setHireDate(Date hireDate) {
        //index parse, illegal
        this.hireDate = hireDate;
    }

    public void setFirstName(String firstName) {
        //illegalArgument Index
        this.firstName = firstName;
    }
}
