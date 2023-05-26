package bt_java.MTK.MauCauTruc.Tokenize;

import java.util.ArrayList;
import java.util.List;

public class DauCau extends TokenizeDecorator{
    String[] stopword = {",", "."};

    public DauCau(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    List<String> tokenzize() {
        List<String> dsDauCau = super.tokenzize();
        List<String> dsDauCauDung = new ArrayList<>(List.of(stopword));
        dsDauCau.removeAll(dsDauCauDung);
        return dsDauCau;
    }

}
