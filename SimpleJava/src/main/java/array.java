public class array {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Jan";
        names[1] = "Anna";
        names[2] = "Krzysztof";
        names[3] = "Piotr";

        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]);
        }

      // -- sposób 2 deklaracji:   String[] names2 = {"Marek", "Karol", "Kasia", "Basia"};
    }
}
