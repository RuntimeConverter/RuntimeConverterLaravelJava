package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_natcasesort;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_functions;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/FunctionEnumerator.php

*/

public class FunctionEnumerator extends Enumerator {

    public FunctionEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FunctionEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public FunctionEnumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "reflector",
        typeHint = "Reflector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object listItems(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, true);
        if (null == reflector) {
            reflector = ZVal.getNull();
        }
        Object target = assignParameter(args, 2, true);
        if (null == target) {
            target = ZVal.getNull();
        }
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object functions = null;
        Object label = null;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull()))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull()))) {
            return null;
        }

        if (!ZVal.isTrue(
                env.callMethod(input, "getOption", FunctionEnumerator.class, "functions"))) {
            return null;
        }

        if (ZVal.isTrue(env.callMethod(input, "getOption", FunctionEnumerator.class, "user"))) {
            label = "User Functions";
            functions = this.getFunctions(env, "user");

        } else if (ZVal.isTrue(
                env.callMethod(input, "getOption", FunctionEnumerator.class, "internal"))) {
            label = "Internal Functions";
            functions = this.getFunctions(env, "internal");

        } else {
            label = "Functions";
            functions = this.getFunctions(env);
        }

        functions = this.prepareFunctions(env, functions);
        if (ZVal.isEmpty(functions)) {
            return null;
        }

        ret.setObject(ZVal.newArray());
        ret.arrayAccess(env, label).set(functions);
        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getFunctions(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        ReferenceContainer funcs = new BasicReferenceContainer(null);
        funcs.setObject(function_get_defined_functions.f.env(env).call().value());
        if (ZVal.isTrue(type)) {
            return ZVal.assign(funcs.arrayGet(env, type));

        } else {
            return ZVal.assign(
                    function_array_merge
                            .f
                            .env(env)
                            .call(funcs.arrayGet(env, "internal"), funcs.arrayGet(env, "user"))
                            .value());
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "functions", typeHint = "array")
    protected Object prepareFunctions(RuntimeEnv env, Object... args) {
        Object functions = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object name = null;
        function_natcasesort.f.env(env).call(functions);
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1373 : ZVal.getIterable(functions, env, true)) {
            name = ZVal.assign(zpairResult1373.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", FunctionEnumerator.class, name))) {
                ret.arrayAccess(env, name)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", name),
                                        new ZPair("style", CONST_IS_FUNCTION),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentSignature",
                                                        FunctionEnumerator.class,
                                                        name))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\FunctionEnumerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Enumerator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ListCommand\\FunctionEnumerator")
                    .setLookup(
                            FunctionEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/FunctionEnumerator.php")
                    .addExtendsClass("Psy\\Command\\ListCommand\\Enumerator")
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
