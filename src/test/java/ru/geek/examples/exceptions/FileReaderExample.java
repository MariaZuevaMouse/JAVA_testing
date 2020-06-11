package ru.geek.examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample  {
    public FileReader readFile(String path) throws FileNotFoundException {
        File file = new File("1234567");
        return new FileReader("file");
    }
}
