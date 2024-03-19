public class Lab4_zad7 {
    public static void main(String[] args) {
        String[] tab1 = {"Ala","ma","kota"};
        String[] tab2 = {"Ala","ma","kota"};

        for (int i = 0; i < 6; i++) {
            if (tab1[i] == tab2[i]) {
                System.out.print(tab1[i] + " ");
            } else if (tab1[i] != tab2[i]) {
                System.out.println("Tabele nie są jednakowe");
            break;
            }
            System.out.println("Tabele są jednakowe");
        }
    }
}
