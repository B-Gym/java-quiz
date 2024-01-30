package object_oriented_programming1;

public class Exercise6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard(1, true);

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
