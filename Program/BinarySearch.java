package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(List<Integer> arr,int target){
        int left=0;
        int right=arr.size()-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr.get(mid)==target) return mid;
            if(arr.get(mid)<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr.add(x);

        }
        int target=sc.nextInt();
        int res=binarySearch(arr,target);
        System.out.println(res);

    }
}
