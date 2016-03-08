package cat.albert.hogwartswiki.models.business.entities;

import java.io.Serializable;

/**
 * Created by albert on 15/02/2016.
 */
public class Place implements Serializable {
    private String placeName;
    private String placeSecurityLevel;
    private int imatge;
    private int codi;

    public Place() {
    }

    public Place(String placeName, String placeSecurityLevel, int imatge) {
        this.placeName = placeName;
        this.placeSecurityLevel = placeSecurityLevel;
        this.imatge = imatge;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceSecurityLevel() {
        return placeSecurityLevel;
    }

    public void setPlaceSecurityLevel(String placeSecurityLevel) {
        this.placeSecurityLevel = placeSecurityLevel;
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
