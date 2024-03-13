package csw;
import java.util.*;
class TreeSet1{
    public static void main(String args[]){
        // Creating and adding elements
        TreeSet<String> tr=new TreeSet<String>();
        tr.add("Ravi");
        tr.add("Vijay");
        tr.add("Ravi");
        tr.add("Ajay");

        // Traversing elements
        Iterator<String> itr=tr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);

        Iterator<Integer> it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=t.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println();
        System.out.println("polling");
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: "+set);
        System.out.println("Reverse Set: "+set.descendingSet());
        System.out.println("Head Set: "+set.headSet("D", true));
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));
        System.out.println("TailSet: "+set.tailSet("C",false));



        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        System.out.println("Returning element: " +al.get(1));

        // changing the element
        al.set(1, "Dates");

        // traversing list
        for(String fruit:al)
            System.out.println(fruit);
    }
}