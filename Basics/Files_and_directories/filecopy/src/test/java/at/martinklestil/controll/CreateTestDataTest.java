package at.martinklestil.controll;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreateTestDataTest {

    private final String home = System.getProperty("user.home");
    private final Path testDirectory = Paths.get(home, "testJava");
    private final Path testFile = testDirectory.resolve("test.txt");
    private final Path copyFile = testDirectory.resolve("copy_test.txt");

    @Test
    public void testDirectoryCreation() {
        // Überprüfe, ob das Verzeichnis korrekt erstellt wurde
        new CreateTestData();

        assertTrue("Das Verzeichnis wurde nicht korrekt erstellt.",
                Files.exists(testDirectory));
    }

    @Test
    public void testTestFileIsCreatet(){
        new CreateTestData();
        assertTrue("Die Datei wurde nicht erstellt!", Files.exists(testFile));
    }

    @Test
    public void testCopy(){
        //Setzte Benutzereingabe für Testfall
        String userInput = "test.txt";

        FileCopier copy = new FileCopier();
        copy.copyFile(userInput, testDirectory);

        assertTrue("Die Datei wurde nicht erstellt!", Files.exists(copyFile));
    }
}