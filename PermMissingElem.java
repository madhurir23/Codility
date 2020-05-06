/*
Find the missing element in a given permutation. 
*/
class Solution {
    public int solution(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] == i+1 || A[i] > A.length) i++;
            else swap(A, i, A[i] - 1);
        }
        for (i = 0; i < A.length; i++) {
            if (A[i] != i+1) return i+1;
        }
        return A.length+1;
    }
    
    void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
