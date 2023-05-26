package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.TienDien;

public class TienDien implements IXuLyTienDien{
    float min,max;
    float giaTien;
    IXuLyTienDien bacTiepTheo;

    public TienDien(float min, float max, float giaTien) {
        this.min = min;
        this.max = max;
        this.giaTien = giaTien;
    }


    @Override
    public IXuLyTienDien bacTiepTheo(IXuLyTienDien xuLyTienDien) {
        this.bacTiepTheo = xuLyTienDien;
        return xuLyTienDien;
    }

    @Override
    public float tienDien(int kWh) {
        if(kWh <= max)
            return (kWh - min) * giaTien;
        else
            return (max - min) * giaTien + bacTiepTheo.tienDien(kWh);
    }
}
