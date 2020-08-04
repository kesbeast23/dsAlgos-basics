import java.util.Arrays;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println(list.size());
         list.addFirst(10);
         list.addLast(20);
         list.addLast(30);

         var array = list.toArray();
         System.out.println(Arrays.toString(array));
    }
}