package br.com.ajvideira.cleanarchitecture.controller;

import br.com.ajvideira.cleanarchitecture.adapter.dto.PaymentDto;
import br.com.ajvideira.cleanarchitecture.controller.contracts.IPaymentController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/payments")
@RestController
public class PaymentController implements IPaymentController<ResponseEntity<PaymentDto>> {

    @PostMapping
    @Override
    public ResponseEntity<PaymentDto> sendPayment(PaymentDto paymentDto) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<PaymentDto> deletePayment(String id) {
        return null;
    }

    @PatchMapping("/{id}")
    @Override
    public ResponseEntity<PaymentDto> approvePayment(String id) {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<PaymentDto> findById(String id) {
        return null;
    }

}
