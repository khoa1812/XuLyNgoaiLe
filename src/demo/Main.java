package demo;

public class Main {
    public static void main(String[] args) {

    }
    public static void m1() throws Exception {

    }

    public static void m2() {
        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}
