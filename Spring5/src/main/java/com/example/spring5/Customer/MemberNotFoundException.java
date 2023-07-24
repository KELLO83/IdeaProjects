package com.example.spring5.Customer;

public class MemberNotFoundException extends  RuntimeException{
    MemberNotFoundException(){
        System.out.println("MemberNotFoundException() 발생");
    }
}
