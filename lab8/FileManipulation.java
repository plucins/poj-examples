package lab8;

import java.io.File;
import java.io.IOException;

public class FileManipulation {
    public static void main(String[] args) throws IOException {
        File workiDir = new File("./workdir");
        workiDir.mkdir();
        if (new File(workiDir.getPath() + "/mojplik.txt").createNewFile()){
            System.out.println("File created");
        }

        for(File file: workiDir.listFiles()){
            System.out.println(file.getName());
        }

        workiDir.renameTo(new File("./work_directory"));

    }
}
