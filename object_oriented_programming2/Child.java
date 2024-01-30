package object_oriented_programming2;

public class Child extends Parent {
    int x = 3000;

    Child() {
        this(2000);
    }

    Child(int x) {
        this.x = x;
    }

    // int getX() {
    // return x;
    // }
}
