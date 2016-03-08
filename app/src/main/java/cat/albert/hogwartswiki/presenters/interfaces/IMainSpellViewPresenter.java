package cat.albert.hogwartswiki.presenters.interfaces;

import android.content.Context;

import cat.albert.hogwartswiki.views.interfaces.IMainSpellView;

public interface IMainSpellViewPresenter {

    public void onCreate(IMainSpellView view, Context context);

    public void getPersonsFromService();

    public void showList();

    //public void onItemClicked(int position);

}
