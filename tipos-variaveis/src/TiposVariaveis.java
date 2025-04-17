
import static java.lang.System.out;
import java.util.Date;
import models.Pessoa;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Elen Cristina Pinheiro",
                "Elenzita Darhk",
                34,
                159.5,
                67.45,
                'F',
                false,
                new Date(1987, 8, 29));

        out.println(pessoa.toString());

        pessoa.atualizarIdade();

        out.println(pessoa.toString());
    }
}
