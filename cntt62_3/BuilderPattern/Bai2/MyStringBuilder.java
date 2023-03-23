package creational.factory.cntt62_3.BuilderPattern.Bai2;

@SuppressWarnings("UnresolvedClassReferenceRepair")
public class MyStringBuilder {
    String str = "";

    public MyStringBuilder() {
    }

    public MyStringBuilder(MyStringBuilder myStringBuilder) {

    }


    public MyStringBuilder add(String s){
        this.str +=s;
        return this;
    }

    public MyStringBuilder add(Float f){
        String s = f +"";
        this.str += " " +s;
        return this;
    }
    public MyStringBuilder add(Boolean b){
        String s = b +"";
        this.str += " " +s;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
