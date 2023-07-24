package com.example.spring5.Customer;

public class WrongIdPasswordException extends RuntimeException{

    public  WrongIdPasswordException(){
        System.out.println("WrongIdPasswordException() 발생");
    }
}
