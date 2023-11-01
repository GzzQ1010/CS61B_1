import java.util.Comparator;

public class Dog_Launcher_wJavaComparable {
    public static void main(String[] args){
        Dog_Javacomparable d1=new Dog_Javacomparable("Elyse",3);
        Dog_Javacomparable d2= new Dog_Javacomparable("Sture",9);
        Dog_Javacomparable d3= new Dog_Javacomparable("westie",14);
        Dog_Javacomparable[] dogs= new Dog_Javacomparable[]{d1,d2,d3};
        System.out.println(Max_wJavaComparable.max(dogs));
        Dog_Javacomparable d= (Dog_Javacomparable) Max_wJavaComparable.max(dogs);
        d.bark();

        Comparator<Dog_Javacomparable> nc=  Dog_Javacomparable.getNameComparator();
        if(nc.compare(d1,d3)>0){
            d1.bark();
        }else {
            d2.bark();
        }

    }
}
