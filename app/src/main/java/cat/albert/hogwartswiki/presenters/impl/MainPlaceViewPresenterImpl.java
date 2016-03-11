package cat.albert.hogwartswiki.presenters.impl;

import android.content.Context;

import java.util.List;
import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.models.persistence.daos.impl.PlacesSQLiteDAO;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.PlacesDAO;
import cat.albert.hogwartswiki.presenters.interfaces.IMainPlaceViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IMainPlaceView;

public class MainPlaceViewPresenterImpl implements IMainPlaceViewPresenter {

    private IMainPlaceView view;
    private List<Place> places;
    private Context context;
    private PlacesDAO placesDAO;

    @Override
    public void onCreate(IMainPlaceView view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getPersonsFromService() {
        view.showProgressBar();
        view.hideList();

        PlacesDAO placeBuilder = new PlacesSQLiteDAO(context);
        places = placeBuilder.getAll();
        showList();
    }

    public void afegirLocalitzacio(Place place) {
        placesDAO.save(place);
        showList();
    }

    @Override
    public void showList() {
        view.hideProgressBar();
        view.createList(view.createPersonAdapter(places));
        view.showList();
    }
}