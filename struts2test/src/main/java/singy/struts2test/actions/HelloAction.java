package singy.struts2test.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import singy.struts2test.model.HelloModel;

//access with
//http://localhost:8080/struts2cdrp/hello.action

/**
 * <code>Set welcome message.</code>
 */
public class HelloAction extends ActionSupport implements ModelDriven<HelloModel>, Preparable, SessionAware {

    private HelloModel model;
    private Map<String, Object> session;
    private String foobar;

    public String execute() throws Exception {
        System.out.println("execute!");
        setMessage(getText(MESSAGE));
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public HelloModel getModel() {
        System.out.println("getmodel");
        return this.model;
    }

    @Override
    public void prepare() throws Exception {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("prepare");

        foobar = "foobar!";

        session.put("baz", "baz!");

        model = new HelloModel();
        model.setFooStr("foo!");
        model.setBarInt(123);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("setSession");
        this.session = session;
    }

    public String getFoobar() {
        return foobar;
    }

    public void setFoobar(String foobar) {
        this.foobar = foobar;
    }


}
