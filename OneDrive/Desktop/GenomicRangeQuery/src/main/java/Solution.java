/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8

        //this solution can be used when we want to find min/max values given a sub range(query)

        int[] soln = new int[Q.length]; //soln array

        //for every possible value in query initialsie array of size of full dataset
        // in this case String
        int[] A = new int[S.length()+1];
        int[] C = new int[S.length()+1];
        int[] G = new int[S.length()+1];
        int[] T = new int[S.length()+1];


        //array starts at 0 
        for(int i=0;i<S.length();i++){
            //if certain char(value) is found at position i in String(dataset) add 1 to the value of its next index
            //note if never found values would stay at 0 as it adds 1 to curr indx which starts at 0
            if(S.charAt(i) =='A'){
                A[i+1] = A[i]+1;
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i];
            } else if(S.charAt(i) =='C'){
                A[i+1] = A[i];
                C[i+1] = C[i]+1;
                G[i+1] = G[i];
                T[i+1] = T[i];
            } else if(S.charAt(i) =='G'){
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i]+1;
                T[i+1] = T[i];
            } else if(S.charAt(i) =='T'){
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i]+1;
            }

            int numQueries = Q.length;// number of queries

            for(int j=0;j<numQueries;j++){
                //Subtract values of item at index of query ranges(Q[j]+1 A[p[j]]) 
                //if value is present the value produced will be more than 0

                int continsA = A[Q[j]+1] - A[P[j]];// if 
                int continsC = C[Q[j]+1] - C[P[j]];
                int continsG = G[Q[j]+1] - G[P[j]];
                int continsT = T[Q[j]+1] - T[P[j]];

                //task is to find lowest value present so can use if else for this
                
                if(continsA > 0){
                    soln[j] = 1;
                }else if (continsC > 0){
                    soln[j] = 2;
                }else if (continsG > 0){
                    soln[j] = 3;
                }else if (continsT > 0){
                    soln[j] = 4;
                }
            }
        }
     

        return soln; 
    }
}