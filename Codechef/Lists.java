package Codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int count=0;
            int surplus=0;
            int[] a=new int[n];
            List<Integer> defects=new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>=x)
                {
                    count++;
                    surplus+=a[i]-x;
                }else{
                    defects.add(x-a[i]);
                }
            }
            Collections.sort(defects);
            for(int def:defects){
                if(surplus>=def){
                    surplus-=def;
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);

        }

    }
    
}
/* 
Input:
1
3 2
2 3 1
output:
3*/
