/*inheritance allows subclasses to reuse code from an already defined class.
* it has access to all public members */
public class DLLists_Extend<Type> extends Generic_DLLists<Type> {
    public void rotateRight(){
        Type temp=removeLast();
        addFirst(temp);
    }

    public static void main(String[] args){
        DLLists_Extend<Integer> DLLExtend= new DLLists_Extend<>();
        DLLExtend.addLast(10);
        DLLExtend.addLast(11);
        DLLExtend.addFirst(12);
        DLLExtend.insert(1,1);
        DLLExtend.print();
        DLLExtend.rotateRight();
        DLLExtend.print();
    }
}




