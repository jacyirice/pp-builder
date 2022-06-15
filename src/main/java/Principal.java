import com.jacyirice.Produto;
import com.jacyirice.ProdutoBuilder;

public class Principal {
    public static void main(String[] args) {
        ProdutoBuilder builder = new ProdutoBuilder();
        Produto produto = builder
                .categoria("")
                .descricao("")
                .build();

        System.out.println(produto);
    }
}
