package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.SilencedErrorContext;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.TraceStub;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.FrameStub;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ArgsStub;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ClassStub;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/ExceptionCaster.php

*/

public class ExceptionCaster extends RuntimeClassBase {

    public ExceptionCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ExceptionCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "Error")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castError(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            return ZVal.assign(
                    runtimeStaticObject.filterExceptionArray(
                            env,
                            toObjectR(stub).accessProp(this, env).name("class").value(),
                            a,
                            "\u0000Error\u0000",
                            filter));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castException(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            return ZVal.assign(
                    runtimeStaticObject.filterExceptionArray(
                            env,
                            toObjectR(stub).accessProp(this, env).name("class").value(),
                            a,
                            "\u0000Exception\u0000",
                            filter));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "ErrorException")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castErrorException(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object s = null;
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    s = toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "severity"))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .VarDumper
                                                    .namespaces
                                                    .Caster
                                                    .classes
                                                    .ExceptionCaster
                                                    .RequestStaticProperties
                                                    .class,
                                            "errorTypes"),
                                    env,
                                    a.arrayGet(env, s)))) {
                a.arrayAccess(env, s)
                        .set(
                                new ConstStub(
                                        env,
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Caster
                                                                .classes
                                                                .ExceptionCaster
                                                                .RequestStaticProperties
                                                                .class,
                                                        "errorTypes")
                                                .arrayGet(env, a.arrayGet(env, s)),
                                        a.arrayGet(env, s)));
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "e",
            typeHint = "Symfony\\Component\\VarDumper\\Exception\\ThrowingCasterException"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castThrowingCasterException(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object trace = null;
            ReferenceContainer b = new BasicReferenceContainer(null);
            Object prefix = null;
            Object xPrefix = null;
            trace = toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "trace";
            prefix = ZVal.assign(Caster.CONST_PREFIX_PROTECTED);
            xPrefix = "\u0000Exception\u0000";
            if (ZVal.toBool(
                            ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    a,
                                                    env,
                                                    toStringR(xPrefix, env) + "previous"))
                                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, a, env, trace)))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    a.arrayGet(env, toStringR(xPrefix, env) + "previous"),
                                    PHPException.class,
                                    "Exception"))) {
                b.setObject(
                        ZVal.assign(
                                rToArrayCast(
                                        a.arrayGet(env, toStringR(xPrefix, env) + "previous"))));
                runtimeStaticObject.traceUnshift(
                        env,
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        new ArrayDimensionReference(
                                                b.getObject(), toStringR(xPrefix, env) + "trace")),
                        b.arrayGet(env, toStringR(xPrefix, env) + "trace"),
                        function_get_class
                                .f
                                .env(env)
                                .call(a.arrayGet(env, toStringR(xPrefix, env) + "previous"))
                                .value(),
                        b.arrayGet(env, toStringR(prefix, env) + "file"),
                        b.arrayGet(env, toStringR(prefix, env) + "line"));
                a.arrayAccess(env, trace)
                        .set(
                                new TraceStub(
                                        env,
                                        b.arrayGet(env, toStringR(xPrefix, env) + "trace"),
                                        false,
                                        0,
                                        ZVal.minusSign(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(a.arrayGet(env, trace))
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .value())
                                                        .value())));
            }

            arrayActionR(ArrayAction.UNSET, a, env, toStringR(xPrefix, env) + "previous");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "code");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "file");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "line");
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "e",
            typeHint = "Symfony\\Component\\Debug\\Exception\\SilencedErrorContext"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castSilencedErrorContext(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object trace = null;
            Object sPrefix = null;
            Object s = null;
            sPrefix = "\u0000" + toStringR(SilencedErrorContext.CONST_class, env) + "\u0000";
            if (!arrayActionR(
                    ArrayAction.ISSET, a, env, s = toStringR(sPrefix, env) + "severity")) {
                return ZVal.assign(a.getObject());
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .VarDumper
                                    .namespaces
                                    .Caster
                                    .classes
                                    .ExceptionCaster
                                    .RequestStaticProperties
                                    .class,
                            "errorTypes"),
                    env,
                    a.arrayGet(env, s))) {
                a.arrayAccess(env, s)
                        .set(
                                new ConstStub(
                                        env,
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Caster
                                                                .classes
                                                                .ExceptionCaster
                                                                .RequestStaticProperties
                                                                .class,
                                                        "errorTypes")
                                                .arrayGet(env, a.arrayGet(env, s)),
                                        a.arrayGet(env, s)));
            }

            trace =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    ZVal.newArray(
                                            new ZPair(
                                                    "file",
                                                    a.arrayGet(
                                                            env, toStringR(sPrefix, env) + "file")),
                                            new ZPair(
                                                    "line",
                                                    a.arrayGet(
                                                            env,
                                                            toStringR(sPrefix, env) + "line")))));
            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(sPrefix, env) + "trace")) {
                trace =
                        function_array_merge
                                .f
                                .env(env)
                                .call(trace, a.arrayGet(env, toStringR(sPrefix, env) + "trace"))
                                .value();
            }

            arrayActionR(ArrayAction.UNSET, a, env, toStringR(sPrefix, env) + "file");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(sPrefix, env) + "line");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(sPrefix, env) + "trace");
            a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "trace")
                    .set(
                            new TraceStub(
                                    env,
                                    trace,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .VarDumper
                                                            .namespaces
                                                            .Caster
                                                            .classes
                                                            .ExceptionCaster
                                                            .RequestStaticProperties
                                                            .class)
                                            .traceArgs));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "trace",
            typeHint = "Symfony\\Component\\VarDumper\\Caster\\TraceStub"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castTraceStub(RuntimeEnv env, Object... args) {
            Object trace = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            ReferenceContainer frames = new BasicReferenceContainer(null);
            Object prefix = null;
            ReferenceContainer f = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer j = new BasicReferenceContainer(null);
            Object label = null;
            Object lastCall = null;
            Object call = null;
            Object collapse = null;
            Object frame = null;
            if (!ZVal.isTrue(isNested)) {
                return ZVal.assign(a.getObject());
            }

            toObjectR(stub).accessProp(this, env).name("class").set("");
            toObjectR(stub).accessProp(this, env).name("handle").set(0);
            frames.setObject(
                    ZVal.assign(toObjectR(trace).accessProp(this, env).name("value").value()));
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.setObject(ZVal.newArray());
            j.setObject(function_count.f.env(env).call(frames.getObject()).value());
            if (ZVal.isGreaterThan(
                    0,
                    '>',
                    i.setObject(
                            ZVal.assign(
                                    toObjectR(trace)
                                            .accessProp(this, env)
                                            .name("sliceOffset")
                                            .value())))) {
                i.setObject(
                        NamespaceGlobal.max
                                .env(env)
                                .call(0, ZVal.add(j.getObject(), i.getObject()))
                                .value());
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(trace, "value", env),
                    env,
                    i.getObject())) {
                return ZVal.assign(ZVal.newArray());
            }

            lastCall =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, frames, env, i.getObject(), "function")
                                    ? toStringR(
                                                    arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    frames,
                                                                    env,
                                                                    i.getObject(),
                                                                    "class")
                                                            ? toStringR(
                                                                            frames.arrayGet(
                                                                                    env, 0,
                                                                                    "class"),
                                                                            env)
                                                                    + toStringR(
                                                                            frames.arrayGet(
                                                                                    env,
                                                                                    i.getObject(),
                                                                                    "type"),
                                                                            env)
                                                            : "",
                                                    env)
                                            + toStringR(
                                                    frames.arrayGet(env, i.getObject(), "function"),
                                                    env)
                                            + "()"
                                    : "");
            frames.arrayAppend(env).set(ZVal.newArray(new ZPair("function", "")));
            collapse = false;
            for (j.setObject(
                            ZAssignment.add(
                                    "+=",
                                    j.getObject(),
                                    ZVal.subtract(
                                            toObjectR(trace)
                                                    .accessProp(this, env)
                                                    .name("numberingOffset")
                                                    .value(),
                                            ZVal.postIncrement(i))));
                    arrayActionR(ArrayAction.ISSET, frames, env, i.getObject());
                    i.setObject(ZVal.increment(i.getObject())),
                            j.setObject(ZVal.decrement(j.getObject()))) {
                f.setObject(ZVal.assign(frames.arrayGet(env, i.getObject())));
                call =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, f, env, "function")
                                        ? toStringR(
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        f,
                                                                        env,
                                                                        "class")
                                                                ? toStringR(
                                                                                f.arrayGet(
                                                                                        env,
                                                                                        "class"),
                                                                                env)
                                                                        + toStringR(
                                                                                f.arrayGet(
                                                                                        env,
                                                                                        "type"),
                                                                                env)
                                                                : "",
                                                        env)
                                                + toStringR(f.arrayGet(env, "function"), env)
                                        : "???");
                frame =
                        new FrameStub(
                                env,
                                ZVal.add(
                                        ZVal.newArray(
                                                new ZPair(
                                                        "object",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        f,
                                                                        env,
                                                                        "object")
                                                                ? f.arrayGet(env, "object")
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "class",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        f,
                                                                        env,
                                                                        "class")
                                                                ? f.arrayGet(env, "class")
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "type",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        f,
                                                                        env,
                                                                        "type")
                                                                ? f.arrayGet(env, "type")
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "function",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        f,
                                                                        env,
                                                                        "function")
                                                                ? f.arrayGet(env, "function")
                                                                : ZVal.getNull())),
                                        frames.arrayGet(env, ZVal.subtract(i.getObject(), 1))),
                                false,
                                true);
                f.setObject(
                        runtimeStaticObject.castFrameStub(
                                env, frame, ZVal.newArray(), frame, true));
                if (arrayActionR(ArrayAction.ISSET, f, env, toStringR(prefix, env) + "src")) {
                    for (ZPair zpairResult2185 :
                            ZVal.getIterable(
                                    toObjectR(f.arrayGet(env, toStringR(prefix, env) + "src"))
                                            .accessProp(this, env)
                                            .name("value")
                                            .value(),
                                    env,
                                    false)) {
                        label = ZVal.assign(zpairResult2185.getKey());
                        frame = ZVal.assign(zpairResult2185.getValue());
                        if (ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(label, "\u0000~collapse=0")
                                        .value())) {
                            if (ZVal.isTrue(collapse)) {
                                label =
                                        NamespaceGlobal.substr_replace
                                                .env(env)
                                                .call(label, "1", 11, 1)
                                                .value();

                            } else {
                                collapse = true;
                            }
                        }

                        label =
                                NamespaceGlobal.substr_replace
                                        .env(env)
                                        .call(
                                                label,
                                                "title=Stack level "
                                                        + toStringR(j.getObject(), env)
                                                        + ".&",
                                                2,
                                                0)
                                        .value();
                    }

                    f.setObject(ZVal.assign(frames.arrayGet(env, ZVal.subtract(i.getObject(), 1))));
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    toObjectR(trace)
                                                            .accessProp(this, env)
                                                            .name("keepArgs")
                                                            .value())
                                            && ZVal.toBool(
                                                    !arrayActionR(
                                                            ArrayAction.EMPTY, f, env, "args")))
                            && ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            frame,
                                            EnumStub.class,
                                            "Symfony\\Component\\VarDumper\\Caster\\EnumStub"))) {
                        new ReferenceClassProperty(frame, "value", env)
                                .arrayAccess(env, "arguments")
                                .set(
                                        new ArgsStub(
                                                env,
                                                f.arrayGet(env, "args"),
                                                arrayActionR(ArrayAction.ISSET, f, env, "function")
                                                        ? f.arrayGet(env, "function")
                                                        : ZVal.getNull(),
                                                arrayActionR(ArrayAction.ISSET, f, env, "class")
                                                        ? f.arrayGet(env, "class")
                                                        : ZVal.getNull()));
                    }

                } else if (ZVal.strictNotEqualityCheck("???", "!==", lastCall)) {
                    label = new ClassStub(env, lastCall);
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(label, "attr", env),
                            env,
                            "ellipsis")) {
                        new ReferenceClassProperty(label, "attr", env)
                                .arrayAccess(env, "ellipsis")
                                .set(
                                        ZAssignment.add(
                                                "+=",
                                                new ReferenceClassProperty(label, "attr", env)
                                                        .arrayGet(env, "ellipsis"),
                                                2));
                        label =
                                toStringR(
                                                NamespaceGlobal.substr_replace
                                                        .env(env)
                                                        .call(
                                                                prefix,
                                                                "ellipsis-type=class&ellipsis="
                                                                        + toStringR(
                                                                                new ReferenceClassProperty(
                                                                                                label,
                                                                                                "attr",
                                                                                                env)
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                "ellipsis"),
                                                                                env)
                                                                        + "&ellipsis-tail=1&title=Stack level "
                                                                        + toStringR(
                                                                                j.getObject(), env)
                                                                        + ".",
                                                                2,
                                                                0)
                                                        .value(),
                                                env)
                                        + toStringR(
                                                toObjectR(label)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                env)
                                        + "()";

                    } else {
                        label =
                                toStringR(
                                                NamespaceGlobal.substr_replace
                                                        .env(env)
                                                        .call(
                                                                prefix,
                                                                "title=Stack level "
                                                                        + toStringR(
                                                                                j.getObject(), env)
                                                                        + ".",
                                                                2,
                                                                0)
                                                        .value(),
                                                env)
                                        + toStringR(
                                                toObjectR(label)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                env)
                                        + "()";
                    }

                } else {
                    label =
                            toStringR(
                                            NamespaceGlobal.substr_replace
                                                    .env(env)
                                                    .call(
                                                            prefix,
                                                            "title=Stack level "
                                                                    + toStringR(j.getObject(), env)
                                                                    + ".",
                                                            2,
                                                            0)
                                                    .value(),
                                            env)
                                    + toStringR(lastCall, env);
                }

                a.arrayAccess(
                                env,
                                NamespaceGlobal.substr_replace
                                        .env(env)
                                        .call(
                                                label,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "separator=%s&",
                                                                ZVal.isTrue(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                frame,
                                                                                                EnumStub
                                                                                                        .class,
                                                                                                "Symfony\\Component\\VarDumper\\Caster\\EnumStub"))
                                                                        ? " "
                                                                        : ":")
                                                        .value(),
                                                2,
                                                0)
                                        .value())
                        .set(frame);
                lastCall = ZVal.assign(call);
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    toObjectR(trace).accessProp(this, env).name("sliceLength").value())) {
                a.setObject(
                        function_array_slice
                                .f
                                .env(env)
                                .call(
                                        a.getObject(),
                                        0,
                                        toObjectR(trace)
                                                .accessProp(this, env)
                                                .name("sliceLength")
                                                .value(),
                                        true)
                                .value());
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "frame",
            typeHint = "Symfony\\Component\\VarDumper\\Caster\\FrameStub"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castFrameStub(RuntimeEnv env, Object... args) {
            Object frame = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object template = null;
            Object src = null;
            ReferenceContainer f = new BasicReferenceContainer(null);
            Object prefix = null;
            ReferenceContainer templateInfo = new BasicReferenceContainer(null);
            ReferenceContainer match = new BasicReferenceContainer(null);
            Object srcKey = null;
            Object ternaryExpressionTemp = null;
            Object k = null;
            Object ellipsis = null;
            Object templatePath = null;
            Object templateSrc = null;
            Object caller = null;
            Object srcAttr = null;
            ReferenceContainer cacheKey = new BasicReferenceContainer(null);
            Object v = null;
            Object ellipsisTail = null;
            if (!ZVal.isTrue(isNested)) {
                return ZVal.assign(a.getObject());
            }

            f.setObject(ZVal.assign(toObjectR(frame).accessProp(this, env).name("value").value()));
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, f, env, "file"))
                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, f, env, "line"))) {
                cacheKey.setObject(ZVal.assign(f.getObject()));
                arrayActionR(ArrayAction.UNSET, cacheKey, env, "object");
                arrayActionR(ArrayAction.UNSET, cacheKey, env, "args");
                cacheKey.arrayAppend(env)
                        .set(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .VarDumper
                                                        .namespaces
                                                        .Caster
                                                        .classes
                                                        .ExceptionCaster
                                                        .RequestStaticProperties
                                                        .class)
                                        .srcContext);
                cacheKey.setObject(
                        NamespaceGlobal.implode.env(env).call("-", cacheKey.getObject()).value());
                if (arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .VarDumper
                                        .namespaces
                                        .Caster
                                        .classes
                                        .ExceptionCaster
                                        .RequestStaticProperties
                                        .class,
                                "framesCache"),
                        env,
                        cacheKey.getObject())) {
                    a.arrayAccess(env, toStringR(prefix, env) + "src")
                            .set(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .VarDumper
                                                            .namespaces
                                                            .Caster
                                                            .classes
                                                            .ExceptionCaster
                                                            .RequestStaticProperties
                                                            .class,
                                                    "framesCache")
                                            .arrayGet(env, cacheKey.getObject()));

                } else {
                    if (function_preg_match
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                            .call(
                                    "/\\((\\d+)\\)(?:\\([\\da-f]{32}\\))? : (?:eval\\(\\)'d code|runtime-created function)$/",
                                    f.arrayGet(env, "file"),
                                    match.getObject())
                            .getBool()) {
                        f.arrayAccess(env, "file")
                                .set(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        f.arrayGet(env, "file"),
                                                        0,
                                                        ZVal.minusSign(
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                match.arrayGet(
                                                                                        env, 0))
                                                                        .value()))
                                                .value());
                        f.arrayAccess(env, "line").set(ZVal.toLong(match.arrayGet(env, 1)));
                    }

                    caller =
                            ZVal.assign(
                                    arrayActionR(ArrayAction.ISSET, f, env, "function")
                                            ? function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "in %s() on line %d",
                                                            toStringR(
                                                                            arrayActionR(
                                                                                            ArrayAction
                                                                                                    .ISSET,
                                                                                            f,
                                                                                            env,
                                                                                            "class")
                                                                                    ? toStringR(
                                                                                                    f
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    "class"),
                                                                                                    env)
                                                                                            + toStringR(
                                                                                                    f
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    "type"),
                                                                                                    env)
                                                                                    : "",
                                                                            env)
                                                                    + toStringR(
                                                                            f.arrayGet(
                                                                                    env,
                                                                                    "function"),
                                                                            env),
                                                            f.arrayGet(env, "line"))
                                                    .value()
                                            : ZVal.getNull());
                    src = ZVal.assign(f.arrayGet(env, "line"));
                    srcKey = ZVal.assign(f.arrayGet(env, "file"));
                    ellipsis = new LinkStub(env, srcKey, 0);
                    srcAttr =
                            "collapse="
                                    + toStringR(
                                            ZVal.toLong(
                                                    toObjectR(ellipsis)
                                                            .accessProp(this, env)
                                                            .name("inVendor")
                                                            .value()),
                                            env);
                    ellipsisTail =
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    new ReferenceClassProperty(
                                                            ellipsis, "attr", env),
                                                    env,
                                                    "ellipsis-tail")
                                            ? new ReferenceClassProperty(ellipsis, "attr", env)
                                                    .arrayGet(env, "ellipsis-tail")
                                            : 0);
                    ellipsis =
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    new ReferenceClassProperty(
                                                            ellipsis, "attr", env),
                                                    env,
                                                    "ellipsis")
                                            ? new ReferenceClassProperty(ellipsis, "attr", env)
                                                    .arrayGet(env, "ellipsis")
                                            : 0);
                    if (ZVal.toBool(
                                    function_file_exists
                                            .f
                                            .env(env)
                                            .call(f.arrayGet(env, "file"))
                                            .value())
                            && ZVal.toBool(
                                    ZVal.isLessThanOrEqualTo(
                                            0,
                                            "<=",
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Symfony
                                                                    .namespaces
                                                                    .Component
                                                                    .namespaces
                                                                    .VarDumper
                                                                    .namespaces
                                                                    .Caster
                                                                    .classes
                                                                    .ExceptionCaster
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .srcContext))) {
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        !arrayActionR(
                                                                ArrayAction.EMPTY, f, env, "class"))
                                                && ZVal.toBool(
                                                        ZVal.toBool(
                                                                        NamespaceGlobal
                                                                                .is_subclass_of
                                                                                .env(env)
                                                                                .call(
                                                                                        f.arrayGet(
                                                                                                env,
                                                                                                "class"),
                                                                                        "Twig\\Template")
                                                                                .value())
                                                                || ZVal.toBool(
                                                                        NamespaceGlobal
                                                                                .is_subclass_of
                                                                                .env(env)
                                                                                .call(
                                                                                        f.arrayGet(
                                                                                                env,
                                                                                                "class"),
                                                                                        "Twig_Template")
                                                                                .value())))
                                && ZVal.toBool(
                                        function_method_exists
                                                .f
                                                .env(env)
                                                .call(f.arrayGet(env, "class"), "getDebugInfo")
                                                .value())) {
                            template =
                                    ZVal.assign(
                                            arrayActionR(ArrayAction.ISSET, f, env, "object")
                                                    ? f.arrayGet(env, "object")
                                                    : function_unserialize
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    function_sprintf
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "O:%d:\"%s\":0:{}",
                                                                                    function_strlen
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    f
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    "class"))
                                                                                            .value(),
                                                                                    f.arrayGet(
                                                                                            env,
                                                                                            "class"))
                                                                            .value())
                                                            .value());
                            ellipsis = 0;
                            templateSrc =
                                    ZVal.assign(
                                            function_method_exists
                                                            .f
                                                            .env(env)
                                                            .call(template, "getSourceContext")
                                                            .getBool()
                                                    ? env.callMethod(
                                                            env.callMethod(
                                                                    template,
                                                                    "getSourceContext",
                                                                    ExceptionCaster.class),
                                                            "getCode",
                                                            ExceptionCaster.class)
                                                    : function_method_exists
                                                                    .f
                                                                    .env(env)
                                                                    .call(template, "getSource")
                                                                    .getBool()
                                                            ? env.callMethod(
                                                                    template,
                                                                    "getSource",
                                                                    ExceptionCaster.class)
                                                            : "");
                            templateInfo.setObject(
                                    env.callMethod(
                                            template, "getDebugInfo", ExceptionCaster.class));
                            if (arrayActionR(
                                    ArrayAction.ISSET,
                                    templateInfo,
                                    env,
                                    f.arrayGet(env, "line"))) {
                                if (ZVal.toBool(
                                                !function_method_exists
                                                        .f
                                                        .env(env)
                                                        .call(template, "getSourceContext")
                                                        .getBool())
                                        || ZVal.toBool(
                                                !function_file_exists
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                templatePath =
                                                                        env.callMethod(
                                                                                env.callMethod(
                                                                                        template,
                                                                                        "getSourceContext",
                                                                                        ExceptionCaster
                                                                                                .class),
                                                                                "getPath",
                                                                                ExceptionCaster
                                                                                        .class))
                                                        .getBool())) {
                                    templatePath = ZVal.getNull();
                                }

                                if (ZVal.isTrue(templateSrc)) {
                                    src =
                                            runtimeStaticObject.extractSource(
                                                    env,
                                                    templateSrc,
                                                    templateInfo.arrayGet(
                                                            env, f.arrayGet(env, "line")),
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Symfony
                                                                            .namespaces
                                                                            .Component
                                                                            .namespaces
                                                                            .VarDumper
                                                                            .namespaces
                                                                            .Caster
                                                                            .classes
                                                                            .ExceptionCaster
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .srcContext,
                                                    caller,
                                                    "twig",
                                                    templatePath);
                                    srcKey =
                                            toStringR(
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    templatePath)
                                                                    ? ternaryExpressionTemp
                                                                    : env.callMethod(
                                                                            template,
                                                                            "getTemplateName",
                                                                            ExceptionCaster.class),
                                                            env)
                                                    + ":"
                                                    + toStringR(
                                                            templateInfo.arrayGet(
                                                                    env, f.arrayGet(env, "line")),
                                                            env);
                                }
                            }
                        }

                        if (ZVal.equalityCheck(srcKey, f.arrayGet(env, "file"))) {
                            src =
                                    runtimeStaticObject.extractSource(
                                            env,
                                            function_file_get_contents
                                                    .f
                                                    .env(env)
                                                    .call(f.arrayGet(env, "file"))
                                                    .value(),
                                            f.arrayGet(env, "line"),
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Symfony
                                                                    .namespaces
                                                                    .Component
                                                                    .namespaces
                                                                    .VarDumper
                                                                    .namespaces
                                                                    .Caster
                                                                    .classes
                                                                    .ExceptionCaster
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .srcContext,
                                            caller,
                                            "php",
                                            f.arrayGet(env, "file"));
                            srcKey =
                                    toStringR(srcKey, env)
                                            + ":"
                                            + toStringR(f.arrayGet(env, "line"), env);
                            if (ZVal.isTrue(ellipsis)) {
                                ellipsis =
                                        ZAssignment.add(
                                                "+=",
                                                ellipsis,
                                                ZVal.add(
                                                        1,
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(f.arrayGet(env, "line"))
                                                                .value()));
                            }
                        }

                        srcAttr = toStringR(srcAttr, env) + "&separator= ";

                    } else {
                        srcAttr = toStringR(srcAttr, env) + "&separator=:";
                    }

                    srcAttr =
                            toStringR(srcAttr, env)
                                    + toStringR(
                                            ZVal.isTrue(ellipsis)
                                                    ? "&ellipsis-type=path&ellipsis="
                                                            + toStringR(ellipsis, env)
                                                            + "&ellipsis-tail="
                                                            + toStringR(ellipsisTail, env)
                                                    : "",
                                            env);
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .namespaces
                                            .Caster
                                            .classes
                                            .ExceptionCaster
                                            .RequestStaticProperties
                                            .class,
                                    "framesCache")
                            .arrayAccess(env, cacheKey.getObject())
                            .set(
                                    a.arrayAccess(env, toStringR(prefix, env) + "src")
                                            .set(
                                                    new EnumStub(
                                                            env,
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            "\u0000~"
                                                                                    + toStringR(
                                                                                            srcAttr,
                                                                                            env)
                                                                                    + "\u0000"
                                                                                    + toStringR(
                                                                                            srcKey,
                                                                                            env),
                                                                            src)))));
                }
            }

            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "args");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "line");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "file");
            if (toObjectR(frame).accessProp(this, env).name("inTraceStub").getBool()) {
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "class");
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "type");
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "function");
            }

            for (ZPair zpairResult2186 : ZVal.getIterable(a.getObject(), env, false)) {
                k = ZVal.assign(zpairResult2186.getKey());
                v = ZVal.assign(zpairResult2186.getValue());
                if (!ZVal.isTrue(v)) {
                    arrayActionR(ArrayAction.UNSET, a, env, k);
                }
            }

            if (ZVal.toBool(toObjectR(frame).accessProp(this, env).name("keepArgs").value())
                    && ZVal.toBool(!arrayActionR(ArrayAction.EMPTY, f, env, "args"))) {
                a.arrayAccess(env, toStringR(prefix, env) + "arguments")
                        .set(
                                new ArgsStub(
                                        env,
                                        f.arrayGet(env, "args"),
                                        f.arrayGet(env, "function"),
                                        f.arrayGet(env, "class")));
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "xClass")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(index = 2, name = "xPrefix")
        @ConvertedParameter(index = 3, name = "filter")
        private Object filterExceptionArray(RuntimeEnv env, Object... args) {
            Object xClass = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object xPrefix = assignParameter(args, 2, false);
            Object filter = assignParameter(args, 3, false);
            ReferenceContainer trace = new BasicReferenceContainer(null);
            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(xPrefix, env) + "trace")) {
                trace.setObject(ZVal.assign(a.arrayGet(env, toStringR(xPrefix, env) + "trace")));
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(xPrefix, env) + "trace");

            } else {
                trace.setObject(ZVal.newArray());
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.toLong(filter)
                                            & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE)))
                    && ZVal.toBool(trace.getObject())) {
                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        a,
                                        env,
                                        toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "file"))
                        && ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        a,
                                        env,
                                        toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "line"))) {
                    runtimeStaticObject.traceUnshift(
                            env,
                            new RuntimeArgsWithReferences().add(0, trace),
                            trace.getObject(),
                            xClass,
                            a.arrayGet(env, toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "file"),
                            a.arrayGet(
                                    env, toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "line"));
                }

                a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "trace")
                        .set(
                                new TraceStub(
                                        env,
                                        trace.getObject(),
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Caster
                                                                .classes
                                                                .ExceptionCaster
                                                                .RequestStaticProperties
                                                                .class)
                                                .traceArgs));
            }

            if (arrayActionR(ArrayAction.EMPTY, a, env, toStringR(xPrefix, env) + "previous")) {
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(xPrefix, env) + "previous");
            }

            arrayActionR(ArrayAction.UNSET, a, env, toStringR(xPrefix, env) + "string");
            arrayActionR(
                    ArrayAction.UNSET,
                    a,
                    env,
                    toStringR(Caster.CONST_PREFIX_DYNAMIC, env) + "xdebug_message");
            arrayActionR(
                    ArrayAction.UNSET,
                    a,
                    env,
                    toStringR(Caster.CONST_PREFIX_DYNAMIC, env) + "__destructorException");
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "file"))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "line"))) {
                a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "file")
                        .set(
                                new LinkStub(
                                        env,
                                        a.arrayGet(
                                                env,
                                                toStringR(Caster.CONST_PREFIX_PROTECTED, env)
                                                        + "file"),
                                        a.arrayGet(
                                                env,
                                                toStringR(Caster.CONST_PREFIX_PROTECTED, env)
                                                        + "line")));
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "trace")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "file")
        @ConvertedParameter(index = 3, name = "line")
        private Object traceUnshift(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer trace =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object file = assignParameter(args, 2, false);
            Object line = assignParameter(args, 3, false);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    trace,
                                                                    env,
                                                                    0,
                                                                    "file"))
                                                    && ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    trace,
                                                                    env,
                                                                    0,
                                                                    "line")))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    trace.arrayGet(env, 0, "file"), "===", file)))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    trace.arrayGet(env, 0, "line"), "===", line))) {
                return null;
            }

            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            trace.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            "function",
                                            ZVal.isTrue(_pClass)
                                                    ? "new " + toStringR(_pClass, env)
                                                    : ZVal.getNull()),
                                    new ZPair("file", file),
                                    new ZPair("line", line)));
            return null;
        }

        public Object traceUnshift(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "srcLines")
        @ConvertedParameter(index = 1, name = "line")
        @ConvertedParameter(index = 2, name = "srcContext")
        @ConvertedParameter(index = 3, name = "title")
        @ConvertedParameter(index = 4, name = "lang")
        @ConvertedParameter(
            index = 5,
            name = "file",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        private Object extractSource(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer srcLines =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object line = assignParameter(args, 1, false);
            Object srcContext = assignParameter(args, 2, false);
            Object title = assignParameter(args, 3, false);
            Object lang = assignParameter(args, 4, false);
            Object file = assignParameter(args, 5, true);
            if (null == file) {
                file = ZVal.getNull();
            }
            Object pad = null;
            ReferenceContainer c = new BasicReferenceContainer(null);
            ReferenceContainer src = new BasicReferenceContainer(null);
            ReferenceContainer ltrim = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            srcLines.setObject(
                    function_explode.f.env(env).call("\n", srcLines.getObject()).value());
            src.setObject(ZVal.newArray());
            runtimeConverterBreakCount = 0;
            for (i.setObject(ZVal.subtract(ZVal.subtract(line, 1), srcContext));
                    ZVal.isLessThanOrEqualTo(
                            i.getObject(), "<=", ZVal.add(ZVal.subtract(line, 1), srcContext));
                    i.setObject(ZVal.increment(i.getObject()))) {
                src.arrayAppend(env)
                        .set(
                                toStringR(
                                                arrayActionR(
                                                                ArrayAction.ISSET,
                                                                srcLines,
                                                                env,
                                                                i.getObject())
                                                        ? srcLines.arrayGet(env, i.getObject())
                                                        : "",
                                                env)
                                        + "\n");
            }

            srcLines.setObject(ZVal.newArray());
            ltrim.setObject(0);
            runtimeConverterBreakCount = 0;
            do {
                pad = ZVal.getNull();
                runtimeConverterBreakCount = 0;
                for (i.setObject(ZVal.toLong(srcContext) << ZVal.toLong(1));
                        ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                        i.setObject(ZVal.decrement(i.getObject()))) {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    arrayActionR(
                                                            ArrayAction.ISSET,
                                                            src,
                                                            env,
                                                            i.getObject(),
                                                            ltrim.getObject()))
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            "\r",
                                                            "!==",
                                                            c.setObject(
                                                                    ZVal.assign(
                                                                            src.arrayGet(
                                                                                    env,
                                                                                    i.getObject(),
                                                                                    ltrim
                                                                                            .getObject()))))))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck("\n", "!==", c.getObject()))) {
                        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", pad)) {
                            pad = ZVal.assign(c.getObject());
                        }

                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                " ", "!==", c.getObject()))
                                                && ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                "\t", "!==", c.getObject())))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(pad, "!==", c.getObject()))) {
                            break;
                        }
                    }
                }

                ltrim.setObject(ZVal.increment(ltrim.getObject()));

            } while (ZVal.toBool(ZVal.isGreaterThan(0, '>', i.getObject()))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", pad)));

            ltrim.setObject(ZVal.decrement(ltrim.getObject()));
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult2187 : ZVal.getIterable(src.getObject(), env, false)) {
                i.setObject(ZVal.assign(zpairResult2187.getKey()));
                c.setObject(ZVal.assign(zpairResult2187.getValue()));
                if (ZVal.isTrue(ltrim.getObject())) {
                    c.setObject(
                            ZVal.assign(
                                    ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    c,
                                                                    env,
                                                                    ltrim.getObject()))
                                                    && ZVal.toBool(
                                                            ZVal.strictNotEqualityCheck(
                                                                    "\r",
                                                                    "!==",
                                                                    c.arrayGet(
                                                                            env,
                                                                            ltrim.getObject())))
                                            ? function_substr
                                                    .f
                                                    .env(env)
                                                    .call(c.getObject(), ltrim.getObject())
                                                    .value()
                                            : function_ltrim
                                                    .f
                                                    .env(env)
                                                    .call(c.getObject(), " \t")
                                                    .value()));
                }

                c.setObject(function_substr.f.env(env).call(c.getObject(), 0, -1).value());
                if (ZVal.strictNotEqualityCheck(i.getObject(), "!==", srcContext)) {
                    c.setObject(new ConstStub(env, "default", c.getObject()));

                } else {
                    c.setObject(new ConstStub(env, c.getObject(), title));
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", file)) {
                        new ReferenceClassProperty(c.getObject(), "attr", env)
                                .arrayAccess(env, "file")
                                .set(file);
                        new ReferenceClassProperty(c.getObject(), "attr", env)
                                .arrayAccess(env, "line")
                                .set(line);
                    }
                }

                new ReferenceClassProperty(c.getObject(), "attr", env)
                        .arrayAccess(env, "lang")
                        .set(lang);
                srcLines.arrayAccess(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "\u0000~separator=\u203A &%d\u0000",
                                                ZVal.subtract(
                                                        ZVal.add(i.getObject(), line), srcContext))
                                        .value())
                        .set(c.getObject());
            }

            return ZVal.assign(new EnumStub(env, srcLines.getObject()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object srcContext = 1;

        public Object traceArgs = true;

        public Object errorTypes =
                ZVal.newArray(
                        new ZPair(8192, "E_DEPRECATED"),
                        new ZPair(16384, "E_USER_DEPRECATED"),
                        new ZPair(4096, "E_RECOVERABLE_ERROR"),
                        new ZPair(1, "E_ERROR"),
                        new ZPair(2, "E_WARNING"),
                        new ZPair(4, "E_PARSE"),
                        new ZPair(8, "E_NOTICE"),
                        new ZPair(16, "E_CORE_ERROR"),
                        new ZPair(32, "E_CORE_WARNING"),
                        new ZPair(64, "E_COMPILE_ERROR"),
                        new ZPair(128, "E_COMPILE_WARNING"),
                        new ZPair(256, "E_USER_ERROR"),
                        new ZPair(512, "E_USER_WARNING"),
                        new ZPair(1024, "E_USER_NOTICE"),
                        new ZPair(2048, "E_STRICT"));

        public Object framesCache = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster")
                    .setLookup(
                            ExceptionCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("errorTypes", "framesCache", "srcContext", "traceArgs")
                    .setFilename("vendor/symfony/var-dumper/Caster/ExceptionCaster.php")
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
