
package JavaDoc.InClassNotes;

import krg.CustomExceptionClasses.IllegalVacationDaysException;

/**
 *
 * @author Kyle Guzikowski <k.guzikowski@my.wctc.edu>
 */
public class Dog {
    private int age;
    private String name;
    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return a validated Dog Objects name 
     */
    public String getName() {
        return name;
    }

    /**
     * can be well described
     * @param name 
     * 
     * @throws explains if throws exception one
     * @throws explains exception 2
     * 
     * non rigid
     * 
     * what it does not how makes flexible
     * 1. pencil holds graphite that can only write to paper
     * 
     * 2. inputs data onto a surface with graphite
     * 
     * instructor
     * Sets the days of vacation allowed for an employee
     * and persists the data in the current storage system
     * not what not the How
     * How Rigid..
     * 
     * 
     */
    
    public void setName(String name) throws IllegalVacationDaysException {
        
        //@TODO custom Exception Class that Implements Runnable
        if(name == null){
            throw new IllegalVacationDaysException();
        }
        this.name = name;
    }

    
    
    
    public Dog(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }
    

}
