package problems.builder;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        Contato contato1 = new Contato("51980515025", "cailangrott@gmail.com");
        Pessoa pessoa1 = new Pessoa("Cailan", "Soares Grott", "04471087002",
                "1127183067", LocalDate.of(2002, 8, 28), contato1,
                false, false, true, true);
    }
}
