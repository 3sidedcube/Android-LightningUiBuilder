package com.cube.storm.ui.builder;

import android.view.ViewGroup;

import com.cube.storm.ui.model.Model;

import java.util.List;

/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project Storm
 */
public abstract class BuildDelegate implements Builder
{
	protected Builder parent;

	protected BuildDelegate(Builder parent)
	{
		this.parent = parent;
	}

	@Override public ListBuilder list()
	{
		return parent.list();
	}

	@Override public ListBuilder list(String header)
	{
		return parent.list(header);
	}

	@Override public ListBuilder list(String header, String footer)
	{
		return parent.list(header, footer);
	}

	@Override public List<Model> getModels()
	{
		return this.parent.getModels();
	}

	@Override public ViewGroup build(ViewGroup parent)
	{
		return this.parent.build(parent);
	}

	@Override public List<Model> buildModels()
	{
		return this.parent.buildModels();
	}
}
