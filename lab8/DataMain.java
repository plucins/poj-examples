package lab8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataMain {


    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss dd/MMMM/yyyy");
        System.out.println(LocalDateTime.now().format(dt));


    }
}
