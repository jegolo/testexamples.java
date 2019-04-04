package de.lostuxos.testexamples.archunit;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;


public class ArchunitTest {

    @Test
    public void Services_should_only_be_accessed_by_Controllers() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("de.lostuxos.myapp");

        ArchRule myRule = classes()
                .that().resideInAPackage("..service..")
                .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");

        myRule.check(importedClasses);
    }
}
