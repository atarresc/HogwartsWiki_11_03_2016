package cat.albert.hogwartswiki.views.interfaces;

public interface IDetailSpellView {

    // exemple de mètode per assignar una imatge a partir d'una URL
    void setImage(String url);

    // mètodes per assignar nom i impacte del conjur
    void setSpellName(String text);
    void setSpellImpact(String text);
}
