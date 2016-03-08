package cat.albert.hogwartswiki.presenters.impl;

import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.presenters.interfaces.IDetailPlaceViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IDetailPlaceView;

public class DetailPlaceViewPresenterImpl implements IDetailPlaceViewPresenter {

    private IDetailPlaceView view;
    private Place place;

    @Override
    public void onCreate(IDetailPlaceView detailView, Place place) {
        view = detailView;
        this.place = place;

        view.setPlaceName(place.getPlaceName());
        view.setPlaceSecurityLevel(place.getPlaceSecurityLevel());
    }
}
