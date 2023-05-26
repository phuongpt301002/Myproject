package bt_java.MTK.MauHanhVi.A_Observer.BtA3_TiGia;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia t;
    public NhaDauTuB(TiGia t){
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy(){
        t.detach(this);
    }

    @Override
    public void capNhapTiGia(float delta){
        if(delta > 0)
            System.out.println("B: Bán ra");
        else
            System.out.println("B: Mua vào");
    }
}
