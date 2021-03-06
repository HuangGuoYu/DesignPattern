package chain.of.responsiblity.filter;

import chain.of.responsiblity.filter.FilterChain;

/**
 * Created by AXT on 2017/10/25.
 */
public class MsgProcessor {
    private String msg;
    private FilterChain filter;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public FilterChain getFilter() {
        return filter;
    }

    public void setFilter(FilterChain filter) {
        this.filter = filter;
    }

    public String process() {
        return filter.doFilter(msg);
    }
}
