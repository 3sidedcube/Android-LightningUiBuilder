package com.cube.storm.ui.builder;

import android.view.ViewGroup;

import com.cube.storm.ui.model.Model;

import java.util.List;

/**
 * Builder interface for defining top level group methods.
 *
 * @author Callum Taylor
 * @project LightningUiBuilder
 */
public interface Builder
{
	public ListBuilder list();
	public ListBuilder list(String header);
	public ListBuilder list(String header, String footer);

	public ViewGroup build(ViewGroup parent);

	public List<Model> getModels();
	public List<Model> buildModels();
}
