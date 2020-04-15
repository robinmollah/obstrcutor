
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.AWTException;

public class HelloWorld{
    public static void main(String... args) throws AWTException {
        Robot r = new Robot();

        long initTime = System.currentTimeMillis();
        long oneMinute = 1 * 10 * 1000;

        long timeDif = Math.abs(System.currentTimeMillis() - initTime);
        while(timeDif < oneMinute){
            // random mouse move
            int base = (int) Math.ceil(Math.random() * 1000);
            r.mouseMove(base, (int) (base * Math.random()));
            timeDif = Math.abs(System.currentTimeMillis() - initTime);
            // random keyboard behave
            int randomKey = (int) (65 + (Math.random() * 20));
            System.out.println("Key: " + randomKey);
            r.keyPress(randomKey);
            System.out.println(timeDif);
        }



        System.out.println("Hello world");
    }
}