package com.emerald.comic.beans.impl;

import javax.faces.bean.ManagedBean;

import com.emerald.comic.beans.model.MessageRegistryBean;

/**
 * 
 * @author C4X2
 * @version 1.0
 */
@ManagedBean
public class MessageRegistryBeanImpl implements MessageRegistryBean
{
	private final String trueName = "MessageResgistryBean";

	public String getTrueName()
	{
		return trueName;
	}
	
}
