package uz.tuitfb.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.tuitfb.market.constant.Country;
import uz.tuitfb.market.entity.Customer;
import uz.tuitfb.market.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(MarketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Customer> customers = new LinkedList<>();
        customers.addAll(Stream.of(
                new Customer( "Ferganna", Country.UZB, "+998911533507"),
                new Customer( "Ferganna", Country.UZB, "+998911533508"),
                new Customer( "Qo`qon", Country.RUS, "+998911533509")
        ).collect(Collectors.toList()));
        System.out.println(customers);
        customerService.saveAll(customers);
    }
}
