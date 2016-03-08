package cat.albert.hogwartswiki.views.interfaces;

import java.util.List;
import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.views.impl.adapters.ObjectListAdapter;

public interface IMainObjectView {

    void createList(ObjectListAdapter adapter);

    ObjectListAdapter createPersonAdapter(List<Object> objects);

    void goToDetailActivity(Object object);

    void showProgressBar();

    void hideProgressBar();

    void showRetryButton();

    void hideRetryButton();

    void showList();

    void hideList();

    void showMessage(String message);
}
