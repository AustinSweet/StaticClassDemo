package userpackage;

public class User {

    private String name;
    private String password;
    private int privCounter = 0;
    private static int counter = 0;

    public User(){}

    public User(String name){
        this.name = name;
        this.privCounter++;
        counter++;
    }

    public void printCounter() {
        System.out.println(this.name);
        System.out.println(privCounter);
        System.out.println(counter);
        System.out.println();
    }

}
