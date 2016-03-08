package cat.albert.hogwartswiki.presenters.interfaces;

import android.content.Context;

import cat.albert.hogwartswiki.views.interfaces.IMainPlaceView;

public interface IMainPlaceViewPresenter {

    public void onCreate(IMainPlaceView view, Context context);

    public void getPersonsFromService();

    public void showList();

    //public void onItemClicked(int position);

}
