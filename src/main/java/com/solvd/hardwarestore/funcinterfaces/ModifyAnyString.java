package com.solvd.hardwarestore.funcinterfaces;
@FunctionalInterface
public interface ModifyAnyString<T>{
    String getModifiedString(T t);
}
