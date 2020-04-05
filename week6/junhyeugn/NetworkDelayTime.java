public static int networkDelayTime(int[][] times, int N, int K) {
        int[][] g = new int[100][100];
        int[] c = new int[100];
        int maxNum = 0;
        int cnt = 0;
        
        for(int i=0; i<g.length; i++)
        {
            for(int j=0; j<g.length; j++)
            {
                g[i][j] = -1;
            }
        }
        
        for(int i=0; i<100; i++)
        {
            c[i] = -1;
        }

        for(int i=0; i<times.length; i++)
        {
            g[times[i][0]-1][times[i][1]-1] = times[i][2];
        }
        
        dfs(N, K, 0, g, c, K-1, K-1);
        c[K-1] = -1;
        
        for(int i=0; i<100; i++)
        {
            if( c[i] != -1 )
            {
                cnt++;
                if(maxNum < c[i]) maxNum  = c[i];
            }
        }

        if(maxNum == 0 || cnt != N-1) {
            return -1;
        } else {
            return maxNum;
        }
    }

    public static void dfs(int N, int K, int deep, int[][] g, int[] c, int s_v, int e_v)
    {
        if(deep+1 > N) return;

        int n = g.length;
        
        if(K-1 != e_v)
        {
            c[e_v] = c[s_v] + g[s_v][e_v];    
        } else {
            c[e_v] = 0;
        }

        for(int i=0; i < n; i++)
        {
            if(g[e_v][i] != -1)
            {
                if(c[i] == -1 && i != K-1)
                {
                    dfs(N, K, deep+1, g, c, e_v, i);    
                } else if(c[e_v] + g[e_v][i] < c[i]) {
                    dfs(N, K, deep+1, g, c, e_v, i);    
                }
            }
        }
    }
