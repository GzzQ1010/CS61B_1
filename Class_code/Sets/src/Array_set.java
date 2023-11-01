/**
 * Set
 Store a set of values with no duplicates
 Has no sense of order.
 *
 */
public class Array_set<T> {
    private T[] items;
    private int size;//the next item to add is at positon size

    public Array_set(){
        items=(T[]) new Object[100];
        size=0;
    }
    public boolean contains(T x ){
        for (int i=0;i<size;i++){
            if (x.equals(items[i])){
                return true;
            }
        }
        return false;
    }

    public void add(T x){
        if (contains(x)){
            return;
        }else {
            items[size]=x;
            size+=1;
        }
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        Array_set<String> s = new Array_set<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("horse");
        s.add("fox");
        System.out.println(s.contains("horse"));
        System.out.println(s.size());
    }
}