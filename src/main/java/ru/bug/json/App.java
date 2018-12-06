package ru.bug.json;

import java.util.Scanner;

public class App {

    public static void main(String...args) {
        new App().start();
    }

    private void start() {
        while(true) {
            printOptions();
            Scanner scanner = new Scanner(System.in);
            switch(scanner.nextLine()) {
                case "q":
                case "Q":
                    return;
                case "1":
                    jsonParser();
                    break;
                case "2":
                    jsonGenerator();
                    break;
                case "3":
                    jsonStream();
                    break;
                case "4":
                    jsonPointer();
                    break;
                case "5":
                    jsonPatch();
                    break;
                case "6":
                    jsonSerialization();
                    break;
                case "7":
                    jsonDeserialization();
                    break;
                case "8":
                    jsonDeserializationGenericList();
                    break;
            }
        }
    }

    private void jsonDeserializationGenericList() {

    }

    private void jsonDeserialization() {

    }

    private void jsonSerialization() {

    }

    private void jsonPatch() {

    }

    private void jsonPointer() {
    }

    private void jsonStream() {

    }

    private void jsonGenerator() {

    }

    private void jsonParser() {

    }

    private void printOptions() {

    }
}
