public class WrapperConversion {
    public static void main(String[] args) {
        int num = 15;
        String bin = Integer.toBinaryString(num);
        String hex = Integer.toHexString(num);
        System.out.println(bin + " " + hex);
    }
}
