package in.my.home.controller.member;

import in.my.home.service.member.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MemberRsetController {

    private final MemberService memberService;


    @PostMapping("/idcheck1")
        public String idcheck(@RequestParam("id") String id){
            boolean exists =memberService.existId(id);
            return exists ? "fail" : "ok" ;
        }
    }


