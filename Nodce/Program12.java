package Nodce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program12 {
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        List<Integer> a=new ArrayList<>();
        int n=s.nextInt();
       for(int i=0;i<n;i++){
          int x=s.nextInt();
          a.add(x);
       }
       for(int i=0;i<n;i++)
       {
        System.out.print(a.get(i));
       }
       System.out.println();

       for(var i:a)//implicit
       {
        System.out.print(i+" ");
       }
       System.out.println();
       for(Integer i:a)//explicit
       {
        System.out.print(i+" ");
       }
    
    }
}
