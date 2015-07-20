package com.cube.storm.ui.builder.view;

import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.UnorderedListItem;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class UnorderedListItemBuilder
{
	private UnorderedListItem item;

	public UnorderedListItemBuilder()
	{
		item = new UnorderedListItem();
	}

	public UnorderedListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.setTitle(new TextProperty(content));
		}

		return this;
	}

	public UnorderedListItemBuilder description(@Nullable String content)
	{
		if (content != null)
		{
			item.setDescription(new TextProperty(content));
		}

		return this;
	}

	public UnorderedListItem build()
	{
		return item;
	}

	public static UnorderedListItemBuilder create()
	{
		return new UnorderedListItemBuilder();
	}

	public static UnorderedListItemBuilder create(@Nullable String title)
	{
		return new UnorderedListItemBuilder().title(title);
	}

	public static UnorderedListItemBuilder create(@Nullable String title, @Nullable String description)
	{
		return new UnorderedListItemBuilder()
					.title(title)
					.description(description);
	}
}
