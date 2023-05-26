package bt_java.BTCoBan.BT5;

public class LopHoc {
    QLDS dsHS = new QLDS();
    QLDS dsGVGD = new QLDS();

    public int themHocSinh( HocSinh hs){
        dsHS.them(hs);
        return 0;
    }
    public int themGVGD( GiaoVien gv){
        dsGVGD.them(gv);
        return 0;
    }

    public int xoaHS(String tenHS){
        dsHS.xoa(tenHS);
        return 0;
    }
    public int xoaGVGD(String tenGVGD){
        dsGVGD.xoa(tenGVGD);
        return 0;
    }
    public int inDSHS(){
        dsHS.inDS();
        return 0;
    }
    public int inDSGVGD(){
        dsGVGD.inDS();
        return 0;
    }
}
