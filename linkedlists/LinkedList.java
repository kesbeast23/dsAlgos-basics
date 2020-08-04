import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        
        public Node(){};
        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;
    private int size;
    //addfirst
    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first=last = node;
        }else{
            node.next=first;
            first = node;
        }
        size++;
    }
    //addlast
    public void addLast(int item){
        Node node = new Node(item);

        if(isEmpty()){
            first=last=node;
        }else{
            last.next=node;
            last=node;
        }
        size++;
    }
    private boolean isEmpty(){
        return first==null;
    }

    public int indexOf(int item){
        int index=0;
        var current = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        
        if(first==last){
            first=last=null;
            return;
        }else{
            var second = first.next;
            first.next=null;
            first=second;
        }

        size--;
    }
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first==last){
            first=last=null;
            return;
        }else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
       
        size--;
    }
    private Node getPrevious(Node node){
        var current=first;
        while(current!=null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public int size(){
        return size;
    }
    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index=0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
    public void reverse(){
        if(isEmpty()) return;

        var previous =first;
        var current = first.next;
        last=first;
        last.next=null;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }
    public int getKthFromTheEnd(int k){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var a =first;
        var b = first;
        
        for (int i = 0; i < k-1; i++) {
            b=b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }

        while (b != last) {
            a=a.next;
            b=b.next;
        }
        return a.value;
    }
}