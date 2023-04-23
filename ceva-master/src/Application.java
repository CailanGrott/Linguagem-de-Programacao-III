import enums.FormaPagamento;
import enums.TipoCerveja;
import model.*;
import service.PedidoService;

import java.time.LocalDate;
import java.util.Arrays;

import static java.math.BigDecimal.*;

public class Application {

    public static void main(String[] args) {

        Endereco enderecoLucas = new Endereco("Rua X", 40, "", "90000-000");
        Endereco enderecoMarcela = new Endereco("Rua Y", 80, "", "90000-000");
        Endereco enderecoCailan = new Endereco("Rua Y", 80, "", "90000-000");

        Usuario usuario = new Usuario("Lucas", LocalDate.of(1987, 7, 27),
                enderecoLucas, "11111111", "lucas.nunes", "123456");
        Usuario usuario2 = new Usuario("Marcela", LocalDate.of(1987, 7, 27),
                enderecoMarcela, "2222222", "marcela.proenca", "123456");
        Usuario usuario3 = new Usuario("Cailan", LocalDate.of(2002, 8, 28),
                enderecoCailan, "2222222", "eusougrott", "123456");

        Produto produto1 = new Cerveja("Cerveja Polar", valueOf(10),
                LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1),
                "Brasil", TipoCerveja.PILSEN, 5, 600);
        Produto produto2 = new Cerveja("Cerveja Heineken", valueOf(10),
                LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1),
                "Brasil", TipoCerveja.PILSEN, 6, 600);
        Produto produto3 = new Cerveja("Cerveja Brahma", valueOf(10),
                LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1),
                "Brasil", TipoCerveja.WEISS, 6, 600);

        Pedido pedido1 = new Pedido(1, usuario2, Arrays.asList(produto1, produto2), FormaPagamento.PIX);
        Pedido pedido2 = new Pedido(2, usuario, Arrays.asList(produto2), FormaPagamento.DINHEIRO);
        Pedido pedido3 = new Pedido(3, usuario3, Arrays.asList(produto3, produto1), FormaPagamento.CARTAO);

        PedidoService service = new PedidoService();
        service.efetuarPedido(pedido1);
        service.efetuarPedido(pedido2);
        service.efetuarPedido(pedido3);
    }

}
