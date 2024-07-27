package at.mklestil.widgetprogramicon.model;

import at.mklestil.widgetprogramicon.view.IconImageView;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class IconHandler  {

    //"Home.png", "IDE.png", "Mail.png", "Explorer.png"
    private EventHandler eventHandler;

    public IconHandler(String path) {

        eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                //Query operating system
                String os = System.getProperty("os.name").toLowerCase();


                if (path.equals("Browser.png")){
                    System.out.println("Browser");
                    if(os.contains("win")){
                        String path = "C:\\Program Files\\Mozilla Firefox\\firefox.exe" ;
                        startProgramm(path);
                    }else if (os.contains("mac")) {
                        String path = "open /Applications/Firefox.app" ;
                        startProgramm(path);
                    }else {
                        System.out.println("Unsupported operating system");
                    }

                } else if (path.equals("IDE.png")) {
                    System.out.println("IDE");
                    if(os.contains("win")){
                        String path = "C:\\Users\\PC\\eclipse\\eclipse\\eclipse.exe" ;
                        startProgramm(path);
                    }else if (os.contains("mac")) {
                        String path = "open /Applications/Eclipse/Eclipse.app" ;
                        startProgramm(path);
                    }else {
                        System.out.println("Unsupported operating system");
                    }
                    startProgramm(path);
                }else if (path.equals("Mail.png")) {
                    System.out.println("Mail");
                    if(os.contains("win")){
                        String path = "C:\\Program Files\\Mozilla Thunderbird\\thunderbird.exe" ;
                        startProgramm(path);
                    }else if (os.contains("mac")) {
                        String path = "open /Applications/Mail.app" ;
                        startProgramm(path);
                    }else {
                        System.out.println("Unsupported operating system");
                    }
                    startProgramm(path);
                }else if (path.equals("Text.png")) {
                    System.out.println("Text");
                    if(os.contains("win")){
                        String path = "C:\\Users\\PC\\Desktop\text.txt" ;
                        startProgramm(path);
                    }else if (os.contains("mac")) {
                        String path = "open /Applications/TextEdit.app" ;
                        startProgramm(path);
                    }else {
                        System.out.println("Unsupported operating system");
                    }
                    startProgramm(path);
                }else {
                    System.out.println("Fehler");
                }
            }
        };

    }

    public void startProgramm(String thePath){
        String cmd = thePath;
        try{
            System.out.println("Program start");
            Process process = Runtime.getRuntime().exec(cmd);
            try{
                System.out.println("Wait 5s");
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Program end");
            process.destroy();
        }catch (Exception e){

        }
    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }
}
