/*Interface is a specification of what a List is able to do, not how to do it */

public interface List61B<Type> {

    /** Inserts X into the back of the list. */
    public void addLast(Type x);

    /** Returns the item from the back of the list. */
    public Type getLast();
    /** Gets the ith item in the list (0 is the front). */
    public Type get(int i);

    /** Returns the number of items in the list. */
    public int size();

    /* inserts item into array arr at the given position.  */
    public void insert( Type item, int position);

    /*Add First */
    public void addFirst(Type x);

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Type removeLast();

    /*Example of body inheritance(Implementation Inheritance)
    print everything in list*/
    default public void print(){
        for(int i=0; i<size();i++){
            System.out.println(get(i)+" ");
        }

        System.out.println();
    }
    /*
    Partuclar Danger of Implementation Inheritance
        1.Makes it hardetr to keep track of where something was
        actually implemented(though a good IDE makes this better)
        2.Rules for resolving conflicts can be arcane
            eg:what of twp interface both give conflicting default methods?
        3.Encourages overly complex code
            common mistake: has-a vs is-a
        4.Break encapsulation
            what's that?
     */

}