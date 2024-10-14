package br.com.ajvideira.cleanarchitecture.controller.contracts;

import br.com.ajvideira.cleanarchitecture.adapter.dto.PaymentDto;

public interface IPaymentController<E> {

    E sendPayment(final PaymentDto paymentDto);
    E deletePayment(final String id);
    E approvePayment(final String id);
    E findById(final String id);

}
