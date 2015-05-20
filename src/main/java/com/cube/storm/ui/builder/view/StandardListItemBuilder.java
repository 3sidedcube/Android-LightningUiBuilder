package com.cube.storm.ui.builder.view;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.cube.storm.ui.model.list.StandardListItem;
import com.cube.storm.ui.model.property.BundleImageProperty;
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

	public StandardListItemBuilder title(@NonNull String content)
	{
		item.setTitle(new TextProperty(content));
		return this;
	}

	public StandardListItemBuilder description(@NonNull String content)
	{
		item.setDescription(new TextProperty(content));
		return this;
	}

	public StandardListItemBuilder image(@NonNull Uri uri)
	{
		item.setImage(new BundleImageProperty(uri.toString()));
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

	public static StandardListItemBuilder create(@NonNull String title)
	{
		return new StandardListItemBuilder().title(title);
	}

	public static StandardListItemBuilder create(@NonNull String title, @NonNull String description)
	{
		return new StandardListItemBuilder()
					.title(title)
					.description(description);
	}

	public static StandardListItemBuilder create(@NonNull String title, @NonNull String description, @NonNull Uri imageUri)
	{
		return new StandardListItemBuilder()
					.title(title)
					.description(description)
					.image(imageUri);
	}
}
