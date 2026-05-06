package dc.unifacef.memoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // classe responsável por controlar requisições rest
@RequestMapping("/produto") // response apenas solicitações do endpoint /produto
public class ProdutoController {

    // requisição pelo verbo GET
    @GetMapping
    public String mensagem(){
        return "Hello World";
    }

}