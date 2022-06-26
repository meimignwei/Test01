package 继承;

//对于父类中的private方法，是父类私有，没法进行继承
public class One {
    protected void printA() {
        System.out.println("父类printA");
    }

    protected void printB() {
        System.out.println("父类printB");
    }

    protected void printC() {
        System.out.println("父类printC");
    }

    protected void printABC() {
        printA();
        printB();
        printC();
    }
}
