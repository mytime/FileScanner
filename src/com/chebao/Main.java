package com.chebao;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //绝对路径
//        printFiles(new File("/Users/iwan/workspace/FileScanner"));

        //相对路径
        printFiles(new File("../FileScanner"),1);
    }

    private static void printFiles(File dir,int tab) {
        //是否是路径
        if (dir.isDirectory()) {
            //file[]
            File next[] = dir.listFiles();
            //遍历数组
            for (int i = 0; i < next.length; i++) {
                for (int j = 0; j < tab; j++) {
                    System.out.print("|--");
                }
                //输出名称
                System.out.println(next[i].getName());
                //如果是目录,递归,从头再执行一次
                if (next[i].isDirectory()) {
                    printFiles(next[i],tab+1);
                }
            }


        }

    }

}

