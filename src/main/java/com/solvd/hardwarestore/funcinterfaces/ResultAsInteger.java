package com.solvd.hardwarestore.funcinterfaces;
@FunctionalInterface
public interface ResultAsInteger <T,V>{
    Integer resultIsInteger(T t,V v);
}
