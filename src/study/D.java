package study;

public class D  {
    int x = 10;

    void show(int x) {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new D().show(20);
    }
}


