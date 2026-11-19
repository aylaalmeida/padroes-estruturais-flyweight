package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void cadastrar(String tituloLivro, String nomeEditora, String pais) {
        Editora editora = EditoraFactory.getEditora(nomeEditora, pais);
        Livro livro = new Livro(tituloLivro, editora);
        livros.add(livro);
    }

    public List<String> obterLivros() {
        List<String> saida = new ArrayList<String>();
        for (Livro livro : this.livros) {
            saida.add(livro.obterLivro());
        }
        return saida;
    }


}
