package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/SplFileInfo.php

*/

public class SplFileInfo extends com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo {

    public Object relativePath = null;

    public Object relativePathname = null;

    public SplFileInfo(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SplFileInfo.class) {
            this.__construct(env, args);
        }
    }

    public SplFileInfo(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "string")
    @ConvertedParameter(index = 1, name = "relativePath", typeHint = "string")
    @ConvertedParameter(index = 2, name = "relativePathname", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object relativePath = assignParameter(args, 1, false);
        Object relativePathname = assignParameter(args, 2, false);
        super.__construct(env, file);
        this.relativePath = relativePath;
        this.relativePathname = relativePathname;
        return null;
    }

    @ConvertedMethod
    public Object getRelativePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relativePath);
    }

    @ConvertedMethod
    public Object getRelativePathname(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relativePathname);
    }

    @ConvertedMethod
    public Object getContents(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/finder")
                        .setFile("/vendor/symfony/finder/SplFileInfo.php");
        ReferenceContainer error = new BasicReferenceContainer(null);
        Object content = null;
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Finder",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "type")
                            @ConvertedParameter(index = 1, name = "msg")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object type = assignParameter(args, 0, false);
                                Object msg = assignParameter(args, 1, false);
                                ReferenceContainer error = new BasicReferenceContainer(null);
                                error = this.contextReferences.getReferenceContainer("error");
                                error.setObject(ZVal.assign(msg));
                                return null;
                            }
                        }.useRef("error", error));
        content =
                function_file_get_contents
                        .f
                        .env(env)
                        .call(env.callMethod(this, "getPathname", SplFileInfo.class))
                        .value();
        function_restore_error_handler.f.env(env).call();
        if (ZVal.strictEqualityCheck(false, "===", content)) {
            throw ZVal.getException(env, new RuntimeException(env, error.getObject()));
        }

        return ZVal.assign(content);
    }

    public static final Object CONST_class = "Symfony\\Component\\Finder\\SplFileInfo";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .files
                    .SplFileInfo
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\SplFileInfo")
                    .setLookup(
                            SplFileInfo.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePath", "relativePathname")
                    .setFilename("vendor/symfony/finder/SplFileInfo.php")
                    .addExtendsClass("SplFileInfo")
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
