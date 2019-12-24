package pattern.strategy.pay;

/**
 * ֧������Ժ��״̬
 * Created by Tom on 2018/3/11.
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg,Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString(){
        return ("֧��״̬��[" + code + "]," + msg + ",�������飺" + data);
    }
}
