//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 *addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/
public class Naive_AList {
    int size;
    int[] items;
    int RFACTOR;// need to get a value
    public Naive_AList() {
        items= new int[100];
        size=0;
    }
    private void resize(int capacity){
        int[] a= new int[capacity];
        System.arraycopy(items,0,a,0,size);
        items=a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size==items.length){
            resize(size*RFACTOR);
        }
        items[size]=x;
        size=size+1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        //we don't really need to change item[i]
        int x=getLast();
        size=size-1;
        items[size]=0;//yeah, but unnecessary
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