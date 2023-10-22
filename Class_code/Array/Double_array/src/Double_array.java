public class Double_array {
    public static void main(String[] args) {
        int[][] pascalsTriangle;
        pascalsTriangle= new int[4][];
        int[] rowZero=pascalsTriangle[0];

        pascalsTriangle[0]=new int[]{1};
        pascalsTriangle[1]=new int[]{1,2};
        pascalsTriangle[2]=new int[]{1,2,3};
        pascalsTriangle[3]=new int[]{1,2,3,4};
        int[] rowTwo=pascalsTriangle[2];
        rowTwo[1]=-5;

        int[][] matrix;
        matrix=new int[4][];
        matrix=new int[4][4];

        int[][] pascalAgain=new int[][]{{1},{1,2},{1,2,3},{1,2,3,4}};

    }
}
/*Array vs class
* array boxes are accessed using []
* class boxes are accessed using dot(.)
* array boxes must all be the same type
* class boxes may be of different types
* both have a fixed number of boxes
*
* */