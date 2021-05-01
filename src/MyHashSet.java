public class MyHashSet {
    private Node first;
    private class Node{
        int item;
        Node next;
        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    /** Initialize your data structure here. */
    public MyHashSet() {
        first=null;
    }

    public void add(int key) {
        if(contains(key)) return;
        Node oldfirst=first;
        first=new Node(key,oldfirst);
    }

    public void remove(int key) {
        if(first.item==key){
            first=first.next;
            return;
        }
        for(Node x=first;x.next!=null;x=x.next){
            if(x.next.item==key){
                x.next=x.next.next;
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Node x=first;
        for(Node n=first;n!=null;n=n.next){
            if(n.item==key)
                return true;
        }
        return false;
    }
}
