package br.com.ajvideira.cleanarchitecture.contracts;

import br.com.ajvideira.cleanarchitecture.adapter.dto.PaymentDto;

public interface IPaymentApplication {

    PaymentDto receivePayment(final PaymentDto paymentDto);
    void cancelPayment(final String id);
    PaymentDto approvePayment(final String id);

}
