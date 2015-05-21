package com.cube.storm.ui.builder;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.cube.storm.UiSettings;
import com.cube.storm.ui.controller.adapter.StormListAdapter;
import com.cube.storm.ui.model.Model;
import com.cube.storm.ui.view.holder.ViewHolder;
import com.cube.storm.ui.view.holder.ViewHolderFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Entry class for the module.
 * <br /><br />
 * This is the class you will be using to build all the views you wish. The class implements a {@link Builder} interface
 * which defines a standard list of methods that can be used. Each method you call will return a specific
 * builder that is related to the type of view that you are creating, for instance, calling {@link #list()}
 * will return an instance of {@link ListBuilder} which will, in turn, have a set of standard methods
 * that are related to the {@link com.cube.storm.ui.model.list.List} model. Because {@link ListBuilder}
 * also implements {@link Builder}, the same methods as in this class are available which will break
 * out of the current context of the {@link ListBuilder} and back into the parent context of the {@link UiBuilder}.
 * <br /><br />
 * This allows you to chain your methods in a nice human-readable way that represents loosely the way
 * it will be rendered on screen.
 * <br /><br />
 * Example: <br />
 * <pre>
	new UiBuilder()
		.list("Details")
			.textListItem("Title Text 1")
			.textListItem("Title Text 2")
			.textListItem("Title Text 3")
		.list("More details")
			.textListItem("Title Text 4")
			.textListItem("Title Text 5")
			.textListItem("Title Text 6")
		.build((ViewGroup)findViewById(R.id.content));
 * </pre>
 *
 * This will create a view that will look like <br />
 * <pre>
+-------------+
|Details      |
+-------------+
|  Item 1     |
|  Item 2     |
|  Item 3     |
|             |
+-------------+
|More details |
+-------------+
|  Item 4     |
|  Item 5     |
|  Item 6     |
|             |
+-------------+
 * </pre>
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
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

	@Override public ListBuilder list(@Nullable String header, @Nullable String footer)
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
	@Override public ViewGroup build(@NonNull ViewGroup parent)
	{
		StormListAdapter adapter = new StormListAdapter();

		for (Model model : models)
		{
			adapter.addItem(model);
		}

		Random rand = new Random();
		for (int index = 0, count = adapter.getItemCount(); index < count; index++)
		{
			Model model = adapter.getItem(index);
			Class<? extends ViewHolderFactory> holderClass = UiSettings.getInstance().getViewFactory().getHolderForView(model.getClassName());

			if (holderClass != null)
			{
				try
				{
					ViewHolderFactory controller = holderClass.newInstance();
					ViewHolder holder = (ViewHolder)controller.createViewHolder(parent);
					holder.populateView(model);

					parent.addView(holder.itemView);
				}
				catch (Exception e)
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
