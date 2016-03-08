package cat.albert.hogwartswiki.presenters.interfaces;

import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.views.interfaces.IDetailObjectView;

public interface IDetailObjectViewPresenter {

    public void onCreate(IDetailObjectView view, Object object);

}
