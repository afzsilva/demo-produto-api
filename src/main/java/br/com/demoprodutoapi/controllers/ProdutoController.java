package br.com.demoprodutoapi.controllers;

import br.com.demoprodutoapi.dto.ProdutoDTO;
import br.com.demoprodutoapi.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> buscarTodos(){
        return  ResponseEntity.ok(produtoService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> salvar(@RequestBody ProdutoDTO produtoDTO){
        return ResponseEntity.ok(produtoService.salvar(produtoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id){
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
