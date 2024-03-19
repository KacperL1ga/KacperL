public class Lab4_zad2 {
    public static void main(String[] args) {
        int[] tab1 ={64,23,5,756,1,65,23,45,6,100};
        int[] tab2 ={91,82,73,64,55,46,37,28,19};

        System.out.println("Zawartosc tablicy nr.1: ");
        for (int x = 0; x < tab1.length; x=x+2){
            System.out.print(tab1[x]+", ");
        }
        System.out.println("\nZawartosc tablicy nr.2: ");
        for (int x = 0; x < tab1.length; x=x+2){
            System.out.print(tab1[x+1]+", ");
        }
    }
}
