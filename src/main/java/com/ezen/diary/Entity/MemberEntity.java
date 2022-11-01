package com.ezen.diary.Entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "diary_member")
@Entity
@DynamicInsert
@DynamicUpdate
@SequenceGenerator(
        name = "num_seq_generator",
        sequenceName = "num_seq",
        initialValue = 1,allocationSize = 1
)
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "num_seq_generator")
    Long num;

    @Column
    String id;

    @Column
    String pw;

    @Column
    String name;

    @Column
    String address;

    @Column
    String phone;

    @Column
    String email;
}
