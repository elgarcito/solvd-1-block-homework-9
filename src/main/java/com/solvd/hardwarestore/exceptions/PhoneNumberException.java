package com.solvd.hardwarestore.exceptions;
/*
This exception throws a messsage if we don't have any more stock available
 */

public class PhoneNumberException extends Exception {
    public PhoneNumberException(String message){
        super(message);
    }
}
