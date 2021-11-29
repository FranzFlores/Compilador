/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Smart
 */
public class Utilities {

    private static String FOLDER = "data";
    private static String FILE = FOLDER + File.separatorChar + "lexicon.properties";
    private Properties properties;
    
    public Utilities() {
        this.loadData();
    }
    
    //Cargar los datos desde el archivo lexicon.properties
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
    
    //Obtiene todos los símbolos válidos para el autómata
    public String[] getSymbols() {
        return properties.getProperty("symbols").split("|");
    }
    
    //Verifica que el caracter ingresado es válido
    public boolean verifyChar(String[] data, String character) {
        return Arrays.asList(data).contains(character);
    }
    
}
