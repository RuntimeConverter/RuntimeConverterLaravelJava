package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeUnitReverseLookup.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_functions;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/code-unit-reverse-lookup/src/Wizard.php

*/

public class Wizard extends RuntimeClassBase {

    public Object lookupTable = ZVal.newArray();

    public Object processedClasses = ZVal.newArray();

    public Object processedFunctions = ZVal.newArray();

    public Wizard(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Wizard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    @ConvertedParameter(index = 1, name = "lineNumber")
    public Object lookup(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        Object lineNumber = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "lookupTable", env),
                env,
                filename,
                lineNumber)) {
            this.updateLookupTable(env);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "lookupTable", env),
                env,
                filename,
                lineNumber)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "lookupTable", env)
                            .arrayGet(env, filename, lineNumber));

        } else {
            return ZVal.assign(toStringR(filename, env) + ":" + toStringR(lineNumber, env));
        }
    }

    @ConvertedMethod
    private Object updateLookupTable(RuntimeEnv env, Object... args) {
        this.processClassesAndTraits(env);
        this.processFunctions(env);
        return null;
    }

    @ConvertedMethod
    private Object processClassesAndTraits(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object classOrTrait = null;
        Object method = null;
        Object reflector = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1429 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        function_get_declared_classes.f.env(env).call().value(),
                                        NamespaceGlobal.get_declared_traits.env(env).call().value())
                                .value(),
                        env,
                        true)) {
            classOrTrait = ZVal.assign(zpairResult1429.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "processedClasses", env),
                    env,
                    classOrTrait)) {
                continue;
            }

            reflector = new ReflectionClass(env, classOrTrait);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1430 :
                    ZVal.getIterable(
                            env.callMethod(reflector, "getMethods", Wizard.class), env, true)) {
                method = ZVal.assign(zpairResult1430.getValue());
                this.processFunctionOrMethod(env, method);
            }

            new ReferenceClassProperty(this, "processedClasses", env)
                    .arrayAccess(env, classOrTrait)
                    .set(true);
        }

        return null;
    }

    @ConvertedMethod
    private Object processFunctions(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object function = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1431 :
                ZVal.getIterable(
                        handleReturnReference(
                                        function_get_defined_functions.f.env(env).call().value())
                                .arrayGet(env, "user"),
                        env,
                        true)) {
            function = ZVal.assign(zpairResult1431.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "processedFunctions", env),
                    env,
                    function)) {
                continue;
            }

            this.processFunctionOrMethod(env, new ReflectionFunction(env, function));
            new ReferenceClassProperty(this, "processedFunctions", env)
                    .arrayAccess(env, function)
                    .set(true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "functionOrMethod",
        typeHint = "ReflectionFunctionAbstract"
    )
    private Object processFunctionOrMethod(RuntimeEnv env, Object... args) {
        Object functionOrMethod = assignParameter(args, 0, false);
        Object line = null;
        Object name = null;
        if (ZVal.isTrue(env.callMethod(functionOrMethod, "isInternal", Wizard.class))) {
            return null;
        }

        name = env.callMethod(functionOrMethod, "getName", Wizard.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        functionOrMethod, ReflectionMethod.class, "ReflectionMethod"))) {
            name =
                    toStringR(
                                    env.callMethod(
                                            env.callMethod(
                                                    functionOrMethod,
                                                    "getDeclaringClass",
                                                    Wizard.class),
                                            "getName",
                                            Wizard.class),
                                    env)
                            + "::"
                            + toStringR(name, env);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "lookupTable", env),
                env,
                env.callMethod(functionOrMethod, "getFileName", Wizard.class))) {
            new ReferenceClassProperty(this, "lookupTable", env)
                    .arrayAccess(env, env.callMethod(functionOrMethod, "getFileName", Wizard.class))
                    .set(ZVal.newArray());
        }

        for (ZPair zpairResult1432 :
                ZVal.getIterable(
                        function_range
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                functionOrMethod, "getStartLine", Wizard.class),
                                        env.callMethod(
                                                functionOrMethod, "getEndLine", Wizard.class))
                                .value(),
                        env,
                        true)) {
            line = ZVal.assign(zpairResult1432.getValue());
            new ReferenceClassProperty(this, "lookupTable", env)
                    .arrayAccess(
                            env,
                            env.callMethod(functionOrMethod, "getFileName", Wizard.class),
                            line)
                    .set(name);
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeUnitReverseLookup\\Wizard";

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
                    .setName("SebastianBergmann\\CodeUnitReverseLookup\\Wizard")
                    .setLookup(
                            Wizard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("lookupTable", "processedClasses", "processedFunctions")
                    .setFilename("vendor/sebastian/code-unit-reverse-lookup/src/Wizard.php")
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
