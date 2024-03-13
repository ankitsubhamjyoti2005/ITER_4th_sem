package csw;
import java.util.*;
public class LINK {
    public static void main(String[] args) {
//            LinkedList<String> al = new LinkedList<String>();
//            al.add("Ravi");
//            al.add("Vijay");
//            al.add("Ravi");
//            al.add("Ajay");
//
//            Iterator<String> itr = al.iterator();
//            while(itr.hasNext()) {
//                System.out.println(itr.next());
//            }


        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Initial list of elements: " + ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add method: " + ll);

        // Adding an element at the specific position
        ll.add(1, "Gaurav");
        System.out.println("After invoking add(index, e) method: " + ll);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");

        // Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll() method:"+ll);

        System.out.println(ll.getFirst());


        //third


        }
}
