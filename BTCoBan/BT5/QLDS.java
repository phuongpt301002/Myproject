package bt_java.BTCoBan.BT5;

import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS{
   List<CaNhan> qlDS = new ArrayList<>();

    @Override
    public int them(CaNhan c) {
        qlDS.add(c);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        for (int i = 0; i < qlDS.size(); i++) {
            CaNhan c = qlDS.get(i);
            if (ten.equals(c.getHoTen())) {
                qlDS.remove(i);
            }
        }
        return 0;
    }

    @Override
    public void inDS() {
        for(CaNhan c: qlDS)
        {
            System.out.println(c.HienThiTT());
        }
    }
}
