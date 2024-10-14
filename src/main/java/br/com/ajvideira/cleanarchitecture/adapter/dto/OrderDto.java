package br.com.ajvideira.cleanarchitecture.adapter.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class OrderDto implements Serializable {

    private String customerFirstName;
    private String customerLastName;
    private String billingStreet;
    private String billingCity;
    private String zipCode;

}
