package com.bank.application.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.domain.model.TransferPaymentModel;

import jakarta.transaction.Transactional;

@Repository
public interface TransferPaymentRespository extends CrudRepository<TransferPaymentModel, String> {

    @Modifying
    @Transactional
    @Query("update TransferPaymentEntity tpe SET tpe.isProcessed = ?1 where tpe.transactionId = ?2")
    void updateTransactionStatus(Boolean newValue, String transactionId);

    @Modifying
    @Transactional
    @Query("update TransferPaymentEntity tpe SET tpe.isProcessed = ?1, tpe.error = ?2 where tpe.transactionId = ?3")
    void updateTransactionStatusError(Boolean newValue, String error, String transactionId);
}
