package com.javarush.task.task24.task2401;

public class UnsupportedInterfaceMarkerException extends Exception{
    public UnsupportedInterfaceMarkerException(String parameter_is_null) {
        super(parameter_is_null);
    }
}
