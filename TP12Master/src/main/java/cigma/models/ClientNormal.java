package cigma.models;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
//@PrimaryKeyJoinColumn(name="normal_id")
@DiscriminatorValue("normal")
public class ClientNormal extends Client{
    private int importanceLevel;

    public ClientNormal() {
    }

    public ClientNormal(String name, int importanceLevel) {
        super(name);
        this.importanceLevel = importanceLevel;
    }

}