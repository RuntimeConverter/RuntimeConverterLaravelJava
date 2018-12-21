package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/Exception/FatalErrorException.php

*/

public class FatalErrorException extends ErrorException {

    public FatalErrorException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FatalErrorException.class) {
            this.__construct(env, args);
        }
    }

    public FatalErrorException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "code", typeHint = "int")
    @ConvertedParameter(index = 2, name = "severity", typeHint = "int")
    @ConvertedParameter(index = 3, name = "filename", typeHint = "string")
    @ConvertedParameter(index = 4, name = "lineno", typeHint = "int")
    @ConvertedParameter(
        index = 5,
        name = "traceOffset",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "traceArgs",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "trace",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "previous",
        typeHint = "Throwable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        Object severity = assignParameter(args, 2, false);
        Object filename = assignParameter(args, 3, false);
        Object lineno = assignParameter(args, 4, false);
        Object traceOffset = assignParameter(args, 5, true);
        if (null == traceOffset) {
            traceOffset = ZVal.getNull();
        }
        Object traceArgs = assignParameter(args, 6, true);
        if (null == traceArgs) {
            traceArgs = true;
        }
        Object trace = assignParameter(args, 7, true);
        if (null == trace) {
            trace = ZVal.getNull();
        }
        Object previous = assignParameter(args, 8, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        ReferenceContainer frame = new BasicReferenceContainer(null);
        super.__construct(env, message, code, severity, filename, lineno, previous);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", trace)) {
            if (!ZVal.isTrue(traceArgs)) {
                for (ZPair zpairResult1778 : ZVal.getIterable(trace, env, true)) {
                    frame = zpairResult1778;
                    arrayActionR(ArrayAction.UNSET, frame, env, "args");
                    arrayActionR(ArrayAction.UNSET, frame, env, "this");
                    frame.setObject(null);
                }
            }

            this.setTrace(env, trace);

        } else if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", traceOffset)) {
            if (function_function_exists.f.env(env).call("xdebug_get_function_stack").getBool()) {
                trace =
                        com.runtimeconverter.runtime.ZVal.functionNotFound(
                                        "xdebug_get_function_stack")
                                .env(env)
                                .call()
                                .value();
                if (ZVal.isLessThan(0, '<', traceOffset)) {
                    function_array_splice.f.env(env).call(trace, ZVal.minusSign(traceOffset));
                }

                for (ZPair zpairResult1779 : ZVal.getIterable(trace, env, true)) {
                    frame = zpairResult1779;
                    if (!arrayActionR(ArrayAction.ISSET, frame, env, "type")) {
                        if (arrayActionR(ArrayAction.ISSET, frame, env, "class")) {
                            frame.arrayAccess(env, "type").set("::");
                        }

                    } else if (ZVal.strictEqualityCheck(
                            "dynamic", "===", frame.arrayGet(env, "type"))) {
                        frame.arrayAccess(env, "type").set("->");

                    } else if (ZVal.strictEqualityCheck(
                            "static", "===", frame.arrayGet(env, "type"))) {
                        frame.arrayAccess(env, "type").set("::");
                    }

                    if (!ZVal.isTrue(traceArgs)) {
                        arrayActionR(ArrayAction.UNSET, frame, env, "params");
                        arrayActionR(ArrayAction.UNSET, frame, env, "args");

                    } else if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, frame, env, "params"))
                            && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, frame, env, "args"))) {
                        frame.arrayAccess(env, "args").set(frame.arrayGet(env, "params"));
                        arrayActionR(ArrayAction.UNSET, frame, env, "params");
                    }
                }

                frame.setObject(null);
                trace = function_array_reverse.f.env(env).call(trace).value();

            } else {
                trace = ZVal.newArray();
            }

            this.setTrace(env, trace);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trace")
    protected Object setTrace(RuntimeEnv env, Object... args) {
        Object trace = assignParameter(args, 0, false);
        Object traceReflector = null;
        traceReflector = new ReflectionProperty(env, "Exception", "trace");
        env.callMethod(traceReflector, "setAccessible", FatalErrorException.class, true);
        env.callMethod(traceReflector, "setValue", FatalErrorException.class, this, trace);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\Exception\\FatalErrorException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ErrorException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\Exception\\FatalErrorException")
                    .setLookup(
                            FatalErrorException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/debug/Exception/FatalErrorException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("ErrorException")
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
