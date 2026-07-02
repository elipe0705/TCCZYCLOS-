package com.itb.inf2fm.zyclos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.inf2fm.zyclos.model.services.ProdutoService;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

}
