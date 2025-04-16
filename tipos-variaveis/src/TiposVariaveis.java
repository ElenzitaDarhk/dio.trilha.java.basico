
import static java.lang.System.out;
import models.Pessoa;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Elen Cristina Pinheiro",
                "Elenzita Darhk",
                37,
                159.5F);

        out.println(pessoa.toString());
    }
}
