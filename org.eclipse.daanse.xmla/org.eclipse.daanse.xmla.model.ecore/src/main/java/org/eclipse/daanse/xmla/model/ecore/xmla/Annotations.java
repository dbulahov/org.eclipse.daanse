/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Annotations</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotations#getAnnotation
 * <em>Annotation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAnnotations()
 * @model extendedMetaData="name='Annotations_._type' kind='elementOnly'"
 * @generated
 */
public interface Annotations extends EObject {
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference
   * list. The list contents are of type
   * {@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotation}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAnnotations_Annotation()
   * @model containment="true" extendedMetaData="kind='element' name='Annotation'"
   * @generated
   */
  EList<Annotation> getAnnotation();

} // Annotations
