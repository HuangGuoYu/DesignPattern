package chain.of.responsiblity;

/**
 * chain of responsibility
 */
public class Main {


    public static void main(String[] args) {
        String msg = "大家好 ：）<script>:敏感的巴萨记得把阿贾克斯表达式可能宝鼎科技and被就业";
        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(msg);
        System.out.println(processor.process());
    }
}
