package bt_java.MTK.MauKhoiTao.Baitap4_baucu;

public class Baitap4Design_Main {
    public static void main(String[] args) {
        Election e = Election.getInstance();
        User u1 = new User("lan");
        User u2 = new User("phuong");
        User u3 = new User("kieu");
        User u4 = new User("man");
        User u5 = new User("a");
        User u6 = new User("a");
        u1.vote(Candidate.DonalTrump);
        u2.vote(Candidate.DonalTrump);
        u3.vote(Candidate.JoeBiden);
        u4.vote(Candidate.DonalTrump);
        u5.vote(Candidate.JoeBiden);
        u6.vote(Candidate.JoeBiden);
        System.out.println("Donal Trump: "+e.donalTrump);
        System.out.println("Joe Biden: "+e.joeBiden);
    }
}
