/*
 * generated by Xtext 2.27.0
 */
package org.eclipse.daanse.mdx.xtext.tests;

import java.util.List;

import org.eclipse.daanse.mdx.xtext.mdx.MdxStatement;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(MdxInjectorProvider.class)
public class MdxParsingTest {
  @Inject
  private ParseHelper<MdxStatement> parseHelper;

  @Test
//	@Disabled
  public void loadMdxStatement() throws Exception {
    String s = "SELECT [Customer].[Gender].[Gender].Membmers ON COLUMNS,\n"
        + "							         {[Customer].[Customer].[Aaron A. Allen],\n"
        + "							          [Customer].[Customer].[Abigail Clark]} ON ROWS\n"
        + "							   FROM [Adventure Works]\n"
        + "							   WHERE [Measures].[Internet Sales Amount]";

    s = "SELECT [a].[b].[&aa] on ROWS FROM [a].[c]  WHERE [a]";
    MdxStatement result = parseHelper.parse(s);

    System.out.println(result);
    Assertions.assertNotNull(result);
    List<Diagnostic> errors = result.eResource().getErrors();
    Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: " + IterableExtensions.join(errors, ", "));
  }
}
