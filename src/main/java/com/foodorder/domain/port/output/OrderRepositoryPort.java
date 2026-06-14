package com.foodorder.domain.port.output;

import com.foodorder.domain.dto.FoodOrder;

public interface OrderRepositoryPort {

    void saveOrder(FoodOrder order);
    String findById(String orderId);
}
