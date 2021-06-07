package com.example.javalearn.lianxi;

public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 2000; i++){
            System.out.println("我在看代码---"+i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程

        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();

        //调用start()方法开启多线程
        testThread1.start();

        for (int i = 0; i < 2000; i++){
            System.out.println("我在学习多线程--"+i);
        }
    }
}
