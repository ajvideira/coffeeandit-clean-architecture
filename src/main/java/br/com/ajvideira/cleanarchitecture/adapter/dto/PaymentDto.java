package br.com.ajvideira.cleanarchitecture.adapter.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class PaymentDto implements Serializable {

    private UUID id;
    private OrderDto orderDto;
    private Double amount;
    private String currency;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private Status status = Status.NAO_AUTORIZADA;

}
