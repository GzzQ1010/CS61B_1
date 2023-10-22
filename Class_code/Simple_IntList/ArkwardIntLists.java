public class ArkwardIntLists {
    public int first;
    public ArkwardIntLists rest;


    public static void main(String[] args){
        ArkwardIntLists L = new ArkwardIntLists();
        L.first=5;
        L.rest=null;

        L.rest= new ArkwardIntLists();
        L.rest.first=10;

        L.rest.rest= new ArkwardIntLists();
        L.rest.rest.first=15;

        // How to print out?
        //It's able to visualize how does it works on Java visualizer

    }
}