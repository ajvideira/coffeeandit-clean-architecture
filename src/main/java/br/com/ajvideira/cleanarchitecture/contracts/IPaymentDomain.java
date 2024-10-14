package br.com.ajvideira.cleanarchitecture.contracts;

import br.com.ajvideira.cleanarchitecture.adapter.dto.PaymentDto;

import java.util.Optional;

public interface IPaymentDomain {

    PaymentDto receivePayment(final PaymentDto paymentDto);
    void cancelPayment(final PaymentDto paymentDto);
    PaymentDto approvePayment(final PaymentDto paymentDto);
    Optional<PaymentDto> findById(final String id);

}
