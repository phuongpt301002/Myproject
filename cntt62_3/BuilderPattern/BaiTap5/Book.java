package creational.factory.cntt62_3.BuilderPattern.BaiTap5;

public class Book {
    String Tuade, SoTrang,Tacgia, DSChuong;


    private Book(Builder b) {
        this.Tuade = b.Tuade;
        this.Tacgia = b.Tacgia;
        this.SoTrang = b.SoTrang;
        this.DSChuong = b.DSChuong;
    }

    @Override
    public String toString() {
        return "Book { \n" +
                "Tuade =" + Tuade +
                "Tacgia =" + Tacgia +
                "DSChuong =" + DSChuong +
                "SoTrang =" + SoTrang +
                '}';
    }

    public static class Builder{
        String Tuade, SoTrang, Tacgia, DSChuong;

        public Builder buildtuade(String Tuade){
            this.Tuade = Tuade;
            return this;
        }
        public Builder buildsotrang(String SoTrang){
            this.SoTrang = SoTrang;
            return this;
        }
        public Builder buildtacgia(String Tacgia){
            this.Tacgia = Tacgia;
            return this;
        }
        public Builder buildDSchuong(String DSChuong){
            this.DSChuong = DSChuong;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
}
