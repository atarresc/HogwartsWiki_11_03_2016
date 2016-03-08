package cat.albert.hogwartswiki.views.interfaces;

import java.util.List;
import cat.albert.hogwartswiki.models.business.entities.Spell;
import cat.albert.hogwartswiki.views.impl.adapters.SpellListAdapter;

public interface IMainSpellView {

    void createList(SpellListAdapter adapter);

    SpellListAdapter createPersonAdapter(List<Spell> spells);

    void goToDetailActivity(Spell spell);

    void showProgressBar();

    void hideProgressBar();

    void showRetryButton();

    void hideRetryButton();

    void showList();

    void hideList();

    void showMessage(String message);
}
