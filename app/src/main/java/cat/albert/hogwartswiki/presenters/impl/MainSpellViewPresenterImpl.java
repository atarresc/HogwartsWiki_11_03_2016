package cat.albert.hogwartswiki.presenters.impl;


import android.content.Context;

import java.util.List;
import cat.albert.hogwartswiki.helpers.CharacterBuilder;
import cat.albert.hogwartswiki.models.business.entities.Spell;
import cat.albert.hogwartswiki.models.persistence.daos.impl.SpellsSQLiteDAO;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.SpellsDAO;
import cat.albert.hogwartswiki.presenters.interfaces.IMainSpellViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IMainSpellView;


public class MainSpellViewPresenterImpl implements IMainSpellViewPresenter {


    private IMainSpellView view;
    private List<Spell> spells;
    private Context context;

    @Override
    public void onCreate(IMainSpellView view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getPersonsFromService() {
        view.showProgressBar();
        view.hideList();

//        CharacterBuilder characterBuilder = new CharacterBuilder();
//        spells = characterBuilder.getSpells();
        SpellsDAO spellBuilder = new SpellsSQLiteDAO(context);
        spells = spellBuilder.getAll();
        showList();
    }

    @Override
    public void showList() {
        view.hideProgressBar();
        view.createList(view.createPersonAdapter(spells));
        view.showList();
    }

}