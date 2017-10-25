package chain.of.responsiblity.filter;

/**
 * 实现对html的标签过滤
 */
public class HTMLFilter implements StrFilter {

    @Override
    public String doFilter(String str) {
//        System.out.println(str.replaceAll("[<>]","|"));
        return str.replaceAll("[<>]","|");
    }

}
