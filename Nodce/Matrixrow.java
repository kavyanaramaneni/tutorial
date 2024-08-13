package Nodce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrixrow {
    public static void main(String[] args){
        List<List<Integer>> mt=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int cols=s.nextInt();
       
        for(int j=0;j<rows;j++)
        {
            List<Integer> row=new ArrayList<>();
        for(int i=0;i<cols;i++){
            int x=s.nextInt();
          row.add(x);
        }
    
        mt.add(row);
        
    }

        for(var i:mt) {
            for(var j:i){
                System.out.print(j+" ");
            }
            System.out.println();

        }
        System.out.println();
        for(int i=0;i<mt.size();i++){
            for(int j=0;j<mt.get(0).size();j++){
                System.out.print(mt.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
    
}
