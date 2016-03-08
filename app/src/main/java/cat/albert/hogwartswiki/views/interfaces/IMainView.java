package cat.albert.hogwartswiki.views.interfaces;

import java.util.List;
import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.views.impl.adapters.CharacterListAdapter;

public interface IMainView {

    void createList(CharacterListAdapter adapter);

    CharacterListAdapter createPersonAdapter(List<Character> characters);

    void goToDetailActivity(Character character);

    void showProgressBar();

    void hideProgressBar();

    void showRetryButton();

    void hideRetryButton();

    void showList();

    void hideList();

    void showMessage(String message);

}
