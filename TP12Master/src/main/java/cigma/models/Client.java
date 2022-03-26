package cigma.models;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client")
//@Inheritance(strategy = InheritanceType.JOINED)

public class Client {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private List<Facture> factures;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
            name = "client_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "promotion_fk",
                    referencedColumnName = "id"
            ))
    private List<Promotion> promotions;

    //@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;
   // private List<Facture> factures;


    public Client() {
    }

    public Client(long id, String name, List<Facture> factures, List<Promotion> promotions, CarteFidelio carteFidelio) {
        this.id = id;
        this.name = name;
        this.factures = factures;
        this.promotions = promotions;
        this.carteFidelio = carteFidelio;
    }


    public Client(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public Client get() {

        return null;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", factures=" + factures +
                ", promotions=" + promotions +
                ", carteFidelio=" + carteFidelio +
                '}';
    }
}