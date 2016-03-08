package cat.albert.hogwartswiki.models.business.entities;

/**
 * Created by albert on 15/02/2016.
 */
public class Spell {
    private String spellName;
    private String spellImpact;
    private int imatge;
    private int codi;

    public Spell() {
    }

    public Spell(String spellName, String spellImpact, int imatge) {
        this.spellName = spellName;
        this.spellImpact = spellImpact;
        this.imatge = imatge;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellImpact() {
        return spellImpact;
    }

    public void setSpellImpact(String spellImpact) {
        this.spellImpact = spellImpact;
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
