package bt_java.MTK.MauCauTruc.Tokenize;

import java.util.ArrayList;
import java.util.List;

public  class TachTu extends Tokenize{
    String chuoi;

    public TachTu(String chuoi) {
        this.chuoi = chuoi;
    }

    @Override
    List<String> tokenzize() {
        return new ArrayList<>(List.of(chuoi.split(" ")));
    }
}
