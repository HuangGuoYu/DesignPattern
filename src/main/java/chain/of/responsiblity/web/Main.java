package chain.of.responsiblity.web;

/**
 * Created by AXT on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
        String msg = "大家好 ：）<script>:敏感的巴萨记得把阿贾克斯表达式可能宝鼎科技and被就业";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain chain = new FilterChain();
        chain.addFilter(new HTMLFilter())
            .addFilter(new SensitiveFilter());
        chain.doFilter(request, response,chain);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
