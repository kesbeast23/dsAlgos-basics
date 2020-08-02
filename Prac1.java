import java.util.Arrays;

public class Prac1 {
    public static void main(String[] args) {
        int[] arrays = {45,12,85,32,89,39,69,44,42,1,6,8}; 
        int temp;
        for(int i=1;i<arrays.length;i++){
            for(int j=i;j>0;j--){
                if(arrays[j]<arrays[j-1]){
                    temp=arrays[j];
                    arrays[j]=arrays[j-1];
                    arrays[j-1]=temp;
                }
            }
        }
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.binarySearch(arrays, 6));
    }
}