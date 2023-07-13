package Chapter2.sq_ch3_ex4;

import org.springframework.stereotype.Component;


public class BeanB {
    private final BeanA a;
    private String param;

    public BeanB(BeanA a) {
        this.a = a;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
