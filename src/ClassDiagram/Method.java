/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ClassDiagram.Method#getParamTypes <em>Param Types</em>}</li>
 *   <li>{@link ClassDiagram.Method#getParamNames <em>Param Names</em>}</li>
 *   <li>{@link ClassDiagram.Method#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getMethod()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parametersSize'"
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Param Types</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Types</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ParamTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getParamTypes();

	/**
	 * Returns the value of the '<em><b>Param Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Names</em>' attribute list.
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ParamNames()
	 * @model
	 * @generated
	 */
	EList<String> getParamNames();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Classifier#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Classifier)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_Owner()
	 * @see ClassDiagram.Classifier#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	Classifier getOwner();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Classifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.paramTypes -&gt; exists (t : Type | t.oclIsTypeOf(VoidType))'"
	 * @generated
	 */
	boolean paramNotVoid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.paramTypes -&gt; size() = self.paramNames -&gt; size()'"
	 * @generated
	 */
	boolean parametersSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Method
