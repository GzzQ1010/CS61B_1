/*Testing the sort class
* Following is an example of ad-hoc testing */
public class SortTest {
    //Testing the Sort.sort method
    public static void testSort(){
        String[] input={"i", "have", "an", "egg"};
        String[] expected={"an","egg","have","i"};

        Sort.sort(input);
        for (int i=0;i<input.length;i++){
            if(!input[i].equals(expected[i])){
                System.out.println("Mismatch in position"+ i+","
                +expected[i]+", but got:"+ input[i]);
                return;
            }
        }
        if (!java.util.Arrays.equals(input,expected)){
            System.out.println("Error! There seems to be a problem with Sort,sort.");
        }

    }
    public static void main(String[] args){
        testSort();
    }
}
