package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class UtilitiesV1 {

    private static String FOLDER = "data";
    private static String FILE = FOLDER + File.separatorChar + "lexicon.properties";
    private Properties properties;
    
    public UtilitiesV1() {
        this.loadData();
    }
    
    public void loadData() {
        try {
            Properties prop = new Properties();
            InputStream in = new FileInputStream(FILE);
            prop.load(in);
            properties = prop;
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al cargar datos" + e);
        }
    }
    
    public String[] getSymbols() {
        return properties.getProperty("symbols").split("|");
    }
    
    public boolean verifyChar(String[] data, String character) {
        return Arrays.asList(data).contains(character);
    }
    
}
