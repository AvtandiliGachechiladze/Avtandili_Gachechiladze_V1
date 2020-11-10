package ge.edu.btu.currency.service;

public interface CurrencyService {
    double convert(double amount);
    double convert(int amount);
    void setExchangeRate(double value);
}
