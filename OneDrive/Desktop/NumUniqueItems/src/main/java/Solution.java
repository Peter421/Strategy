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
public class Solution {
      public int solution(int[] A) {
        // write your code in Java SE 8
        ArrayList<Integer> elements = new ArrayList();
        for(int i=0;i<A.length;i++){
            elements.add(A[i]);
        }

        Set<Integer> unique = new HashSet(elements);
   return unique.size(); }
}
