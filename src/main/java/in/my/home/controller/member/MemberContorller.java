package in.my.home.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberContorller {

    @GetMapping(value = "memberinput")
    public String member(){


        return "member/MemberInput";
    }
}
