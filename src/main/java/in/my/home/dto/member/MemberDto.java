package in.my.home.dto.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class MemberDto {

    @NotBlank(message = "아이디는 필수입니다.")
    @Size(min = 4,max = 10,message = "아이디는 4~10자여야 합니다.")
    private String memberid;

    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;

    @NotBlank(message = "이름은 필수입니다.")
    private String name;


    private Date birth;
    private String nickname;
    private int grade;
    private int auth;
    private String email;
    private String address;
    private String phone;

}
