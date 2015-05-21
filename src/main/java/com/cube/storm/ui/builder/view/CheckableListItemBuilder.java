package com.cube.storm.ui.builder.view;

import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.CheckableListItem;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class CheckableListItemBuilder
{
	private CheckableListItem item;

	public CheckableListItemBuilder()
	{
		item = new CheckableListItem();
	}

	public CheckableListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.setTitle(new TextProperty(content));
		}

		return this;
	}

	public CheckableListItemBuilder description(@Nullable String content)
	{
		if (content != null)
		{
			item.setDescription(new TextProperty(content));
		}

		return this;
	}

	public CheckableListItemBuilder isVolatile(boolean isVolatile, @Nullable String id)
	{
		item.setVolatile(isVolatile);
		item.setId(id);

		return this;
	}

	public CheckableListItem build()
	{
		return item;
	}

	public static CheckableListItemBuilder create()
	{
		return new CheckableListItemBuilder();
	}

	public static CheckableListItemBuilder create(@Nullable String title)
	{
		return new CheckableListItemBuilder().title(title);
	}

	public static CheckableListItemBuilder create(@Nullable String title, boolean isVolatile, @Nullable String id)
	{
		return new CheckableListItemBuilder()
					.title(title)
					.isVolatile(isVolatile, id);
	}

	public static CheckableListItemBuilder create(@Nullable String title, @Nullable String description)
	{
		return new CheckableListItemBuilder()
					.title(title)
					.description(description);
	}

	public static CheckableListItemBuilder create(@Nullable String title, @Nullable String description, boolean isVolatile, @Nullable String id)
	{
		return new CheckableListItemBuilder()
					.title(title)
					.description(description)
					.isVolatile(isVolatile, id);
	}
}
