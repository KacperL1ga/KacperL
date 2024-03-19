import java.util.Arrays;

public class Lab4_zad4 {
    public static void main(String[] args) {
        String wyrazy[];
        wyrazy = new String[] {"Student","chodzi","na","zajecia"};
        String [] litery = new String[4];
        for(int i = wyrazy.length -1; i>=0; i--){
            litery[i]=wyrazy[i];
            System.out.print(new StringBuilder(litery[i]).reverse()+" ");
        }

    }

}
