package cat.albert.hogwartswiki.presenters.impl;

import cat.albert.hogwartswiki.models.business.entities.Spell;
import cat.albert.hogwartswiki.presenters.interfaces.IDetailSpellViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IDetailSpellView;

public class DetailSpellViewPresenterImpl implements IDetailSpellViewPresenter {

    private IDetailSpellView view;
    private Spell spell;

    @Override
    public void onCreate(IDetailSpellView detailView, Spell spell) {
        view = detailView;
        this.spell = spell;

        view.setSpellName(spell.getSpellName());
        view.setSpellImpact(spell.getSpellImpact());
    }
}
