/*
Find the minimal nucleotide from a range of sequence DNA. 
*/
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int[] aCount = new int[N+1];
        int[] cCount = new int[N+1];
        int[] gCount = new int[N+1];
        int[] tCount = new int[N+1];
        

        for (int index = 1; index <= N; index++) {
            char ch = S.charAt(index-1);
            aCount[index] = aCount[index-1];
            cCount[index] = cCount[index-1];
            gCount[index] = gCount[index-1];
            tCount[index] = tCount[index-1];
            if (ch == 'A') aCount[index] = aCount[index-1] + 1;
            if (ch == 'G') gCount[index] = gCount[index-1] + 1;
            if (ch == 'C') cCount[index] = cCount[index-1] + 1;
            if (ch == 'T') tCount[index] = tCount[index-1] + 1;
        }
        
        int[] res = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int pos1 = P[i];
            int pos2 = Q[i] + 1;
            

            if (aCount[pos2] > aCount[pos1]) res[i] = 1;
            else if (cCount[pos2] > cCount[pos1]) res[i] = 2;
            else if (gCount[pos2] > gCount[pos1]) res[i] = 3;
            else if (tCount[pos2] > tCount[pos1]) res[i] = 4;
        }
        return res;
    }
}
