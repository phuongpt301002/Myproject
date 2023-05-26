package bt_java.MTK.MauHanhVi.A_Observer.BtA1_StreamData;

import java.util.List;

public class MainData {
    public static void main(String[] args) {
        Stream<List<Monhoc>> stream = new Stream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client<List<Monhoc>> client = new Client<List<Monhoc>>(stream) {
            @Override
            public void handle(List<Monhoc> monhocs) {
                for(var mh:monhocs)
                    System.out.println(mh.toString());
            }
        };
        System.out.println("Lần 1 -------------------");
        dataAccess.add(new Monhoc("001","Học hông hiểu", 6));
        System.out.println("Lần 2 -------------------");
        dataAccess.add(new Monhoc("002","Học dễ qua",3));
        System.out.println("Lần 3 -------------------");
        dataAccess.remove("002");
    }
}
