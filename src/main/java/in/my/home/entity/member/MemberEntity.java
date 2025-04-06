package in.my.home.entity.member;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
@Getter
public class MemberEntity {

    @Id
    @Column(nullable = false,unique = true,length =10)
    private String memberid;

    @Column(nullable = false,length =20 )
    private String password;

    @Column(nullable = false,length = 20)
    private String name;

    @Column(nullable = false,length = 20)
    private String nickname;

    @Column(nullable = false,columnDefinition = "CHAR(8)")
    private String birth;

    @Column(nullable = false,length = 11,columnDefinition = "CHAR(11)")
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(columnDefinition = "CHAR(1)")
    private String grade;

    @Column(columnDefinition = "CHAR(1)")
    private String auth;
}
