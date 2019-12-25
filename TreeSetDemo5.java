import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator5());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("Q"));
        System.out.println(t);

    }
}

class MyComparator5 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}
