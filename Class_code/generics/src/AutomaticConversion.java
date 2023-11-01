import java.util.ArrayList;

public class AutomaticConversion {

    public static void main(String[] args) {
        /*Old version*/
//        ArrayList<Integer> L= new ArrayList<Integer>();
//        L.add(new Integer(5)); it's annoying and it's been depreciated
//        L.add(new Integer(6));
//        int first= L.get(0).valueOf();

        /*Auto boxing(unboxing): Implicit conversions between wrapper/*/
        ArrayList<Integer> L =new ArrayList<Integer>();
        L.add(5);
        L.add(6);
        int first= L.get(0);
    }
    /**
     * Arrays are never autoboxed/unboxed
     *      eg: an Integer[] cannot be used in place of an int[]
     * Autoboxing/unboxing icures a measurable performance impact
     * wrapper type use Much more memory than primitive types
     */

}