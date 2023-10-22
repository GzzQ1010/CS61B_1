public class ContinueDemo {
    public static void main(String[] args){
        String[] a ={"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        for (int i=0;i<a.length;i++){
            if(a[i].contains("horse")){
                continue;
            }
            for (int j=0;j<3;j++){
                System.out.println(a[i]);
            }
        }
    }
}
