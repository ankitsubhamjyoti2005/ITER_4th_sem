package

        csw;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Hashset1{
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        HashSet<String> set1=new HashSet<String>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Ravi");
        set1.add("Ajay");
        System.out.println("An initial list of elements: "+set1);
        //Removing specific element from HashSet
        set1.remove("Ravi");
        System.out.println("After invoking remove(object) method: "+set1);
        HashSet<String> set2=new HashSet<String>();
        set2.add("Ajay");
        set2.add("Gaurav");
        set1.addAll(set2);
        System.out.println("Updated List: "+set1);


        System.out.println();
    }
}