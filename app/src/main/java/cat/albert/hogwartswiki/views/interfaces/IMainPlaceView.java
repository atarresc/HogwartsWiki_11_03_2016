package cat.albert.hogwartswiki.views.interfaces;

import java.util.List;
import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.views.impl.adapters.PlaceListAdapter;

public interface IMainPlaceView {

    void createList(PlaceListAdapter adapter);

    PlaceListAdapter createPersonAdapter(List<Place> places);

    void goToDetailActivity(Place place);

    void showProgressBar();

    void hideProgressBar();

    void showRetryButton();

    void hideRetryButton();

    void showList();

    void hideList();

    void showMessage(String message);
}
