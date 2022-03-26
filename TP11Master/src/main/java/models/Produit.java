package models;


import lombok.Data;


import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Produit {

    //Créer l’entity Product avec les attributs (id, name, price)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private  String name;
    private double price;

    @ManyToOne (cascade = CascadeType.PERSIST)

    @JoinColumn(name = "FK_FACTURE_ID")
    private Facture facture;

    public Produit() {
    }

    public Produit(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setProduit(List<Produit> produits) {
    }
}

