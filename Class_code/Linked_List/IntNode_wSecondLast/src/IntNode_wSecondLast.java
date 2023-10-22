public class IntNode_wSecondLast {
    /* Adding a secondToLast pointer will not help either, because then we'd need to find the third to last item in the
    list in order to make sure that secondToLast and last obey the appropriate invariants after removing the last item*/
    private static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int x, IntNode n){
            item=x;
            next=n;
        }
    }
    private int size;
    private IntNode sentinel;
    private IntNode Last;

    private IntNode Second_Last;

    /*Two constructors*/
    public IntNode_wSecondLast(){
        sentinel=new IntNode(1,null);
        Last=null;
        Second_Last=null;
        size=0;
    }
    public IntNode_wSecondLast(int x){
        sentinel=new IntNode(1,null);
        sentinel.next=new IntNode(x,null);
        Last=sentinel.next;
        Second_Last=null;
        size=1;
    }
    //add first
    public void addFirst(int x){
        if(Last==null){
            sentinel.next=new IntNode(x,sentinel.next);
            Last=sentinel.next;
        }else if(Second_Last==null){
            sentinel.next= new IntNode(x,sentinel.next);
            Second_Last=sentinel.next;
        }else {
            sentinel.next=new IntNode(x,sentinel.next);
        }
        size+=1;
    }
    //add last
    public void addLast(int x){
        Second_Last=Last;
        Last.next= new IntNode(x,null);
        Last=Last.next;

        size+=1;
    }
    public void ugly_removeLast(){
        IntNode P=sentinel.next;
        while (P.next!=Last){
            P=P.next;
        }
        P.next=null;
        Last=P;
        size-=1;
    }
    public void removeLast(){

    }
    //Get first
    public int getFirst(){
        return sentinel.next.item;
    }
    //get last
    public int getLast(){
        return Last.item;
    }
    public int ugly_getLast(){
        IntNode P=sentinel.next;
        while (P.next!=null){
            P=P.next;
        }
        return P.item;
    }



    public static void main(String[] args) {
        IntNode_wSecondLast L= new IntNode_wSecondLast();
        L.addFirst(2);
        L.addFirst(3);
        L.addLast(5);
        L.addLast(6);
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
        System.out.println(L.ugly_getLast());
////        L.removeLast();
//        System.out.println(L.ugly_getLast());
//        System.out.println(L.getLast());
        System.out.println(L.size);
    }
}