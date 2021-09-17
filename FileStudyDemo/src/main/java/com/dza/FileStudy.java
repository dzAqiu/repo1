package com.dza;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

import com.Dog_.Dog;


/**
 * @author 丁振奥~
 * @version 1.0
 */
public class FileStudy {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src//main//java//com//Properties_//dog.properties"));
        DogNew dogNew =
                new DogNew(properties.getProperty("name"),
                        Integer.parseInt(properties.getProperty("age")),
                        properties.getProperty("color"));
        System.out.println(dogNew);
    }
}


class DogNew{
    private String name;
    private int age;
    private String color;

    public DogNew(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "DogNew{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}