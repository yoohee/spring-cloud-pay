package quick.pager.pay.request.pay;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * 退款请求对象
 */
@Data
@Builder
@RequiredArgsConstructor
public class RefundRequest implements Serializable {
    private static final long serialVersionUID = 7665434802208740984L;
}
