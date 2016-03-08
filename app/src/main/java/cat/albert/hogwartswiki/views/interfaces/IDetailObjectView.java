package cat.albert.hogwartswiki.views.interfaces;

public interface IDetailObjectView {

    // exemple de mètode per assignar una imatge a partir d'una URL
    void setImage(String url);

    // mètodes per assignar nom i nivell de seguretat del lloc
    void setObjectName(String text);
    void setObjectInfo(String text);
}
