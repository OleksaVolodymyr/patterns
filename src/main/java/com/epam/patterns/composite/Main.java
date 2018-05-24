package com.epam.patterns.composite;

public class Main {
    public static void main(String[] args) {
        File file = new File("file 1");
        File file2 = new File("file 2");
        Directory directory = new Directory("Directory");
        directory.add(file);
        directory.add(file2);
        Directory directory1 = new Directory("Directory1");
        File file3 = new File("file 3");
        File file4 = new File("file 4");
        directory1.add(file3);
        directory1.add(file4);
        directory.add(directory1);
        directory.ls();
    }
}
