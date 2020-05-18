package ro.pub.cs.systems.eim.practicaltest02.model;

import java.util.Date;

public class BitcoinExchange {
    private Double exchangeRate;
    private String currencyCode;
    private Date updateDate;

    public BitcoinExchange() {
        this.exchangeRate = null;
        this.currencyCode = null;
        this.updateDate = null;
    }

    public BitcoinExchange(Double rate, String code) {
        this.exchangeRate = rate;
        this.currencyCode = code;
        this.updateDate = new Date();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
