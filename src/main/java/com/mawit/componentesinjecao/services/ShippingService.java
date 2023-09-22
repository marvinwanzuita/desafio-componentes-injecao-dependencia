package com.mawit.componentesinjecao.services;

import com.mawit.componentesinjecao.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        Double basic = order.getBasic();
        if (basic < 100.0){
            return 20.0;
        } else if (basic >= 100 && basic < 200.0){
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
