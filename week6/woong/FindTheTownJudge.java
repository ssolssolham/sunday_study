class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] result = new int[N+1];
        if(result.length == 2) return N;
        for(int[] item : trust) {
            if(result[item[1]] >= 0) {
                result[item[1]]++;
            }
            result[item[0]] = -1;
        }
        int max = 0;
        int cnt = 0;
        int target = -1;
        for(int tmp : result) {
            System.out.println(tmp);
            if(tmp > 0 && tmp > max ) {
                if(tmp == N-1) {
                    max = tmp;
                    target = cnt;
                }
            }
            cnt++;
        }
        return target;
    }
}
