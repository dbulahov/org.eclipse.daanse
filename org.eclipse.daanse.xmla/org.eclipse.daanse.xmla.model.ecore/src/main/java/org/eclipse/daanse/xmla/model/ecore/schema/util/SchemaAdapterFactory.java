/**
 */
package org.eclipse.daanse.xmla.model.ecore.schema.util;

import org.eclipse.daanse.xmla.model.ecore.schema.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage
 * @generated
 */
public class SchemaAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected static SchemaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public SchemaAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = SchemaPackage.eINSTANCE;
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
  protected SchemaSwitch<Adapter> modelSwitch = new SchemaSwitch<Adapter>() {
    @Override
    public Adapter caseAll(All object) {
      return createAllAdapter();
    }

    @Override
    public Adapter caseAnnotated(Annotated object) {
      return createAnnotatedAdapter();
    }

    @Override
    public Adapter caseAnnotationType(AnnotationType object) {
      return createAnnotationTypeAdapter();
    }

    @Override
    public Adapter caseAnyType(AnyType object) {
      return createAnyTypeAdapter();
    }

    @Override
    public Adapter caseAppinfoType(AppinfoType object) {
      return createAppinfoTypeAdapter();
    }

    @Override
    public Adapter caseAttribute(Attribute object) {
      return createAttributeAdapter();
    }

    @Override
    public Adapter caseAttributeGroup(AttributeGroup object) {
      return createAttributeGroupAdapter();
    }

    @Override
    public Adapter caseAttributeGroupRef(AttributeGroupRef object) {
      return createAttributeGroupRefAdapter();
    }

    @Override
    public Adapter caseComplexContentType(ComplexContentType object) {
      return createComplexContentTypeAdapter();
    }

    @Override
    public Adapter caseComplexRestrictionType(ComplexRestrictionType object) {
      return createComplexRestrictionTypeAdapter();
    }

    @Override
    public Adapter caseComplexType(ComplexType object) {
      return createComplexTypeAdapter();
    }

    @Override
    public Adapter caseDocumentationType(DocumentationType object) {
      return createDocumentationTypeAdapter();
    }

    @Override
    public Adapter caseDocumentRoot(DocumentRoot object) {
      return createDocumentRootAdapter();
    }

    @Override
    public Adapter caseElement(Element object) {
      return createElementAdapter();
    }

    @Override
    public Adapter caseExplicitGroup(ExplicitGroup object) {
      return createExplicitGroupAdapter();
    }

    @Override
    public Adapter caseExtensionType(ExtensionType object) {
      return createExtensionTypeAdapter();
    }

    @Override
    public Adapter caseFacet(Facet object) {
      return createFacetAdapter();
    }

    @Override
    public Adapter caseFieldType(FieldType object) {
      return createFieldTypeAdapter();
    }

    @Override
    public Adapter caseGroup(Group object) {
      return createGroupAdapter();
    }

    @Override
    public Adapter caseGroupRef(GroupRef object) {
      return createGroupRefAdapter();
    }

    @Override
    public Adapter caseImportType(ImportType object) {
      return createImportTypeAdapter();
    }

    @Override
    public Adapter caseIncludeType(IncludeType object) {
      return createIncludeTypeAdapter();
    }

    @Override
    public Adapter caseKeybase(Keybase object) {
      return createKeybaseAdapter();
    }

    @Override
    public Adapter caseKeyrefType(KeyrefType object) {
      return createKeyrefTypeAdapter();
    }

    @Override
    public Adapter caseListType(ListType object) {
      return createListTypeAdapter();
    }

    @Override
    public Adapter caseLocalComplexType(LocalComplexType object) {
      return createLocalComplexTypeAdapter();
    }

    @Override
    public Adapter caseLocalElement(LocalElement object) {
      return createLocalElementAdapter();
    }

    @Override
    public Adapter caseLocalSimpleType(LocalSimpleType object) {
      return createLocalSimpleTypeAdapter();
    }

    @Override
    public Adapter caseNamedAttributeGroup(NamedAttributeGroup object) {
      return createNamedAttributeGroupAdapter();
    }

    @Override
    public Adapter caseNamedGroup(NamedGroup object) {
      return createNamedGroupAdapter();
    }

    @Override
    public Adapter caseNarrowMaxMin(NarrowMaxMin object) {
      return createNarrowMaxMinAdapter();
    }

    @Override
    public Adapter caseNoFixedFacet(NoFixedFacet object) {
      return createNoFixedFacetAdapter();
    }

    @Override
    public Adapter caseNotationType(NotationType object) {
      return createNotationTypeAdapter();
    }

    @Override
    public Adapter caseNumFacet(NumFacet object) {
      return createNumFacetAdapter();
    }

    @Override
    public Adapter caseOpenAttrs(OpenAttrs object) {
      return createOpenAttrsAdapter();
    }

    @Override
    public Adapter casePatternType(PatternType object) {
      return createPatternTypeAdapter();
    }

    @Override
    public Adapter caseRealGroup(RealGroup object) {
      return createRealGroupAdapter();
    }

    @Override
    public Adapter caseRedefineType(RedefineType object) {
      return createRedefineTypeAdapter();
    }

    @Override
    public Adapter caseRestrictionType(RestrictionType object) {
      return createRestrictionTypeAdapter();
    }

    @Override
    public Adapter caseRestrictionType1(RestrictionType1 object) {
      return createRestrictionType1Adapter();
    }

    @Override
    public Adapter caseSchemaType(SchemaType object) {
      return createSchemaTypeAdapter();
    }

    @Override
    public Adapter caseSelectorType(SelectorType object) {
      return createSelectorTypeAdapter();
    }

    @Override
    public Adapter caseSimpleContentType(SimpleContentType object) {
      return createSimpleContentTypeAdapter();
    }

    @Override
    public Adapter caseSimpleExplicitGroup(SimpleExplicitGroup object) {
      return createSimpleExplicitGroupAdapter();
    }

    @Override
    public Adapter caseSimpleExtensionType(SimpleExtensionType object) {
      return createSimpleExtensionTypeAdapter();
    }

    @Override
    public Adapter caseSimpleRestrictionType(SimpleRestrictionType object) {
      return createSimpleRestrictionTypeAdapter();
    }

    @Override
    public Adapter caseSimpleType(SimpleType object) {
      return createSimpleTypeAdapter();
    }

    @Override
    public Adapter caseTopLevelAttribute(TopLevelAttribute object) {
      return createTopLevelAttributeAdapter();
    }

    @Override
    public Adapter caseTopLevelComplexType(TopLevelComplexType object) {
      return createTopLevelComplexTypeAdapter();
    }

    @Override
    public Adapter caseTopLevelElement(TopLevelElement object) {
      return createTopLevelElementAdapter();
    }

    @Override
    public Adapter caseTopLevelSimpleType(TopLevelSimpleType object) {
      return createTopLevelSimpleTypeAdapter();
    }

    @Override
    public Adapter caseTotalDigitsType(TotalDigitsType object) {
      return createTotalDigitsTypeAdapter();
    }

    @Override
    public Adapter caseUnionType(UnionType object) {
      return createUnionTypeAdapter();
    }

    @Override
    public Adapter caseWhiteSpaceType(WhiteSpaceType object) {
      return createWhiteSpaceTypeAdapter();
    }

    @Override
    public Adapter caseWildcard(Wildcard object) {
      return createWildcardAdapter();
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
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.All <em>All</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch
   * all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.All
   * @generated
   */
  public Adapter createAllAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Annotated
   * <em>Annotated</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Annotated
   * @generated
   */
  public Adapter createAnnotatedAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.AnnotationType
   * <em>Annotation Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.AnnotationType
   * @generated
   */
  public Adapter createAnnotationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.AnyType <em>Any
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.AnyType
   * @generated
   */
  public Adapter createAnyTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.AppinfoType <em>Appinfo
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.AppinfoType
   * @generated
   */
  public Adapter createAppinfoTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Attribute
   * <em>Attribute</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.AttributeGroup
   * <em>Attribute Group</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.AttributeGroup
   * @generated
   */
  public Adapter createAttributeGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.AttributeGroupRef
   * <em>Attribute Group Ref</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.AttributeGroupRef
   * @generated
   */
  public Adapter createAttributeGroupRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ComplexContentType
   * <em>Complex Content Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ComplexContentType
   * @generated
   */
  public Adapter createComplexContentTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ComplexRestrictionType
   * <em>Complex Restriction Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ComplexRestrictionType
   * @generated
   */
  public Adapter createComplexRestrictionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ComplexType <em>Complex
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ComplexType
   * @generated
   */
  public Adapter createComplexTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.DocumentationType
   * <em>Documentation Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.DocumentationType
   * @generated
   */
  public Adapter createDocumentationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.DocumentRoot <em>Document
   * Root</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Element
   * <em>Element</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Element
   * @generated
   */
  public Adapter createElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ExplicitGroup <em>Explicit
   * Group</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ExplicitGroup
   * @generated
   */
  public Adapter createExplicitGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ExtensionType
   * <em>Extension Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ExtensionType
   * @generated
   */
  public Adapter createExtensionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will
   * catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Facet
   * @generated
   */
  public Adapter createFacetAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.FieldType <em>Field
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.FieldType
   * @generated
   */
  public Adapter createFieldTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Group <em>Group</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will
   * catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Group
   * @generated
   */
  public Adapter createGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.GroupRef <em>Group
   * Ref</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.GroupRef
   * @generated
   */
  public Adapter createGroupRefAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ImportType <em>Import
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ImportType
   * @generated
   */
  public Adapter createImportTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.IncludeType <em>Include
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.IncludeType
   * @generated
   */
  public Adapter createIncludeTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Keybase
   * <em>Keybase</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Keybase
   * @generated
   */
  public Adapter createKeybaseAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.KeyrefType <em>Keyref
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.KeyrefType
   * @generated
   */
  public Adapter createKeyrefTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.ListType <em>List
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.ListType
   * @generated
   */
  public Adapter createListTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.LocalComplexType <em>Local
   * Complex Type</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.LocalComplexType
   * @generated
   */
  public Adapter createLocalComplexTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.LocalElement <em>Local
   * Element</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.LocalElement
   * @generated
   */
  public Adapter createLocalElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.LocalSimpleType <em>Local
   * Simple Type</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.LocalSimpleType
   * @generated
   */
  public Adapter createLocalSimpleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.NamedAttributeGroup
   * <em>Named Attribute Group</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.NamedAttributeGroup
   * @generated
   */
  public Adapter createNamedAttributeGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.NamedGroup <em>Named
   * Group</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.NamedGroup
   * @generated
   */
  public Adapter createNamedGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.NarrowMaxMin <em>Narrow
   * Max Min</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.NarrowMaxMin
   * @generated
   */
  public Adapter createNarrowMaxMinAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.NoFixedFacet <em>No Fixed
   * Facet</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.NoFixedFacet
   * @generated
   */
  public Adapter createNoFixedFacetAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.NotationType <em>Notation
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.NotationType
   * @generated
   */
  public Adapter createNotationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.NumFacet <em>Num
   * Facet</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.NumFacet
   * @generated
   */
  public Adapter createNumFacetAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.OpenAttrs <em>Open
   * Attrs</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.OpenAttrs
   * @generated
   */
  public Adapter createOpenAttrsAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.PatternType <em>Pattern
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.PatternType
   * @generated
   */
  public Adapter createPatternTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.RealGroup <em>Real
   * Group</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.RealGroup
   * @generated
   */
  public Adapter createRealGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.RedefineType <em>Redefine
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.RedefineType
   * @generated
   */
  public Adapter createRedefineTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.RestrictionType
   * <em>Restriction Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.RestrictionType
   * @generated
   */
  public Adapter createRestrictionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.RestrictionType1
   * <em>Restriction Type1</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.RestrictionType1
   * @generated
   */
  public Adapter createRestrictionType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SchemaType
   * <em>Type</em>}'. <!-- begin-user-doc --> This default implementation returns
   * null so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SchemaType
   * @generated
   */
  public Adapter createSchemaTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SelectorType <em>Selector
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SelectorType
   * @generated
   */
  public Adapter createSelectorTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SimpleContentType
   * <em>Simple Content Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SimpleContentType
   * @generated
   */
  public Adapter createSimpleContentTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SimpleExplicitGroup
   * <em>Simple Explicit Group</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SimpleExplicitGroup
   * @generated
   */
  public Adapter createSimpleExplicitGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SimpleExtensionType
   * <em>Simple Extension Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SimpleExtensionType
   * @generated
   */
  public Adapter createSimpleExtensionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SimpleRestrictionType
   * <em>Simple Restriction Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SimpleRestrictionType
   * @generated
   */
  public Adapter createSimpleRestrictionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.SimpleType <em>Simple
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.SimpleType
   * @generated
   */
  public Adapter createSimpleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.TopLevelAttribute <em>Top
   * Level Attribute</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.TopLevelAttribute
   * @generated
   */
  public Adapter createTopLevelAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.TopLevelComplexType
   * <em>Top Level Complex Type</em>}'. <!-- begin-user-doc --> This default
   * implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.TopLevelComplexType
   * @generated
   */
  public Adapter createTopLevelComplexTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.TopLevelElement <em>Top
   * Level Element</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.TopLevelElement
   * @generated
   */
  public Adapter createTopLevelElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.TopLevelSimpleType <em>Top
   * Level Simple Type</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.TopLevelSimpleType
   * @generated
   */
  public Adapter createTopLevelSimpleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.TotalDigitsType <em>Total
   * Digits Type</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.TotalDigitsType
   * @generated
   */
  public Adapter createTotalDigitsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.UnionType <em>Union
   * Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when
   * inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.UnionType
   * @generated
   */
  public Adapter createUnionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.WhiteSpaceType <em>White
   * Space Type</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.WhiteSpaceType
   * @generated
   */
  public Adapter createWhiteSpaceTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class
   * '{@link org.eclipse.daanse.xmla.model.ecore.schema.Wildcard
   * <em>Wildcard</em>}'. <!-- begin-user-doc --> This default implementation
   * returns null so that we can easily ignore cases; it's useful to ignore a case
   * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see org.eclipse.daanse.xmla.model.ecore.schema.Wildcard
   * @generated
   */
  public Adapter createWildcardAdapter() {
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

} // SchemaAdapterFactory
