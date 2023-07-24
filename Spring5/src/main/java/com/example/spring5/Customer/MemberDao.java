package com.example.spring5.Customer;
import org.jetbrains.annotations.NotNull;

import  java.util.HashMap;
import  java.util.Map;
public class MemberDao {  // emial 통한 데이터 엑세스
    private  static long nextid = 0;
    private  Map<String, Member> map = new HashMap<>();

    public Member selectByEmail(String email) {
        return map.get(email);
    }
    public  void insert(@NotNull Member member) {
        member.setId(++nextid);
        map.put(member.getEmail(), member);
    }
    public  void update(Member member) {
        map.put(member.getEmail(), member);
    }
}
