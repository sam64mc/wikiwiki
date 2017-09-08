package wildmonsters.monsterwiki;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listeMonstreAdapter extends ArrayAdapter<listeMonstre> {

    public listeMonstreAdapter(Context context, ArrayList<listeMonstre> liste){
        super(context, 0, liste);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        listeMonstre listeM = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listemonstre_item,parent, false);
        }

        TextView nomMonstre = (TextView)convertView.findViewById(R.id.nomMonstre);
        TextView nomElement = (TextView)convertView.findViewById(R.id.nomElement);

        ImageView imageMonstre = (ImageView)convertView.findViewById(R.id.imageMonstre);

        nomMonstre.setText(listeM.nomMonstre);
        nomElement.setText(listeM.nomElement);
        imageMonstre.setImageResource(listeM.imageMonstre);

        return convertView;
    }
}
