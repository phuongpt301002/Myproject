package bt_java.MTK.MauHanhVi.A_Observer.BtA4_Topic;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic = new Topic();
        MemberA mA = new MemberA();
        MemberB mB = new MemberB();
        topic.attack(mA);
        topic.attack(mB);
        topic.addMessage("Hello World");
        topic.addMessage("Me too");
        topic.updateMessage(1,"Hê sờ lô");
        //topic.detach(mA);
        //topic.detach(mB);
    }
}
