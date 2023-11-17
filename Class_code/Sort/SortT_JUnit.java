    import org.junit.Test;
import static org.junit.Assert.*;//after implemented this I can delete org.junit.Asser.
public class SortT_JUnit {
    //Testing the Sort.sort method
    @Test
    public void testSort(){
        String[] input={"i", "have", "an", "egg"};
        String[] expected={"an","egg","have","i"};

        Sort.sort(input);

        assertArrayEquals(expected,input);//same as following
//        for (int i=0;i<input.length;i++){
//            if(!input[i].equals(expected[i])){
//                System.out.println("Mismatch in position"+ i+","
//                        +expected[i]+", but got:"+ input[i]);
//                return;
//            }
//        }

    }
    /*Test the Sort.findSmallest method*/
    @Test
    public void testFindSmallest(){
        String[] input={"i", "have", "an", "egg"};
        int expected=2;

        int actual=Sort.findSmallest(input,0);
        assertEquals(expected,actual);
    }
    @Test
    public void testSwap(){
        int a=0, b=2;
        String[] input={"i", "have", "an", "egg"};
        String[] expected={"an","have","i","egg"};

        Sort.swap(input,a,b);

        org.junit.Assert.assertArrayEquals(expected,input);// if import static org.junit.Assert.*; is not implemented
    }
//    public static void main(String[] args){
//        testSort();
////        testFindSmallest();
////        testSwap();
//
//    }
}
