package com.github.acnaweb.study_apir.controller;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.github.acnaweb.study_apir.dto.PedidoRequestCreate;
import com.github.acnaweb.study_apir.dtogi.PedidoResponse;
 
@RestController
@RequestMapping("pedidos")
public class ControllerPedido {
 
    @PostMapping
    public ResponseEntity<PedidoResponse> create(
                                @RequestBody PedidoRequestCreate dto) {                                            
        return ResponseEntity.noContent().build();  
    }
 
    @GetMapping("{id}")
    public ResponseEntity<PedidoResponse> findById(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }
}