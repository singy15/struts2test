package singy.struts2test.model;

import java.io.Serializable;

public class HelloModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fooStr;
    private int barInt;

    public String getFooStr() {
        return fooStr;
    }
    public void setFooStr(String fooStr) {
        this.fooStr = fooStr;
    }
    public int getBarInt() {
        return barInt;
    }
    public void setBarInt(int barInt) {
        this.barInt = barInt;
    }
}
