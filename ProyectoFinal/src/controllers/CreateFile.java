/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Alejandro
 */
public class CreateFile {

    public static void main(String[] args) {
        try {
            String pathCup = "data" + File.separatorChar;
            String[] paths = {pathCup + "Lexer.flex"};

            String[] paths$ = {"-parser", "Sintax", pathCup + "Syntax.cup"};
            java_cup.Main.main(paths$);
            jflex.Main.generate(paths);

            Path sym = Paths.get(System.getProperty("user.dir") + File.separatorChar + "src" + File.separatorChar + "controllers" + File.separatorChar + "sym.java");
            deletePath(sym);

            Path sym1 = Paths.get(System.getProperty("user.dir") + File.separatorChar + "src" + File.separatorChar + "controllers" + File.separatorChar + "Sintax.java");
            deletePath(sym1);

            Path lex = Paths.get(System.getProperty("user.dir") + File.separatorChar + "src" + File.separatorChar + "controllers" + File.separatorChar + "LexerCup.java");
            deletePath(lex);

            Files.move(Paths.get(System.getProperty("user.dir") + File.separatorChar + "sym.java"), sym);
            Files.move(Paths.get(System.getProperty("user.dir") + File.separatorChar + "Sintax.java"), sym1);
            Files.move(Paths.get(pathCup + "LexerCup.java"), lex);

        } catch (Exception e) {
            System.out.println("Error en analizador" + e);
        }
    }

    private static void deletePath(Path path) {
        try {
            if (Files.exists(path)) {
                Files.delete(path);
            }

        } catch (Exception e) {
            System.out.println("Error" + path + " " + e);
        }
    }
}
