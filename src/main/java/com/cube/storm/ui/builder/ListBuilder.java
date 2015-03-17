package com.cube.storm.ui.builder;

import com.cube.storm.ui.model.list.TextListItem;

public class ListBuilder extends BuildDelegate
{
	public ListBuilder(Builder parent)
	{
		super(parent);
	}

	public ListBuilder textListItem(String title)
	{
		((com.cube.storm.ui.model.list.List)this.parent.getModels().get(this.parent.getModels().size() - 1)).getChildren().add(new TextListItem(title));
		return this;
	}
}
