package cat.albert.hogwartswiki.presenters.interfaces;

import android.content.Context;

import cat.albert.hogwartswiki.views.interfaces.IMainView;

public interface IMainViewPresenter {

    public void onCreate(IMainView view, Context context);

    public void getPersonsFromService();

    public void showList();

    //public void onItemClicked(int position);

}
