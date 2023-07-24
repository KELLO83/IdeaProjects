package com.example.spring5.Customer;
public class Assembler {
    private MemberDao memberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;


    public  Assembler() {
        memberDao = new MemberDao();
        regSvc = new MemberRegisterService(memberDao);
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao); // Depedency injection
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }
    public MemberRegisterService getMemberRegisterService() {
        return regSvc;
    }

    public ChangePasswordService getPwdSvc() {
        return pwdSvc;
    }
}
