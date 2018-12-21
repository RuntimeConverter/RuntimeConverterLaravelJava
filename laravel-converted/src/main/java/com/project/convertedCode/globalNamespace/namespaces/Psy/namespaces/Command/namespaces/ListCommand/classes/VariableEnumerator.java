package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uksort;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/VariableEnumerator.php

*/

public class VariableEnumerator extends Enumerator {

    public Object context = null;

    public VariableEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VariableEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public VariableEnumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "presenter", typeHint = "Psy\\VarDumper\\Presenter")
    @ConvertedParameter(index = 1, name = "context", typeHint = "Psy\\Context")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object presenter = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        this.context = context;
        super.__construct(env, presenter);
        return null;
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
        Object variables = null;
        Object showAll = null;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull()))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull()))) {
            return null;
        }

        if (!ZVal.isTrue(env.callMethod(input, "getOption", VariableEnumerator.class, "vars"))) {
            return null;
        }

        showAll = env.callMethod(input, "getOption", VariableEnumerator.class, "all");
        variables = this.prepareVariables(env, this.getVariables(env, showAll));
        if (ZVal.isEmpty(variables)) {
            return null;
        }

        return ZVal.assign(ZVal.newArray(new ZPair("Variables", variables)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "showAll")
    protected Object getVariables(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command/ListCommand")
                        .setFile(
                                "/vendor/psy/psysh/src/Command/ListCommand/VariableEnumerator.php");
        int runtimeConverterContinueCount;
        Object showAll = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object val = null;
        Object name = null;
        Object scopeVars = null;
        scopeVars = env.callMethod(this.context, "getAll", VariableEnumerator.class);
        function_uksort
                .f
                .env(env)
                .call(
                        scopeVars,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Psy\\Command\\ListCommand",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "a")
                            @ConvertedParameter(index = 1, name = "b")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object a = assignParameter(args, 0, false);
                                Object b = assignParameter(args, 1, false);
                                Object bIndex = null;
                                Object aIndex = null;
                                aIndex =
                                        function_array_search
                                                .f
                                                .env(env)
                                                .call(
                                                        a,
                                                        env.getRequestStaticProperties(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Psy
                                                                                .namespaces
                                                                                .Command
                                                                                .namespaces
                                                                                .ListCommand
                                                                                .classes
                                                                                .VariableEnumerator
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .specialNames)
                                                .value();
                                bIndex =
                                        function_array_search
                                                .f
                                                .env(env)
                                                .call(
                                                        b,
                                                        env.getRequestStaticProperties(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Psy
                                                                                .namespaces
                                                                                .Command
                                                                                .namespaces
                                                                                .ListCommand
                                                                                .classes
                                                                                .VariableEnumerator
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .specialNames)
                                                .value();
                                if (ZVal.strictNotEqualityCheck(aIndex, "!==", false)) {
                                    if (ZVal.strictNotEqualityCheck(bIndex, "!==", false)) {
                                        return ZVal.assign(ZVal.subtract(aIndex, bIndex));
                                    }

                                    return 1;
                                }

                                if (ZVal.strictNotEqualityCheck(bIndex, "!==", false)) {
                                    return -1;
                                }

                                return ZVal.assign(
                                        NamespaceGlobal.strnatcasecmp.env(env).call(a, b).value());
                            }
                        });
        ret.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1382 : ZVal.getIterable(scopeVars, env, false)) {
            name = ZVal.assign(zpairResult1382.getKey());
            val = ZVal.assign(zpairResult1382.getValue());
            if (ZVal.toBool(!ZVal.isTrue(showAll))
                    && ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            name,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Psy
                                                                    .namespaces
                                                                    .Command
                                                                    .namespaces
                                                                    .ListCommand
                                                                    .classes
                                                                    .VariableEnumerator
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .specialNames)
                                    .value())) {
                continue;
            }

            ret.arrayAccess(env, name).set(val);
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variables", typeHint = "array")
    protected Object prepareVariables(RuntimeEnv env, Object... args) {
        Object variables = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object val = null;
        Object fname = null;
        Object name = null;
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1383 : ZVal.getIterable(variables, env, false)) {
            name = ZVal.assign(zpairResult1383.getKey());
            val = ZVal.assign(zpairResult1383.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", VariableEnumerator.class, name))) {
                fname = "$" + toStringR(name, env);
                ret.arrayAccess(env, fname)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", fname),
                                        new ZPair(
                                                "style",
                                                function_in_array
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        name,
                                                                        env
                                                                                .getRequestStaticProperties(
                                                                                        com.project
                                                                                                .convertedCode
                                                                                                .globalNamespace
                                                                                                .namespaces
                                                                                                .Psy
                                                                                                .namespaces
                                                                                                .Command
                                                                                                .namespaces
                                                                                                .ListCommand
                                                                                                .classes
                                                                                                .VariableEnumerator
                                                                                                .RequestStaticProperties
                                                                                                .class)
                                                                                .specialNames)
                                                                .getBool()
                                                        ? CONST_IS_PRIVATE
                                                        : CONST_IS_PUBLIC),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentRef",
                                                        VariableEnumerator.class,
                                                        val))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\VariableEnumerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Enumerator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object specialNames =
                ZVal.arrayFromList(
                        "_",
                        "_e",
                        "__out",
                        "__function",
                        "__method",
                        "__class",
                        "__namespace",
                        "__file",
                        "__line",
                        "__dir");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ListCommand\\VariableEnumerator")
                    .setLookup(
                            VariableEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context", "filter", "presenter")
                    .setStaticPropertyNames("specialNames")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/VariableEnumerator.php")
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
