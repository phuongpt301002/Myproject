package bt_java.MTK.MauHanhVi.A_Observer.BtA3_TiGia;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia{

    TiGia t;
    public NhaDauTuA(TiGia t){
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy(){
        t.detach(this);
    }

    @Override
    public void capNhapTiGia(float delta){
        if(delta > 0)
            System.out.println("A: Bán ra");
        else
            System.out.println("A: Mua vào");
    }
}
