package in.my.home.service.member;

import in.my.home.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

   @Autowired
   private MemberRepository memberRepository;

    @Override
    public boolean existId(String id) {
        return memberRepository.existsById(id);
    }
}
