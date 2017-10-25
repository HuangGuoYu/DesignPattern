package chain.of.responsiblity.web;

/**
 * Created by AXT on 2017/10/25.
 */
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replaceAll("[<>]","|") +"---reqHtml";
        filterChain.doFilter(request,response,filterChain);
        response.responseStr += "--respHtml";
    }
}
