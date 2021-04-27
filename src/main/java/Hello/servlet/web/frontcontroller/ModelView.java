package Hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

/*** ModelView는 jsp파일 이름과 jsp파일에 전달할 데이터를 다루는 클래스 ***/
/*** model은 JSP파일에 전달할 데이터가 들어있는 객체 ***/
public class ModelView {

    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
