package cat.albert.hogwartswiki.presenters.interfaces;

import android.content.Context;

import cat.albert.hogwartswiki.views.interfaces.IMainObjectView;

public interface IMainObjectViewPresenter {

    public void onCreate(IMainObjectView view, Context context);

    public void getPersonsFromService();

    public void showList();

    //public void onItemClicked(int position);

}
