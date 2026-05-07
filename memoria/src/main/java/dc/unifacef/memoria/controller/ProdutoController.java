package dc.unifacef.memoria.controller;

import dc.unifacef.memoria.model.Produto;
import dc.unifacef.memoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;

@RestController // classe responsável por controlar requisições rest
@RequestMapping("/produto") // response apenas solicitações do endpoint /produto
public class ProdutoController {

    // Injeção de dependência
    // Chamar métodos de um objeto sem instanciá-lo
    @Autowired
    ProdutoService service;

    // ResponseEntity é um tipo de dado que retorna do controller para o Frontend
    @GetMapping // requisição pelo verbo GET
    public ResponseEntity<ArrayList<Produto>> consultar(){
        return ResponseEntity.ok(service.consulta());
    }

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto){
        Produto novo = service.criar(produto);
        // URI Uniform Resource Indentifier
        URI uri = URI.create("/produto/" + novo.getID());
        return ResponseEntity.created(uri).body(novo);
    }
}
  