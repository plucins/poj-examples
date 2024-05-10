package lab3.zad2;

public class Owner {
    private String firstName;
    private String lastName;

    public Owner(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showContent(){
        System.out.println(this.firstName + " " + this.lastName);
    }

    public String returnOwnerInfo(){
        return this.firstName + " " + this.lastName;
    }

}
