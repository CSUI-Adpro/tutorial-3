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
        // Jika sudah pernah direedem maka kembalikan string "Your coupon is already redeemed"
        String notification;
        if (this.adaptedCoupon.isRedeemed()) {
            return String.format("Your coupon is already redeemed");
        }
        notification = this.adaptedCoupon.redeem(item);
        return notification;
    }
}
