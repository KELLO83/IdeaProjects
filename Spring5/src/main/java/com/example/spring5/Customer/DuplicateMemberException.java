package com.example.spring5.Customer;

public class DuplicateMemberException extends RuntimeException{

        public  DuplicateMemberException(){

            System.out.println("DuplicateMemberException() 발생");
        }
}
