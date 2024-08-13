/*Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
*/
package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum{
    public static void main(String[] args)
    {

    }
    public List<List<Integer>> comb2(int[] candidates,int target){
        Arrays.sort(candidates);
        List<List<Integer>> subs=new ArrayList<>();
        generatelist(0,candidates,new ArrayList(),subs,target);
        return subs;
    }
    void generatelist(int start,int[] nums,List<Integer> current,List<List<Integer>> subsets,int target){

        if(target==0){
            subsets.add(new ArrayList(current));
            return;
        }
        if(target<0)return;
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            generatelist(i+1,nums,current,subsets,target-nums[i]);
            current.remove(current.size()-1);

        }

    }

}