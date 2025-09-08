package com.paypal.Transaction_service.service;

import com.paypal.Transaction_service.entity.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction craeteTransaction(Transaction request);
    List<Transaction>getAllTransaction();
}
