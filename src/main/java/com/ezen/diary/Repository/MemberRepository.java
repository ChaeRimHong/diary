package com.ezen.diary.Repository;

import com.ezen.diary.DTO.MemberDTO;
import com.ezen.diary.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {
    Optional<MemberEntity> findByName(String id);
}
