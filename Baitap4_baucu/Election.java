package bt_java.MTK.MauKhoiTao.Baitap4_baucu;
import java.util.ArrayList;
import java.util.List;

public class Election {

    int donalTrump = 0, joeBiden = 0;

    List<String> users = new ArrayList<>();
    public void vote(Candidate c, User user){
        if(users.contains(user.name)){
            return;
        }
        if(c == Candidate.DonalTrump){
            donalTrump++;
            users.add(user.name);
        }
        else if (c == Candidate.JoeBiden){
            joeBiden++;
            users.add(user.name);
        }
    }

    public int getDonalTrump() {
        return donalTrump;
    }

    public int getJoeBiden() {
        return joeBiden;
    }


    private static Election instance;

    private Election(){
    }

    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }
}
