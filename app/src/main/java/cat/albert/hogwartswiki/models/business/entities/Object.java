package cat.albert.hogwartswiki.models.business.entities;

import java.io.Serializable;

/**
 * Created by albert on 15/02/2016.
 */
public class Object implements Serializable {
    private String objectName;
    private String objectInfo;
    private int imatge;
    private int codi;

    public Object() {
    }

    public Object(String objectName, String objectInfo, int imatge) {
        this.objectName = objectName;
        this.objectInfo = objectInfo;
        this.imatge = imatge;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(String objectInfo) {
        this.objectInfo = objectInfo;
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
