package com.paypal.Transaction_service.controller;

import com.paypal.Transaction_service.entity.Transaction;
import com.paypal.Transaction_service.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions/")
public class TrancationController {
    private final TransactionService service;
    private TrancationController (TransactionService service){
        this.service = service;
    }
    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody Transaction transaction){
        Transaction created = service.craeteTransaction(transaction);
        return ResponseEntity.ok(created);
    }
    @GetMapping("/all")
    public List<Transaction> getAll(){
        return service.getAllTransaction();
    }
}
