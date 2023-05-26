package bt_java.MTK.MauCauTruc.File;

public class File extends AbstractFile{

    @Override
    void add(AbstractFile abstractFile) {

    }

    @Override
    void remove(AbstractFile abstractFile) {

    }

    public File(String name) {
        super(name);
    }

    @Override
    String getTree() {
        return name;
    }
}
