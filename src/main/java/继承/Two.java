package 继承;

public class Two extends One {
    protected void printA() {
        System.out.println("子类printA");
    }

    protected void printB() {
        System.out.println("子类printB");
    }

    public void printC() {
        System.out.println("子类printC");
    }

    public static void main(String[] args) {
//        Two t = new Two();
        One t = new Two();
        t.printABC();
    }
}
