/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
import java.io.*;
class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8

        int AdivK = (int)Math.floor(A/K); //number of times K goes into A
        int BdivK = (int)Math.floor(B/K); //number of times K goes into B

        int numsDivInRange = BdivK - AdivK; //this gives us divisible numbers in range 
        if(A%K == 0){
            numsDivInRange++;
        }

        return numsDivInRange;
    }
}