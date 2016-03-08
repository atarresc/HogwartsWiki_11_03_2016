package cat.albert.hogwartswiki.presenters.interfaces;

import cat.albert.hogwartswiki.models.business.entities.Spell;
import cat.albert.hogwartswiki.views.interfaces.IDetailSpellView;

public interface IDetailSpellViewPresenter {

    public void onCreate(IDetailSpellView view, Spell spell);

}
