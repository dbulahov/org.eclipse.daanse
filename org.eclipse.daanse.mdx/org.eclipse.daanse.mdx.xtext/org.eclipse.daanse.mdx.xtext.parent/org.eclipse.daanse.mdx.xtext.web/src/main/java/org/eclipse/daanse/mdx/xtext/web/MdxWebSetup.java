/*
 * generated by Xtext 2.27.0
 */
package org.eclipse.daanse.mdx.xtext.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.daanse.mdx.xtext.MdxRuntimeModule;
import org.eclipse.daanse.mdx.xtext.MdxStandaloneSetup;
import org.eclipse.daanse.mdx.xtext.ide.MdxIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class MdxWebSetup extends MdxStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MdxRuntimeModule(), new MdxIdeModule(), new MdxWebModule()));
	}
	
}
