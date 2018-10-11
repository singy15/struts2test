package singy.struts2test.actionsTest;

import org.apache.struts2.StrutsTestCase;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import singy.struts2test.actions.HelloAction;

public class HelloActionTest extends StrutsTestCase {

    public void testHelloAction() throws Exception {
        HelloAction hello = new HelloAction();
        ActionContext.getContext().getContainer().inject(hello);
        String result = hello.execute();
        assertTrue("Expected a success result!",
                ActionSupport.SUCCESS.equals(result));
        assertTrue("Expected the default message!",
                hello.getText(HelloAction.MESSAGE).equals(hello.getMessage()));
    }
}
