public class static_dogLauncher{
    public static void main(String[] args){
            static_dog dog1= new static_dog(15);
            static_dog dog2=new static_dog(100);
            static_dog bigger=static_dog.maxDog(dog1,dog2);
            bigger.MakeNoise();
        
    }
}


