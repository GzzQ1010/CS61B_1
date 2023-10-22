public class Function {
    /** Retuen the larger of x aand y */
    public static int larger(int x,int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(larger(-5,10));

    }
}

/*
1. Function must be part of a class in Java
    A function that is part of a class is called a "method".
    So in java, all functions are methods.
2.To define a function in Java we use "public static "
    and we'll learn alternative way later
3. All parameters of a function must have a declared type
    and the return value of a function must have a type
4.Functions in Java only return only one value 
 */
