package com.cdp.patterns.factorymethod.factory;

import com.cdp.patterns.factorymethod.model.Parser;
import com.cdp.patterns.factorymethod.enums.ParserType;
import com.cdp.patterns.factorymethod.implementation.CSVParser;
import com.cdp.patterns.factorymethod.implementation.XLSXParser;
import com.cdp.patterns.factorymethod.implementation.XMLParser;

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
