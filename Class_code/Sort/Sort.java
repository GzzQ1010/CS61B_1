/*Selection sorting
* find the smallest item
* move it to the front
* Selection sort the remaining N-1 items(without touching front item*/
public class Sort {
    public static void sort(String[] x){
//    int smallestIndex=findSmallest(x);
//    swap(x,0,smallestIndex);
    sort(x,0);
    }
    /*Helper function Sorts x starting at position start.*/
    private static void sort(String[] x, int start){
        if(start==x.length){
            return;
        }
        int smallestIndex= findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x,start+1);
    }
    //return index of the smallest string in x
    /*This should be private. However, we need another way to access the private
    method in other file. It's accept for now;*/
    public static int findSmallest(String[] x,int start){
        int smallestIndex=start;
        for (int i=start;i<x.length;i++){
            //from internet if x[i]<x[smallestIndex], cmp =-1
            int cmp= x[i].compareTo(x[smallestIndex]);
            if (cmp<0){
                    smallestIndex=i;
            }
        }
        return smallestIndex;
    }
    /*swap item a with b*/
    public static void swap(String[] x, int a, int b){
        String temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
}
