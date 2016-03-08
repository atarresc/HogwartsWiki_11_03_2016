package cat.albert.hogwartswiki.presenters.interfaces;

import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.views.interfaces.IDetailPlaceView;

public interface IDetailPlaceViewPresenter {

    public void onCreate(IDetailPlaceView view, Place place);

}
