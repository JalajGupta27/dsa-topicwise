import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pattern p=Pattern.compile("\\b(\\w+)(\\W+\\1)+\\b",Pattern.CASE_INSENSITIVE);
        Matcher m= p.matcher("I love Love to To tO code into I love to code?");
        while (m.find()){
            System.out.println(m.group());
        }
    }
}