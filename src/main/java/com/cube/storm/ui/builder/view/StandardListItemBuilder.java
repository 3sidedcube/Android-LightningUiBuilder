package com.cube.storm.ui.builder.view;

import android.net.Uri;
import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.StandardListItem;
import com.cube.storm.ui.model.property.BundleImageProperty;
import com.cube.storm.ui.model.property.InternalLinkProperty;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class StandardListItemBuilder
{
	private StandardListItem item;

	public StandardListItemBuilder()
	{
		item = new StandardListItem();
	}

	public StandardListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.setTitle(new TextProperty(content));
		}

		return this;
	}

	public StandardListItemBuilder description(@Nullable String content)
	{
		if (content != null)
		{
			item.setDescription(new TextProperty(content));
		}

		return this;
	}

	public StandardListItemBuilder image(@Nullable Uri uri)
	{
		if (uri != null)
		{
			item.setImage(new BundleImageProperty(uri.toString()));
		}

		return this;
	}

	public StandardListItemBuilder link(@Nullable String destination)
	{
		if (destination != null)
		{
			item.setLink(new InternalLinkProperty().setDestination(destination));
		}

		return this;
	}

	public StandardListItem build()
	{
		return item;
	}

	public static StandardListItemBuilder create()
	{
		return new StandardListItemBuilder();
	}

	public static StandardListItemBuilder create(@Nullable String title)
	{
		return new StandardListItemBuilder().title(title);
	}

	public static StandardListItemBuilder create(@Nullable String title, @Nullable String description)
	{
		return new StandardListItemBuilder()
					.title(title)
					.description(description);
	}

	public static StandardListItemBuilder create(@Nullable String title, @Nullable Uri imageUri)
	{
		return new StandardListItemBuilder()
					.title(title)
					.image(imageUri);
	}

	public static StandardListItemBuilder create(@Nullable String title, @Nullable Uri imageUri, @Nullable String linkUri)
	{
		return new StandardListItemBuilder()
					.title(title)
					.image(imageUri)
					.link(linkUri);
	}

	public static StandardListItemBuilder create(@Nullable String title, @Nullable String description, @Nullable String linkUri)
	{
		return new StandardListItemBuilder()
					.title(title)
					.description(description)
					.link(linkUri);
	}

	public static StandardListItemBuilder create(@Nullable String title, @Nullable String description, @Nullable Uri imageUri)
	{
		return new StandardListItemBuilder()
					.title(title)
					.description(description)
					.image(imageUri);
	}

	public static StandardListItemBuilder create(@Nullable String title, @Nullable String description, @Nullable Uri imageUri, @Nullable String linkUri)
	{
		return new StandardListItemBuilder()
					.title(title)
					.description(description)
					.image(imageUri)
					.link(linkUri);
	}
}
