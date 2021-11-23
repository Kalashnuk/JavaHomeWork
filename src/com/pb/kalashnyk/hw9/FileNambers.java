package com.pb.kalashnyk.hw9;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

class FileNumbers {

    Path path = Paths.get("src/com/pb/kalashnyk/hw9/numbers.txt");

    public void createNumbersFile(){
        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(path)){

            for (int x=1; x<10; x++){
                        for (int i=1; i<10; i++){
                            int a = (int) ( Math.random() * 99 );
                            writer.write( a + " ");
                        }writer.newLine();
            }

        } catch (Exception e){
            e.getMessage();
        }
    }

    public void createOddNumbersFile() {

        Path pathOdd = Paths.get("src/com/pb/kalashnyk/hw9/odd-numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(pathOdd)) {
            List<String> arrayInt = Files.readAllLines(path);

            for (String string : arrayInt) {
                System.out.println(string);
                String[] array = string.split(" ");

                for (String prt : array) {
                    int integer = Integer.parseInt(prt);
                    if(integer % 2 == 0) {
                        integer = 0;
                    }
                    writer.write(integer + " ");
                }
                writer.newLine();
            }

        } catch (Exception e){
            e.getMessage();
        }
    }

    public static void main(String[] args) throws Exception {

        FileNumbers fileNumbers = new FileNumbers();

        fileNumbers.createNumbersFile();
        fileNumbers.createOddNumbersFile();


    }
}