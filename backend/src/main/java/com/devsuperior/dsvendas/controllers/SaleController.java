package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDto;
import com.devsuperior.dsvendas.dto.SaleSumDto;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService sale;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> list = sale.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sum-by-seller")
    public ResponseEntity<List<SaleSumDto>> amountGroupBySeller() {
        List<SaleSumDto> list = sale.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDto>> successGroupBySeller() {
        List<SaleSuccessDto> list = sale.successGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
