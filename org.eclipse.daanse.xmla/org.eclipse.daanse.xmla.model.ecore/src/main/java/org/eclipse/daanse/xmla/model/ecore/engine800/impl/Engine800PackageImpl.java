/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine800.impl;

import org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage;

import org.eclipse.daanse.xmla.model.ecore.engine.impl.EnginePackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine100.Engine100Package;

import org.eclipse.daanse.xmla.model.ecore.engine100.impl.Engine100PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.impl.Engine100_100PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine2.Engine2Package;

import org.eclipse.daanse.xmla.model.ecore.engine2.impl.Engine2PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package;

import org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.Engine200_200Package;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.impl.Engine200_200PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;

import org.eclipse.daanse.xmla.model.ecore.engine300.impl.Engine300PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine400.Engine400Package;

import org.eclipse.daanse.xmla.model.ecore.engine400.impl.Engine400PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine600.Engine600Package;

import org.eclipse.daanse.xmla.model.ecore.engine600.impl.Engine600PackageImpl;

import org.eclipse.daanse.xmla.model.ecore.engine800.DaxOptimizationModeType;
import org.eclipse.daanse.xmla.model.ecore.engine800.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.engine800.Engine800Factory;
import org.eclipse.daanse.xmla.model.ecore.engine800.Engine800Package;

import org.eclipse.daanse.xmla.model.ecore.ext.ExtPackage;

import org.eclipse.daanse.xmla.model.ecore.ext.impl.ExtPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage;

import org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.schema.SchemaPackage;

import org.eclipse.daanse.xmla.model.ecore.schema.impl.SchemaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.Xmla_emptyPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl.Xmla_emptyPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl.Xmla_multipleresultsPackageImpl;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.Xmla_rowsetPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl.Xmla_rowsetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine800PackageImpl extends EPackageImpl implements Engine800Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daxOptimizationModeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.daanse.xmla.model.ecore.engine800.Engine800Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Engine800PackageImpl() {
		super(eNS_URI, Engine800Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Engine800Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Engine800Package init() {
		if (isInited) return (Engine800Package)EPackage.Registry.INSTANCE.getEPackage(Engine800Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEngine800Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Engine800PackageImpl theEngine800Package = registeredEngine800Package instanceof Engine800PackageImpl ? (Engine800PackageImpl)registeredEngine800Package : new Engine800PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EnginePackageImpl theEnginePackage = (EnginePackageImpl)(registeredPackage instanceof EnginePackageImpl ? registeredPackage : EnginePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine100_100Package.eNS_URI);
		Engine100_100PackageImpl theEngine100_100Package = (Engine100_100PackageImpl)(registeredPackage instanceof Engine100_100PackageImpl ? registeredPackage : Engine100_100Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine100Package.eNS_URI);
		Engine100PackageImpl theEngine100Package = (Engine100PackageImpl)(registeredPackage instanceof Engine100PackageImpl ? registeredPackage : Engine100Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine2Package.eNS_URI);
		Engine2PackageImpl theEngine2Package = (Engine2PackageImpl)(registeredPackage instanceof Engine2PackageImpl ? registeredPackage : Engine2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine200_200Package.eNS_URI);
		Engine200_200PackageImpl theEngine200_200Package = (Engine200_200PackageImpl)(registeredPackage instanceof Engine200_200PackageImpl ? registeredPackage : Engine200_200Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine200Package.eNS_URI);
		Engine200PackageImpl theEngine200Package = (Engine200PackageImpl)(registeredPackage instanceof Engine200PackageImpl ? registeredPackage : Engine200Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine300_300Package.eNS_URI);
		Engine300_300PackageImpl theEngine300_300Package = (Engine300_300PackageImpl)(registeredPackage instanceof Engine300_300PackageImpl ? registeredPackage : Engine300_300Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine300Package.eNS_URI);
		Engine300PackageImpl theEngine300Package = (Engine300PackageImpl)(registeredPackage instanceof Engine300PackageImpl ? registeredPackage : Engine300Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine400Package.eNS_URI);
		Engine400PackageImpl theEngine400Package = (Engine400PackageImpl)(registeredPackage instanceof Engine400PackageImpl ? registeredPackage : Engine400Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Engine600Package.eNS_URI);
		Engine600PackageImpl theEngine600Package = (Engine600PackageImpl)(registeredPackage instanceof Engine600PackageImpl ? registeredPackage : Engine600Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExtPackage.eNS_URI);
		ExtPackageImpl theExtPackage = (ExtPackageImpl)(registeredPackage instanceof ExtPackageImpl ? registeredPackage : ExtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MsxmlaPackage.eNS_URI);
		MsxmlaPackageImpl theMsxmlaPackage = (MsxmlaPackageImpl)(registeredPackage instanceof MsxmlaPackageImpl ? registeredPackage : MsxmlaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_emptyPackage.eNS_URI);
		Xmla_emptyPackageImpl theXmla_emptyPackage = (Xmla_emptyPackageImpl)(registeredPackage instanceof Xmla_emptyPackageImpl ? registeredPackage : Xmla_emptyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_exceptionPackage.eNS_URI);
		Xmla_exceptionPackageImpl theXmla_exceptionPackage = (Xmla_exceptionPackageImpl)(registeredPackage instanceof Xmla_exceptionPackageImpl ? registeredPackage : Xmla_exceptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_mddatasetPackage.eNS_URI);
		Xmla_mddatasetPackageImpl theXmla_mddatasetPackage = (Xmla_mddatasetPackageImpl)(registeredPackage instanceof Xmla_mddatasetPackageImpl ? registeredPackage : Xmla_mddatasetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_multipleresultsPackage.eNS_URI);
		Xmla_multipleresultsPackageImpl theXmla_multipleresultsPackage = (Xmla_multipleresultsPackageImpl)(registeredPackage instanceof Xmla_multipleresultsPackageImpl ? registeredPackage : Xmla_multipleresultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Xmla_rowsetPackage.eNS_URI);
		Xmla_rowsetPackageImpl theXmla_rowsetPackage = (Xmla_rowsetPackageImpl)(registeredPackage instanceof Xmla_rowsetPackageImpl ? registeredPackage : Xmla_rowsetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmlaPackage.eNS_URI);
		XmlaPackageImpl theXmlaPackage = (XmlaPackageImpl)(registeredPackage instanceof XmlaPackageImpl ? registeredPackage : XmlaPackage.eINSTANCE);

		// Create package meta-data objects
		theEngine800Package.createPackageContents();
		theEnginePackage.createPackageContents();
		theEngine100_100Package.createPackageContents();
		theEngine100Package.createPackageContents();
		theEngine2Package.createPackageContents();
		theEngine200_200Package.createPackageContents();
		theEngine200Package.createPackageContents();
		theEngine300_300Package.createPackageContents();
		theEngine300Package.createPackageContents();
		theEngine400Package.createPackageContents();
		theEngine600Package.createPackageContents();
		theExtPackage.createPackageContents();
		theMsxmlaPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theXmla_emptyPackage.createPackageContents();
		theXmla_exceptionPackage.createPackageContents();
		theXmla_mddatasetPackage.createPackageContents();
		theXmla_multipleresultsPackage.createPackageContents();
		theXmla_rowsetPackage.createPackageContents();
		theXmlaPackage.createPackageContents();

		// Initialize created meta-data
		theEngine800Package.initializePackageContents();
		theEnginePackage.initializePackageContents();
		theEngine100_100Package.initializePackageContents();
		theEngine100Package.initializePackageContents();
		theEngine2Package.initializePackageContents();
		theEngine200_200Package.initializePackageContents();
		theEngine200Package.initializePackageContents();
		theEngine300_300Package.initializePackageContents();
		theEngine300Package.initializePackageContents();
		theEngine400Package.initializePackageContents();
		theEngine600Package.initializePackageContents();
		theExtPackage.initializePackageContents();
		theMsxmlaPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theXmla_emptyPackage.initializePackageContents();
		theXmla_exceptionPackage.initializePackageContents();
		theXmla_mddatasetPackage.initializePackageContents();
		theXmla_multipleresultsPackage.initializePackageContents();
		theXmla_rowsetPackage.initializePackageContents();
		theXmlaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEngine800Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Engine800Package.eNS_URI, theEngine800Package);
		return theEngine800Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DaxOptimizationMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SubscriptionId() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaxOptimizationModeType() {
		return daxOptimizationModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine800Factory getEngine800Factory() {
		return (Engine800Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DAX_OPTIMIZATION_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUBSCRIPTION_ID);

		// Create enums
		daxOptimizationModeTypeEEnum = createEEnum(DAX_OPTIMIZATION_MODE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DaxOptimizationMode(), this.getDaxOptimizationModeType(), "daxOptimizationMode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SubscriptionId(), theXMLTypePackage.getString(), "subscriptionId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(daxOptimizationModeTypeEEnum, DaxOptimizationModeType.class, "DaxOptimizationModeType");
		addEEnumLiteral(daxOptimizationModeTypeEEnum, DaxOptimizationModeType._1);
		addEEnumLiteral(daxOptimizationModeTypeEEnum, DaxOptimizationModeType._0);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// https://jakarta.ee/xml/ns/jaxb
		createJaxbAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>https://jakarta.ee/xml/ns/jaxb</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJaxbAnnotations() {
		String source = "https://jakarta.ee/xml/ns/jaxb";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "version", "3.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (daxOptimizationModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "DaxOptimizationMode_._type"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_DaxOptimizationMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DaxOptimizationMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SubscriptionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubscriptionId",
			   "namespace", "##targetNamespace"
		   });
	}

} //Engine800PackageImpl
