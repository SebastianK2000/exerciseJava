import java.util.*;


public class arrayList {
    public static void main(String[] args) {

        System.out.println("Lista uczniów: ");

        List<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Mateusz");
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Lena");
        names.add("Sebastian");
        names.add("Rafal");
        names.add("Janek");
        names.add("Robert");
        names.add("Klaudia");
        names.add("Kornelia");
        names.add("Lila");
        names.add("Sara");
        names.add("Karol");
        names.add("Maciek");
        names.add("Lucek");
        names.add("Daria");
        names.add("Zosia");
        names.add("Leosia");
        names.add("Piotr");
        names.add("Piotr");
        names.add("Adrian");

        names.remove("Adrian");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(" ");
        System.out.println("Lista przedmiotów: ");

        Set<String> lesson = new HashSet<>();

        lesson.add("Matematyka");
        lesson.add("Fizyka");
        lesson.add("Chemia");
        lesson.add("Biologia");
        lesson.add("Geografia");
        lesson.add("Historia");
        lesson.add("WOS");
        lesson.add("Język Polski");
        lesson.add("Język Angielski");
        lesson.add("Język Niemiecki");
        lesson.add("Język Rosyjski");
        lesson.add("Język Francuski");
        lesson.add("Wychowanie Fizyczne");

        for(String less : lesson) {
            System.out.println(less);
        }

        Map<String, String> nameToLesson = new HashMap<>();

        nameToLesson.put("Daniel", "Matematyka");
        nameToLesson.put("Mateusz", "Fizyka");
        nameToLesson.put("Anna", "Chemia");
        nameToLesson.put("Katarzyna", "Biologia");
        nameToLesson.put("Lena", "Geografia");
        nameToLesson.put("Sebastian", "Historia");
        nameToLesson.put("Rafal", "WOS");
        nameToLesson.put("Janek", "Język Polski");
        nameToLesson.put("Robert", "Język Angielski");
        nameToLesson.put("Klaudia", "Język Niemiecki");
        nameToLesson.put("Kornelia", "Język Rosyjski");
        nameToLesson.put("Lila", "Język Francuski");
        nameToLesson.put("Sara", "Wychowanie Fizyczne");
        nameToLesson.put("Karol", "Matematyka");
        nameToLesson.put("Maciek", "Fizyka");
        nameToLesson.put("Lucek", "Chemia");
        nameToLesson.put("Daria", "Biologia");
        nameToLesson.put("Zosia", "Geografia");
        nameToLesson.put("Leosia", "Historia");
        nameToLesson.put("Piotr", "WOS");

        System.out.println(" ");
        System.out.println("Podział zajęć uczniów na godzinę 08:00 - ");
        System.out.println(" ");
        System.out.println(nameToLesson.get("Daniel"));

    }
}
