/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.structure;

import org.xtext.example.structure.StructureStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class StructureStandaloneSetup extends StructureStandaloneSetupGenerated {
  public static void doSetup() {
    new StructureStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}