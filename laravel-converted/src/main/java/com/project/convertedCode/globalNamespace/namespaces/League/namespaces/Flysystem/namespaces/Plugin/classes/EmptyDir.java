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

 vendor/league/flysystem/src/Plugin/EmptyDir.php

*/

public class EmptyDir extends AbstractPlugin {

    public EmptyDir(RuntimeEnv env, Object... args) {
        super(env);
    }

    public EmptyDir(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return "emptyDir";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object handle(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object listing = null;
        listing =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "listContents",
                        EmptyDir.class,
                        dirname,
                        false);
        for (ZPair zpairResult665 : ZVal.getIterable(listing, env, true)) {
            item.setObject(ZVal.assign(zpairResult665.getValue()));
            if (ZVal.strictEqualityCheck(item.arrayGet(env, "type"), "===", "dir")) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "deleteDir",
                        EmptyDir.class,
                        item.arrayGet(env, "path"));

            } else {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "delete",
                        EmptyDir.class,
                        item.arrayGet(env, "path"));
            }
        }

        return null;
    }

    public static final Object CONST_class = "League\\Flysystem\\Plugin\\EmptyDir";

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
                    .setName("League\\Flysystem\\Plugin\\EmptyDir")
                    .setLookup(
                            EmptyDir.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem")
                    .setFilename("vendor/league/flysystem/src/Plugin/EmptyDir.php")
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
