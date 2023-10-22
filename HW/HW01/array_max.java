public class array_max {
    /*Return the maximum value from array m */
    public int[] m;
    //constructor
    public array_max(int[] numbers){
        m=numbers;
    }
    public static int max(int[] m){
        int x=m[0];
        for(int i=0;i<m.length;i++){
            if(x<m[i])
                x=m[i];
        }
        System.out.println(x);
        return x;
    }
    public static void main(String[] args){
        int [] numbers = new int[]{9,2,15,2,22,10,6};
        max(numbers);
    }
}
