import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class HelloWorld{
    public static void main(String... args) throws AWTException {
        Robot r = new Robot();

        long initTime = System.currentTimeMillis();
        long oneMinute = 1 * 10 * 1000;

        long timeDif = Math.abs(System.currentTimeMillis() - initTime);
        while(timeDif < oneMinute){
            int base = (int) Math.ceil(Math.random() * 1000);
            r.mouseMove(base, (int) (base * Math.random()));
            timeDif = Math.abs(System.currentTimeMillis() - initTime);
            System.out.println(timeDif);
        }



        System.out.println("Hello world");
    }
}