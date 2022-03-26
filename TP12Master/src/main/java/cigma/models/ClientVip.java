package cigma.models;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
//@PrimaryKeyJoinColumn(name="vip_id")
@DiscriminatorValue("vip")
public class ClientVip extends Client{
    private String preferences;

    public ClientVip() {
    }

    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences;
    }

}