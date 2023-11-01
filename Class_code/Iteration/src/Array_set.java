import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Array_set<T> implements Iterable<T> {
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
    public Iterator<T> iterator(){
        return new ArraySetIterator();

    }
    @Override
    public String toString(){
        String returnString= "{";
        for (T item: this){
            returnString += item;
            returnString += ", ";
        }
        returnString += "}";
        return returnString;
    }
    private class ArraySetIterator implements Iterator<T>{
        private int wizPos;
        public ArraySetIterator(){
            wizPos=0;
        }

        public boolean hasNext(){
            return wizPos<size;
        };
       public T next(){
            T return_item= items[wizPos];
            wizPos++;
            return return_item;
       };
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
        Set<Integer> javaset= new HashSet<>();

        //ugly iterator
        Iterator<Integer> seer =javaset.iterator();
        while(seer.hasNext()){
            int i=seer.next();
            System.out.println(i);
        }
        Iterator<String> Aseer=  s.iterator();
        while (Aseer.hasNext()){
            String a=Aseer.next();
            System.out.println(a);
        }
        //the enhance loop can work after Iterable implemented
        for (String a:s){
            System.out.println(a);
        }





    }
}