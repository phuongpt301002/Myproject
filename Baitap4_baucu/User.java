package bt_java.MTK.MauKhoiTao.Baitap4_baucu;

public class User {

    String name;

    public User(String name) {

        this.name = name;
    }

    public void vote(Candidate c){
        Election e = Election.getInstance();
        e.vote(c,this);
    }
}
