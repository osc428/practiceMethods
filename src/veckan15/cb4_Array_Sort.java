package veckan15;

import java.util.Arrays;
import java.util.LinkedList;

public class cb4_Array_Sort {
    public static void main(String[] args) {
       System.out.println(centeredAverage(new int[]{5, 3, 4, 6, 2}));// → 3
       System.out.println(Arrays.toString(sortStringArray(new String[]{"Ahmet", "Mehmet", "Cemil", "Selim"})));// → 3
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));// → 5
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));// → -3
        System.out.println(Arrays.toString(sort(new int[]{5, 3, 4, 6, 2})));
        LinkedList ef = new LinkedList();
        ef.add("Ankara");
    }

    private static int centeredAverage(int[] nums) {
        int[] sortedNums = sort(nums);
        if (nums.length%2==0) return (sortedNums[nums.length/2-1]+sortedNums[nums.length/2])/2;
        return sortedNums[nums.length/2];
    }

    public static int [] sort (int[] nums){
    int [] sortedNums = new int[nums.length];
    //sortedNums [0] = nums[minindex(nums)];

        for (int i = 0; i < sortedNums.length; i++) {
            int [] temp = new int[nums.length-1];
            int a = 0;
            int min = minindex(nums);
            sortedNums [i] = nums[min];
            for (int j = 0; j < nums.length; j++) {
                if(j != min) {temp [a] = nums[j]; a++;}
            }
            nums = temp;
        }
    return sortedNums;
    }
    public static int minindex (int[] nums){
        int min=nums[0];
        int minindex = 0;
        for (int j=0;j<nums.length;j++){
            if(nums[j]<min) {min = nums[j]; minindex = j;}
        }
        return minindex;
    }

    public static String [] sortStringArray (String[] strings){
        String [] sorted = new String[strings.length];

        for (int i = 0; i < sorted.length; i++) {
            String [] temp = new String[strings.length-1];
            int a = 0;
            int min = minindex(strings);
            sorted [i] = strings[min];
            for (int j = 0; j < strings.length; j++) {
                if(j != min) {temp [a] = strings[j]; a++;}
            }
            strings = temp;
        }
        return sorted;
    }
    public static int minindex (String[] str){
        String min=str[0];
        int minindex = 0;
        for (int j=0;j<str.length;j++){
            if(str[j].compareTo(min)<0) {min = str[j]; minindex = j;}
        }
        return minindex;
    }
}
