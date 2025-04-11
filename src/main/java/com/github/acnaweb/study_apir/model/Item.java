package com.github.acnaweb.study_apir.model;

import java.math.BigDecimal;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
 
@Entity
public class Item {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @ManyToOne
    private Pedido pedido;
 
    @ManyToOne
    private Product product;
 
    private BigDecimal valor;
 
    private BigDecimal quantidade;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Pedido getPedido() {
        return pedido;
    }
 
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
 
    public Product getProduto() {
        return product;
    }
 
    public void setProduto(Product produto) {
        this.product = product;
    }
 
    public BigDecimal getValor() {
        return valor;
    }
 
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
 
    public BigDecimal getQuantidade() {
        return quantidade;
    }
 
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
 
   
 
}
 