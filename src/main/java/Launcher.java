import userpackage.User;

import java.util.ArrayList;
import java.util.HashSet;

public class Launcher {


    public static void main(String[] args) {

        User u1 = new User("u1");
        u1.printCounter();

        User u2 = new User("u2");
        u2.printCounter();

        User u3 = new User("u3");
        u3.printCounter();

        //Unboxing
        Integer x = 1;
        int y = x;

        //Autoboxing
        boolean a = true;
        Boolean b = a;

        double e = 1.1;
        Double f = e;

        char c = 'x';
        Character ch = c;

        User u5 = new User();

    }

}

