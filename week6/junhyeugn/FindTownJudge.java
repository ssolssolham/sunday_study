public static int findJudge(int N, int[][] trust) {
        int[][] g = new int[1001][1001];
        HashSet<Integer> hs = new HashSet<Integer>();
        int cnt = 0;

        if(trust.length == 0 ) return 1;

        for(int i=0; i<trust.length; i++)
        {
            g[trust[i][0]][trust[i][1]] = 1;
            hs.add(trust[i][0]);
            hs.add(trust[i][1]);
        }

        for(Integer hi : hs)
        {
            for(int i=1; i<1001; i++)
            {
                if( g[i][hi] == 1 )
                {
                    cnt++;
                }
            }

            if(cnt == N-1)
            {
                boolean flag = true;

                for(int i=1; i<1001; i++)
                {
                    if( g[hi][i] == 1 )
                    {
                        flag = false;
                    }
                }

                if(flag) return hi;
            }

            cnt=0;
        }

        return -1;
    }
