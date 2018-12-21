package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.AbstractPlugin;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Plugin/ListPaths.php

*/

public class ListPaths extends AbstractPlugin {

    public ListPaths(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ListPaths(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return "listPaths";
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
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object contents = null;
        ReferenceContainer _object = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        contents =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "listContents",
                        ListPaths.class,
                        directory,
                        recursive);
        for (ZPair zpairResult667 : ZVal.getIterable(contents, env, true)) {
            _object.setObject(ZVal.assign(zpairResult667.getValue()));
            result.arrayAppend(env).set(_object.arrayGet(env, "path"));
        }

        return ZVal.assign(result.getObject());
    }

    public static final Object CONST_class = "League\\Flysystem\\Plugin\\ListPaths";

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
                    .setName("League\\Flysystem\\Plugin\\ListPaths")
                    .setLookup(
                            ListPaths.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem")
                    .setFilename("vendor/league/flysystem/src/Plugin/ListPaths.php")
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
