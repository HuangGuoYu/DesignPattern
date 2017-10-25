package chain.of.responsiblity.web;

/**
 * Created by AXT on 2017/10/25.
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
