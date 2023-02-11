
package data_structur;

/**
 *
 * @author ziade
 */
public class MST {

    static int v = 5;
    static int[] parent = new int[v];
    static int INF = Integer.MIN_VALUE;
    static int maxcost = 0;
    static int total = 0;
    static int[][] cost;

    static void kruskalMST(int[][] cost) {
        int maxcost = 0;

        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }
        int edge_count = 0;
        while (edge_count < v - 1) {
            int min = INF, a = -1, b = -1;
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if (find(i) != find(j) && cost[i][j] > min) {
                        min = cost[i][j];
                        a = i;
                        b = j;

                    }

                }

            }
            union1(a, b);
            edge_count++;
            maxcost += min;
        }
     
        System.out.println("Removed minimum cost = " + ((total) - maxcost));

    }

    static int find(int i) {

        while (parent[i] != i) {
            i = parent[i];
        }

        return i;

    }

    static void union1(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }

    public static void main(String[] args) {
        StopWatch Timer = new StopWatch();
        Timer.setstartime(System.currentTimeMillis());
        int cost[][] = {
            {0, 1, 2, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0}

                       };
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                total += cost[i][j];

            }
        }

        kruskalMST(cost);
        Timer.setendtime(System.currentTimeMillis());
        double starttime = Timer.getstarttime();
        double endtime = Timer.getendtime();
        System.out.println("Excution time in mili seconed:\t" + Timer.gettimeelapsed(endtime, starttime)+" millisecond  ");

    }

}
