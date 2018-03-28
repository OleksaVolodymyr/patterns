package com.epam.patterns.factorymethod.model;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public abstract class Parser {
    public abstract <T> void parse(String path, T object);

    protected <T> T createElement(T object, String[] split) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(Override.class)) {
                fields[i].setAccessible(true);
                try {
                    fields[i].set(object, parseValue(fields[i], split[i]));
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;
    }
    private Object parseValue(Field field, String value) throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Object parseValue = null;
        if (field.getType().isPrimitive()) {
            if (field.getType().equals(int.class)) {
                parseValue = Integer.parseInt(value);
            } else if (field.getClass().equals(double.class)) {
                parseValue = Double.parseDouble(value);
            } else if (field.getClass().equals(float.class)) {
                parseValue = Float.parseFloat(value);
            } else if (field.getClass().equals(byte.class)) {
                parseValue = Byte.parseByte(value);
            } else if (field.getClass().equals(boolean.class)) {
                parseValue = Boolean.parseBoolean(value);
            } else if (field.getClass().equals(short.class)) {
                parseValue = Short.parseShort(value);
            } else if (field.getClass().equals(long.class)) {
                parseValue = Long.parseLong(value);
            }
        } else {
            parseValue = field.getType().getConstructor(String.class).newInstance(value);
        }
        return parseValue;
    }
}
