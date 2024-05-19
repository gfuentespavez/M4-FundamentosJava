package dia_10;

public class Tables {
    public void showTables() {
        for (int j = 0; j < 11; j++) {
            for (int i = 0; i < 11; i++) {
                System.out.printf("%d * %d = %d\n", i, j, j*i);
            }
        }
    }
}
