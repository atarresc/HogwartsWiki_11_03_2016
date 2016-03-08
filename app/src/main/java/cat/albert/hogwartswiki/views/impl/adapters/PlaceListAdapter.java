package cat.albert.hogwartswiki.views.impl.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Place;

public class PlaceListAdapter extends ArrayAdapter<Place>{
    private Context context;
    private LayoutInflater inflater;

    public PlaceListAdapter(Context context, List<Place> comments) {
        super(context, 0, comments);

        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PlaceHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.place_list, parent, false);

            holder = new PlaceHolder();
            addViewsToHolder(convertView, holder);
            convertView.setTag(holder);
        } else {
            holder = (PlaceHolder) convertView.getTag();
        }
        Place place = getItem(position);
        setDataIntoHolder(holder, place);

        return convertView;
    }

    private void addViewsToHolder(View convertView, PlaceHolder holder) {
        holder.placeName = (TextView) convertView.findViewById(R.id.main_txtview_placename);
        holder.placeSecurityLevel = (TextView) convertView.findViewById(R.id.main_txtview_placesecuritylevel);
        holder.imageView = (ImageView) convertView.findViewById(R.id.imageView_2);
    }

    private void setDataIntoHolder(PlaceHolder holder, Place place) {
        holder.placeName.setText(String.format("Nom: %s", place.getPlaceName()));
        holder.placeSecurityLevel.setText(String.format("Seguretat: %s", place.getPlaceSecurityLevel()));
        holder.imageView.setImageResource(place.getImatge());
    }

    class PlaceHolder {
        TextView placeName;
        TextView placeSecurityLevel;
        ImageView imageView;
    }
}