/*
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
package coding.Leetcode;
import java.io.*;
import java.util.*;

/**
 *
 * @author Disha Sharma
 */
public class MajorityElement {
    static int MajorityElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i], val+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int m=-1;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int val = entry.getValue();
        if(val > n/2){
            m=entry.getKey();
            break;
        }        
    }
    return m;
}
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = MajorityElement(arr);
        System.out.println(result);
    }
}    