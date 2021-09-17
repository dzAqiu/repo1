package com.Dog_;

import java.io.Serializable;

/**
 * @author 丁振奥~
 * @version 1.0
 */
public class Dog implements Serializable{
        private String name;
        private int age;

        private static final long serialVersionUID = 1L;
        private String hobby;
        //serialVersionUID  序列化版本号
        //有这个东西以后，在反序列化的时候
    // 即使类的内容有改变，比如加入一个属性，会认为是这个类的升级版本

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
}
