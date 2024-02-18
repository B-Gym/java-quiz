package generics_enumeration_annotation;

import generics_enumeration_annotation.Card.Kind;
import generics_enumeration_annotation.Card.Number;

public class Exercise12_5 {
    public static void main(String[] args) {
        Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c); // System.out.println(c.toString());과 같다.

        d.shuffle(); // 카드를 섞는다.
        c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = Card.Kind.values().length;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        for (int i = 0; i < cardArr.length; i++) {
            int kindIdx = (int) (Math.random() * Card.Kind.values().length);
            int numIdx = (int) (Math.random() * Card.Number.values().length);
            cardArr[i] = new Card(Kind.getKind(kindIdx), Number.getNumber(numIdx));
        }
    }

    Card pick(int idx) {
        return cardArr[idx];
    }

    Card pick() {
        int idx = (int) (Math.random() * CARD_NUM);
        return pick(idx);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    enum Kind {
        CLOVER, HEART, DIAMOND, SPADE;

        private static Kind[] list = Kind.values();

        public static Kind getKind(int idx) {
            return list[idx];
        }

    };

    enum Number {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        private static Number[] list = Number.values();

        public static Number getNumber(int idx) {
            return list[idx];
        }
    }

    Kind kind;
    Number num;

    Card() {
        this(Kind.SPADE, Number.ACE);
    }

    Card(Kind kind, Number num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return "[" + kind.name() + "," + num.name() + "]";
    }
}
