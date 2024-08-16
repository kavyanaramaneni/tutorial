/*
 Example 1:

Input: arrays = [[1,2,3],[4,5],[1,2,3]]
Output: 4
Explanation: One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.
 */
package Program;

import java.util.ArrayList;
import java.util.List;

public class MaximumDistanceinArrays {

    public static void main(String[] args){
        List<List<Integer>> arr=new ArrayList<>();

        maxDistance(arr);
        System.out.println(maxDistance);

    }
    public int maxDistance(List<List<Integer>> arrays)
    {
            int m=arrays.size();
            int minVal=arrays.get(0).get(0);
            int maxVal=arrays.get(0).get(arrays.get(0).size()-1);
            int maxDistance=0;
            for(int i=1;i<m;i++){
                List<Integer> array=new ArrayList<>();
                maxDistance=Math.max(maxDistance,Math.abs(array.get(array.size()-1)-minVal));
                maxDistance=Math.max(maxDistance,Math.abs(array.get(0)-maxVal));
                minVal=Math.min(minVal,array.get(0));
                maxVal=Math.max(maxVal,array.get(array.size()-1));
            }

    }
}
