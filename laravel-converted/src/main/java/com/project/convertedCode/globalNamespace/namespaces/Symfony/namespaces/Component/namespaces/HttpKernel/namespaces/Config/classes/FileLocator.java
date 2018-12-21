package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Config.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Config/FileLocator.php

*/

public class FileLocator extends RuntimeClassBase {

    public Object kernel = null;

    public Object path = null;

    public FileLocator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileLocator.class) {
            this.__construct(env, args);
        }
    }

    public FileLocator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\KernelInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "path",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "paths",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        ReferenceContainer paths = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == paths.getObject()) {
            paths.setObject(ZVal.newArray());
        }
        this.kernel = kernel;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", path)) {
            this.path = path;
            paths.arrayAppend(env).set(path);
        }

        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "parent"), env)
                .callUnknownStaticMethod(
                        env, "__construct", new RuntimeArgsWithReferences(), paths.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "currentPath",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "first",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object locate(RuntimeEnv env, Object... args) {
        ReferenceContainer file = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object currentPath = assignParameter(args, 1, true);
        if (null == currentPath) {
            currentPath = ZVal.getNull();
        }
        Object first = assignParameter(args, 2, true);
        if (null == first) {
            first = true;
        }
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, file, env, 0))
                && ZVal.toBool(ZVal.strictEqualityCheck("@", "===", file.arrayGet(env, 0)))) {
            return ZVal.assign(
                    env.callMethod(
                            this.kernel,
                            "locateResource",
                            FileLocator.class,
                            file.getObject(),
                            this.path,
                            first));
        }

        return ZVal.assign(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "parent"), env)
                        .callUnknownStaticMethod(
                                env,
                                "locate",
                                new RuntimeArgsWithReferences(),
                                file.getObject(),
                                currentPath,
                                first));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Config\\FileLocator";

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
                    .setName("Symfony\\Component\\HttpKernel\\Config\\FileLocator")
                    .setLookup(
                            FileLocator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("kernel", "path")
                    .setFilename("vendor/symfony/http-kernel/Config/FileLocator.php")
                    .addExtendsClass("Symfony\\Component\\Config\\FileLocator")
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
