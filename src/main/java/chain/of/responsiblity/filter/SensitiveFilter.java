package chain.of.responsiblity.filter;

/**
 * 实现对敏感词汇的过滤
 */
public class SensitiveFilter implements StrFilter {
    @Override
    public String doFilter(String str) {
        return str.replaceAll("被就业", "就业");
    }
}
