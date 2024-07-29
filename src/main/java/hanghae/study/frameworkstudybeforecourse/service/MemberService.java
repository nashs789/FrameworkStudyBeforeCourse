package hanghae.study.frameworkstudybeforecourse.service;

import hanghae.study.frameworkstudybeforecourse.dto.req.LoginReqDto;
import hanghae.study.frameworkstudybeforecourse.entity.Member;
import hanghae.study.frameworkstudybeforecourse.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public ModelAndView login(ModelAndView mav, LoginReqDto loginReqDto) {
        Optional<Member> member = memberRepository.findByUserNameAndPw(loginReqDto.getUserName(), loginReqDto.getPw());

        mav.setViewName(member.isPresent() ? "welcome" : "main");

        if(member.isPresent()) {
            mav.addObject("member", member.get());

            mav.setViewName("welcome");
        } else {
            mav.setViewName("main");
        }

        return mav;
    }
}
