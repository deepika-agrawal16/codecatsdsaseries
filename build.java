import java.util.*;

public class build {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(arr));
    }
}
