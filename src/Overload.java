import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Overload {

    public void overLoadGarbageCollector() throws Throwable {

        List<String> list = new ArrayList<>();
        Random random = new Random();

        Thread.sleep(10000);

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < 15000; i++) {
                String string1 = new String( String.valueOf(random.nextInt(10000000)));
                list.add(string1);
                System.out.println(string1);
            }
        }
    }
}