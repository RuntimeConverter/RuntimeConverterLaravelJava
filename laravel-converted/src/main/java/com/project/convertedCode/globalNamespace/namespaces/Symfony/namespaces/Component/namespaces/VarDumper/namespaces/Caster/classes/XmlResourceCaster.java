package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/XmlResourceCaster.php

*/

public class XmlResourceCaster extends RuntimeClassBase {

    public XmlResourceCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XmlResourceCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Caster\\XmlResourceCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "h")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castXml(RuntimeEnv env, Object... args) {
            Object h = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, "current_byte_index")
                    .set(NamespaceGlobal.xml_get_current_byte_index.env(env).call(h).value());
            a.arrayAccess(env, "current_column_number")
                    .set(NamespaceGlobal.xml_get_current_column_number.env(env).call(h).value());
            a.arrayAccess(env, "current_line_number")
                    .set(NamespaceGlobal.xml_get_current_line_number.env(env).call(h).value());
            a.arrayAccess(env, "error_code")
                    .set(NamespaceGlobal.xml_get_error_code.env(env).call(h).value());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .VarDumper
                                    .namespaces
                                    .Caster
                                    .classes
                                    .XmlResourceCaster
                                    .RequestStaticProperties
                                    .class,
                            "xmlErrors"),
                    env,
                    a.arrayGet(env, "error_code"))) {
                a.arrayAccess(env, "error_code")
                        .set(
                                new ConstStub(
                                        env,
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Caster
                                                                .classes
                                                                .XmlResourceCaster
                                                                .RequestStaticProperties
                                                                .class,
                                                        "xmlErrors")
                                                .arrayGet(env, a.arrayGet(env, "error_code")),
                                        a.arrayGet(env, "error_code")));
            }

            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object xmlErrors =
                ZVal.newArray(
                        new ZPair(0, "XML_ERROR_NONE"),
                        new ZPair(1, "XML_ERROR_NO_MEMORY"),
                        new ZPair(2, "XML_ERROR_SYNTAX"),
                        new ZPair(3, "XML_ERROR_NO_ELEMENTS"),
                        new ZPair(4, "XML_ERROR_INVALID_TOKEN"),
                        new ZPair(5, "XML_ERROR_UNCLOSED_TOKEN"),
                        new ZPair(6, "XML_ERROR_PARTIAL_CHAR"),
                        new ZPair(7, "XML_ERROR_TAG_MISMATCH"),
                        new ZPair(8, "XML_ERROR_DUPLICATE_ATTRIBUTE"),
                        new ZPair(9, "XML_ERROR_JUNK_AFTER_DOC_ELEMENT"),
                        new ZPair(10, "XML_ERROR_PARAM_ENTITY_REF"),
                        new ZPair(11, "XML_ERROR_UNDEFINED_ENTITY"),
                        new ZPair(12, "XML_ERROR_RECURSIVE_ENTITY_REF"),
                        new ZPair(13, "XML_ERROR_ASYNC_ENTITY"),
                        new ZPair(14, "XML_ERROR_BAD_CHAR_REF"),
                        new ZPair(15, "XML_ERROR_BINARY_ENTITY_REF"),
                        new ZPair(16, "XML_ERROR_ATTRIBUTE_EXTERNAL_ENTITY_REF"),
                        new ZPair(17, "XML_ERROR_MISPLACED_XML_PI"),
                        new ZPair(18, "XML_ERROR_UNKNOWN_ENCODING"),
                        new ZPair(19, "XML_ERROR_INCORRECT_ENCODING"),
                        new ZPair(20, "XML_ERROR_UNCLOSED_CDATA_SECTION"),
                        new ZPair(21, "XML_ERROR_EXTERNAL_ENTITY_HANDLING"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\XmlResourceCaster")
                    .setLookup(
                            XmlResourceCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("xmlErrors")
                    .setFilename("vendor/symfony/var-dumper/Caster/XmlResourceCaster.php")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
