package com.epam.patterns.factorymethod.factory;

import com.epam.patterns.factorymethod.model.Parser;
import com.epam.patterns.factorymethod.enums.ParserType;
import com.epam.patterns.factorymethod.implementation.CSVParser;
import com.epam.patterns.factorymethod.implementation.XLSXParser;
import com.epam.patterns.factorymethod.implementation.XMLParser;

public class ParserFactory {

    public static Parser getParser(ParserType type){
        switch (type){
            case XML:
                return new XMLParser();
            case CSV:
                return new CSVParser();
            case XLSX:
                return new XLSXParser();
        }
        return null;
    }
}
