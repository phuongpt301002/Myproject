package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.VeSo;

public class Giai implements IDoVeSo{
    String [] listBoSo;
    String tenGiai;
    IDoVeSo doVeSo;

    public Giai(String tenGiai, String[] listBoSo ) {
        this.tenGiai = tenGiai;
        this.listBoSo = listBoSo;
    }

    @Override
    public IDoVeSo giaithaphon(IDoVeSo doVeSo) {
        this.doVeSo = doVeSo;
        return doVeSo;
    }

    @Override
    public String doVe(String soDo) {
        for(String soTrungThuong : listBoSo){
            if(soDo.endsWith(soTrungThuong)){
                return "Chúc mừng bạn trúng " + tenGiai;
            }
        }
        return this.doVeSo.doVe(soDo);
    }
}
