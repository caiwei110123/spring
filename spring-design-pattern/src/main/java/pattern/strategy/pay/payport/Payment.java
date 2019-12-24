package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * Ö§¸¶ÇþµÀ
 * Created by Tom on 2018/3/11.
 */
public interface Payment {

      PayState pay(String uid, double amount);

}
