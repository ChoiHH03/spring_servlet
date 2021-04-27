package Hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/springmvc/old-controller")
/*** 위의 url로 들어가면 거기에 맞는 핸들러가 찾아지고, 이를 핸들러 어댑터를 통해 실행시킨다 ***/
/*** implements Controller의 Controller가 바로 핸들러 어댑터임 ***/
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}
