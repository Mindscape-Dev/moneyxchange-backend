package dev.mindscapedev.moneyxchange.core.currency.model;


import dev.mindscapedev.moneyxchange.support.exceptions.InvalidCurrencyCodeException;


public enum CurrencyCode {
    USD("USD"),
    EURO("EUR"),
    TURKISH_LIRA("TRY"),
    SAUDI_RIYAL("SAR"),
    JAPANESE_YEN("JPY"),
    POUND("GBP"),
    RUSSIAN_RUBLE("RUB"),
    KUWAITI_DINAR("KWD"),
    AZERBAIJAN_MANAT("AZN"),
    CANADIAN_DOLLAR("CAD"),
    CHINESE_YUAN("CNY"),
    SWEDISH_KRONA("SEK");


    final String code;

    CurrencyCode(String code) {
        this.code = code;
    }

    public static CurrencyCode getCurrencyByCode(String code) throws InvalidCurrencyCodeException {
        for (CurrencyCode currency : CurrencyCode.values()) {
            if (currency.getCode().equals(code)) {
                return currency;
            }
        }
        throw new InvalidCurrencyCodeException();
    }

    public String getCode() {
        return code;
    }
}
