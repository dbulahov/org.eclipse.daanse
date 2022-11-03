/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine100;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.daanse.xmla.model.ecore.engine100.Engine100Package
 * @generated
 */
public interface Engine100Factory extends EFactory {
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  Engine100Factory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document Root</em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the package supported by this factory.
   * @generated
   */
  Engine100Package getEngine100Package();

} // Engine100Factory
