public class makeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        int maxBigBricksUsed = Math.min(goal / 5, big);
        int remaining = goal - (maxBigBricksUsed * 5);
        return remaining <= small;
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));  // true
        System.out.println(makeBricks(3, 1, 9));  // false
        System.out.println(makeBricks(3, 2, 10)); // true
    }
}
