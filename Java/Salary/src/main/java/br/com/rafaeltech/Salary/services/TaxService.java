package br.com.rafaeltech.Salary.services;

import br.com.rafaeltech.Salary.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double tax(double amount) {
        return amount * 0.2;
    }
}
