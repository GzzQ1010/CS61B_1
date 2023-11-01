/*
A list that remembers all items that have been banished by removeLast
 */
public class VengefulDLList<Type> extends Generic_DLLists<Type> {
    Generic_DLLists<Type> deletedItems;//= new Generic_DLLists<Type>();
    //is possible to not have constructor below, just do assign above

    //constructors are not inherited
    /*While constructors are not inherited, Java requires that all
    constructors must start with a call to one of its superclass's
    constructors.*/
    public VengefulDLList(){
        super();//super class constructor
        deletedItems= new Generic_DLLists<Type>();
    }
    @Override
    public Type removeLast(){
        Type x=super.removeLast();
        deletedItems.addLast(x);
        return x;
    }
    public void printLostItems(){
        deletedItems.print();
    }

    public static void main(String[] args){
        VengefulDLList<Integer> vs1= new VengefulDLList<>();
        vs1.addLast(1);
        vs1.addLast(2);
        vs1.addLast(3);
        vs1.addLast(4);

        vs1.removeLast();
        vs1.removeLast();

        System.out.print("The fallen are: ");
        vs1.printLostItems();
    }

}
