package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoService {
    // Cria o ArrayList
    public ArrayList<Produto> produtos = new ArrayList<>();
    private Long ID = 1L;

    // Consulta os produtos da lista
    public ArrayList<Produto> consulta(){
        return this.produtos;
    }

    // Insere produto na lista
    public Produto criar(Produto produto){
        produto.setID(ID);
        ID++;
        this.produtos.add(produto);
        return produto;
    }
}
