package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Exception/Formatter.php

*/

public class Formatter extends RuntimeClassBase {

    public Formatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Formatter(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Whoops\\Exception\\Formatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "inspector",
            typeHint = "Whoops\\Exception\\Inspector"
        )
        @ConvertedParameter(index = 1, name = "shouldAddTrace")
        public Object formatExceptionAsDataArray(RuntimeEnv env, Object... args) {
            Object inspector = assignParameter(args, 0, false);
            Object shouldAddTrace = assignParameter(args, 1, false);
            Object exception = null;
            ReferenceContainer frameData = new BasicReferenceContainer(null);
            Object frames = null;
            ReferenceContainer response = new BasicReferenceContainer(null);
            Object frame = null;
            exception = env.callMethod(inspector, "getException", Formatter.class);
            response.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "type", function_get_class.f.env(env).call(exception).value()),
                            new ZPair(
                                    "message",
                                    env.callMethod(exception, "getMessage", Formatter.class)),
                            new ZPair(
                                    "file", env.callMethod(exception, "getFile", Formatter.class)),
                            new ZPair(
                                    "line",
                                    env.callMethod(exception, "getLine", Formatter.class))));
            if (ZVal.isTrue(shouldAddTrace)) {
                frames = env.callMethod(inspector, "getFrames", Formatter.class);
                frameData.setObject(ZVal.newArray());
                for (ZPair zpairResult41 : ZVal.getIterable(frames, env, true)) {
                    frame = ZVal.assign(zpairResult41.getValue());
                    frameData
                            .arrayAppend(env)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    "file",
                                                    env.callMethod(
                                                            frame, "getFile", Formatter.class)),
                                            new ZPair(
                                                    "line",
                                                    env.callMethod(
                                                            frame, "getLine", Formatter.class)),
                                            new ZPair(
                                                    "function",
                                                    env.callMethod(
                                                            frame, "getFunction", Formatter.class)),
                                            new ZPair(
                                                    "class",
                                                    env.callMethod(
                                                            frame, "getClass", Formatter.class)),
                                            new ZPair(
                                                    "args",
                                                    env.callMethod(
                                                            frame, "getArgs", Formatter.class))));
                }

                response.arrayAccess(env, "trace").set(frameData.getObject());
            }

            return ZVal.assign(response.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "inspector",
            typeHint = "Whoops\\Exception\\Inspector"
        )
        public Object formatExceptionPlain(RuntimeEnv env, Object... args) {
            Object inspector = assignParameter(args, 0, false);
            Object frames = null;
            Object plain = null;
            Object i = null;
            Object ternaryExpressionTemp = null;
            Object message = null;
            Object frame = null;
            message =
                    env.callMethod(
                            env.callMethod(inspector, "getException", Formatter.class),
                            "getMessage",
                            Formatter.class);
            frames = env.callMethod(inspector, "getFrames", Formatter.class);
            plain = env.callMethod(inspector, "getExceptionName", Formatter.class);
            plain = toStringR(plain, env) + " thrown with message \"";
            plain = toStringR(plain, env) + toStringR(message, env);
            plain = toStringR(plain, env) + "\"" + "\n\n";
            plain = toStringR(plain, env) + "Stacktrace:\n";
            for (ZPair zpairResult42 : ZVal.getIterable(frames, env, false)) {
                i = ZVal.assign(zpairResult42.getKey());
                frame = ZVal.assign(zpairResult42.getValue());
                plain =
                        toStringR(plain, env)
                                + "#"
                                + toStringR(
                                        ZVal.subtract(
                                                ZVal.subtract(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(frames)
                                                                .value(),
                                                        i),
                                                1),
                                        env)
                                + " ";
                plain =
                        toStringR(plain, env)
                                + toStringR(
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                env.callMethod(
                                                                        frame,
                                                                        "getClass",
                                                                        Formatter.class))
                                                ? ternaryExpressionTemp
                                                : "",
                                        env);
                plain =
                        toStringR(plain, env)
                                + toStringR(
                                        ZVal.toBool(
                                                                env.callMethod(
                                                                        frame,
                                                                        "getClass",
                                                                        Formatter.class))
                                                        && ZVal.toBool(
                                                                env.callMethod(
                                                                        frame,
                                                                        "getFunction",
                                                                        Formatter.class))
                                                ? ":"
                                                : "",
                                        env);
                plain =
                        toStringR(plain, env)
                                + toStringR(
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                env.callMethod(
                                                                        frame,
                                                                        "getFunction",
                                                                        Formatter.class))
                                                ? ternaryExpressionTemp
                                                : "",
                                        env);
                plain = toStringR(plain, env) + " in ";
                plain =
                        toStringR(plain, env)
                                + toStringR(
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                env.callMethod(
                                                                        frame,
                                                                        "getFile",
                                                                        Formatter.class))
                                                ? ternaryExpressionTemp
                                                : "<#unknown>",
                                        env);
                plain = toStringR(plain, env) + ":";
                plain =
                        toStringR(plain, env)
                                + toStringR(
                                        ZVal.toLong(
                                                env.callMethod(frame, "getLine", Formatter.class)),
                                        env)
                                + "\n";
            }

            return ZVal.assign(plain);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Exception\\Formatter")
                    .setLookup(
                            Formatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/filp/whoops/src/Whoops/Exception/Formatter.php")
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
