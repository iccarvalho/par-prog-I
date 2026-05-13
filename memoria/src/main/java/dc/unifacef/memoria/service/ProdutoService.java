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
    public ArrayList<Produto> consultar(){
        return this.produtos;
    }

    // Insere produto na lista
    public Produto criar(Produto produto){
        produto.setID(ID);
        ID++;
        this.produtos.add(produto);
        return produto;
    }

    // Remove um produto com id
    public boolean remover(Long ID){
        return this.produtos.removeIf(p -> p.getID().equals(ID));
    }

    // Atualiza um produto por id
    public Produto atualizar(Long ID, Produto novo){
        novo.setID(ID);
        // percorrer para atualizar o produto
        for (int i = 0; i < produtos.size(); i++) {
            if(this.produtos.get(i).getID().equals(ID)){
                // produto encontrado
                this.produtos.set(i, novo); // atualiza
                return novo;
            }
        }
        return null; // produto não encontrado para atualizar
    }
}
