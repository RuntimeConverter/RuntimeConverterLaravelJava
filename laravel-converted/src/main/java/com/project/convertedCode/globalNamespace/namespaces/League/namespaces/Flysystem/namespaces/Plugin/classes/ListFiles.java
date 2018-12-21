package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.AbstractPlugin;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Plugin/ListFiles.php

*/

public class ListFiles extends AbstractPlugin {

    public ListFiles(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ListFiles(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return "listFiles";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/league/flysystem/src/Plugin")
                        .setFile("/vendor/league/flysystem/src/Plugin/ListFiles.php");
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        Object filter = null;
        Object contents = null;
        contents =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "listContents",
                        ListFiles.class,
                        directory,
                        recursive);
        filter =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "League\\Flysystem\\Plugin",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "object")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer _object =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                ZVal.strictEqualityCheck(
                                        _object.arrayGet(env, "type"), "===", "file"));
                    }
                };
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(function_array_filter.f.env(env).call(contents, filter).value())
                        .value());
    }

    public static final Object CONST_class = "League\\Flysystem\\Plugin\\ListFiles";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractPlugin.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Plugin\\ListFiles")
                    .setLookup(
                            ListFiles.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem")
                    .setFilename("vendor/league/flysystem/src/Plugin/ListFiles.php")
                    .addInterface("League\\Flysystem\\PluginInterface")
                    .addExtendsClass("League\\Flysystem\\Plugin\\AbstractPlugin")
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
