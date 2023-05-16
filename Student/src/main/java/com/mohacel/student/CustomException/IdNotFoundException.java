package com.mohacel.student.CustomException;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(){super();}
    public IdNotFoundException(String message){super(message);}
}
