package com.foodorder.domain.port.input;

import com.foodorder.domain.dto.FoodOrder;

public interface PlaceOrderUsecase {

    void placeOrder(FoodOrder order);
}
