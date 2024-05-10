package lab7;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {


        Pattern pattern1 = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

        String text = "43-123 22-123 23-123";
        String pattern = "\\b\\d{2}-\\d{3}\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.find()){
            System.out.println("W tekscie " + text + " wystepuje pattern " + pattern);
        }

        text.replaceAll(pattern, "Janek");

        User u = new User();
        User a = new User("Adam");

//        try {
//            u.getName();
//        } catch (CantAccessToNameException e) {
//            System.err.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        } finally {
//            System.out.println("A to też wykonam");
//        }

    }
}
