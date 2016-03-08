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
import cat.albert.hogwartswiki.models.business.entities.Character;

/**
 * Created by albert on 16/02/2016.
 */
public class CharacterListAdapter extends ArrayAdapter<Character>{
    private Context context;
    private LayoutInflater inflater;

    public CharacterListAdapter(Context context, List<Character> comments) {
        super(context, 0, comments);

        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CharacterHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_list, parent, false);

            holder = new CharacterHolder();
            addViewsToHolder(convertView, holder);
            convertView.setTag(holder);
        } else {
            holder = (CharacterHolder) convertView.getTag();
        }
        Character character = getItem(position);
        setDataIntoHolder(holder, character);

        return convertView;
    }

    private void addViewsToHolder(View convertView, CharacterHolder holder) {
        holder.firstName = (TextView) convertView.findViewById(R.id.main_txtview_firstname);
        holder.lastName = (TextView) convertView.findViewById(R.id.main_txtview_lastname);
        holder.family = (TextView) convertView.findViewById(R.id.main_txtview_family);
        holder.imageView = (ImageView) convertView.findViewById(R.id.imageView_1);
    }

    private void setDataIntoHolder(CharacterHolder holder, Character character) {
        holder.firstName.setText(String.format("Nom: %s", character.getFirstName()));
        holder.lastName.setText(String.format("Cognom: %s", character.getLastName()));
        holder.family.setText(String.format("Família: %s", character.getFamily()));
        holder.imageView.setImageResource(character.getImatge());
    }

    class CharacterHolder {
        TextView firstName;
        TextView lastName;
        TextView family;
        ImageView imageView;
    }
}
