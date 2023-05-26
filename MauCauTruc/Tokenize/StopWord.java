package bt_java.MTK.MauCauTruc.Tokenize;

import java.util.ArrayList;
import java.util.List;

public class StopWord extends TokenizeDecorator{
    String[] stopword = {"thì", "mà", "hoặc", "và","là"};
    public StopWord(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    List<String> tokenzize() {
        List<String> dstu = super.tokenzize();
        List<String> dstudung = new ArrayList<>(List.of(stopword));
        dstu.removeAll(dstudung);
        return dstu;
    }
}
