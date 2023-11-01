public class WordUtils2 {
    public static String longest(List61B<String> list){
        int maxDex=0;
        for (int i=0; i<list.size();i+=1){
            String longestString=list.get(maxDex);
            String thisString=list.get(i);
            if(thisString.length()>longestString.length()){
                maxDex=i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args) {
        Generic_AList<String> some_list= new Generic_AList<>();
        some_list.addLast("elk");
        some_list.addFirst("cdsdc");
        System.out.println(longest(some_list));
        Generic_DLLists<String> list2 = new Generic_DLLists<>();
        list2.addLast("abc");
        list2.addFirst("abcd");
        System.out.println(longest(list2));
        System.out.println("Body implementation");
        some_list.print();// how do we know which print method is applied?
        /*
        We know that variables in java have a type.

List61B<String> lst = new SLList<String>();

In the above declaration and instantiation, lst is of type "List61B". This is called the "static type"

However, the objects themselves have types as well. the object that lst
points to is of type SLList. Although this object is intrinsically an
SLList (since it was declared as such), it is also a List61B, because
of the “is-a” relationship we explored earlier. But, because the object
itself was instantiated using the SLList constructor, We call this its "
dynamic type".
         */
    }
}