public class Trees {
    static class Node{
        Node left,right;
        int data;

        Node(int d){
            this.data=d;
        }
        public void insert(int d){
            if(d<=data){
                if(left==null)
                    left= new Node(d);
                else
                    left.insert(d);
            }else{
                if(right==null)
                    right=new Node(d);
                else
                    right.insert(d);
            }
        }
        public boolean contains(int d){
            if(d==data){
                return true;
            }else if (d<data) {
                if (left==null) {
                    return false;
                }else{
                    return left.contains(d);
                }
            }else{
                if (right==null) {
                    return false;
                }else{
                    return right.contains(d);
                }
            }
        }
        public void printInOrder(){
            if (left!=null) {
                left.printInOrder();
            }
            System.out.println(data);
            if (right!=null) {
               right.printInOrder(); 
            }
        }
    }
    
}
