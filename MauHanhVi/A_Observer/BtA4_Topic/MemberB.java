package bt_java.MTK.MauHanhVi.A_Observer.BtA4_Topic;

import java.util.ArrayList;
import java.util.List;

public class MemberB implements I_Topic{
    private List<String> receivedMessages = new ArrayList<>();
    @Override
    public void update (Topic topic){
        List<String> messages = topic.getMessages();
        for (int i = receivedMessages.size(); i < messages.size(); i++){
            String message = messages.get(i);
            System.out.println("Người B nhận thông báo " + (i + 1) + ": " + message);
            receivedMessages.add(message);
        }
    }
}
