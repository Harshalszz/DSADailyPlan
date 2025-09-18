package ProblemsDay_104;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    //https://leetcode.com/problems/lru-cache/?envType=study-plan-v2&envId=top-interview-150

    Map<Integer, Node> mpp = new HashMap<>();
    int cap;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    private void insertAfterHead(Node node){
        mpp.put(node.key, node);
        Node currAfterHead = head.next;
        head.next = node;
        node.next = currAfterHead;
        currAfterHead.prev = node;
        node.prev = head;
    }

    private void deleteNode(Node node){
        mpp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if(!mpp.containsKey(key)) return -1;
        Node node = mpp.get(key);
        deleteNode(node);
        insertAfterHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            deleteNode(mpp.get(key));
            insertAfterHead(new Node(key, value));
        }
        else{
            if(mpp.size() == cap){
                deleteNode(tail.prev);
            }
            insertAfterHead(new Node(key, value));
        }
    }
    class Node{
        Node prev, next;
        int key, value;
        Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }

    public static void main(String[] args) {

    }
}
