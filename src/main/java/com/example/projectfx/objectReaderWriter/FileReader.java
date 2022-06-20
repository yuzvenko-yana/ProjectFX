package com.example.projectfx.objectReaderWriter;

import com.example.projectfx.Flower;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<Flower> read(String file) throws IOException {
        List<Flower> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        try {
            //Обойти все доступные объекты ()> 0 означает, что в потоке еще есть объекты
            while (fileInputStream.available() > 0) {
                Flower o = (Flower) ois.readObject();
                list.add(o);
            }
            ois.close();
            return list;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;

    }
}
