package com.foodorder.adapter.output.repository;

import com.foodorder.domain.dto.FoodOrder;
import com.foodorder.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort {

    // inject mongo repository

    @Override
    public void saveOrder(FoodOrder order) {

    }

    @Override
    public String findById(String orderId) {
        return "";
    }
}
