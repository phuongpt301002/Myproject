package bt_java.MTK.MauCauTruc.File;

import java.util.ArrayList;

public class Folder extends AbstractFile{
    ArrayList<AbstractFile> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }


    @Override
    void add(AbstractFile abstractFile) {
        children.add(abstractFile);
    }

    @Override
    void remove(AbstractFile abstractFile) {
        children.remove(abstractFile);
    }

    @Override
    public String getTree() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        for(AbstractFile file : children){
            builder.append("\n..").append(file.getTree());
        }
        return builder.toString();
    }
}
