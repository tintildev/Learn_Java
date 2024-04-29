package at.martinklestil.controll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTestData {

    private static Path directory;

    public CreateTestData() {
        try{
            //Get cross-platform home directory
            String home = System.getProperty("user.home");
            System.out.println(home);

            //create directory and file
            directory = Paths.get(home, "testJava");
            Path testFile = directory.resolve("test.txt");

            //create directory
            if(!Files.exists(directory)) {
                Files.createDirectories(directory);
            }
            //delete and create file
            if(Files.exists(testFile)){
                Files.delete(testFile);
            }
            Files.createFile(testFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Print directory path for testing
        System.out.println("Verzeichnis zum Testen erstellt: " + directory);

        // List contents of directory for testing
        listOfDir(directory.toFile());

    }

    public void listOfDir(File dir){
        File[] files = dir.listFiles();
        if (files != null){
            for(int i = 0; i < files.length; i++){
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }

    public Path getDirectory() {
        return directory;
    }
}
