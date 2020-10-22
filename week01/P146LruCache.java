package leetcode.editor.cn;

//Java：LRU缓存机制

import java.util.HashMap;
import java.util.Map;

public class P146LruCache {

    public static void main(String[] args) {
        LRUCache solution = new LRUCache(3);
        // TO TEST
        int r = solution.get(1);
        System.out.println(r);
        solution.put(1,1);
        solution.put(2,2);
        solution.put(3,3);
        solution.put(2,-2);
        solution.put(4,4);
        solution.put(5,5);
        System.out.println(solution.get(2));
        System.out.println(solution);

    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class LRUCache {

    private class DLinkNode<K, V> {
        private K key;
        private V value;
        private DLinkNode<K, V> pre;
        private DLinkNode<K, V> next;

        private DLinkNode() {}
        public DLinkNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%s:%s", this.key, this.value);
        }
    }

    private int capacity;
    private int size;
    private Map<Integer, DLinkNode<Integer, Integer>> map;
    private DLinkNode<Integer, Integer> head;
    private DLinkNode<Integer, Integer> tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new DLinkNode<Integer, Integer>();
        this.tail = new DLinkNode<Integer, Integer>();
        this.head.next = this.tail;
        this.tail.pre = this.head;
        this.map = new HashMap<Integer, DLinkNode<Integer, Integer>>(capacity);
    }
    
    public int get(int key) {
        if (this.map.get(key) == null) {
            return -1;
        }
        DLinkNode<Integer, Integer> node = this.map.get(key);
        move2head(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkNode<Integer, Integer> node = this.map.get(key);
        if (node == null) {
            node = new DLinkNode<Integer, Integer>(key, value);
            this.map.put(key, node);
            this.size++;
            insert2head(node);
            if (this.size > this.capacity) {
                this.map.remove(this.tail.pre.key);
                removeTail();
                this.size--;
            }
        } else {
            node.value = value;
            move2head(node);
        }
    }

    private void removeTail() {
        this.tail.pre.pre.next = this.tail;
        this.tail.pre = this.tail.pre.pre;
    }

    private void insert2head(DLinkNode<Integer, Integer> node) {
        node.next = this.head.next;
        node.pre = this.head;
        this.head.next.pre = node;
        this.head.next = node;
    }

    private void move2head(DLinkNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;

        insert2head(node);
    }

    @Override
    public String toString(){
        DLinkNode<Integer, Integer> node = this.head.next;
        while (node != null) {
            System.out.print("->");
            System.out.print(node);
            node = node.next;
        }
        return "";
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)

