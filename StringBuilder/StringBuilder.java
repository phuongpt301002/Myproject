package bt_java.MTK.MauKhoiTao.StringBuilder;

public class StringBuilder {
    String str = "";

    public static class MyStringBuilder{
        String str = "baitap2";
        public MyStringBuilder(){
        }

        public MyStringBuilder addString (String s){
            this.str += " " +s;
            return this;
        }
        public MyStringBuilder addFloat (Float f){
            String s = f +"";
            this.str += " " +s;
            return this;
        }
        public MyStringBuilder addBool (boolean b){
            String s = b +"";
            this.str += " " +s;
            return this;
        }
        public StringBuilder myStringBuilder(){
            return new StringBuilder(this);
        }
    }
    public StringBuilder (MyStringBuilder myStringBuilder){
        this.str = myStringBuilder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }
}
