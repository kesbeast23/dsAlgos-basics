import java.util.*;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
         
        myList.add("I");
        myList.add("S");
        myList.add("T");
        myList.addFirst("L");
        myList.addLast("S");
        myList.remove(4);
        System.out.println(myList.toString());
        System.out.println(myList.getFirst());

    }
}