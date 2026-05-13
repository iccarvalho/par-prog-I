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
        return ResponseEntity.ok(service.consultar());
    }

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto){
        Produto novo = service.criar(produto);
        // URI Uniform Resource Indentifier
        URI uri = URI.create("/produto/" + novo.getID());
        return ResponseEntity.created(uri).body(novo);
    }

    @DeleteMapping("/{ID}")
    public ResponseEntity<Void> remover(@PathVariable Long ID){
        if(service.remover(ID)) {
            return ResponseEntity.noContent().build(); // sucesso - 204
        } else {
            return ResponseEntity.notFound().build(); // erro do cliente - 404
        }
    }

    @PatchMapping("/{ID}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long ID, @RequestBody Produto novo) {
        Produto resposta = service.atualizar(ID, novo);
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
  