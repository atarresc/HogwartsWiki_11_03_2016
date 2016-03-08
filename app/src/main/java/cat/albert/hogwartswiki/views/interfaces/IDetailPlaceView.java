package cat.albert.hogwartswiki.views.interfaces;

public interface IDetailPlaceView {

    // exemple de mètode per assignar una imatge a partir d'una URL
    void setImage(String url);

    // mètodes per assignar nom i nivell de seguretat del lloc
    void setPlaceName(String text);
    void setPlaceSecurityLevel(String text);
}
