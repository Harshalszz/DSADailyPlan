package ProblemsDay_106;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class NodeA {
    public int val;
    public List<NodeA> neighbors;
    public NodeA() {
        val = 0;
        neighbors = new ArrayList<NodeA>();
    }
    public NodeA(int _val) {
        val = _val;
        neighbors = new ArrayList<NodeA>();
    }
    public NodeA(int _val, ArrayList<NodeA> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph {

    //https://leetcode.com/problems/clone-graph/?envType=study-plan-v2&envId=top-interview-150
    Map<NodeA, NodeA> map = new HashMap<>();
    public NodeA dfs(NodeA node){
        if(node == null) return null;
        if(map.containsKey(node)) return map.get(node);
        NodeA new_node = new NodeA(node.val);
        map.put(node,new_node);
        for(NodeA adj_node: node.neighbors){
            new_node.neighbors.add(dfs(adj_node));
        }
        return new_node;
    }
    public NodeA cloneGraph(NodeA node) {
        NodeA node_clone = dfs(node);
        return node_clone;
    }

    public static void main(String[] args) {

    }
}
