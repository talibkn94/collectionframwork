package collection.java.arraylist;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test1
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();   //capacity - 10; size - 0
        
        al.add(0, 50);
        al.add(1, 90);
        al.add(20);
        al.add("talib");
        al.add(3, "akash");
        System.out.println(al);
        LinkedList<String> ll=new LinkedList<>();
        ll.add(String.valueOf(al));
        System.out.println(ll);

    }
}
