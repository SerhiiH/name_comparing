import static com.sun.xml.internal.ws.util.VersionUtil.compare;

/**
 * Created by Сергей on 18.02.2017.
 */
public class NameComparingRunner {
    public static void main(String[] args) {
        Names names = Names.getNames();
        names.addName("Sergey");
        names.addName("George");
        names.addName("Alona");
        names.addName("Oleg");
        names.addName("Ekaterina");
        names.addName("Anna");
        names.addName("Aza");
        System.out.println(names);
        System.out.println();

        //Sort in alphabetical order
        names.sort((str1, str2) -> str1.compareTo(str2));
        System.out.println(names);

        //Sort in reverse alphabetical order
        names.sort((str1, str2) -> str2.compareTo(str1));
        System.out.println(names);

        //Sort by number of letters in ascending order
        names.sort((str1, str2) -> {
            return (str1.length() > str2.length()) ? 1 :
                   (str1.length() < str2.length()) ? -1 : 0;
        });
        System.out.println(names);

        //Sort by number of letters and reverse alphabetical order in groups
        names.sort((str1, str2) -> {
            return (str1.length() > str2.length()) ? 1 :
                   (str1.length() < str2.length()) ? -1 :
                   (str2.compareTo(str1));
        });
    }
}
