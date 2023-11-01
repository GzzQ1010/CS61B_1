/*
On older Java(java 7 and earlier, the fundatmental issues is that memory box variable
cannot contain pointers to functions.
for this reason we implement an abstract function in interface
 */
public class TenX implements IntUnaryFunction {
    public int apply(int x){
            return 10*x;
    }


}
