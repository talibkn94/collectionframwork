package collection.java.linkedlist;

import java.util.LinkedList;

public class Test2
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        
        ll.add("deepak");
        ll.add("rahul");
        ll.add("amit");
        ll.add("aaa");
        ll.add("bbb");
        
        //System.out.println(ll.removeFirst()+" element is removed");
        
        ll.removeLast();
        
        System.out.println(ll);
    }
}
