/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine200_200.util;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.*;

import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package
 * @generated
 */
public class Engine200_200AdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected static Engine200_200Package modelPackage;

  /**
   * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public Engine200_200AdapterFactory() {
    if (modelPackage == null) {
      modelPackage = Engine200_200Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object. <!--
   * begin-user-doc --> This implementation returns <code>true</code> if the
   * object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * 
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject) object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected Engine200_200Switch<Adapter> modelSwitch = new Engine200_200Switch<Adapter>() {
    @Override
    public Adapter caseExpressionBinding(ExpressionBinding object) {
      return createExpressionBindingAdapter();
    }

    @Override
    public Adapter caseRowNumberBinding(RowNumberBinding object) {
      return createRowNumberBindingAdapter();
    }

    @Override
    public Adapter caseDocumentRoot(DocumentRoot object) {
      return createDocumentRootAdapter();
    }

    @Override
    public Adapter caseBinding(Binding object) {
      return createBindingAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object) {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject) target);
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding
   * <em>Expression Binding</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ExpressionBinding
   * @generated
   */
  public Adapter createExpressionBindingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.RowNumberBinding
   * <em>Row Number Binding</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.RowNumberBinding
   * @generated
   */
  public Adapter createRowNumberBindingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot
   * <em>Document Root</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will
   * catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.xmla.Binding
   * @generated
   */
  public Adapter createBindingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case. <!-- begin-user-doc --> This
   * default implementation returns null. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} // Engine200_200AdapterFactory
