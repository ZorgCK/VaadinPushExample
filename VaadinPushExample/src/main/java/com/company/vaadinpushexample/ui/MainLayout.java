
package com.company.vaadinpushexample.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;


@Route("")
public class MainLayout extends VerticalLayout implements PageConfigurator
{
	public MainLayout()
	{
		super();
		this.initUI();
	}
	
	@Override
	public void configurePage(final InitialPageSettings settings)
	{
		settings.addLink("shortcut icon", "frontend/images/favicon.ico");
		settings.addFavIcon("icon", "frontend/images/favicon256.png", "256x256");
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.setSizeFull();
	} // </generated-code>
	
}
