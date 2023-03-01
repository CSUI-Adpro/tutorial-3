package id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.adapter;

import id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.Coupon;
import id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.Item;
import id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.payment.Payment;

public class CouponAdapter  implements Payment {
    private final Coupon adaptedCoupon;

    public CouponAdapter(Coupon coupon) {
        this.adaptedCoupon = coupon;
    }

    @Override
    public String pay(Item item) {
        // TODO: DONE
        // Melakukan redeem, method di Coupon yang setingkat dengan pay di dalam BelanjaaPayPayment
        String notification = adaptedCoupon.redeem(item);
        return notification;
    }
}
