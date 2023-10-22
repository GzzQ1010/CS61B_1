public class Sentinel_Upgraded{
    /*Unfinished*/
    private static class IntNode {
        IntNode previous;
        int item;
        IntNode next;

        public IntNode(IntNode p, int x, IntNode n) {
            previous = p;
            item = x;
            next = n;
        }
    }

    /*Invariants*/
    private int size;
    private IntNode sentinel;
    private IntNode Last;

    /*Constructor*/
    //Empty constructor
    public Sentinel_Upgraded() {
        sentinel = new IntNode(sentinel, 1, sentinel);
//        Last = sentinel.next;
        size = 0;
    }

    //Initiative constructor
    public Sentinel_Upgraded(int x) {
        sentinel = new IntNode(sentinel, 1, sentinel);
        sentinel.next = new IntNode(sentinel, x, null);
//        Last = sentinel.next;
        size = 1;
    }

    /*operators*/
    //add first
    public void addFirst(int x) {
        sentinel.next = new IntNode(null, x, sentinel.next);
        sentinel.previous=sentinel.next;
//        sentinel.next.next = new IntNode(sentinel.next, sentinel.next.next.item, sentinel.next.next.next);
        if(Last==null){
            Last=sentinel.next;
        }else{
            sentinel.next.next.previous=sentinel.next;
        }
        size+=1;
    }
    //add last
    public  void addLast(int x){
        if(Last==null){
            sentinel.next=new IntNode(null,x,null);
            Last=sentinel.next;
        }else {
            Last.next=new IntNode(Last,x,null);
            Last=Last.next;
        }
        size+=1;
    }
    //remove Last
    public void removeLast(){
        if(Last==null){
            throw new IllegalCallerException("error no element in list");
        }else{
            Last.previous.next=null;
            Last=Last.previous;
        }
        size-=1;
    }
    //remove first
    public void removeFirst(){
        if (sentinel.next==null){
            throw new IllegalCallerException("error! no element in list");
        }else {
            sentinel.next = sentinel.next.next;
            sentinel.next.previous = null;
        }
    }
    //get First
    public int getFirst(){
        return sentinel.next.item;
    }
    //get Last
    public int getLast(){
        return Last.item;
    }
    //ugly get size--make sure the list is correctly linked
    public int ugly_getSize(){
        int total=0;
        IntNode P=sentinel;
        while (P.next!=null){
            P=P.next;
            total+=1;
        }
        return total;
    }

    public static void main(String[] args) {
        Sentinel_Upgraded L = new Sentinel_Upgraded(5);
        L.addFirst(3);
        L.addFirst(6);
        L.addLast(5);
        L.addLast(10);
        L.addLast(7);
        System.out.println(L.getFirst());//6
        System.out.println(L.getLast());//7
        L.removeLast();
        L.removeLast();
        L.removeFirst();
        System.out.println(L.getFirst());//3
        System.out.println(L.getLast());//5
        L.removeLast();
        L.removeLast();
        System.out.println(L.ugly_getSize());

    }
}