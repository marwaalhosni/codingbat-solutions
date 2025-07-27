public class in3050 {
    public boolean in3050(int a, int b) {
        boolean range30to40 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean range40to50 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        return range30to40 || range40to50;
    }
}
