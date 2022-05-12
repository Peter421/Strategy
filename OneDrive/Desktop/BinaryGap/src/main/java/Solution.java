/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class Solution {
  public int solution(int N) {
        // write your code in Java SE 8

        String dummy = Integer.toBinaryString(N);
        int maxBinaryGap=0;
        int currGap=0;
        int prevMax=0;

        for(int i=0;i< dummy.length();i++){

              if(dummy.charAt(i)=='0'){
                currGap++;
                if(currGap >= maxBinaryGap){
                    maxBinaryGap = currGap;
                    

                }
                
            } else if(dummy.charAt(i)== '1'){
                currGap = 0;
                prevMax = maxBinaryGap;
            }
             if(i == dummy.length()-1 && dummy.charAt(dummy.length()-1)=='0' && currGap==maxBinaryGap){
                maxBinaryGap = prevMax;
                currGap = 0;
                
            }
        }


        return maxBinaryGap;
    }
}
