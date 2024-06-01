package main.drive;

import main.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);

}
