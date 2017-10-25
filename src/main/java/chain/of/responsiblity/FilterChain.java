package chain.of.responsiblity;

import chain.of.responsiblity.filter.StrFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AXT on 2017/10/25.
 */
public class FilterChain {
    private List<StrFilter> filters = new ArrayList<>();

    public void addFilter(StrFilter f) {
        filters.add(f);
    }

    public String doFilter(String str) {
        String r = str;
        for(StrFilter filter : filters) {
            r = filter.doFilter(r);
        }
        return r;
    }
}
