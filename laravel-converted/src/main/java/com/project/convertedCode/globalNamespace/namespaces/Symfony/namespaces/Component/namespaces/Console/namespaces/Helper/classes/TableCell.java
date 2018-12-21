package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/TableCell.php

*/

public class TableCell extends RuntimeClassBase {

    public Object value = null;

    public Object options = ZVal.newArray(new ZPair("rowspan", 1), new ZPair("colspan", 1));

    public TableCell(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TableCell.class) {
            this.__construct(env, args);
        }
    }

    public TableCell(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = "";
        }
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object diff = null;
        this.value = value;
        if (ZVal.isTrue(
                diff =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        function_array_keys.f.env(env).call(options).value(),
                                        function_array_keys.f.env(env).call(this.options).value())
                                .value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The TableCell does not support the following options: '%s'.",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("', '", diff)
                                                    .value())
                                    .value()));
        }

        this.options = function_array_merge.f.env(env).call(this.options, options).value();
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object getColspan(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toLong(
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "colspan")));
    }

    @ConvertedMethod
    public Object getRowspan(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toLong(
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "rowspan")));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\TableCell";

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
                    .setName("Symfony\\Component\\Console\\Helper\\TableCell")
                    .setLookup(
                            TableCell.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options", "value")
                    .setFilename("vendor/symfony/console/Helper/TableCell.php")
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
