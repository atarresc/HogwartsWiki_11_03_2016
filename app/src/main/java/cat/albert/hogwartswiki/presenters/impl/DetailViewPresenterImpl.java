package cat.albert.hogwartswiki.presenters.impl;

import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.presenters.interfaces.IDetailViewPresenter;
import cat.albert.hogwartswiki.views.interfaces.IDetailView;

public class DetailViewPresenterImpl implements IDetailViewPresenter {

	private IDetailView view;
	private Character character;

	@Override
	public void onCreate(IDetailView detailView, Character character) {
		view = detailView;
		this.character = character;

		view.setFirstName(character.getFirstName());
		view.setLastName(character.getLastName());
		view.setFamily(character.getFamily());
	}
}
