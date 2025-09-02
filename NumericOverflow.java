public class NumericOverflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int overflow = max + 1;
        System.out.println(max);
        System.out.println(overflow);
    }
}
