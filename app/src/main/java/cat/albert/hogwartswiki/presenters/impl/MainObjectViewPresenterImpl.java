package cat.albert.hogwartswiki.presenters.impl;

import android.content.Context;

import java.util.List;
import cat.albert.hogwartswiki.helpers.CharacterBuilder;
import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.models.persistence.daos.impl.ObjectsSQLiteDAO;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.ObjectsDAO;
import cat.albert.hogwartswiki.presenters.interfaces.IMainObjectViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IMainObjectView;

public class MainObjectViewPresenterImpl implements IMainObjectViewPresenter {

    private IMainObjectView view;
    private List<Object> objects;
    private Context context;

    @Override
    public void onCreate(IMainObjectView view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getPersonsFromService() {
        view.showProgressBar();
        view.hideList();

//        CharacterBuilder characterBuilder = new CharacterBuilder();
//        objects = characterBuilder.getObjects();
        ObjectsDAO objectBuilder = new ObjectsSQLiteDAO(context);
        objects = objectBuilder.getAll();
        showList();
    }

    @Override
    public void showList() {
        view.hideProgressBar();
        view.createList(view.createPersonAdapter(objects));
        view.showList();
    }
}