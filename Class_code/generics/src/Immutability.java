/*
An immutable data type is a data type whose instances cannot change in any
observable way after instantiation.

Eg:
Mutatble: ArrayDeq,Planet
Immutable: Integer,String,Date(If date has define in the same way below)

Final:
final keyword will help compiler ensure immutability
    final variable means you will assign a value once
    Not necessary to have final to be immutable
    Declaring a reference as Final does not make object immutable
        eg: below
 */


import java.util.ArrayList;

public class Immutability {
    public class Date{
        public final int month;
        public final int day;
        public final int year;

        private boolean contrived= true;
        public Date(int m, int d, int y){
            month=m;
            day=d;
            year=y;
        }
       //Declaring a reference as Final does not make object immutable
        public final ArrayList<String> d = new ArrayList<>();
        /*for the d declared above, d is an address of new created arrayList.
        Because of the final decleration, d cannot be changed. However, the arrayList can
        be changed.
         */
    }
}
