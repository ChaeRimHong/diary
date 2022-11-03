package com.ezen.diary.Service;

import com.ezen.diary.Entity.MemberEntity;
import com.ezen.diary.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImp implements MemberService{

    @Autowired
    MemberRepository mRepository;

    @Override
    public void join_save(MemberEntity memberEntity1) {
        mRepository.save(memberEntity1);
    }

    @Override
    public void login_do(String id, String pw) {

    }

    @Override
    public Optional<MemberEntity> find_idnum(String id) {
        return mRepository.findByName(id);
    }


}
