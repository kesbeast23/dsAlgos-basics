public class Main extends Array{
    
    public static void main(String[] args) {
        Array numbers = new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(40);
        numbers.insert(2);
        System.out.println( numbers.indexOf(40));
    }
}