package Part2;
public abstract class NumberList {

  protected int[] intList;
  protected double[] doubleList;
  protected String[] charList;

  NumberList() {
    intList = null;
    doubleList = null;
    charList = null;
  }

  public int[] getIntList() { return intList; }
  public double[] getDoubleList() { return doubleList; }
  public String[] charList() { return charList; }
  public void display() {}
  public Number sum() { return null; }

}
