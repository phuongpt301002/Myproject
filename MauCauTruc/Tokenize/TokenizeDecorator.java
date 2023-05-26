package bt_java.MTK.MauCauTruc.Tokenize;

import java.util.List;

public class TokenizeDecorator extends Tokenize{
    Tokenize tokenize;

    public TokenizeDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }

    @Override
    List<String> tokenzize() {
        return tokenize.tokenzize();
    }
}
