package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMElement;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.BundlesElement;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.RequiresElement;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestDocumentException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ContainsElement;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.CopyrightElement;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestDocumentLoadingException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ManifestDocument.php

*/

public class ManifestDocument extends RuntimeClassBase {

    public Object dom = null;

    public ManifestDocument(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ManifestDocument.class) {
            this.__construct(env, args);
        }
    }

    public ManifestDocument(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
    private Object __construct(RuntimeEnv env, Object... args) {
        Object dom = assignParameter(args, 0, false);
        this.ensureCorrectDocumentType(env, dom);
        this.dom = dom;
        return null;
    }

    @ConvertedMethod
    public Object getContainsElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ContainsElement(env, this.fetchElementByName(env, "contains")));
    }

    @ConvertedMethod
    public Object getCopyrightElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(new CopyrightElement(env, this.fetchElementByName(env, "copyright")));
    }

    @ConvertedMethod
    public Object getRequiresElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(new RequiresElement(env, this.fetchElementByName(env, "requires")));
    }

    @ConvertedMethod
    public Object hasBundlesElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        toObjectR(
                                        env.callMethod(
                                                this.dom,
                                                "getElementsByTagNameNS",
                                                ManifestDocument.class,
                                                CONST_XMLNS,
                                                "bundles"))
                                .accessProp(this, env)
                                .name("length")
                                .value(),
                        "===",
                        1));
    }

    @ConvertedMethod
    public Object getBundlesElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(new BundlesElement(env, this.fetchElementByName(env, "bundles")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
    private Object ensureCorrectDocumentType(RuntimeEnv env, Object... args) {
        Object dom = assignParameter(args, 0, false);
        Object root = null;
        root = ZVal.assign(toObjectR(dom).accessProp(this, env).name("documentElement").value());
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                toObjectR(root).accessProp(this, env).name("localName").value(),
                                "!==",
                                "phar"))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                toObjectR(root).accessProp(this, env).name("namespaceURI").value(),
                                "!==",
                                CONST_XMLNS))) {
            throw ZVal.getException(
                    env, new ManifestDocumentException(env, "Not a phar.io manifest document"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementName")
    private Object fetchElementByName(RuntimeEnv env, Object... args) {
        Object elementName = assignParameter(args, 0, false);
        Object element = null;
        element =
                env.callMethod(
                        env.callMethod(
                                this.dom,
                                "getElementsByTagNameNS",
                                ManifestDocument.class,
                                CONST_XMLNS,
                                elementName),
                        "item",
                        ManifestDocument.class,
                        0);
        if (!ZVal.isTrue(ZVal.checkInstanceType(element, DOMElement.class, "DOMElement"))) {
            throw ZVal.getException(
                    env,
                    new ManifestDocumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Element %s missing", elementName)
                                    .value()));
        }

        return ZVal.assign(element);
    }

    public static final Object CONST_XMLNS = "https://phar.io/xml/manifest/1.0";

    public static final Object CONST_class = "PharIo\\Manifest\\ManifestDocument";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename")
        public Object fromFile(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            if (!function_file_exists.f.env(env).call(filename).getBool()) {
                throw ZVal.getException(
                        env,
                        new ManifestDocumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("File \"%s\" not found", filename)
                                        .value()));
            }

            return ZVal.assign(
                    runtimeStaticObject.fromString(
                            env, function_file_get_contents.f.env(env).call(filename).value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "xmlString")
        public Object fromString(RuntimeEnv env, Object... args) {
            Object xmlString = assignParameter(args, 0, false);
            Object dom = null;
            Object prev = null;
            Object errors = null;
            prev = NamespaceGlobal.libxml_use_internal_errors.env(env).call(true).value();
            NamespaceGlobal.libxml_clear_errors.env(env).call();
            dom = new DOMDocument(env);
            env.callMethod(dom, "loadXML", ManifestDocument.class, xmlString);
            errors = NamespaceGlobal.libxml_get_errors.env(env).call().value();
            NamespaceGlobal.libxml_use_internal_errors.env(env).call(prev);
            if (ZVal.strictNotEqualityCheck(
                    function_count.f.env(env).call(errors).value(), "!==", 0)) {
                throw ZVal.getException(env, new ManifestDocumentLoadingException(env, errors));
            }

            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PharIo
                            .namespaces
                            .Manifest
                            .classes
                            .ManifestDocument(env, dom));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ManifestDocument")
                    .setLookup(
                            ManifestDocument.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dom")
                    .setFilename("vendor/phar-io/manifest/src/xml/ManifestDocument.php")
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
