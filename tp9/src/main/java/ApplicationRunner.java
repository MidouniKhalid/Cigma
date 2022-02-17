import presentation.ClientController;
import models.CarteFidelio;
import models.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) ctx.getBean("ctrl");
        Client client = new Client("OMAR");
        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctr.save(client);
    }
}