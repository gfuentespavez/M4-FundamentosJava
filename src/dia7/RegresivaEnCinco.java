package dia7;
import java.util.concurrent.TimeUnit;
public class RegresivaEnCinco {
    public void RegresivaenCinco () {
        int i = 5;
        while (i > 0) {
            System.out.printf("%d\n", i);
            i--;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
