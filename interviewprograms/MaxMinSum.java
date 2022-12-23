package interviewprograms;

public class MaxMinSum {
    public static int findDifference(int N, int M, int[] A){
        int maxSum = 0;
        int minSum = 0;
        int temp=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(A[i]<=A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
            
        }
        for(int i=0; i<M; i++){
            minSum += A[i];
        }
        for(int i=N-M; i<N; i++){
            maxSum += A[i];
        }
        return (maxSum - minSum);
    }
    public static void main(String[] args) {
        int M = 3;
        int[] A = {7,5,8,7,1,8,7,8};
        int N = A.length;
        int diff = findDifference(N, M, A);
        System.out.println("The difference is : " + diff);

    }
    
}
