package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {
    private double exchangeRate;

    @Override
    public double convert(double amount) {
        double result = amount / exchangeRate;
        return result;
    }

    @Override
    public double convert(int amount) {
        double result = amount / exchangeRate;
        return result;
    }

    @Override
    public void setExchangeRate(double value) {
        exchangeRate = value;
    }
}
