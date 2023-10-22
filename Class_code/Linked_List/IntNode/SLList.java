/**An Sllist is a list of integers, which hides the terrible
 truth of the nakedness witnin
 */
public class SLList{
//    public IntNode first;
    /*To avoid change in first leads infinite loop, use private */
    private IntNode first;
/** SLList is easier to instantiate(no need to specify null) */
    public SLList(int x){
        first=new IntNode(x,null);
    }
    /*Add x to the front of the list */
    public void addFirst(int x){
        first= new IntNode(x,first);
    }
    /*Get the first item in the list */
    public int getFirst(){
        return first.item;
    }
    public static void main(String[] args){
        SLList L = new SLList(10);
        L.addFirst(15);
        L.addFirst(5);
        System.out.println(L.getFirst());
    }
}