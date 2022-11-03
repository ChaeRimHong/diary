package com.ezen.diary.Service;

import com.ezen.diary.Entity.MemberEntity;

import java.util.Optional;

public interface MemberService {
    public void join_save(MemberEntity memberEntity1);


    void login_do(String id, String pw);

    Optional<MemberEntity> find_idnum(String id);
}
