public class IntNode_wLastP{
    private static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item=i;
            next=n;
        }

    }
    private IntNode sentinel;
    private  IntNode Last;

    private int size;
    /*Two constructors */
    //empty constructor
    public IntNode_wLastP(){
        sentinel= new IntNode(1,null);
        Last= null;
        size=0;
    }
    //constructor with first element inside
    public IntNode_wLastP(int x){
        sentinel= new IntNode(1,null);
        Last= null;
        sentinel.next= new IntNode(x,null);
        Last=sentinel.next;
        size=1;
    }

    //add first
    public void addFirst(int x){
        sentinel.next= new IntNode(x,sentinel.next);
        if(Last==null){
            Last=sentinel.next;
        }
        size+=1;
    }
    //add last
    public void addLast(int x){
        Last.next=new IntNode(x,null);
        Last=Last.next;
        if (sentinel.next==null){
            sentinel.next=Last.next;
        }
        size+=1;
    }
    //Remove Last
    public void removeLast(){
        IntNode P=sentinel.next;
        while(P.next!=this.Last){
            P=P.next;
        }
        P.next=null;
        Last=P;
        size-=1;
    }
    // get first
    public int getFirst(){
        return sentinel.next.item;
    }
    //get last
    public int getLast(){
        return Last.item;
    }
    public  int ugly_getLast(){
        IntNode P=sentinel.next;
        while(P.next!=null){
            P=P.next;
        }
        return P.item;
    }


    public static void main(String[] args) {
        IntNode_wLastP L= new IntNode_wLastP(10);
        // L.addFirst(2);
        // L.addFirst(3);
        L.addLast(5);
        L.addLast(6);
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
        System.out.println(L.ugly_getLast());
        L.removeLast();
        System.out.println(L.ugly_getLast());
        System.out.println(L.getLast());
        System.out.println(L.size);
    }
}