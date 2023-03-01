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
        String notification = this.adaptedGift.redeem(item);
        return notification;
    }
}
