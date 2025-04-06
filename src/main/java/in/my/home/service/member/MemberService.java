package in.my.home.service.member;


import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    boolean existId(String id);
}
