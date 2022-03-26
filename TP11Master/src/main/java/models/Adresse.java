package models;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter

@Entity(name = "TAdresse")

public class Adresse {

    //(id, avenue ,ville, pays)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;


    private String avenue;
    private String ville;
    private String pays;

    public Adresse() {
    }

    public Adresse(long id, String avenue, String ville, String pays) {
        this.id = id;
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;
    }
}

