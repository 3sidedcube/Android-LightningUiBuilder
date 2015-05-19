package com.cube.storm.ui.builder;

import lombok.experimental.Delegate;


/**
 * // TODO: Add class description
 *
 * @author Callum Taylor
 * @project Storm
 */
public abstract class BuildDelegate implements Builder
{
	@Delegate(types=Builder.class)
	protected Builder parent;

	protected BuildDelegate(Builder parent)
	{
		this.parent = parent;
	}
}
