/*
Following is an example of function overloading
However, there'are some shorts of overloading:
1.our source file is unnecessarily long.
2.repeat yourself
3.more code to maintain
    any change made to one, needs also made to others
    debuging
 */
public class WordUtils {
    public static String longest(Generic_AList<String> list){
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

    public static String longest(Generic_DLLists<String> list){
        int maxDex=0;
        for (int i=0; i<list.ugly_getSize();i+=1){
            String longestString=list.get(maxDex);
            String thisString=list.get(i);
            if(thisString.length()>longestString.length()){
                maxDex=i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}