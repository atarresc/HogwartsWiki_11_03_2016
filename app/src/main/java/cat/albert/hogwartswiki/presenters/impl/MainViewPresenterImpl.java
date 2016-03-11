package cat.albert.hogwartswiki.presenters.impl;


import android.content.Context;

import java.util.List;
import cat.albert.hogwartswiki.helpers.CharacterBuilder;
import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.models.persistence.daos.impl.CharactersSQLiteDAO;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.CharactersDAO;
import cat.albert.hogwartswiki.presenters.interfaces.IMainViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IMainView;


public class MainViewPresenterImpl implements IMainViewPresenter {


    private IMainView view;
    private List<Character> characters;
    private Context context;
    private CharactersDAO charactersDAO;

    @Override
    public void onCreate(IMainView view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getPersonsFromService() {
        view.showProgressBar();
        view.hideList();


        CharactersDAO characterBuilder = new CharactersSQLiteDAO(context);
        characters = characterBuilder.getAll();
        showList();
    }

    public void afegirPersonatge(Character character) {
        charactersDAO.save(character);
        showList();
    }

    @Override
    public void showList() {
        view.hideProgressBar();
        view.createList(view.createPersonAdapter(characters));
        view.showList();
    }
}

