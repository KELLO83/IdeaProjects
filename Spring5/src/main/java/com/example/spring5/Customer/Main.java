package com.example.spring5.Customer;
import  java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));
        while (true) {
            System.out.println("명령어 입력");
            String commend = bufferedReader.readLine();
            if (commend.equalsIgnoreCase("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            if (commend.startsWith("new ")) {
                processNewCommand(commend.split(" "));
                continue;
            } else if (commend.startsWith("change ")) {
                processNewCommand(commend.split(" "));
                continue;
            }

        }
    }

    public static void processNewCommand(String[] args) {
        if (args.length != 5) {
            return;
        }
        MemberRegisterService regSvc = new MemberRegisterService();
        RegisterRequest req = new RegisterRequest();
        req.setEmail(args[1]);
        req.setName(args[2]);
        req.setPassword(args[3]);
        req.setConfirmPassword(args[4]);
        if (!req.isPasswordEqualToConfirmPassword()) {
            System.out.println("암호와 확인이 일치하지 않습니다.");
            return;
        }
        try {
            regSvc.regist(req);
            System.out.println("등록했습니다.");
        } catch (DuplicateMemberException e) {
            System.out.println("이미 존재하는 이메일입니다.");
        }
    }
}


