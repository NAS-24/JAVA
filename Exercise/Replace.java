package Exercise;

public class Replace {
    public static void main(String[] args) {

        String name="Dear <|name>|,Thanks a lot";
        System.out.println(name.replace("<|name>|","Naman"));
    }
}
