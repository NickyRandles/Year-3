import java.util.Enumeration;
import java.util.NoSuchElementException;

public abstract class AbstractProject{
    protected String name;
    protected float salary;
    protected Project parent = null;
    protected boolean leaf = true;

    public abstract float getSalary();
    public abstract String getName();
    public abstract boolean add(Project e)
        throws NoSuchElementException;
    public abstract void remove(Project e)
        throws NoSuchElementException;
    public abstract Enumeration subordinates();
    public abstract Project getChild(String s);
    public abstract float getSalaries();
    public boolean isLeaf() {
        return leaf;
    }
}
