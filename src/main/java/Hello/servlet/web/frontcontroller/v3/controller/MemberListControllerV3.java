package Hello.servlet.web.frontcontroller.v3.controller;

import Hello.servlet.domain.member.Member;
import Hello.servlet.domain.member.MemberRepository;
import Hello.servlet.web.frontcontroller.ModelView;
import Hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {

        List<Member> members = memberRepository.findAll();

        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        /*** mv의 model에는 member 리스트가 들어간다 ***/
        /*** model은 JSP 파일에 전달할 값들이 들어가있음 ***/
        return mv;
    }
}
