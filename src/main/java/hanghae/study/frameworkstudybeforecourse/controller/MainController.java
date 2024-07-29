package hanghae.study.frameworkstudybeforecourse.controller;

import hanghae.study.frameworkstudybeforecourse.dto.req.LoginReqDto;
import hanghae.study.frameworkstudybeforecourse.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    private final MemberService memberService;

    public MainController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String main(Model model) {
        List<String> items = Arrays.asList("item1", "item2", "item3");

        model.addAttribute("name", "Lee");
        model.addAttribute("items", items);
        model.addAttribute("condition", true);

        return "main";
    }

    @PostMapping("/login")
    public ModelAndView login(ModelAndView mav, LoginReqDto loginReqDto) {
        return memberService.login(mav, loginReqDto);
    }
}
