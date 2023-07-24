package com.example.spring5.Customer;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public class MemberRegisterService {
    private MemberDao memberDao;

    public MemberRegisterService(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    public MemberRegisterService() {
        //
    }

    public  Long regist(@NotNull RegisterRequest req){
        Member member = memberDao.selectByEmail(req.getEmail());
        if (member !=null){
            throw new DuplicateMemberException();
        }

        Member newMember  = new Member(req.getEmail(),req.getPassword(),req.getName(), LocalDateTime.now());

        memberDao.insert(newMember);

        return  newMember.getId();
    }
}
