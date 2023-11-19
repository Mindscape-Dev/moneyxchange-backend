package dev.mindscapedev.moneyxchange.core.currency.model;

import dev.mindscapedev.moneyxchange.support.exceptions.InvalidCurrencyCodeException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class CurrencyExchangeRate {
    @Id
    private String code;

    @Column(name = "baseCode")
    private CurrencyCode baseCurrencyCode;

    @Column(name= "targetCode")
    private CurrencyCode targetCurrencyCode;
    @Column(name = "buy")
    private String buyPrice;

    @Column(name = "sell")
    private String sellPrice;

    @Column(name = "isRaised")
    private Boolean isRaised;

    @Column(name = "expireTime")
    private Instant expirationTime;

    private CurrencyExchangeRate(){}

    public static CurrencyExchangeRate createExchangeRate(String baseCurrencyCode, String targetCurrencyCode) throws InvalidCurrencyCodeException{
        return  new CurrencyExchangeRate()
                .setCode(baseCurrencyCode+targetCurrencyCode)
                .setBaseCurrencyCode(CurrencyCode.getCurrencyByCode(baseCurrencyCode))
                .setTargetCurrencyCode(CurrencyCode.getCurrencyByCode(targetCurrencyCode));
    }

    public String getCode() {
        return code;
    }

    private CurrencyExchangeRate setCode(String code) {
        this.code = code;
        return this;
    }

    public CurrencyCode getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public CurrencyExchangeRate setBaseCurrencyCode(CurrencyCode baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
        return this;
    }

    public CurrencyCode getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    public CurrencyExchangeRate setTargetCurrencyCode(CurrencyCode targetCurrencyCode) {
        this.targetCurrencyCode = targetCurrencyCode;
        return this;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public CurrencyExchangeRate setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public CurrencyExchangeRate setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public Boolean getRaised() {
        return isRaised;
    }

    public CurrencyExchangeRate setRaised(Boolean raised) {
        isRaised = raised;
        return this;
    }

    public Instant getExpirationTime() {
        return expirationTime;
    }

    public CurrencyExchangeRate setExpirationTime(Instant expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
}
