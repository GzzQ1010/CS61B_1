package DLList;
public class Generic_DLLists<Type> {
    private class StaffNode {
        public StaffNode previous;
         public Type item;
        public StaffNode next;

        public StaffNode(StaffNode p, Type x, StaffNode n) {
            previous = p;
            item = x;
            next = n;
        }
    }

    /*Invariants*/
    private int size;
    private StaffNode sentinel;
    private StaffNode Last;

    /*Constructor*/
    //Empty constructor
    public Generic_DLLists() {
        sentinel = new StaffNode(null, null, null);
        Last = sentinel.next;
        size = 0;
    }

    //Initiative constructor
    public Generic_DLLists(Type x) {
        sentinel = new StaffNode(null, x, null);
        sentinel.next = new StaffNode(null, x, null);
        Last = sentinel.next;
        size = 1;
    }

    /*operators*/
    //add first
    public void addFirst(Type x) {
        sentinel.next = new StaffNode(null, x, sentinel.next);
//        sentinel.next.next = new StaffNode(sentinel.next, sentinel.next.next.item, sentinel.next.next.next);
        if(Last==null){
            Last=sentinel.next;
        }else{
            sentinel.next.next.previous=sentinel.next;
        }
        size+=1;
    }
    //add last
    public  void addLast(Type x){
        if(Last==null){
            sentinel.next=new StaffNode(null,x,null);
            Last=sentinel.next;
        }else {
            Last.next=new StaffNode(Last,x,null);
            Last=Last.next;
        }
        size+=1;
    }
    //remove Last
    public void removeLast(){
        if(Last==null){
            throw new IllegalCallerException("error no element in list");
        }else if(Last.previous==null){
            sentinel.next=null;
            Last=null;
        }
        else{
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
    //Insert x at position p
    public void insert(Type x, int p){
        if (p>this.size){
            throw new IllegalArgumentException("error! p is out of range");
        }else if(sentinel.next==null||p==0){
            addFirst(x);
            return;
        }else{
            StaffNode current_node=sentinel.next;
            while (p>1 && current_node.next!=null){
                p--;
                current_node=current_node.next;
            }
            StaffNode newNode= new StaffNode(current_node,x,current_node.next);
            current_node.next=newNode;
        }
    }
    //reverse list--incompleted following method applys to SLList only
    // public void reverse(){
    //     if(size==1){
    //         return;
    //     }
    //     StaffNode frontOfReversed=null;
    //     StaffNode nextNodeToAdd=this.sentinel.next;
    //     while(nextNodeToAdd!=null){
    //         StaffNode remainderOfOriginal=nextNodeToAdd.next;
    //         nextNodeToAdd.next=frontOfReversed;
    //         frontOfReversed=nextNodeToAdd;
    //         nextNodeToAdd=remainderOfOriginal;
    //     }
    //     sentinel.next=frontOfReversed;
    // }
    //get First
    public Type getFirst(){
        return sentinel.next.item;
    }
    //get Last
    public Type getLast(){
        return Last.item;
    }
    public Type get(int i){
        if(i>size){
            throw new IllegalArgumentException("error! out of range");
        }
        StaffNode P= sentinel.next;
        while(i!=0){
            P=P.next;
            i--;
        }
        return P.item;
    }
    //ugly get size--make sure the list is correctly linked
    public int ugly_getSize(){
        int total=0;
        StaffNode P=sentinel;
        while (P.next!=null){
            P=P.next;
            total+=1;
        }
        return total;
    }

    public static void main(String[] args) {
        Generic_DLLists<String> L = new Generic_DLLists<>("x");
        L.addFirst("a");
        L.addFirst("b");
        L.addLast("c");
        L.addLast("d");
        L.addLast("e");
        System.out.println(L.getFirst());//6
        System.out.println(L.getLast());//7
        L.removeLast();
        L.removeLast();
        L.removeFirst();
        System.out.println(L.getFirst());//3
        System.out.println(L.getLast());//5
        System.out.println(L.ugly_getSize());
        L.removeLast();
        L.removeLast();
        Generic_DLLists<Integer> L1=new Generic_DLLists<>();
        L1.addFirst(4);
        L1.addLast(5);
        System.out.println(L1.getFirst());
        System.out.println(L1.getLast());

    }
}