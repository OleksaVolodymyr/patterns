package com.epam;


import com.epam.patterns.iterator.OwnArrayList;
import com.epam.patterns.flyWeight.DroidFactory;
import com.epam.patterns.memento.Caretaker;
import com.epam.patterns.memento.Droid;
import com.epam.patterns.prototype.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternsTest {

    @Test
    public void mementoTest() {
        Caretaker caretaker = new Caretaker();
        Droid droid = new Droid();
        droid.setLiveTime("10");
        caretaker.addMemento(droid.saveToMemento());
        droid.setLiveTime("30");
        droid.setLiveTime("40");
        Assert.assertEquals(droid.getLiveTime(), "40");
        droid.restore(caretaker.get(0));
        Assert.assertEquals(droid.getLiveTime(), "10");
    }

    @Test
    public void iteratorTest() {
        List<Object> list = new ArrayList<>();
        OwnArrayList arrayList = new OwnArrayList();
        while (arrayList.hasNext()) {
            list.add(arrayList.next());
        }
        Assert.assertEquals(list.size(), 4);
        Assert.assertEquals(list, Arrays.asList("1", "2", "3", "4"));

    }

    @Test
    public void testPrototype() {
        Data data = new Data();
        data.setName("qwerty");
        data.setYear(1999);
        Data dataClone = null;
        try {
            dataClone = data.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(data, dataClone);
    }

    @Test
    public void flyWeightTest() {
        com.epam.patterns.flyWeight.Droid droid = DroidFactory.getDroid("One");
        com.epam.patterns.flyWeight.Droid droid1 = DroidFactory.getDroid("Second");
        Assert.assertNotEquals(droid, droid1);
        com.epam.patterns.flyWeight.Droid droid2 = DroidFactory.getDroid("One");
        Assert.assertEquals(droid2, droid);
    }

}
