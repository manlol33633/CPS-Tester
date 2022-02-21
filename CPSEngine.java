public class CPSEngine {
    private static int count;
    public CPSEngine() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void count() {
        count++;
    }

    public void test() {
        wait(3000);
    }

    public double CPS(int seconds) {
        return count/seconds;
    }
}
