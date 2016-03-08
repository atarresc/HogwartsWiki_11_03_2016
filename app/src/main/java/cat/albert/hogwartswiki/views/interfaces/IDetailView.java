package cat.albert.hogwartswiki.views.interfaces;

public interface IDetailView {

    // exemple de mètode per assignar una imatge a partir d'una URL
    void setImage(String url);

    // mètodes per assignar el nom, cognom i la família màgica del personatge
    void setFirstName(String text);
    void setLastName(String text);
    void setFamily(String text);
}
