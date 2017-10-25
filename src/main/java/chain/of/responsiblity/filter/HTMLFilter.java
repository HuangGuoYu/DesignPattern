package chain.of.responsiblity.filter;

/**
 * Created by AXT on 2017/10/25.
 */
public class HTMLFilter implements StrFilter {

    @Override
    public String doFilter(String str) {
        return str.replaceAll("[<>]","|");
    }

}
