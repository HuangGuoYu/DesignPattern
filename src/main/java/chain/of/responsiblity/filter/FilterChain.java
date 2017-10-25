package chain.of.responsiblity.filter;

import chain.of.responsiblity.filter.StrFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤连
 */
public class FilterChain implements StrFilter{
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
