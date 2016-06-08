import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Task extends Project {
    Vector employees;

    public Task(String initName, long initSalary) {
        super(initName, initSalary);
        leaf = false;
        employees = new Vector();
    }

    public Task(Project initParent, String initName, long initSalary) {
        super(initParent, initName, initSalary);
        leaf = false;
        employees = new Vector();
    }

    public Task(Project emp) {
        //promotes an employee position to a Boss
        //and thus allows it to have employees
        super(emp.getName (), emp.getSalary());
        employees = new Vector();
        leaf = false;
    }

    public boolean add(Project e) throws NoSuchElementException {
        employees.add(e);
        return true;
    }

    public void remove(Project e) throws NoSuchElementException {
        employees.removeElement(e);
    }

    public Enumeration subordinates () {
        return employees.elements ();
    }

    public Project getChild(String s) throws NoSuchElementException {

    	Project newEmp = null;

        if (getName().equals(s))
            return this;
        else {
            boolean found = false;
            Enumeration e = subordinates();
            while (e.hasMoreElements() && (! found)) {
                newEmp = (Project)e.nextElement();
                found = newEmp.getName().equals(s);
                if (! found) {
                    if (! newEmp.isLeaf ()) {
                        newEmp = newEmp.getChild(s);
                    } else
                        newEmp = null;
                    found =(newEmp != null);
                }
            }
            if (found)
                return newEmp;
            else
                return null;
        }
    }
    //--------------------------------------


    public float getSalaries() {
        float sum = salary;
        for (int i = 0; i < employees.size(); i++) {
            sum += ((Project)employees.elementAt(i)).getSalaries();
        }
        return sum;
    }


}
