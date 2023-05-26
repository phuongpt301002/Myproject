package bt_java.MTK.MauHanhVi.C_Stratery.baitaC1_PhepTinh;

public class Calculator {
    private baitaC1.ITinh t;
    public Calculator(baitaC1.ITinh t){
        this.t = t;
    }
    public float tinh(float a, float b){
        return t.tinh(a,b);
    }
}
