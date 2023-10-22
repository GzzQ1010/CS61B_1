public class SpeedTestAlist {
    public  static void main(String[] args){
        Naive_AList L=new Naive_AList();
        int i=0;
        while (i<1000000){
            L.addLast(i);
            i++;
        }
    }
}
