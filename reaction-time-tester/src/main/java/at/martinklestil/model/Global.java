package at.martinklestil.model;

import java.awt.*;

/**
     * @author Martin Klestil
     *
     */
    public class Global {

        private String title = "Reaction Time Tester";
        private String version = "1.0";
        private String versionDate = "09.01.2022";

        //Colors
        private Color maincolor = Color.decode("#112D4E");
        private Color maincolorLight = Color.decode("#3F72AF");
        private Color secondcolor = Color.decode("#DBE2EF");
        private Color secondcolorLight = Color.decode("#F9F7F7");
        private Color grey = Color.decode("#eef8ff");
        private Color greyLight = Color.decode("#dff2ff");
        private Color white = Color.decode("#ffffff");
        private Color black = Color.decode("#000000");
        private Color red = Color.decode("#880000");
        private String defaultFont = "Helvetica";
        private String defaultFontSize = "16";

    public Global() {
    }

    public String getTitle() {
        return title;
    }
    public String getVersion() {
        return version;
    }

    public String getVersionDate() {
        return versionDate;
    }

    public Color getMaincolor() {
        return maincolor;
    }

    public Color getMaincolorLight() {
        return maincolorLight;
    }

    public Color getSecondcolor() {
        return secondcolor;
    }

    public Color getSecondcolorLight() {
        return secondcolorLight;
    }

    public Color getGrey() {
        return grey;
    }

    public Color getGreyLight() {
        return greyLight;
    }

    public Color getWhite() {
        return white;
    }

    public Color getBlack() {
        return black;
    }

    public Color getRed() {
        return red;
    }

    public String getDefaultFont() {
        return defaultFont;
    }

    public String getDefaultFontSize() {
        return defaultFontSize;
    }
}
