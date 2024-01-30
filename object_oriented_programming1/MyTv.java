package object_oriented_programming1;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn = isPowerOn ? false : true;
    }

    void volumeUp() {
        volume = volume < MAX_VOLUME ? volume++ : volume;
    }

    void volumeDown() {
        volume = volume > MIN_VOLUME ? volume-- : volume;
    }

    void channelUp() {
        channel = channel == MAX_CHANNEL ? MIN_CHANNEL : ++channel;
    }

    void channelDown() {
        channel = channel == MIN_CHANNEL ? MAX_CHANNEL : --channel;

    }
}
