package com.ezen.diary.DTO;

import com.ezen.diary.Entity.MemberEntity;
import lombok.*;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
/*
create TABLE diary_member(
num int not null PRIMARY KEY,
id varchar2(50) DEFAULT '0' UNIQUE,
pw varchar2(100) DEFAULT '0',
name varchar2(50) DEFAULT '0',
address varchar2(100) DEFAULT '0',
phone varchar2(50) DEFAULT '0',
email varchar2(50) DEFAULT '0'
);
create SEQUENCE num_seq;
 */
public class MemberDTO {
    Long num;

    String id;
    String pw;
    String name;
    String address;
    String phone;
    String email;

public MemberEntity toEntity(){
    return new MemberEntity(num,id, pw,name,address, phone, email);
}
}
