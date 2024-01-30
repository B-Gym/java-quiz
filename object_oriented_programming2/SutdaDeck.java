package object_oriented_programming2;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        int index = 0;
        for (int i = 1; i <= CARD_NUM / 10; i++) {
            for (int j = 1; j <= 10; j++) {
                cards[index] = new SutdaCard(j, i == 1 && (j == 1 || j == 3 || j == 8));
                index++;
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int random = (int) (Math.random() * CARD_NUM);

            SutdaCard temp = cards[0];
            cards[0] = cards[random];
            cards[random] = temp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int random = (int) (Math.random() * CARD_NUM);
        return cards[random];
    }
}
