package Class;

public class new_dog {
    public int WeightInPounds;

    public void makeNoise(){
        if (WeightInPounds<10){
            System.out.println("tip");
        }
        else if(WeightInPounds<30){
            System.out.println("bark!");
        }
        else{
            System.out.println("woof ");
        }
    }
}
