package lab7;

import java.io.IOException;

public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() throws CantAccessToNameException, IOException {
        if(name == null) {
            throw new CantAccessToNameException("Nie dasz rady dostac wartosci pola");
        }

        if(name.contains("A")) {
            throw new IOException("Nie możesz miec imienia z A");
        }
        return name;
    }
}
