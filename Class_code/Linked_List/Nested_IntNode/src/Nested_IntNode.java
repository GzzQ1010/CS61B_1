public class Nested_IntNode{
    public static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item=i;
            next=n;
        }
    }
    //    public IntNode first;
    /*To avoid change in first leads infinite loop, use private */
    private IntNode first;

    /**Fast size method; Caching: putting aside data to speed up retrieval*/
    private int size;

    /** SLList is easier to instantiate(no need to specify null) */
    public Nested_IntNode(int x){
        first=new IntNode(x,null);
        size=1;//part of fast size.
    }
    /*Add x to the front of the list */
    public void addFirst(int x){
        first= new IntNode(x,first);
        size+=1;//part of fast size.
    }
    /*Get the first item in the list */
    public int getFirst(){
        return first.item;
    }

    /*Adds and item to the end of the list.*/
    public void addLast(int x){
        IntNode P=first;
        while (P.next!=null){
            P=P.next;
        }
        P.next = new IntNode(x,null);
        size+=1;//part of fast size.
    }
    /**Return the size of the list that starts at IntNode p. */
    private static int size(IntNode p){
        if(p.next==null){
            return 1;
        }
        return 1+size(p.next);
    }

    public int size(){
        return size(first);
    }
    public static void main(String[] args){
        Nested_IntNode L = new Nested_IntNode(10);
        L.addFirst(15);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.size);
    }
}