package bt_java.MTK.MauHanhVi.A_Observer.BtA1_StreamData;

public abstract class Client<T> implements Stream.StreamListener<T> {

    Stream<T> stream;

    public Client(Stream<T> stream) {
        this.stream = stream;
        this.stream.listen(this);
    }
}
