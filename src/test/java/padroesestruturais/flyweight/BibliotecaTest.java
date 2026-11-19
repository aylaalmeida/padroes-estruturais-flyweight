package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarLivros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Capitaes da Areia", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Vidas Secas", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Animal Farm", "Penguin", "Reino Unido");

        List<String> saida = Arrays.asList(
                "Livro{titulo='Dom Casmurro', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Capitaes da Areia', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Vidas Secas', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Animal Farm', editora='Penguin', pais='Reino Unido'}");

        assertEquals(saida, biblioteca.obterLivros());
    }

    @Test
    void deveRetornarTotalEditoras() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Capitaes da Areia", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Vidas Secas", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Animal Farm", "Penguin", "Reino Unido");

        assertEquals(2, EditoraFactory.getTotalEditoras());
    }

}
