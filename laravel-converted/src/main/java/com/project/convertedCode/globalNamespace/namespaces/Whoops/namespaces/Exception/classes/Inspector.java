package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.FrameCollection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes.Misc;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Exception/Inspector.php

*/

public class Inspector extends RuntimeClassBase {

    public Object exception = null;

    public Object frames = null;

    public Object previousExceptionInspector = null;

    public Inspector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Inspector.class) {
            this.__construct(env, args);
        }
    }

    public Inspector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        this.exception = exception;
        return null;
    }

    @ConvertedMethod
    public Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exception);
    }

    @ConvertedMethod
    public Object getExceptionName(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_get_class.f.env(env).call(this.exception).value());
    }

    @ConvertedMethod
    public Object getExceptionMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(
                                this.extractDocrefUrl(
                                        env,
                                        env.callMethod(
                                                this.exception, "getMessage", Inspector.class)))
                        .arrayGet(env, "message"));
    }

    @ConvertedMethod
    public Object getExceptionDocrefUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(
                                this.extractDocrefUrl(
                                        env,
                                        env.callMethod(
                                                this.exception, "getMessage", Inspector.class)))
                        .arrayGet(env, "url"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    private Object extractDocrefUrl(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer docref = new BasicReferenceContainer(null);
        Object pattern = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        docref.setObject(
                ZVal.newArray(new ZPair("message", message), new ZPair("url", ZVal.getNull())));
        if (ZVal.toBool(!function_ini_get.f.env(env).call("html_errors").getBool())
                || ZVal.toBool(!function_ini_get.f.env(env).call("docref_root").getBool())) {
            return ZVal.assign(docref.getObject());
        }

        pattern = "/\\[<a href='([^']+)'>(?:[^<]+)<\\/a>\\]/";
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(pattern, message, matches.getObject())
                .getBool()) {
            docref.arrayAccess(env, "message")
                    .set(function_preg_replace.f.env(env).call(pattern, "", message, 1).value());
            docref.arrayAccess(env, "url").set(matches.arrayGet(env, 1));
        }

        return ZVal.assign(docref.getObject());
    }

    @ConvertedMethod
    public Object hasPreviousException(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.previousExceptionInspector)
                        || ZVal.toBool(
                                env.callMethod(this.exception, "getPrevious", Inspector.class)));
    }

    @ConvertedMethod
    public Object getPreviousExceptionInspector(RuntimeEnv env, Object... args) {
        Object previousException = null;
        if (ZVal.strictEqualityCheck(this.previousExceptionInspector, "===", ZVal.getNull())) {
            previousException = env.callMethod(this.exception, "getPrevious", Inspector.class);
            if (ZVal.isTrue(previousException)) {
                this.previousExceptionInspector =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Whoops
                                .namespaces
                                .Exception
                                .classes
                                .Inspector(env, previousException);
            }
        }

        return ZVal.assign(this.previousExceptionInspector);
    }

    @ConvertedMethod
    public Object getFrames(RuntimeEnv env, Object... args) {
        Object outerFrames = null;
        Object file = null;
        ReferenceContainer frames = new BasicReferenceContainer(null);
        Object firstFrame = null;
        Object line = null;
        Object previousInspector = null;
        Object i = null;
        Object k = null;
        ReferenceContainer next_frame = new BasicReferenceContainer(null);
        ReferenceContainer newFrames = new BasicReferenceContainer(null);
        ReferenceContainer frame = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(this.frames, "===", ZVal.getNull())) {
            frames.setObject(this.getTrace(env, this.exception));
            for (ZPair zpairResult43 : ZVal.getIterable(frames.getObject(), env, false)) {
                k = ZVal.assign(zpairResult43.getKey());
                frame.setObject(ZVal.assign(zpairResult43.getValue()));
                if (arrayActionR(ArrayAction.EMPTY, frame, env, "file")) {
                    file = "[internal]";
                    line = 0;
                    next_frame.setObject(
                            ZVal.assign(
                                    !arrayActionR(ArrayAction.EMPTY, frames, env, ZVal.add(k, 1))
                                            ? frames.arrayGet(env, ZVal.add(k, 1))
                                            : ZVal.newArray()));
                    if (ZVal.isTrue(this.isValidNextFrame(env, next_frame.getObject()))) {
                        file = ZVal.assign(next_frame.arrayGet(env, "file"));
                        line = ZVal.assign(next_frame.arrayGet(env, "line"));
                    }

                    frames.arrayAccess(env, k, "file").set(file);
                    frames.arrayAccess(env, k, "line").set(line);
                }
            }

            i = 0;
            for (ZPair zpairResult44 : ZVal.getIterable(frames.getObject(), env, false)) {
                k = ZVal.assign(zpairResult44.getKey());
                frame.setObject(ZVal.assign(zpairResult44.getValue()));
                if (ZVal.toBool(
                                ZVal.equalityCheck(
                                        frame.arrayGet(env, "file"),
                                        env.callMethod(this.exception, "getFile", Inspector.class)))
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        frame.arrayGet(env, "line"),
                                        env.callMethod(
                                                this.exception, "getLine", Inspector.class)))) {
                    i = ZVal.assign(k);
                }
            }

            if (ZVal.isGreaterThan(i, '>', 0)) {
                function_array_splice.f.env(env).call(frames.getObject(), 0, i);
            }

            firstFrame = this.getFrameFromException(env, this.exception);
            function_array_unshift.f.env(env).call(frames.getObject(), firstFrame);
            this.frames = new FrameCollection(env, frames.getObject());
            if (ZVal.isTrue(previousInspector = this.getPreviousExceptionInspector(env))) {
                outerFrames = ZVal.assign(this.frames);
                newFrames.setObject(
                        ZVal.assign(
                                ((RuntimeClassInterface)
                                                env.callMethod(
                                                        previousInspector,
                                                        "getFrames",
                                                        Inspector.class))
                                        .phpClone(env)));
                if (arrayActionR(ArrayAction.ISSET, newFrames, env, 0)) {
                    env.callMethod(
                            newFrames.arrayGet(env, 0),
                            "addComment",
                            Inspector.class,
                            env.callMethod(
                                    previousInspector, "getExceptionMessage", Inspector.class),
                            "Exception message:");
                }

                env.callMethod(
                        newFrames.getObject(),
                        "prependFrames",
                        Inspector.class,
                        env.callMethod(
                                outerFrames, "topDiff", Inspector.class, newFrames.getObject()));
                this.frames = newFrames.getObject();
            }
        }

        return ZVal.assign(this.frames);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    protected Object getTrace(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object stack = null;
        Object trace = null;
        Object traces = null;
        traces = env.callMethod(e, "getTrace", Inspector.class);
        if (!ZVal.isTrue(ZVal.checkInstanceType(e, ErrorException.class, "ErrorException"))) {
            return ZVal.assign(traces);
        }

        if (!ZVal.isTrue(
                Misc.runtimeStaticObject.isLevelFatal(
                        env, env.callMethod(e, "getSeverity", Inspector.class)))) {
            return ZVal.assign(traces);
        }

        if (ZVal.toBool(!function_extension_loaded.f.env(env).call("xdebug").getBool())
                || ZVal.toBool(
                        !com.runtimeconverter.runtime.ZVal.functionNotFound("xdebug_is_enabled")
                                .env(env)
                                .call()
                                .getBool())) {
            return ZVal.assign(ZVal.newArray());
        }

        stack =
                function_array_reverse
                        .f
                        .env(env)
                        .call(
                                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                                "xdebug_get_function_stack")
                                        .env(env)
                                        .call()
                                        .value())
                        .value();
        trace = NamespaceGlobal.debug_backtrace.env(env).call(2).value();
        traces = function_array_diff_key.f.env(env).call(stack, trace).value();
        return ZVal.assign(traces);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    protected Object getFrameFromException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("file", env.callMethod(exception, "getFile", Inspector.class)),
                        new ZPair("line", env.callMethod(exception, "getLine", Inspector.class)),
                        new ZPair("class", function_get_class.f.env(env).call(exception).value()),
                        new ZPair(
                                "args",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        exception,
                                                        "getMessage",
                                                        Inspector.class))))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exception",
        typeHint = "Whoops\\Exception\\ErrorException"
    )
    protected Object getFrameFromError(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("file", env.callMethod(exception, "getFile", Inspector.class)),
                        new ZPair("line", env.callMethod(exception, "getLine", Inspector.class)),
                        new ZPair("class", ZVal.getNull()),
                        new ZPair("args", ZVal.newArray())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frame", typeHint = "array")
    protected Object isValidNextFrame(RuntimeEnv env, Object... args) {
        ReferenceContainer frame = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (arrayActionR(ArrayAction.EMPTY, frame, env, "file")) {
            return ZVal.assign(false);
        }

        if (arrayActionR(ArrayAction.EMPTY, frame, env, "line")) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.EMPTY, frame, env, "function"))
                || ZVal.toBool(
                        !NamespaceGlobal.stristr
                                .env(env)
                                .call(frame.arrayGet(env, "function"), "call_user_func")
                                .getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "Whoops\\Exception\\Inspector";

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
                    .setName("Whoops\\Exception\\Inspector")
                    .setLookup(
                            Inspector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "frames", "previousExceptionInspector")
                    .setFilename("vendor/filp/whoops/src/Whoops/Exception/Inspector.php")
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
