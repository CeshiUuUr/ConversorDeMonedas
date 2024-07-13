import com.aluracursos.conversormonedas.CurrencyConverter;
import com.aluracursos.conversormonedas.Menu;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter();
        converter.setApiKey("2b9dae1b2f72bae2e3328583");

        Menu menu = new Menu(converter);
        menu.displayMenu();
    }
}