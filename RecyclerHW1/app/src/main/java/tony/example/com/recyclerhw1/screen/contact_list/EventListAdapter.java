package tony.example.com.recyclerhw1.screen.contact_list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import tony.example.com.recyclerhw1.R;
import tony.example.com.recyclerhw1.model.Event;

/**
 * Created by Tony on 06.10.2017.
 */

public class EventListAdapter extends RecyclerView.Adapter <EventViewHolder> {

    private List<Event> events;

    private OnItemClickListener onItemClickListener;

    public EventListAdapter(List<Event> events, OnItemClickListener onItemClickListener) {
        this.events = events;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event_list,parent,false);
        return new EventViewHolder(view,onItemClickListener);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        Event event =events.get(position);

        holder.photoImageView.setImageResource(event.getPhotoId());
        holder.titleTextView.setText(event.getTitle());
        holder.descriptionTextView.setText(event.getDescription());
        holder.dataTextView.setText(event.getDate());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
