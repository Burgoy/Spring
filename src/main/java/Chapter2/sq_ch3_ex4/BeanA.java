package Chapter2.sq_ch3_ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private String param;
    private final BeanB b;

    @Autowired
    public BeanA(BeanB b){
        this.b = b;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
