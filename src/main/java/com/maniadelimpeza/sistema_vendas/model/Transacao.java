package com.maniadelimpeza.sistema_vendas.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transacao {
    private String methodPayment;
    private String method;
    private Boolean isValid;
}
