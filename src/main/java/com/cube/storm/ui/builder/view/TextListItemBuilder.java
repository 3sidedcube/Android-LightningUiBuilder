package com.cube.storm.ui.builder.view;

import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.TextListItem;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class TextListItemBuilder
{
	private TextListItem item;

	public TextListItemBuilder()
	{
		item = new TextListItem();
	}

	public TextListItemBuilder description(@Nullable String content)
	{
		if (content != null)
		{
			item.setDescription(new TextProperty(content));
		}

		return this;
	}

	public TextListItem build()
	{
		return item;
	}

	public static TextListItemBuilder create()
	{
		return new TextListItemBuilder();
	}

	public static TextListItemBuilder create(@Nullable String content)
	{
		return new TextListItemBuilder().description(content);
	}
}
