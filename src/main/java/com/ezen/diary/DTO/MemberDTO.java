package com.ezen.diary.DTO;

import com.ezen.diary.Entity.MemberEntity;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
/*
create TABLE diary_member(
num int not null PRIMARY KEY,
id varchar2(50),
pw varchar2(100),
name varchar2(50),
address varchar2(100),
phone varchar2(50),
email varchar2(50)
);

create SEQUENCE num_seq;
 */
public class MemberDTO {
    Long num;

    @NotBlank(message = "(필수) 아이디를 입력해 주세요")
    String id;

    @NotBlank(message = "(필수) 비밀번호를 입력해 주세요")
    String pw;

    @NotBlank(message = "(필수) 이름을 입력해 주세요")
    String name;
    String address;

    @NotBlank(message = "(필수) 휴대전화번호를 입력해 주세요")
    String phone;

    @Email(message = "이메일 형식에 맞지 않습니다.")
    String email;

public MemberEntity toEntity(){
    return new MemberEntity(num,id, pw,name,address, phone, email);
}
}
