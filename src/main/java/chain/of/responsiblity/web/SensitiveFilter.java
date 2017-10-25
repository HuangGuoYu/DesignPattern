package chain.of.responsiblity.web;


/**
 * 实现对敏感词汇的过滤
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replaceAll("被就业","就业")+"---reqSens";
        filterChain.doFilter(request,response,filterChain);
        response.responseStr+="--respSens";
    }
}
