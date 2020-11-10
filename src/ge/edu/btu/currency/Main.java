package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String args[]) {
        final Logger logger = Logger.getLogger(Main.class);

        CurrencyServiceImpl currencyService = new CurrencyServiceImpl();
        logger.info("currency service object was created!");

        currencyService.setExchangeRate(3);
        logger.info("exchange rate was set to 3");

        System.out.println(currencyService.convert(12));
        logger.info("conversation was held with parameter: " + 12 + " and result " + currencyService.convert(12));

        System.out.println(currencyService.convert(122.3));
        logger.info("conversation was held with parameter: " + 122.3 + " and result " + currencyService.convert(122.3));
    }
}
