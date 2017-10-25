package chain.of.responsiblity.filter;

/**
 * chain of responsibility
 */
public class Main {


    public static void main(String[] args) {
        String msg = "大家好 ：）<script>:敏感的巴萨记得把阿贾克斯表达式可能宝鼎科技and被就业";
        MsgProcessor processor = new MsgProcessor();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter());
        filterChain.addFilter(new SensitiveFilter());
        processor.setFilter(filterChain);
        processor.setMsg(msg);

        System.out.println(processor.process());
    }
}
