package com.epam.patterns.factorymethod.implementation;

import com.epam.patterns.factorymethod.model.Parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLParser extends Parser {

    @Override
    public <T> void parse(String path, T object) {
        JAXBContext jaxbContext;
        T newObject = null;
        try {
            jaxbContext = JAXBContext.newInstance("");
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            newObject = (T) jaxbUnmarshaller.unmarshal(new File(path));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
