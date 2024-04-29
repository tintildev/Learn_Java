package at.martinklestil.controll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopier {

    public void copyFile(String fileName, Path directory){

        try {
            Path sourceFile = directory.resolve(fileName);
            Path destinationFile = directory.resolve("copy_" + fileName);

            //copy
            Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException e){
            System.err.println("Fehler beim Kopieren der Datei: " + e.getMessage());
        }


    }
}
