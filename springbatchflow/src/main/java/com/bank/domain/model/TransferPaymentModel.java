package com.bank.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class TransferPaymentModel {

    private String transactionId;
    private Double avaiableBalance;
    private Double amountPaid;
    private Boolean isEnabled;
    private Boolean isProcessed;
    private String error;
}
