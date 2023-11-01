import java.util.Comparator;

/*
Java build-in Comparable
we also have a comparator interface built in java
 */
public class Dog_Javacomparable implements Comparable<Dog_Javacomparable>{
    private String name;
    private int size;


    public Dog_Javacomparable(String n ,int s){
        name=n;
        size=s;
    }

    public void bark(){
        System.out.println(name + " says: bark");
    }
    public int compareTo(Dog_Javacomparable uddaDog){
        return this.size-uddaDog.size;
    }
    private static class NameComparator implements Comparator<Dog_Javacomparable>{
        public int compare(Dog_Javacomparable o1,Dog_Javacomparable o2){
            return o1.name.compareTo(o2.name);
        }
    }
    public static Comparator<Dog_Javacomparable> getNameComparator(){
        return new NameComparator();
    }
}
