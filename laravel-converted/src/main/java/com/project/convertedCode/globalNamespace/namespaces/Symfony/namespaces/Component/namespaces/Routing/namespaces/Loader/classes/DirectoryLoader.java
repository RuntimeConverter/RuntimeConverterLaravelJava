package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/DirectoryLoader.php

*/

public class DirectoryLoader extends RuntimeClassBase {

    public DirectoryLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DirectoryLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object path = null;
        Object subType = null;
        Object collection = null;
        Object subPath = null;
        ReferenceContainer dir = new BasicReferenceContainer(null);
        Object subCollection = null;
        path =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("locator").value(),
                        "locate",
                        DirectoryLoader.class,
                        file);
        collection = new RouteCollection(env);
        env.callMethod(
                collection,
                "addResource",
                DirectoryLoader.class,
                env.createNew(ZVal.resolveClassAlias(env, "DirectoryResource"), path));
        for (ZPair zpairResult2033 :
                ZVal.getIterable(NamespaceGlobal.scandir.env(env).call(path).value(), env, true)) {
            dir.setObject(ZVal.assign(zpairResult2033.getValue()));
            if (ZVal.strictNotEqualityCheck(".", "!==", dir.arrayGet(env, 0))) {
                env.callMethod(this, "setCurrentDir", DirectoryLoader.class, path);
                subPath = toStringR(path, env) + "/" + toStringR(dir.getObject(), env);
                subType = ZVal.getNull();
                if (function_is_dir.f.env(env).call(subPath).getBool()) {
                    subPath = toStringR(subPath, env) + "/";
                    subType = "directory";
                }

                subCollection =
                        env.callMethod(
                                this,
                                "import",
                                DirectoryLoader.class,
                                subPath,
                                subType,
                                false,
                                path);
                env.callMethod(collection, "addCollection", DirectoryLoader.class, subCollection);
            }
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        return ZVal.assign(ZVal.strictEqualityCheck("directory", "===", type));
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Loader\\DirectoryLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\DirectoryLoader")
                    .setLookup(
                            DirectoryLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Loader/DirectoryLoader.php")
                    .addExtendsClass("Symfony\\Component\\Config\\Loader\\FileLoader")
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
