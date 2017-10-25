package chain.of.responsiblity;

import chain.of.responsiblity.filter.HTMLFilter;
import chain.of.responsiblity.filter.SensitiveFilter;
import chain.of.responsiblity.filter.StrFilter;

/**
 * Created by AXT on 2017/10/25.
 */
public class MsgProcessor {
    private String msg;
    private StrFilter[] filters = {new HTMLFilter(), new SensitiveFilter()};


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        String r = msg;
        for(StrFilter filter : filters) {
        r = filter.doFilter(r);
        }
        return r;
    }
}
