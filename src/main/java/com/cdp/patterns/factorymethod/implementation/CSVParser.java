package com.cdp.patterns.factorymethod.implementation;

import com.cdp.patterns.factorymethod.model.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSVParser extends Parser {

    @Override
    public <T> void parse(String path, T object) {
        List<T> list = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = read.readLine()) != null) {
                String[] split = line.split(",");
                list.add(createElement(object, split));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
