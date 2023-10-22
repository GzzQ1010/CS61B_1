public class EmptyC_wSentinelNode{
    private static class IntNode{
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
    /*The first item(if it exist) is at sentinel.next. */
    private IntNode sentinel;

    /*Set last pointer*/
    private IntNode Last;

    /**Fast size method; Caching: putting aside data to speed up retrieval*/
    private int size;

    /*Constructor of an empty list */
    public EmptyC_wSentinelNode(){
        /*first=null;
         * bug leads.
         * ex: L= new EmptyC_wSentinelNode();
         * L.addLast(x); //error L.next doesn't exist
         * However, we can modify addLast to fix it.
         */
        sentinel= new IntNode(1,null); //IntNode(x,null); x can be any number
        Last= new IntNode(1,null);
        size=0;
    }
    /** SLList is easier to instantiate(no need to specify null) */
    public EmptyC_wSentinelNode(int x){
        sentinel= new IntNode(1,null);
        sentinel.next= new IntNode(x,null);
        Last.next=sentinel.next;
        size=1;//part of fast size.
    }
    /*Add x to the front of the list */
    public void addFirst(int x){
        sentinel.next= new IntNode(x,sentinel.next);

        size+=1;//part of fast size.
    }
    /*Get the first item in the list */
    public int getFirst(){
        return sentinel.next.item;
    }

    /*Adds and item to the end of the list.*/
    public void addLast(int x){
        IntNode P=sentinel;
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
        EmptyC_wSentinelNode L = new EmptyC_wSentinelNode();
        L.addFirst(15);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
//        System.out.println(L.size());
        System.out.println(L.size);
    }
}
