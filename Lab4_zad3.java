import java.lang.reflect.Array;

public class Lab4_zad3 {
    public static void main(String[] args) {
        String wyrazy[];
        wyrazy = new String[] {"Student","zdaje","ostatni","egzamin"};

        for (String x : wyrazy) {

            System.out.print(x.toUpperCase()+" ");
        }
    }
}
