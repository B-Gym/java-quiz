package object_oriented_programming2;

public class Tv extends Product {

    Tv(int price) {
        super(price);
    }

    public String toString() {
        System.out.println(super.bonusPoint);
        return "Tv";
    }

}
