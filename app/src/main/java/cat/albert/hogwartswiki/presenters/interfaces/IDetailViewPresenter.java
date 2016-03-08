package cat.albert.hogwartswiki.presenters.interfaces;

import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.views.interfaces.IDetailView;

public interface IDetailViewPresenter {

	public void onCreate(IDetailView view, Character character);

}
