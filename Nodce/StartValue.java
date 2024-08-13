package Nodce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartValue {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int startValue=s.nextInt();
    List<Integer> mylist=new ArrayList();
    for(int i=0;i<n;i++){
        mylist.add(startValue++);// i=0 2 i=1 3 i=2 4 i=3 5
    }

    for(Integer i:mylist){
        System.out.print(i);
    }
    
    System.out.println(startValue);
}
    
}
