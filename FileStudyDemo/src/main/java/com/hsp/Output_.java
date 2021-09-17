package com.hsp;

import com.Dog_.Dog;

import java.io.*;

/**
 * @author 丁振奥~
 * @version 1.0
 */
public class Output_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E://dataTest.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);// 自动装箱 int -> Integer   Integer 实现了 Serializable接口
        objectOutputStream.writeBoolean(true);// boolean -> Boolean
        objectOutputStream.writeChar('a');// char -> Character
        objectOutputStream.writeDouble(88.8);// double -> Double
        objectOutputStream.writeUTF("和视频");//String //放入字符串 用 UTF
        objectOutputStream.writeObject(new Dog("呆呆",19));//保存一个对象
        objectOutputStream.close();
        System.out.println("写入成功");
    }
}