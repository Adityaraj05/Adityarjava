// Wrapper classes
//  ==> A class whose object contains or wraps PDT. object of a wrapper class contains a field which sotre field. 
// example:--int === Integer


// code shai hai run on ecclipse it running
// Arraylist
// List<AnyClass>list = new ArrayList<AnyClass>();
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistclass {
    public static void main(String[] args) {
        // wrapper classes
        // Integer in = Integer.valueOf(4);
        // System.out.println(in);

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        // ArrayList<Boolean> l2 = new ArrayList<Boolean>();
        // ArrayList<Float> l2 = new ArrayList<Float>();

        // add new element

        l1.add(5);//5
        l1.add(6);//5,6
        l1.add(7);//5,6,7
        l1.add(8);//5.,6,7,8

        // get an element at index i
        System.out.println(l1.get(0));
        // print with for loop

        for(int i=0; i<l1.size(); i++){

            System.out.println(l1.get(i));// 5,6 ,7,8

            // pritnitg the array list directly
            System.out.println(l1);  //[5,6,7,8]

            // adding element at some index i//[5 100 6 7 8]
            l1.add(index:1, element:100);
            System.out.println(l1);
            // modifying element at some index i
            l1.set(1, 10);
            System.out.println(l1); //[5,10,6,7,8]


            // removing an element at index i
            l1.remove(index:1);
            System.out.println(l1);

            // removing an element e
            l1.remove(Integer.valueOf(i:7));//it return boolean value
            System.out.println(l1);

            // checking if the element exists
            boolean ans = l1.contains(Integer.valueOf(i:6));
            System.out.println(ans);

            // if you don't specify class, you can put anything inside l1
            ArrayList l = new ArrayList();
            l.add(1);
            l.add("pqrse");
            l.add(1.66);
            System.out.println(l);
            



        }

    }
    
}

