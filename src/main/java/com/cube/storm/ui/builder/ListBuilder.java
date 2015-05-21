package com.cube.storm.ui.builder;

import android.support.annotation.NonNull;

import com.cube.storm.ui.builder.view.ButtonListItemBuilder;
import com.cube.storm.ui.builder.view.CheckableListItemBuilder;
import com.cube.storm.ui.builder.view.ImageListItemBuilder;
import com.cube.storm.ui.builder.view.OrderedListItemBuilder;
import com.cube.storm.ui.builder.view.StandardListItemBuilder;
import com.cube.storm.ui.builder.view.TextListItemBuilder;
import com.cube.storm.ui.builder.view.ToggleableListItemBuilder;
import com.cube.storm.ui.builder.view.UnorderedListItemBuilder;
import com.cube.storm.ui.model.list.ButtonListItem;
import com.cube.storm.ui.model.list.CheckableListItem;
import com.cube.storm.ui.model.list.ImageListItem;
import com.cube.storm.ui.model.list.ListItem;
import com.cube.storm.ui.model.list.OrderedListItem;
import com.cube.storm.ui.model.list.StandardListItem;
import com.cube.storm.ui.model.list.TextListItem;
import com.cube.storm.ui.model.list.ToggleableListItem;
import com.cube.storm.ui.model.list.UnorderedListItem;

public class ListBuilder extends BuildDelegate
{
	public ListBuilder(Builder parent)
	{
		super(parent);
	}

	public ListBuilder standardListItem(StandardListItemBuilder listItemBuilder)
	{
		return standardListItem(listItemBuilder.build());
	}

	public ListBuilder standardListItem(StandardListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder imageListItem(ImageListItemBuilder listItemBuilder)
	{
		return imageListItem(listItemBuilder.build());
	}

	public ListBuilder imageListItem(ImageListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder buttonListItem(ButtonListItemBuilder listItemBuilder)
	{
		return buttonListItem(listItemBuilder.build());
	}

	public ListBuilder buttonListItem(ButtonListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder checkableListItem(CheckableListItemBuilder listItemBuilder)
	{
		return checkableListItem(listItemBuilder.build());
	}

	public ListBuilder checkableListItem(CheckableListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder orderedListItem(OrderedListItemBuilder listItemBuilder)
	{
		return orderedListItem(listItemBuilder.build());
	}

	public ListBuilder orderedListItem(OrderedListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder unorderedListItem(UnorderedListItemBuilder listItemBuilder)
	{
		return unorderedListItem(listItemBuilder.build());
	}

	public ListBuilder unorderedListItem(UnorderedListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder toggleableListItem(ToggleableListItemBuilder listItemBuilder)
	{
		return toggleableListItem(listItemBuilder.build());
	}

	public ListBuilder toggleableListItem(ToggleableListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	public ListBuilder textListItem(TextListItemBuilder listItemBuilder)
	{
		return textListItem(listItemBuilder.build());
	}

	public ListBuilder textListItem(TextListItem listItem)
	{
		addItem(listItem);
		return this;
	}

	/**
	 * Adds a list item to the last {@link com.cube.storm.ui.model.list.List} object in the collection
	 * of list items.
	 *
	 * @param item The list item to add
	 */
	private void addItem(@NonNull ListItem item)
	{
		((com.cube.storm.ui.model.list.List)this.parent.getModels().get(this.parent.getModels().size() - 1)).getChildren().add(item);
	}
}
