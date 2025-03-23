import java.util.Locale;

public class StringsMethod {
    public static void main(String[] args) {
        String name="Naman Sinha";
        System.out.println(name);
        int length=name.length();
        System.out.println(length);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(4));
        System.out.println(name.substring(4,9));
        System.out.println(name.replace('a','u'));
        System.out.println(name.startsWith("Na"));
        System.out.println(name.endsWith("nha"));
        System.out.println(name.charAt(7));
        System.out.println(name.indexOf("nha"));
        System.out.println(name.indexOf("ama",4));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("ama",6));
        System.out.println(name.equals("Naman Sinha"));
        System.out.println(name.equalsIgnoreCase("NaMAn SINha"));

                
    }
}
