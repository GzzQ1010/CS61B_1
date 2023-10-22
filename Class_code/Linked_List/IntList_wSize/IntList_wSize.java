public class IntList_wSize {
    public int first;
    public IntList_wSize rest;

    public IntList_wSize(int f, IntList_wSize r){
        first=f;
        rest=r;
    }
    /*Static method, using recursion */
    public static int size(IntList_wSize list){
        if(list.rest==null){
            return 1;
        }else{
            return 1+size(list.rest);
        }
    }
    /*Non_static method using recursion */
    public int size(){
        if(this.rest==null){
            return 1;
        }else{
            return 1+this.rest.size();
        }
    }

    /*Return size of list using iteration*/
    public int iterativeSize(){
            IntList_wSize P;
            int total_size=0;
            P=this;
            while (P!=null){
                total_size+=1;
                P=P.rest;
            }
            return total_size;
    }

    public static void main(String[] args){
        IntList_wSize L =new IntList_wSize(15,null);
        L = new IntList_wSize(10,L);
        L = new IntList_wSize(5,L);
        int size1=size(L);
        // int size2 = L.size();
        int size3=L.iterativeSize();
        System.out.println(size1);
        System.out.println(L.size());
        System.out.println(size3);


    }

}