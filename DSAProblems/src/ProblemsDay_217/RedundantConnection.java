package ProblemsDay_217;

import java.util.HashMap;

public class RedundantConnection {

//https://leetcode.com/problems/redundant-connection/?envType=problem-list-v2&envId=breadth-first-search
    public class DSU {
        class Node {
            int val;
            int rank;
            Node parent;
        }

        private HashMap<Integer, Node> map;

        // Initialize: Every node is its own parent (its own island)
        public void create(int n) {
            map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                Node nn = new Node();
                nn.val = i;
                nn.rank = 1;
                nn.parent = nn;
                map.put(i, nn);
            }
        }

        // Find: Who is the "King" of this node's island?
        public int find(int nn) {
            Node n = map.get(nn);
            return find(n).val;
        }

        // Find with Path Compression: Makes the tree flat for speed
        public Node find(Node nn) {
            if (nn.parent == nn) {
                return nn;
            }
            Node root = find(nn.parent);
            nn.parent = root; // Path Compression
            return root;
        }

        // Union: Merge two islands based on which is "taller" (rank)
        public void union(int v1, int v2) {
            Node n1 = find(map.get(v1));
            Node n2 = find(map.get(v2));
            if (n1 != n2) {
                if (n1.rank == n2.rank) {
                    n2.parent = n1;
                    n1.rank++;
                } else if (n1.rank > n2.rank) {
                    n2.parent = n1;
                } else {
                    n1.parent = n2;
                }
            }
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        DSU g = new DSU();
        g.create(edges.length);

        for (int[] e : edges) {
            int root1 = g.find(e[0]);
            int root2 = g.find(e[1]);

            // If both nodes already share the same root,
            // this edge completes a cycle!
            if (root1 == root2) {
                return e;
            } else {
                g.union(e[0], e[1]);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {

    }
}
