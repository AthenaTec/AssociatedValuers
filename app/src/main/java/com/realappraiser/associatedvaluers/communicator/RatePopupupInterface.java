package com.realappraiser.associatedvaluers.communicator;

import com.realappraiser.associatedvaluers.model.RatePopup;

public interface RatePopupupInterface {
    void onRatePopupSucess(RatePopup ratePopup);
    void onRatePopupFailed(String msg);
}
