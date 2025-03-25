package br.com.rafaeltech.product.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private double shippingAmount;

    public double shipment(double basic){
        if (basic<100){
            return shippingAmount = 20.0;
        } else if (basic >= 100 && basic <= 200){
            return shippingAmount = 12.0;
        } else {
            return shippingAmount = 0.0;
        }
    }
}
