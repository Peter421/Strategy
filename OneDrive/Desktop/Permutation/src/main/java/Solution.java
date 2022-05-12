/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
import java.util.*;
class Solution {
    static public int solution(int[] A) {
        Set<Integer> perm = new HashSet();
       // int N = A.length;
        Set<Integer> count = new HashSet();
       for(int i=0; i<A.length;i++){
           perm.add(A[i]);
           count.add(i+1);   
       }
System.out.println("perm "+perm);
System.out.println("count "+count);
       if(perm.containsAll(count)){
           return 1;
  } else return 0;
   }
    
      public static void main(String[] args){
         
         int[] A = {4, 1, 3, 2};
         solution(A);
     }
}
