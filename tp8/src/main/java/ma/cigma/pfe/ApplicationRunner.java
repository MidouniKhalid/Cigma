package ma.cigma.pfe;


import ma.cigma.pfe.Controller.FactureController;
import ma.cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println("end");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        FactureController ctrl = (FactureController) ctx.getBean("controller");

        Facture f = new Facture(new Date(),20.05);
        ctrl.save(f);


    }
}
