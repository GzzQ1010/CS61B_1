public class static_dog{
    public int WeightInPounds;
    public static_dog(int W){
        WeightInPounds=W;
    }
    public void MakeNoise(){
        if(WeightInPounds>10) {
            System.out.println("yip");
        }
        else if(WeightInPounds>30) {
            System.out.println("bark!");
        }
        else {
            System.out.println("woof!");
        }
    }
    public static static_dog maxDog(static_dog dog1, static_dog dog2){
        if(dog1.WeightInPounds>=dog2.WeightInPounds){
            return dog1;
        }
        return dog2;
    }
}