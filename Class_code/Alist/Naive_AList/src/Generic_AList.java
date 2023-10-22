public class Generic_AList<Type_> {
    int size;
    Type_[] items;
    int RFACTOR;// need to get a value
    public Generic_AList() {
        items= (Type_[]) new Object[100];
        size=0;
    }
    private void resize(int capacity){
        Type_[] a= (Type_[])new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items=a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Type_ x) {
        if(size==items.length){
            resize(size*RFACTOR);
        }
        items[size]=x;
        size=size+1;
    }

    /** Returns the item from the back of the list. */
    public Type_ getLast() {
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Type_ get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /* inserts item into array arr at the given position.  */
    public Type_[] insert(Type_[] arr, Type_ item, int position){
        Type_[] result= (Type_[])new Object[arr.length+1];
        position=Math.min(arr.length,position);
        for (int i=0;i<position;i++){
            result[i]=arr[i];
        }
        result[position]=item;
        for(int i=position;i<arr.length;i++){
            result[i+1]=arr[i];
        }
    return result;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Type_ removeLast() {
        //we don't really need to change item[i]
        Type_ x=getLast();
        items[size-1]=null;//Lotering
        size=size-1;
//        items[size]=0;//yeah, but unnecessary
        return x;
        /*Alternative8*/
//        int returnItem=items[size-1];
//        size-=1;
//        return returnItem;
    }
    /*Second performance problem
    Our AList is almost done, but we have one major issue. Suppose
    we insert 1,000,000,000 items, then later remove 990,000,000 items.
    In this case, we'll be using only 10,000,000 of our memory boxes,
    leaving 99% completely unused.

    To fix this issue, we can also downsize our array when it starts
    looking empty. Specifically, we define a "usage ratio" R which is
    equal to the size of the list divided by the length of the items array. */

    public static void main(String[] args) {

    }
}