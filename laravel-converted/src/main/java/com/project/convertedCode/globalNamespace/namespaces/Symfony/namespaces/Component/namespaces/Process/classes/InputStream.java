package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.ProcessUtils;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/InputStream.php

*/

public class InputStream extends RuntimeClassBase implements IteratorAggregate {

    public Object onEmpty = ZVal.getNull();

    public Object input = ZVal.newArray();

    public Object open = true;

    public InputStream(RuntimeEnv env, Object... args) {
        super(env);
    }

    public InputStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "onEmpty",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object onEmpty(RuntimeEnv env, Object... args) {
        Object onEmpty = assignParameter(args, 0, true);
        if (null == onEmpty) {
            onEmpty = ZVal.getNull();
        }
        this.onEmpty = onEmpty;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    public Object write(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", input)) {
            return null;
        }

        if (ZVal.isTrue(this.isClosed(env))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s is closed",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"))
                                    .value()));
        }

        new ReferenceClassProperty(this, "input", env)
                .arrayAppend(env)
                .set(
                        ProcessUtils.runtimeStaticObject.validateInput(
                                env, "InputStream::write", input));
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        this.open = false;
        return null;
    }

    @ConvertedMethod
    public Object isClosed(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.open));
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object cur = null;
        Object current = null;
        Object onEmpty = null;
        this.open = true;
        runtimeConverterContinueCount = 0;
        while (ZVal.toBool(this.open) || ZVal.toBool(this.input)) {
            if (!ZVal.isTrue(this.input)) {
                runtimeConverterYieldVariable.add("");
                continue;
            }

            current = function_array_shift.f.env(env).call(this.input).value();
            if (ZVal.isTrue(ZVal.checkInstanceType(current, Iterator.class, "Iterator"))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1994 : ZVal.getIterable(current, env, true)) {
                    cur = ZVal.assign(zpairResult1994.getValue());
                    runtimeConverterYieldVariable.add(cur);
                }

            } else {
                runtimeConverterYieldVariable.add(current);
            }

            if (ZVal.toBool(ZVal.toBool(!ZVal.isTrue(this.input)) && ZVal.toBool(this.open))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getNull(), "!==", onEmpty = ZVal.assign(this.onEmpty)))) {
                this.write(
                        env,
                        env.callFunctionDynamic(
                                        onEmpty,
                                        new RuntimeArgsWithReferences()
                                                .add(0, new ReadOnlyReferenceContainer(this)),
                                        this)
                                .value());
            }
        }

        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\InputStream";

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
                    .setName("Symfony\\Component\\Process\\InputStream")
                    .setLookup(
                            InputStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("input", "onEmpty", "open")
                    .setFilename("vendor/symfony/process/InputStream.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
