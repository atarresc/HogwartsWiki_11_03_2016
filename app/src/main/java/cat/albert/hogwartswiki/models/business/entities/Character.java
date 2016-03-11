package cat.albert.hogwartswiki.models.business.entities;

import java.io.Serializable;
import org.parceler.Parcel;

/**
 * Created by albert on 15/02/2016.
 */
@Parcel
public class Character implements Serializable {
    private String firstName;
    private String lastName;
    private String family;
    private int imatge;
    private int codi;

    public Character() {
    }

    public Character(String firstName, String lastName, String family, int imatge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.family = family;
        this.imatge = imatge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getImatge() {
        return imatge;
    }

    public void setImatge(int imatge) {
        this.imatge = imatge;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }
}
