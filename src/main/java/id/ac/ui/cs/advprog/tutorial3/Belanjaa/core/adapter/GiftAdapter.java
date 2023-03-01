package id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.adapter;

import id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.Gift;
import id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.Item;
import id.ac.ui.cs.advprog.tutorial3.Belanjaa.core.payment.Payment;

public class GiftAdapter implements Payment {
    private final Gift adaptedGift;

    public GiftAdapter(Gift gift ) {
        this.adaptedGift = gift;
    }

    @Override
    public String pay(Item item) {
        // TODO: DONE
        // Melakukan redeem, method di Gift yang setingkat dengan pay di dalam BelanjaaPayPayment
        // Jika sudah pernah direedem maka kembalikan string "Your coupon is already redeemed"
        String notification;
        if (this.adaptedGift.isRedeemed()) {
            return String.format("Your gift is already redeemed");
        }
        notification = this.adaptedGift.redeem(item);
        return notification;
    }
}
