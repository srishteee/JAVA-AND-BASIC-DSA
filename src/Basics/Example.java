import java.util.*;

public class Example {

    // Class to represent each edge in the graph
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    // Define necessary variables
    static int n;
    static List<List<Edge>> adj;
    static long[] distToX, distToY, distToZ, subtreeSize, totalDist;

    // DFS to calculate distances from a node to the target city
    public static void dfs(int node, int parent, long[] dist, int target, int[] targetArr) {
        for (Edge edge : adj.get(node)) {
            int next = edge.to;
            if (next == parent) continue;
            dist[next] = dist[node] + edge.weight;
            targetArr[next] = target;
            dfs(next, node, dist, target, targetArr);
        }
    }

    public static int findcity(int n, List<List<Integer>> arr, int x, int y, int z) {
        // Initialize adjacency list
        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Fill the graph with edges
        for (List<Integer> road : arr) {
            int u = road.get(0);
            int v = road.get(1);
            int w = road.get(2);
            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }

        // Initialize arrays for distances and subtree sizes
        distToX = new long[n + 1];
        distToY = new long[n + 1];
        distToZ = new long[n + 1];
        subtreeSize = new long[n + 1];
        totalDist = new long[n + 1];

        // Perform DFS for calculating distances to x, y, and z
        dfs(1, -1, distToX, x, new int[n+1]);
        dfs(1, -1, distToY, y, new int[n+1]);
        dfs(1, -1, distToZ, z, new int[n+1]);

        // For calculating the minimum distance city:
        long minDist = Long.MAX_VALUE;
        int minCity = -1;

        // Iterate over all cities to find the one that minimizes the distance sum
        for (int i = 1; i <= n; i++) {
            long totalDistance = distToX[i] + distToY[i] + distToZ[i];
            if (totalDistance < minDist || (totalDistance == minDist && i < minCity)) {
                minDist = totalDistance;
                minCity = i;
            }
        }

        // Return the city with the minimal distance sum
        return minCity;
    }

    // Main method to test
    public static void main(String[] args) {
        // Example to test the solution
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 15));
        arr.add(Arrays.asList(1, 3, 10));
        arr.add(Arrays.asList(2, 4, 20));
        arr.add(Arrays.asList(2, 5, 25));

        int x = 2, y = 3, z = 4;
        int n = 5;

        int result = findcity(n, arr, x, y, z);
        System.out.println(result);  // Expected output: 2
    }
}
