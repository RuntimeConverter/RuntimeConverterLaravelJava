package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.AbstractPlugin;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Plugin/ListWith.php

*/

public class ListWith extends AbstractPlugin {

    public ListWith(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ListWith(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return "listWith";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "keys",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 1, name = "directory")
    @ConvertedParameter(
        index = 2,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, true);
        if (null == keys) {
            keys = ZVal.newArray();
        }
        Object directory = assignParameter(args, 1, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 2, true);
        if (null == recursive) {
            recursive = false;
        }
        ReferenceContainer contents = new BasicReferenceContainer(null);
        Object index = null;
        Object missingKeys = null;
        ReferenceContainer _object = new BasicReferenceContainer(null);
        contents.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "listContents",
                        ListWith.class,
                        directory,
                        recursive));
        for (ZPair zpairResult668 : ZVal.getIterable(contents.getObject(), env, false)) {
            index = ZVal.assign(zpairResult668.getKey());
            _object.setObject(ZVal.assign(zpairResult668.getValue()));
            if (ZVal.strictEqualityCheck(_object.arrayGet(env, "type"), "===", "file")) {
                missingKeys =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        keys,
                                        function_array_keys
                                                .f
                                                .env(env)
                                                .call(_object.getObject())
                                                .value())
                                .value();
                contents.arrayAccess(env, index)
                        .set(
                                function_array_reduce
                                        .f
                                        .env(env)
                                        .call(
                                                missingKeys,
                                                ZVal.newArray(
                                                        new ZPair(0, this),
                                                        new ZPair(1, "getMetadataByName")),
                                                _object.getObject())
                                        .value());
            }
        }

        return ZVal.assign(contents.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object", typeHint = "array")
    @ConvertedParameter(index = 1, name = "key")
    protected Object getMetadataByName(RuntimeEnv env, Object... args) {
        ReferenceContainer _object = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = assignParameter(args, 1, false);
        Object method = null;
        method = "get" + toStringR(NamespaceGlobal.ucfirst.env(env).call(key).value(), env);
        if (!function_method_exists
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("filesystem").value(), method)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Could not get meta-data for key: " + toStringR(key, env)));
        }

        _object.arrayAccess(env, key)
                .set(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("filesystem").value(),
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ArrayDimensionReference(
                                                        _object.getObject(), "path")),
                                toStringR(method, env),
                                ListWith.class,
                                _object.arrayGet(env, "path")));
        return ZVal.assign(_object.getObject());
    }

    public static final Object CONST_class = "League\\Flysystem\\Plugin\\ListWith";

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
                    .setName("League\\Flysystem\\Plugin\\ListWith")
                    .setLookup(
                            ListWith.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem")
                    .setFilename("vendor/league/flysystem/src/Plugin/ListWith.php")
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
