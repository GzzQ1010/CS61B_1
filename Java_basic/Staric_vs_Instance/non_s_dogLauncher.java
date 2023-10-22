public class non_s_dogLauncher{
    public static void main(String[] args){
        non_s_dog dog1= new non_s_dog(5);
        non_s_dog dog2= new non_s_dog(50);

        non_s_dog bigger=dog1.MaxDog(dog2);
        bigger.MakeNoise();
    }
}