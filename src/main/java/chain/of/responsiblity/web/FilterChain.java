package chain.of.responsiblity.web;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤连
 */
public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();
    int index = 0;
    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
       if(filterChain.index == filterChain.filters.size()) {
           return;
       }
       Filter f = filterChain.filters.get(index);
       index++;
       f.doFilter(request,response,filterChain);
    }
}
