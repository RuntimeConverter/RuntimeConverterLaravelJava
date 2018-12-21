package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionConstraintParser;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Email;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.CopyrightInformation;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.License;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ManifestDocumentMapperException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Url;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.PhpVersionRequirement;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.Version;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.AuthorCollection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.BundledComponent;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.ApplicationName;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.BundledComponentCollection;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.RequirementCollection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Manifest;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Type;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Author;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.PhpExtensionRequirement;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/ManifestDocumentMapper.php

*/

public class ManifestDocumentMapper extends RuntimeClassBase {

    public ManifestDocumentMapper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ManifestDocumentMapper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "document",
        typeHint = "PharIo\\Manifest\\ManifestDocument"
    )
    public Object map(RuntimeEnv env, Object... args) {
        Object document = assignParameter(args, 0, false);
        Object contains = null;
        Object copyright = null;
        Object requirements = null;
        Object e = null;
        Object type = null;
        Object bundledComponents = null;
        try {
            contains = env.callMethod(document, "getContainsElement", ManifestDocumentMapper.class);
            type = this.mapType(env, contains);
            copyright =
                    this.mapCopyright(
                            env,
                            env.callMethod(
                                    document, "getCopyrightElement", ManifestDocumentMapper.class));
            requirements =
                    this.mapRequirements(
                            env,
                            env.callMethod(
                                    document, "getRequiresElement", ManifestDocumentMapper.class));
            bundledComponents = this.mapBundledComponents(env, document);
            return ZVal.assign(
                    new Manifest(
                            env,
                            new ApplicationName(
                                    env,
                                    env.callMethod(
                                            contains, "getName", ManifestDocumentMapper.class)),
                            new Version(
                                    env,
                                    env.callMethod(
                                            contains, "getVersion", ManifestDocumentMapper.class)),
                            type,
                            copyright,
                            requirements,
                            bundledComponents));
        } catch (ConvertedException convertedException109) {
            if (convertedException109.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PharIo
                            .namespaces
                            .Version
                            .classes
                            .Exception
                            .class,
                    "PharIo\\Version\\Exception")) {
                e = convertedException109.getObject();
                throw ZVal.getException(
                        env,
                        new ManifestDocumentMapperException(
                                env,
                                env.callMethod(e, "getMessage", ManifestDocumentMapper.class),
                                env.callMethod(e, "getCode", ManifestDocumentMapper.class),
                                e));
            } else if (convertedException109.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PharIo
                            .namespaces
                            .Manifest
                            .classes
                            .Exception
                            .class,
                    "PharIo\\Manifest\\Exception")) {
                e = convertedException109.getObject();
                throw ZVal.getException(
                        env,
                        new ManifestDocumentMapperException(
                                env,
                                env.callMethod(e, "getMessage", ManifestDocumentMapper.class),
                                env.callMethod(e, "getCode", ManifestDocumentMapper.class),
                                e));
            } else {
                throw convertedException109;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "contains",
        typeHint = "PharIo\\Manifest\\ContainsElement"
    )
    private Object mapType(RuntimeEnv env, Object... args) {
        Object contains = assignParameter(args, 0, false);
        switch (toStringR(env.callMethod(contains, "getType", ManifestDocumentMapper.class))) {
            case "application":
                return ZVal.assign(Type.runtimeStaticObject.application(env));
            case "library":
                return ZVal.assign(Type.runtimeStaticObject.library(env));
            case "extension":
                return ZVal.assign(
                        this.mapExtension(
                                env,
                                env.callMethod(
                                        contains,
                                        "getExtensionElement",
                                        ManifestDocumentMapper.class)));
        }
        ;
        throw ZVal.getException(
                env,
                new ManifestDocumentMapperException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Unsupported type %s",
                                        env.callMethod(
                                                contains, "getType", ManifestDocumentMapper.class))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "copyright",
        typeHint = "PharIo\\Manifest\\CopyrightElement"
    )
    private Object mapCopyright(RuntimeEnv env, Object... args) {
        Object copyright = assignParameter(args, 0, false);
        Object licenseElement = null;
        Object license = null;
        Object authorElement = null;
        Object authors = null;
        authors = new AuthorCollection(env);
        for (ZPair zpairResult912 :
                ZVal.getIterable(
                        env.callMethod(
                                copyright, "getAuthorElements", ManifestDocumentMapper.class),
                        env,
                        true)) {
            authorElement = ZVal.assign(zpairResult912.getValue());
            env.callMethod(
                    authors,
                    new RuntimeArgsWithReferences(),
                    "add",
                    ManifestDocumentMapper.class,
                    new Author(
                            env,
                            env.callMethod(authorElement, "getName", ManifestDocumentMapper.class),
                            new Email(
                                    env,
                                    env.callMethod(
                                            authorElement,
                                            "getEmail",
                                            ManifestDocumentMapper.class))));
        }

        licenseElement =
                env.callMethod(copyright, "getLicenseElement", ManifestDocumentMapper.class);
        license =
                new License(
                        env,
                        env.callMethod(licenseElement, "getType", ManifestDocumentMapper.class),
                        new Url(
                                env,
                                env.callMethod(
                                        licenseElement, "getUrl", ManifestDocumentMapper.class)));
        return ZVal.assign(new CopyrightInformation(env, authors, license));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "requires",
        typeHint = "PharIo\\Manifest\\RequiresElement"
    )
    private Object mapRequirements(RuntimeEnv env, Object... args) {
        Object requires = assignParameter(args, 0, false);
        Object parser = null;
        Object versionConstraint = null;
        Object e = null;
        Object phpElement = null;
        Object extElement = null;
        Object collection = null;
        collection = new RequirementCollection(env);
        phpElement = env.callMethod(requires, "getPHPElement", ManifestDocumentMapper.class);
        parser = new VersionConstraintParser(env);
        try {
            versionConstraint =
                    env.callMethod(
                            parser,
                            "parse",
                            ManifestDocumentMapper.class,
                            env.callMethod(phpElement, "getVersion", ManifestDocumentMapper.class));
        } catch (ConvertedException convertedException110) {
            if (convertedException110.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PharIo
                            .namespaces
                            .Version
                            .classes
                            .Exception
                            .class,
                    "PharIo\\Version\\Exception")) {
                e = convertedException110.getObject();
                throw ZVal.getException(
                        env,
                        new ManifestDocumentMapperException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unsupported version constraint - %s",
                                                env.callMethod(
                                                        e,
                                                        "getMessage",
                                                        ManifestDocumentMapper.class))
                                        .value(),
                                env.callMethod(e, "getCode", ManifestDocumentMapper.class),
                                e));
            } else {
                throw convertedException110;
            }
        }

        env.callMethod(
                collection,
                new RuntimeArgsWithReferences(),
                "add",
                ManifestDocumentMapper.class,
                new PhpVersionRequirement(env, versionConstraint));
        if (!ZVal.isTrue(
                env.callMethod(phpElement, "hasExtElements", ManifestDocumentMapper.class))) {
            return ZVal.assign(collection);
        }

        for (ZPair zpairResult913 :
                ZVal.getIterable(
                        env.callMethod(phpElement, "getExtElements", ManifestDocumentMapper.class),
                        env,
                        true)) {
            extElement = ZVal.assign(zpairResult913.getValue());
            env.callMethod(
                    collection,
                    new RuntimeArgsWithReferences(),
                    "add",
                    ManifestDocumentMapper.class,
                    new PhpExtensionRequirement(
                            env,
                            env.callMethod(extElement, "getName", ManifestDocumentMapper.class)));
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "document",
        typeHint = "PharIo\\Manifest\\ManifestDocument"
    )
    private Object mapBundledComponents(RuntimeEnv env, Object... args) {
        Object document = assignParameter(args, 0, false);
        Object componentElement = null;
        Object collection = null;
        collection = new BundledComponentCollection(env);
        if (!ZVal.isTrue(
                env.callMethod(document, "hasBundlesElement", ManifestDocumentMapper.class))) {
            return ZVal.assign(collection);
        }

        for (ZPair zpairResult914 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(
                                        document,
                                        "getBundlesElement",
                                        ManifestDocumentMapper.class),
                                "getComponentElements",
                                ManifestDocumentMapper.class),
                        env,
                        true)) {
            componentElement = ZVal.assign(zpairResult914.getValue());
            env.callMethod(
                    collection,
                    new RuntimeArgsWithReferences(),
                    "add",
                    ManifestDocumentMapper.class,
                    new BundledComponent(
                            env,
                            env.callMethod(
                                    componentElement, "getName", ManifestDocumentMapper.class),
                            new Version(
                                    env,
                                    env.callMethod(
                                            componentElement,
                                            "getVersion",
                                            ManifestDocumentMapper.class))));
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "extension",
        typeHint = "PharIo\\Manifest\\ExtensionElement"
    )
    private Object mapExtension(RuntimeEnv env, Object... args) {
        Object extension = assignParameter(args, 0, false);
        Object parser = null;
        Object versionConstraint = null;
        Object e = null;
        try {
            parser = new VersionConstraintParser(env);
            versionConstraint =
                    env.callMethod(
                            parser,
                            "parse",
                            ManifestDocumentMapper.class,
                            env.callMethod(
                                    extension, "getCompatible", ManifestDocumentMapper.class));
            return ZVal.assign(
                    Type.runtimeStaticObject.extension(
                            env,
                            new ApplicationName(
                                    env,
                                    env.callMethod(
                                            extension, "getFor", ManifestDocumentMapper.class)),
                            versionConstraint));
        } catch (ConvertedException convertedException111) {
            if (convertedException111.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PharIo
                            .namespaces
                            .Version
                            .classes
                            .Exception
                            .class,
                    "PharIo\\Version\\Exception")) {
                e = convertedException111.getObject();
                throw ZVal.getException(
                        env,
                        new ManifestDocumentMapperException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unsupported version constraint - %s",
                                                env.callMethod(
                                                        e,
                                                        "getMessage",
                                                        ManifestDocumentMapper.class))
                                        .value(),
                                env.callMethod(e, "getCode", ManifestDocumentMapper.class),
                                e));
            } else {
                throw convertedException111;
            }
        }
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ManifestDocumentMapper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\ManifestDocumentMapper")
                    .setLookup(
                            ManifestDocumentMapper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phar-io/manifest/src/ManifestDocumentMapper.php")
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
