public class StaticVsInstance {
    static int staticVar = 100;
    int instanceVar = 50;
    public static void main(String[] args) {
        StaticVsInstance obj = new StaticVsInstance();
        System.out.println(staticVar);
        System.out.println(obj.instanceVar);
    }
}
