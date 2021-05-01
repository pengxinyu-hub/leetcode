public class MyHashMap {
    private Node first;
    private class Node{
        int key;
        int val;
        Node next;
        public Node(int key, int val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    /** Initialize your data structure here. */
    public MyHashMap() {
        first=null;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        for(Node x=first;x!=null;x=x.next){
            if(key== x.key){
                x.val=value;
                return;
            }
        }
        first=new Node(key,value,first);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for(Node x=first;x!=null;x=x.next){
            if(key== x.key)
                return x.val;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(first==null) return;
        if(first.key==key)  {
            first=first.next;
            return;
        }
        for(Node x=first;x.next!=null;x=x.next){
            if(x.next.key==key) {
                x.next = x.next.next;
                return;
            }
        }
    }
}
