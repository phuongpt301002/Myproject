package bt_java.MTK.MauHanhVi.A_Observer.BtA4_Topic;

import java.util.List;

public class MemberA implements I_Topic{
    @Override
    public void update (Topic topic){
        List<String> messages = topic.getMessages();
        String newMessage = messages.get(messages.size() - 1);
        System.out.println("Người A nhận thông báo mới: " + newMessage);
    }
}
