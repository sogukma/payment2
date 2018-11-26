/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.integration.payment.data.domain;

import rocks.process.integration.payment.business.domain.Amount;
import rocks.process.integration.payment.business.domain.Customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long transactionId;
    private Long customerId;
    private String orderId;
    private Double amount;
    private Integer numberOfItems;
    private Double discount;
    private Double chargingAmount;
    private String cardTransactionId;
    private Boolean isCanceled;

    public Transaction(Long customerId, String orderId, Amount amount, Double chargingAmount, Integer numberOfItems, String cardTransactionId) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.amount = amount.getValue();
        this.chargingAmount = chargingAmount;
        this.numberOfItems = numberOfItems;
        this.cardTransactionId = cardTransactionId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Boolean getIsCanceled() {
		return isCanceled;
	}

	public void setIsCanceled(Boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }



    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(Double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }

    public String getCardTransactionId() {
        return cardTransactionId;
    }

    public void setCardTransactionId(String cardTransactionId) {
        this.cardTransactionId = cardTransactionId;
    }

    public Boolean getCanceled() {
        return isCanceled;
    }

    public void setCanceled(Boolean canceled) {
        isCanceled = canceled;
    }
}

