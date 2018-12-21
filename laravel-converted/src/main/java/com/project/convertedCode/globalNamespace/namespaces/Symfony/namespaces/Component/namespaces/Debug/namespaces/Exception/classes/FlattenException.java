package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeClasses.spl.misc.ArrayObject;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Exception.classes.RequestExceptionInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpExceptionInterface;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.__PHP_Incomplete_Class;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/Exception/FlattenException.php

*/

public class FlattenException extends RuntimeClassBase {

    public Object message = null;

    public Object code = null;

    public Object previous = null;

    public Object trace = null;

    public Object _pClass = null;

    public Object statusCode = null;

    public Object headers = null;

    public Object file = null;

    public Object line = null;

    public FlattenException(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FlattenException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        Object exception = null;
        ReferenceContainer exceptions = new BasicReferenceContainer(null);
        exceptions.setObject(ZVal.newArray());
        for (ZPair zpairResult1780 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(ZVal.newArray(new ZPair(0, this)), this.getAllPrevious(env))
                                .value(),
                        env,
                        true)) {
            exception = ZVal.assign(zpairResult1780.getValue());
            exceptions
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "message",
                                            env.callMethod(
                                                    exception,
                                                    "getMessage",
                                                    FlattenException.class)),
                                    new ZPair(
                                            "class",
                                            env.callMethod(
                                                    exception, "getClass", FlattenException.class)),
                                    new ZPair(
                                            "trace",
                                            env.callMethod(
                                                    exception,
                                                    "getTrace",
                                                    FlattenException.class))));
        }

        return ZVal.assign(exceptions.getObject());
    }

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.statusCode);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object setStatusCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        this.statusCode = code;
        return null;
    }

    @ConvertedMethod
    public Object getHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.headers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    public Object setHeaders(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        this.headers = headers;
        return null;
    }

    @ConvertedMethod
    public Object getClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pClass);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object setClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this._pClass = _pClass;
        return null;
    }

    @ConvertedMethod
    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.file);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object setFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        this.file = file;
        return null;
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.line);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object setLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        this.line = line;
        return null;
    }

    @ConvertedMethod
    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object setMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.message = message;
        return null;
    }

    @ConvertedMethod
    public Object getCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object setCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        this.code = code;
        return null;
    }

    @ConvertedMethod
    public Object getPrevious(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.previous);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "previous", typeHint = "self")
    public Object setPrevious(RuntimeEnv env, Object... args) {
        Object previous = assignParameter(args, 0, false);
        this.previous = previous;
        return null;
    }

    @ConvertedMethod
    public Object getAllPrevious(RuntimeEnv env, Object... args) {
        Object e = null;
        ReferenceContainer exceptions = new BasicReferenceContainer(null);
        exceptions.setObject(ZVal.newArray());
        e = ZVal.assign(this);
        while (ZVal.isTrue(e = env.callMethod(e, "getPrevious", FlattenException.class))) {
            exceptions.arrayAppend(env).set(e);
        }

        return ZVal.assign(exceptions.getObject());
    }

    @ConvertedMethod
    public Object getTrace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.trace);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object setTraceFromException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "\"%s\" is deprecated since Symfony 4.1, use \"setTraceFromThrowable()\" instead.",
                                        "FlattenException::setTraceFromException")
                                .value(),
                        16384)
                .value();
        this.setTraceFromThrowable(env, exception);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "throwable", typeHint = "Throwable")
    public Object setTraceFromThrowable(RuntimeEnv env, Object... args) {
        Object throwable = assignParameter(args, 0, false);
        this.setTrace(
                env,
                env.callMethod(throwable, "getTrace", FlattenException.class),
                env.callMethod(throwable, "getFile", FlattenException.class),
                env.callMethod(throwable, "getLine", FlattenException.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trace")
    @ConvertedParameter(index = 1, name = "file")
    @ConvertedParameter(index = 2, name = "line")
    public Object setTrace(RuntimeEnv env, Object... args) {
        Object trace = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object line = assignParameter(args, 2, false);
        ReferenceContainer entry = new BasicReferenceContainer(null);
        Object namespace = null;
        Object parts = null;
        Object _pClass = null;
        this.trace = ZVal.newArray();
        new ReferenceClassProperty(this, "trace", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair("namespace", ""),
                                new ZPair("short_class", ""),
                                new ZPair("class", ""),
                                new ZPair("type", ""),
                                new ZPair("function", ""),
                                new ZPair("file", file),
                                new ZPair("line", line),
                                new ZPair("args", ZVal.newArray())));
        for (ZPair zpairResult1781 : ZVal.getIterable(trace, env, true)) {
            entry.setObject(ZVal.assign(zpairResult1781.getValue()));
            _pClass = "";
            namespace = "";
            if (arrayActionR(ArrayAction.ISSET, entry, env, "class")) {
                parts =
                        function_explode
                                .f
                                .env(env)
                                .call("\\", entry.arrayGet(env, "class"))
                                .value();
                _pClass = function_array_pop.f.env(env).call(parts).value();
                namespace = NamespaceGlobal.implode.env(env).call("\\", parts).value();
            }

            new ReferenceClassProperty(this, "trace", env)
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair("namespace", namespace),
                                    new ZPair("short_class", _pClass),
                                    new ZPair(
                                            "class",
                                            arrayActionR(ArrayAction.ISSET, entry, env, "class")
                                                    ? entry.arrayGet(env, "class")
                                                    : ""),
                                    new ZPair(
                                            "type",
                                            arrayActionR(ArrayAction.ISSET, entry, env, "type")
                                                    ? entry.arrayGet(env, "type")
                                                    : ""),
                                    new ZPair(
                                            "function",
                                            arrayActionR(ArrayAction.ISSET, entry, env, "function")
                                                    ? entry.arrayGet(env, "function")
                                                    : ZVal.getNull()),
                                    new ZPair(
                                            "file",
                                            arrayActionR(ArrayAction.ISSET, entry, env, "file")
                                                    ? entry.arrayGet(env, "file")
                                                    : ZVal.getNull()),
                                    new ZPair(
                                            "line",
                                            arrayActionR(ArrayAction.ISSET, entry, env, "line")
                                                    ? entry.arrayGet(env, "line")
                                                    : ZVal.getNull()),
                                    new ZPair(
                                            "args",
                                            arrayActionR(ArrayAction.ISSET, entry, env, "args")
                                                    ? env.callMethod(
                                                            this,
                                                            "flattenArgs",
                                                            FlattenException.class,
                                                            entry.arrayGet(env, "args"))
                                                    : ZVal.newArray())));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    @ConvertedParameter(index = 1, name = "level", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "count", defaultValue = "0", defaultValueType = "number")
    private Object flattenArgs(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = 0;
        }
        ReferenceContainer count = assignParameterRef(runtimePassByReferenceArgs, args, 2, true);
        if (null == count.getObject()) {
            count.setObject(0);
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult1782 : ZVal.getIterable(___args, env, false)) {
            key = ZVal.assign(zpairResult1782.getKey());
            value = ZVal.assign(zpairResult1782.getValue());
            if (ZVal.isGreaterThan(ZVal.preIncrement(count), '>', 10000.0)) {
                return ZVal.assign(ZVal.arrayFromList("array", "*SKIPPED over 10000 entries*"));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value, __PHP_Incomplete_Class.class, "__PHP_Incomplete_Class"))) {
                result.arrayAccess(env, key)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "incomplete-object"),
                                        new ZPair(1, this.getClassNameFromIncomplete(env, value))));

            } else if (function_is_object.f.env(env).call(value).getBool()) {
                result.arrayAccess(env, key)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "object"),
                                        new ZPair(
                                                1,
                                                function_get_class
                                                        .f
                                                        .env(env)
                                                        .call(value)
                                                        .value())));

            } else if (function_is_array.f.env(env).call(value).getBool()) {
                if (ZVal.isGreaterThan(level, '>', 10)) {
                    result.arrayAccess(env, key)
                            .set(ZVal.arrayFromList("array", "*DEEP NESTED ARRAY*"));

                } else {
                    result.arrayAccess(env, key)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(0, "array"),
                                            new ZPair(
                                                    1,
                                                    env.callMethod(
                                                            this,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(2, count),
                                                            "flattenArgs",
                                                            FlattenException.class,
                                                            value,
                                                            ZVal.add(level, 1),
                                                            count.getObject()))));
                }

            } else if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                result.arrayAccess(env, key)
                        .set(ZVal.newArray(new ZPair(0, "null"), new ZPair(1, ZVal.getNull())));

            } else if (function_is_bool.f.env(env).call(value).getBool()) {
                result.arrayAccess(env, key)
                        .set(ZVal.newArray(new ZPair(0, "boolean"), new ZPair(1, value)));

            } else if (function_is_int.f.env(env).call(value).getBool()) {
                result.arrayAccess(env, key)
                        .set(ZVal.newArray(new ZPair(0, "integer"), new ZPair(1, value)));

            } else if (function_is_float.f.env(env).call(value).getBool()) {
                result.arrayAccess(env, key)
                        .set(ZVal.newArray(new ZPair(0, "float"), new ZPair(1, value)));

            } else if (function_is_resource.f.env(env).call(value).getBool()) {
                result.arrayAccess(env, key)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "resource"),
                                        new ZPair(
                                                1,
                                                NamespaceGlobal.get_resource_type
                                                        .env(env)
                                                        .call(value)
                                                        .value())));

            } else {
                result.arrayAccess(env, key)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, "string"),
                                        new ZPair(1, toStringR(value, env))));
            }
        }

        return ZVal.assign(result.getObject());
    }

    public Object flattenArgs(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "__PHP_Incomplete_Class")
    private Object getClassNameFromIncomplete(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        ReferenceContainer array = new BasicReferenceContainer(null);
        array.setObject(new ArrayObject(env, value));
        return ZVal.assign(array.arrayGet(env, "__PHP_Incomplete_Class_Name"));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\Exception\\FlattenException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
        @ConvertedParameter(
            index = 1,
            name = "statusCode",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object exception = assignParameter(args, 0, false);
            Object statusCode = assignParameter(args, 1, true);
            if (null == statusCode) {
                statusCode = ZVal.getNull();
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                    env, this, FlattenException.class)
                            .method("createFromThrowable")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(exception, statusCode, headers)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "exception", typeHint = "Throwable")
        @ConvertedParameter(
            index = 1,
            name = "statusCode",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object createFromThrowable(RuntimeEnv env, Object... args) {
            Object exception = assignParameter(args, 0, false);
            Object statusCode = assignParameter(args, 1, true);
            if (null == statusCode) {
                statusCode = ZVal.getNull();
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            Object previous = null;
            Object e = null;
            e = env.createNewWithLateStaticBindings(this);
            env.callMethod(
                    e,
                    "setMessage",
                    FlattenException.class,
                    env.callMethod(exception, "getMessage", FlattenException.class));
            env.callMethod(
                    e,
                    "setCode",
                    FlattenException.class,
                    env.callMethod(exception, "getCode", FlattenException.class));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            exception,
                            HttpExceptionInterface.class,
                            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface"))) {
                statusCode = env.callMethod(exception, "getStatusCode", FlattenException.class);
                headers =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        headers,
                                        env.callMethod(
                                                exception, "getHeaders", FlattenException.class))
                                .value();

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            exception,
                            RequestExceptionInterface.class,
                            "Symfony\\Component\\HttpFoundation\\Exception\\RequestExceptionInterface"))) {
                statusCode = 400;
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", statusCode)) {
                statusCode = 500;
            }

            env.callMethod(e, "setStatusCode", FlattenException.class, statusCode);
            env.callMethod(e, "setHeaders", FlattenException.class, headers);
            env.callMethod(e, "setTraceFromThrowable", FlattenException.class, exception);
            env.callMethod(
                    e,
                    "setClass",
                    FlattenException.class,
                    ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            exception,
                                            FatalThrowableError.class,
                                            "Symfony\\Component\\Debug\\Exception\\FatalThrowableError"))
                            ? env.callMethod(
                                    exception, "getOriginalClassName", FlattenException.class)
                            : function_get_class.f.env(env).call(exception).value());
            env.callMethod(
                    e,
                    "setFile",
                    FlattenException.class,
                    env.callMethod(exception, "getFile", FlattenException.class));
            env.callMethod(
                    e,
                    "setLine",
                    FlattenException.class,
                    env.callMethod(exception, "getLine", FlattenException.class));
            previous = env.callMethod(exception, "getPrevious", FlattenException.class);
            if (ZVal.isTrue(ZVal.checkInstanceType(previous, Throwable.class, "Throwable"))) {
                env.callMethod(
                        e,
                        "setPrevious",
                        FlattenException.class,
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, FlattenException.class)
                                .method("createFromThrowable")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(previous)
                                .value());
            }

            return ZVal.assign(e);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\Exception\\FlattenException")
                    .setLookup(
                            FlattenException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "class",
                            "code",
                            "file",
                            "headers",
                            "line",
                            "message",
                            "previous",
                            "statusCode",
                            "trace")
                    .setFilename("vendor/symfony/debug/Exception/FlattenException.php")
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
