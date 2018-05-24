package com.epam.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {
    private String name;
    private List<AbstractFile> files = new ArrayList<>();


    public Directory(String name) {
        this.name = name;
    }


    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void ls() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append(name));
       // builder.append("   ");
        for (AbstractFile file : files) {
            System.out.print("     ");
            file.ls();
        }
    }
}
