import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Project extends AbstractProject {
    public Project(String initName, float initSalary) {
        name = initName;
        salary = initSalary;
        leaf = true;
    }
    //--------------------------------------
    public Project(Project initParent, String initName, float initSalary) {
        name = initName;
        salary = initSalary;
        parent = initParent;
        leaf = true;
    }
    //--------------------------------------
    public float getSalary() {
        return salary;
    }
    //--------------------------------------
    public String getName() {
        return name;
    }
    //--------------------------------------


    public boolean add(Project e) throws NoSuchElementException {
        throw new NoSuchElementException("No subordinates");
    }

    public void remove(Project e) throws NoSuchElementException {
        throw new NoSuchElementException("No subordinates");
    }




    public Enumeration subordinates () {
        Vector v = new Vector();
        return v.elements ();
    }



    //--------------------------------------
    public Project getChild(String s) throws NoSuchElementException {
        throw new NoSuchElementException("No children");
    }

    //--------------------------------------
    public float getSalaries() {
        return salary;
    }
    //--------------------------------------
    public Project getParent() {
        return parent;
    }
}
