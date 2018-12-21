package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.FileNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.AbstractPlugin;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Plugin/ForcedRename.php

*/

public class ForcedRename extends AbstractPlugin {

    public ForcedRename(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ForcedRename(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return "forceRename";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object handle(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        Object deleted = null;
        Object e = null;
        try {
            deleted =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("filesystem").value(),
                            "delete",
                            ForcedRename.class,
                            newpath);
        } catch (ConvertedException convertedException78) {
            if (convertedException78.instanceOf(
                    FileNotFoundException.class, "League\\Flysystem\\FileNotFoundException")) {
                e = convertedException78.getObject();
                deleted = true;
            } else {
                throw convertedException78;
            }
        }

        if (ZVal.isTrue(deleted)) {
            return ZVal.assign(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("filesystem").value(),
                            "rename",
                            ForcedRename.class,
                            path,
                            newpath));
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "League\\Flysystem\\Plugin\\ForcedRename";

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
                    .setName("League\\Flysystem\\Plugin\\ForcedRename")
                    .setLookup(
                            ForcedRename.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem")
                    .setFilename("vendor/league/flysystem/src/Plugin/ForcedRename.php")
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
