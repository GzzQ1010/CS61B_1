public class non_s_dog{
    public int WeightInEnglish;

    public non_s_dog(int W){
        WeightInEnglish=W;
    }
    public void MakeNoise(){
        if(WeightInEnglish <=10){
            System.out.println("yip");
        }else if(WeightInEnglish <=30){
            System.out.println("bark!");
        }else {
            System.out.println("woof");
        }
    }
    public non_s_dog MaxDog(non_s_dog dog){
        if(this.WeightInEnglish <= dog.WeightInEnglish){
            return dog;
        }
        return this;
    }
}