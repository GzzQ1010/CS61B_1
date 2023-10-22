public class IntList_wGet{
    public int first;
    public IntList_wGet rest;

    /*Constructor of Intlist*/
    public IntList_wGet(int f, IntList_wGet r){
        first=f;
        rest=r;
    }
    /*Size method*/
    public int size(){
        if(this.rest==null){
            return 1;
        }else {
            return 1+this.rest.size();
        }
    }
    /*get method, retrun the value of nth on list. Using iteration method*/
    public int get(int n){//this method is only working on int list
        IntList_wGet P=this;
        while(n!=0){
            n--;
            P=P.rest;
        }
        return P.first;
    }
    /*get method; using recursion method*/
    public int Get(int i){
        if(i==0){
            return this.first;
        }else{
            return this.rest.Get(i-1);
        }
    }

    /*Main program*/
    public static void main(String[] args){
        IntList_wGet L= new IntList_wGet(15,null);
        L=new IntList_wGet(10 ,L);
        L= new IntList_wGet(5, L);
        int x=L.get(2);
        int y=L.Get(0);
        System.out.println(x);
        System.out.println(y);

    }
}