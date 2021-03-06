/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.structure.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.structure.StructureRuntimeModule;
import org.xtext.example.structure.StructureStandaloneSetup;
import org.xtext.example.structure.ide.StructureIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class StructureIdeSetup extends StructureStandaloneSetup {
  @Override
  public Injector createInjector() {
    StructureRuntimeModule _structureRuntimeModule = new StructureRuntimeModule();
    StructureIdeModule _structureIdeModule = new StructureIdeModule();
    return Guice.createInjector(Modules2.mixin(_structureRuntimeModule, _structureIdeModule));
  }
}
