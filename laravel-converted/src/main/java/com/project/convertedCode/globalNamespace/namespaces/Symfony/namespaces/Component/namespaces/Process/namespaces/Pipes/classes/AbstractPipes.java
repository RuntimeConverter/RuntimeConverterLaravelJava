package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes.PipesInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/Pipes/AbstractPipes.php

*/

public abstract class AbstractPipes extends RuntimeClassBase implements PipesInterface {

    public Object pipes = ZVal.newArray();

    public Object inputBuffer = "";

    public Object input = null;

    public Object blocked = true;

    public Object lastError = null;

    public AbstractPipes(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractPipes.class) {
            this.__construct(env, args);
        }
    }

    public AbstractPipes(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_resource.f.env(env).call(input).value())
                || ZVal.toBool(ZVal.checkInstanceType(input, Iterator.class, "Iterator"))) {
            this.input = input;

        } else if (function_is_string.f.env(env).call(input).getBool()) {
            this.inputBuffer = input;

        } else {
            this.inputBuffer = toStringR(input, env);
        }

        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        Object pipe = null;
        for (ZPair zpairResult1995 : ZVal.getIterable(this.pipes, env, true)) {
            pipe = ZVal.assign(zpairResult1995.getValue());
            function_fclose.f.env(env).call(pipe);
        }

        this.pipes = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    protected Object hasSystemCallBeenInterrupted(RuntimeEnv env, Object... args) {
        Object lastError = null;
        lastError = ZVal.assign(this.lastError);
        this.lastError = ZVal.getNull();
        return ZVal.assign(
                ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", lastError))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        false,
                                        "!==",
                                        function_stripos
                                                .f
                                                .env(env)
                                                .call(lastError, "interrupted system call")
                                                .value())));
    }

    @ConvertedMethod
    protected Object unblock(RuntimeEnv env, Object... args) {
        Object pipe = null;
        if (!ZVal.isTrue(this.blocked)) {
            return null;
        }

        for (ZPair zpairResult1996 : ZVal.getIterable(this.pipes, env, true)) {
            pipe = ZVal.assign(zpairResult1996.getValue());
            NamespaceGlobal.stream_set_blocking.env(env).call(pipe, 0);
        }

        if (function_is_resource.f.env(env).call(this.input).getBool()) {
            NamespaceGlobal.stream_set_blocking.env(env).call(this.input, 0);
        }

        this.blocked = false;
        return null;
    }

    @ConvertedMethod
    protected Object write(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object input = null;
        ReferenceContainer r = new BasicReferenceContainer(null);
        Object stdin = null;
        ReferenceContainer data = new BasicReferenceContainer(null);
        ReferenceContainer e = new BasicReferenceContainer(null);
        ReferenceContainer w = new BasicReferenceContainer(null);
        Object written = null;
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "pipes", env), env, 0)) {
            return null;
        }

        input = ZVal.assign(this.input);
        if (ZVal.isTrue(ZVal.checkInstanceType(input, Iterator.class, "Iterator"))) {
            if (!ZVal.isTrue(env.callMethod(input, "valid", AbstractPipes.class))) {
                input = ZVal.getNull();

            } else if (function_is_resource
                    .f
                    .env(env)
                    .call(input = env.callMethod(input, "current", AbstractPipes.class))
                    .getBool()) {
                NamespaceGlobal.stream_set_blocking.env(env).call(input, 0);

            } else if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "inputBuffer", env),
                    env,
                    0)) {
                if (!function_is_string.f.env(env).call(input).getBool()) {
                    if (!function_is_scalar.f.env(env).call(input).getBool()) {
                        throw ZVal.getException(
                                env,
                                new InvalidArgumentException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s yielded a value of type \"%s\", but only scalars and stream resources are supported",
                                                        function_get_class
                                                                .f
                                                                .env(env)
                                                                .call(this.input)
                                                                .value(),
                                                        NamespaceGlobal.gettype
                                                                .env(env)
                                                                .call(input)
                                                                .value())
                                                .value()));
                    }

                    input = ZVal.assign(toStringR(input, env));
                }

                this.inputBuffer = input;
                env.callMethod(this.input, "next", AbstractPipes.class);
                input = ZVal.getNull();

            } else {
                input = ZVal.getNull();
            }
        }

        r.setObject(ZVal.assign(e.setObject(ZVal.newArray())));
        w.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                new ReferenceClassProperty(this, "pipes", env).arrayGet(env, 0))));
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                NamespaceGlobal.stream_select
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences().add(0, r).add(1, w).add(2, e))
                        .call(r.getObject(), w.getObject(), e.getObject(), 0, 0)
                        .value())) {
            return null;
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1997 : ZVal.getIterable(w.getObject(), env, true)) {
            stdin = ZVal.assign(zpairResult1997.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "inputBuffer", env),
                    env,
                    0)) {
                written = function_fwrite.f.env(env).call(stdin, this.inputBuffer).value();
                this.inputBuffer =
                        function_substr.f.env(env).call(this.inputBuffer, written).value();
                if (arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "inputBuffer", env),
                        env,
                        0)) {
                    return ZVal.assign(
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            new ReferenceClassProperty(this, "pipes", env)
                                                    .arrayGet(env, 0))));
                }
            }

            if (ZVal.isTrue(input)) {
                runtimeConverterBreakCount = 0;
                for (; ZVal.isTrue(true); ) {
                    data.setObject(function_fread.f.env(env).call(input, CONST_CHUNK_SIZE).value());
                    if (!arrayActionR(ArrayAction.ISSET, data, env, 0)) {
                        break;
                    }

                    written = function_fwrite.f.env(env).call(stdin, data.getObject()).value();
                    data.setObject(
                            function_substr.f.env(env).call(data.getObject(), written).value());
                    if (arrayActionR(ArrayAction.ISSET, data, env, 0)) {
                        this.inputBuffer = data.getObject();
                        return ZVal.assign(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new ReferenceClassProperty(this, "pipes", env)
                                                        .arrayGet(env, 0))));
                    }
                }

                if (NamespaceGlobal.feof.env(env).call(input).getBool()) {
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(this.input, Iterator.class, "Iterator"))) {
                        env.callMethod(this.input, "next", AbstractPipes.class);

                    } else {
                        this.input = ZVal.getNull();
                    }
                }
            }
        }

        if (ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "inputBuffer", env),
                                env,
                                0))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this.input, Iterator.class, "Iterator"))
                                        ? env.callMethod(this.input, "valid", AbstractPipes.class)
                                        : this.input))) {
            this.input = ZVal.getNull();
            function_fclose
                    .f
                    .env(env)
                    .call(new ReferenceClassProperty(this, "pipes", env).arrayGet(env, 0));
            arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "pipes", env), env, 0);

        } else if (!ZVal.isTrue(w.getObject())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    new ReferenceClassProperty(this, "pipes", env)
                                            .arrayGet(env, 0))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "msg")
    public Object handleError(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object msg = assignParameter(args, 1, false);
        this.lastError = msg;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\Pipes\\AbstractPipes";

    @ConvertedMethod()
    public abstract Object getDescriptors(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getFiles(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object readAndWrite(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object areOpen(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object haveReadSupport(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\Process\\Pipes\\AbstractPipes")
                    .setLookup(
                            AbstractPipes.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("blocked", "input", "inputBuffer", "lastError", "pipes")
                    .setFilename("vendor/symfony/process/Pipes/AbstractPipes.php")
                    .addInterface("Symfony\\Component\\Process\\Pipes\\PipesInterface")
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
