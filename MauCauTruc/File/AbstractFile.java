package bt_java.MTK.MauCauTruc.File;

public abstract class AbstractFile {
    String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    abstract void add(AbstractFile abstractFile);
    abstract void remove(AbstractFile abstractFile);

   abstract String getTree();
}
