package com.cdp;


import com.cdp.listener.CustomTestListener;
import com.cdp.patterns.flyWeight.DroidFactory;
import com.cdp.patterns.iterator.OwnArrayList;
import com.cdp.patterns.memento.Caretaker;
import com.cdp.patterns.memento.Droid;
import com.cdp.patterns.prototype.Data;
import com.cdp.patterns.state.AttackState;
import com.cdp.patterns.state.DefendState;
import com.cdp.patterns.state.State;
import com.cdp.patterns.strategy.Calculate;
import com.cdp.patterns.strategy.OperationAdd;
import com.cdp.patterns.strategy.OperationDivide;
import com.cdp.patterns.strategy.OperationMultiply;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Listeners({CustomTestListener.class})
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
    public void prototypeTest() {
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
        com.cdp.patterns.flyWeight.Droid droid = DroidFactory.getDroid("One");
        com.cdp.patterns.flyWeight.Droid droid1 = DroidFactory.getDroid("Second");
        Assert.assertNotEquals(droid, droid1);
        com.cdp.patterns.flyWeight.Droid droid2 = DroidFactory.getDroid("One");
        Assert.assertEquals(droid2, droid);
    }

    @Test
    public void stateTest() {
        com.cdp.patterns.state.Droid droid = new com.cdp.patterns.state.Droid();
        State attack = new AttackState();
        droid.setState(attack);
        // attack.doAction(droid);
        Assert.assertEquals(droid.getState().toString(), "AttackState");
        State defend = new DefendState();
        defend.doAction(droid);
        Assert.assertEquals(droid.getState().toString(), "DefendState");
    }

    @Test
    public void strategyTest() {
        Calculate calculate = new Calculate(new OperationAdd());
        Assert.assertEquals(calculate.calculate(4, 5), 9d);
        calculate = new Calculate(new OperationDivide());
        Assert.assertEquals(calculate.calculate(4, 2), 2d);
        calculate = new Calculate(new OperationMultiply());
        Assert.assertEquals(calculate.calculate(10, 10), 100d);
    }

}
