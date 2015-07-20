package com.cube.storm.ui.builder.view;

import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.ButtonListItem;
import com.cube.storm.ui.model.property.ButtonProperty;
import com.cube.storm.ui.model.property.InternalLinkProperty;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class ButtonListItemBuilder
{
	private ButtonListItem item;

	public ButtonListItemBuilder()
	{
		item = new ButtonListItem();
		item.setButton(new ButtonProperty());
	}

	public ButtonListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.getButton().setTitle(new TextProperty(content));
		}

		return this;
	}

	public ButtonListItemBuilder link(@Nullable String destination)
	{
		if (destination != null)
		{
			item.getButton().setLink(new InternalLinkProperty().setDestination(destination));
		}

		return this;
	}

	public ButtonListItem build()
	{
		return item;
	}

	public static ButtonListItemBuilder create()
	{
		return new ButtonListItemBuilder();
	}

	public static ButtonListItemBuilder create(@Nullable String title)
	{
		return new ButtonListItemBuilder().title(title);
	}

	public static ButtonListItemBuilder create(@Nullable String title, @Nullable String linkUri)
	{
		return new ButtonListItemBuilder()
					.title(title)
					.link(linkUri);
	}
}
