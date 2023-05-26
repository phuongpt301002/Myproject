package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.VeSo;

public class GiaiTam implements IDoVeSo{
    String [] listBoSo;

    public GiaiTam(String[] listBoSo) {
        this.listBoSo = listBoSo;
    }

    @Override
    public IDoVeSo giaithaphon(IDoVeSo doVeSo) {
        return null;
    }

    @Override
    public String doVe(String soDo) {
        for(String soTrungThuong : listBoSo){
            if(soDo.endsWith(soTrungThuong)){
                return "Chúc mừng bạn trúng giải 8";
            }
        }
        return "Chúc bạn may mắn lần sau";
    }
}
