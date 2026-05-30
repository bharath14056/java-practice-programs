public class Propagation {

    public static void main(String[] args) throws Exception {
        m1();
    }

    public static void m1() {
        System.out.println(10 / 0);
        System.out.println("Method m1 called");
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        m2();
    }

    public static void main1(String[] args) throws Exception {

        try {
            m1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

    }
}