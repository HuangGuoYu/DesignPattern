package chain.of.responsiblity.filter;

/**
 * Created by AXT on 2017/10/25.
 */
public class SensitiveFilter implements StrFilter {
    @Override
    public String doFilter(String str) {
        return str.replaceAll("被就业", "就业");
    }
}
