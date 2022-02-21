public class CPSRunner {
    public static void main(String[] args) {
        int seconds = 10;
        CPSFrame window = new CPSFrame("CPS Tester");
        CPSEngine runner = new CPSEngine();
        runner.wait(seconds * 1000);
        System.out.println(runner.CPS(seconds));
    }
}
