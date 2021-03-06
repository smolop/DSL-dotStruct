/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.structure.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raiz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.structure.structure.Raiz#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.structure.structure.Raiz#getCarpetas <em>Carpetas</em>}</li>
 *   <li>{@link org.xtext.example.structure.structure.Raiz#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.structure.structure.StructurePackage#getRaiz()
 * @model
 * @generated
 */
public interface Raiz extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.structure.structure.StructurePackage#getRaiz_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.structure.structure.Raiz#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Carpetas</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.structure.structure.Carpeta}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Carpetas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Carpetas</em>' containment reference list.
   * @see org.xtext.example.structure.structure.StructurePackage#getRaiz_Carpetas()
   * @model containment="true"
   * @generated
   */
  EList<Carpeta> getCarpetas();

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.structure.structure.Content}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.xtext.example.structure.structure.StructurePackage#getRaiz_Contents()
   * @model containment="true"
   * @generated
   */
  EList<Content> getContents();

} // Raiz
