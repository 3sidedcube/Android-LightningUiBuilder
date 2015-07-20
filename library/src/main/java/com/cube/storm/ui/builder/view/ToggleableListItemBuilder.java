package com.cube.storm.ui.builder.view;

import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.ToggleableListItem;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class ToggleableListItemBuilder
{
	private ToggleableListItem item;

	public ToggleableListItemBuilder()
	{
		item = new ToggleableListItem();
	}

	public ToggleableListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.setTitle(new TextProperty(content));
		}

		return this;
	}

	public ToggleableListItemBuilder description(@Nullable String content)
	{
		if (content != null)
		{
			item.setDescription(new TextProperty(content));
		}

		return this;
	}

	public ToggleableListItem build()
	{
		return item;
	}

	public static ToggleableListItemBuilder create()
	{
		return new ToggleableListItemBuilder();
	}

	public static ToggleableListItemBuilder create(@Nullable String title, @Nullable String description)
	{
		return new ToggleableListItemBuilder()
					.title(title)
					.description(description);
	}
}
