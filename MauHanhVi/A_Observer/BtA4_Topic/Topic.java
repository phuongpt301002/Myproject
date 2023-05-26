package bt_java.MTK.MauHanhVi.A_Observer.BtA4_Topic;
import java.util.ArrayList;
import java.util.List;


public class Topic {
    private List<String> messages = new ArrayList<>();
    private  List<I_Topic> topics = new ArrayList<>();

    public void addMessage (String message){
        messages.add(message);
        notifyListeners();
    }
    public void updateMessage(int index, String message){
        messages.set(index,message);
        notifyListeners();
    }


    public void attack(I_Topic topic){
        topics.add(topic);
    }
    public void detach (I_Topic topic){
        topics.remove(topic);
    }

    public List<String> getMessages(){
        return messages;
    }

    private void notifyListeners(){
        for (I_Topic topic : topics){
            topic.update(this);
        }
    }
}
