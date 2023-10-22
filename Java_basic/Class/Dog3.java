package Class;

public class Dog3 {
    //Instance variable
    public int WeightInPounds;
    //Constructor for dogs
    public Dog3(int W){
        WeightInPounds= W;
    }

    public void makeNoise(){
    //Non-static method aka instance method
        if (WeightInPounds<10){
            System.out.println("tip");
        }
        else if(WeightInPounds<30){
            System.out.println("bark!");
        }
        else{
            System.out.println("woof");
        }
    }
}
