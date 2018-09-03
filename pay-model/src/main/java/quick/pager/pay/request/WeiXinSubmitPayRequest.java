package quick.pager.pay.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 微信支付请求主体类
 *
 * @author siguiyang
 */
@Data
public class WeiXinSubmitPayRequest implements Serializable {
    private static final long serialVersionUID = -8866298241183396595L;
    /**
     * 订单号
     */
    private String merchantOrderNo;
    /**
     * 签名
     */
    private String sign;
    /**
     * 签名类型
     */
    private String signType;
    /**
     * 回调通知地址
     */
    private String notifyUrl;

    /**
     * 支付时间戳
     */
    private String timestamp;
    /**
     * 支付主题说明
     */
    private String body;

    /**
     * 订单金额
     */
    private BigDecimal amount;



}
