package com.cube.storm.ui.builder.view;

import android.net.Uri;
import android.support.annotation.Nullable;

import com.cube.storm.ui.model.list.ImageListItem;
import com.cube.storm.ui.model.property.BundleImageProperty;
import com.cube.storm.ui.model.property.ImageDescriptorProperty;
import com.cube.storm.ui.model.property.TextProperty;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public class ImageListItemBuilder
{
	private ImageListItem item;

	public ImageListItemBuilder()
	{
		item = new ImageListItem();
	}

	public ImageListItemBuilder title(@Nullable String content)
	{
		if (content != null)
		{
			item.setTitle(new TextProperty(content));
		}

		return this;
	}

	public ImageListItemBuilder image(@Nullable Uri uri)
	{
		if (uri != null)
		{
			item.setImage(new BundleImageProperty(new ImageDescriptorProperty(uri.toString(), uri.toString(), uri.toString(), uri.toString())));
		}

		return this;
	}

	public ImageListItem build()
	{
		return item;
	}

	public static ImageListItemBuilder create()
	{
		return new ImageListItemBuilder();
	}

	public static ImageListItemBuilder create(@Nullable Uri imageUri)
	{
		return new ImageListItemBuilder().image(imageUri);
	}

	public static ImageListItemBuilder create(@Nullable Uri imageUri, @Nullable String title)
	{
		return new ImageListItemBuilder()
					.image(imageUri)
					.title(title);
	}
}
