package cat.albert.hogwartswiki.presenters.impl;

import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.presenters.interfaces.IDetailObjectViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IDetailObjectView;

public class DetailObjectViewPresenterImpl implements IDetailObjectViewPresenter {

    private IDetailObjectView view;
    private Object object;

    @Override
    public void onCreate(IDetailObjectView detailView, Object object) {
        view = detailView;
        this.object = object;

        view.setObjectName(object.getObjectName());
        view.setObjectInfo(object.getObjectInfo());
    }
}
