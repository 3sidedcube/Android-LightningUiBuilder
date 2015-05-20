package com.cube.storm.ui.builder;

import android.support.annotation.NonNull;

import com.cube.storm.ui.builder.view.StandardListItemBuilder;
import com.cube.storm.ui.builder.view.TextListItemBuilder;
import com.cube.storm.ui.model.list.ListItem;
import com.cube.storm.ui.model.list.StandardListItem;
import com.cube.storm.ui.model.list.TextListItem;

public class ListBuilder extends BuildDelegate
{
	public ListBuilder(Builder parent)
	{
		super(parent);
	}

	public ListBuilder standardListItem(StandardListItemBuilder standardListItemBuilder)
	{
		return standardListItem(standardListItemBuilder.build());
	}

	public ListBuilder standardListItem(StandardListItem standardListItem)
	{
		addItem(standardListItem);
		return this;
	}

	public ListBuilder textListItem(TextListItemBuilder textListItemBuilder)
	{
		return textListItem(textListItemBuilder.build());
	}

	public ListBuilder textListItem(TextListItem textListItem)
	{
		addItem(textListItem);
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
