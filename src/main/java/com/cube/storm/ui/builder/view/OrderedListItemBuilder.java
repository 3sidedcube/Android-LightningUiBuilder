package com.cube.storm.ui.builder.view;

import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.OrderedListItem;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class OrderedListItemBuilder
{
	private OrderedListItem item;

	public OrderedListItemBuilder()
	{
		item = new OrderedListItem();
	}

	public OrderedListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.setTitle(new TextProperty(content));
		}

		return this;
	}

	public OrderedListItemBuilder description(@Nullable String content)
	{
		if (content != null)
		{
			item.setDescription(new TextProperty(content));
		}

		return this;
	}

	public OrderedListItemBuilder annotation(@Nullable String content)
	{
		if (content != null)
		{
			item.setAnnotation(content);
		}

		return this;
	}

	public OrderedListItem build()
	{
		return item;
	}

	public static OrderedListItemBuilder create()
	{
		return new OrderedListItemBuilder();
	}

	public static OrderedListItemBuilder create(@Nullable String annotation, @Nullable String title)
	{
		return new OrderedListItemBuilder().title(title);
	}

	public static OrderedListItemBuilder create(@Nullable String annotation, @Nullable String title, @Nullable String description)
	{
		return new OrderedListItemBuilder()
					.title(title)
					.description(description)
					.annotation(annotation);
	}
}
