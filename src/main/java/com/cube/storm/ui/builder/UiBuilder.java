package com.cube.storm.ui.builder;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.cube.storm.UiSettings;
import com.cube.storm.ui.controller.adapter.StormListAdapter;
import com.cube.storm.ui.model.Model;
import com.cube.storm.ui.view.holder.ViewHolder;
import com.cube.storm.ui.view.holder.ViewHolderController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project Storm
 */
public class UiBuilder implements Builder
{
	protected ArrayList<Model> models = new ArrayList<>();

	@Override public ListBuilder list()
	{
		return list(null, null);
	}

	@Override public ListBuilder list(@Nullable String header)
	{
		return list(header, null);
	}

	@Override public ListBuilder list(@Nullable String header, @Nullable  String footer)
	{
		this.models.add(new com.cube.storm.ui.model.list.List(header, footer));
		return new ListBuilder(this);
	}

	@Override public List<Model> getModels()
	{
		return models;
	}

	/**
	 * Builds the views from the called methods and adds them to {@param parent}
	 *
	 * @param parent The parent view to attach the views to
	 *
	 * @return the {@param parent} object with the views attached
	 */
	@Override public ViewGroup build(ViewGroup parent)
	{
		StormListAdapter adapter = new StormListAdapter(parent.getContext());

		for (Model model : models)
		{
			adapter.addItem(model);
		}

		Random rand = new Random();
		for (int i = 0; i < adapter.getItemCount(); i++)
		{
			Model model = adapter.getItem(i);
			Class<? extends ViewHolderController> holderClass = UiSettings.getInstance().getViewFactory().getHolderForView(model.getClassName());

			if (holderClass != null)
			{
				try
				{
					ViewHolderController controller = holderClass.newInstance();
					ViewHolder holder = (ViewHolder)controller.createViewHolder(parent);
					holder.populateView(model);

					holder.itemView.setBackgroundColor(Color.argb(255, rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));

					parent.addView(holder.itemView);
				}
				catch (InstantiationException | IllegalAccessException e)
				{
					e.printStackTrace();
				}
			}
		}

		return parent;
	}

	public List<Model> buildModels()
	{
		return getModels();
	}
}
