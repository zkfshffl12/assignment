import java.util.List;
import java.util.ArrayList;


public class listtest {

    public static int[] numtest() {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        return nums;
    }

    public static void main(String[] args) {
        for(int num : numtest()) {
            System.out.println(num);
        }
        // List<String> list = new ArrayList<>();
        // list.add("Hello");
        // list.add("World");
        // System.out.println(list);
        
        // List<Integer> intList = new ArrayList<>();
        // intList.add(1);
        // intList.add(2);
        // System.out.println(intList);
        
        // List<Double> doubleList = new ArrayList<>();
        // doubleList.add(3.14);
        // doubleList.add(2.71);
        // System.out.println(doubleList);
        

    }   
    
}
