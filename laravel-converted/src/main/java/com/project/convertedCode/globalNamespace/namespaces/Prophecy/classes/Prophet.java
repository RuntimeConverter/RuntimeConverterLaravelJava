package com.project.convertedCode.globalNamespace.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.PredictionException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes.Doubler;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ProphecySubjectPatch;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.KeywordPatch;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.Revealer;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.AggregateException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.HhvmExceptionPatch;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ObjectProphecy;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ReflectionClassNewInstancePatch;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.TraversablePatch;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes.CallCenter;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.SplFileInfoPatch;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.MagicCallPatch;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes.LazyDouble;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.DisableConstructorPatch;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prophet.php

*/

public class Prophet extends RuntimeClassBase {

    public Object doubler = null;

    public Object revealer = null;

    public Object util = null;

    public Object prophecies = ZVal.newArray();

    public Prophet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Prophet.class) {
            this.__construct(env, args);
        }
    }

    public Prophet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "doubler",
        typeHint = "Prophecy\\Doubler\\Doubler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "revealer",
        typeHint = "Prophecy\\Prophecy\\RevealerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object doubler = assignParameter(args, 0, true);
        if (null == doubler) {
            doubler = ZVal.getNull();
        }
        Object revealer = assignParameter(args, 1, true);
        if (null == revealer) {
            revealer = ZVal.getNull();
        }
        Object util = assignParameter(args, 2, true);
        if (null == util) {
            util = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", doubler)) {
            doubler = new Doubler(env);
            env.callMethod(doubler, "registerClassPatch", Prophet.class, new SplFileInfoPatch(env));
            env.callMethod(doubler, "registerClassPatch", Prophet.class, new TraversablePatch(env));
            env.callMethod(
                    doubler, "registerClassPatch", Prophet.class, new DisableConstructorPatch(env));
            env.callMethod(
                    doubler, "registerClassPatch", Prophet.class, new ProphecySubjectPatch(env));
            env.callMethod(
                    doubler,
                    "registerClassPatch",
                    Prophet.class,
                    new ReflectionClassNewInstancePatch(env));
            env.callMethod(
                    doubler, "registerClassPatch", Prophet.class, new HhvmExceptionPatch(env));
            env.callMethod(doubler, "registerClassPatch", Prophet.class, new MagicCallPatch(env));
            env.callMethod(doubler, "registerClassPatch", Prophet.class, new KeywordPatch(env));
        }

        this.doubler = doubler;
        this.revealer =
                ZVal.isTrue(ternaryExpressionTemp = revealer)
                        ? ternaryExpressionTemp
                        : new Revealer(env);
        this.util =
                ZVal.isTrue(ternaryExpressionTemp = util)
                        ? ternaryExpressionTemp
                        : new StringUtil(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "classOrInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object prophesize(RuntimeEnv env, Object... args) {
        Object classOrInterface = assignParameter(args, 0, true);
        if (null == classOrInterface) {
            classOrInterface = ZVal.getNull();
        }
        Object prophecy = null;
        new ReferenceClassProperty(this, "prophecies", env)
                .arrayAppend(env)
                .set(
                        prophecy =
                                new ObjectProphecy(
                                        env,
                                        new LazyDouble(env, this.doubler),
                                        new CallCenter(env, this.util),
                                        this.revealer));
        if (ZVal.toBool(classOrInterface)
                && ZVal.toBool(function_class_exists.f.env(env).call(classOrInterface).value())) {
            return ZVal.assign(
                    env.callMethod(prophecy, "willExtend", Prophet.class, classOrInterface));
        }

        if (ZVal.toBool(classOrInterface)
                && ZVal.toBool(
                        NamespaceGlobal.interface_exists.env(env).call(classOrInterface).value())) {
            return ZVal.assign(
                    env.callMethod(prophecy, "willImplement", Prophet.class, classOrInterface));
        }

        return ZVal.assign(prophecy);
    }

    @ConvertedMethod
    public Object getProphecies(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prophecies);
    }

    @ConvertedMethod
    public Object getDoubler(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.doubler);
    }

    @ConvertedMethod
    public Object checkPredictions(RuntimeEnv env, Object... args) {
        Object exception = null;
        Object e = null;
        Object prophecy = null;
        exception = new AggregateException(env, "Some predictions failed:\n");
        for (ZPair zpairResult968 : ZVal.getIterable(this.prophecies, env, true)) {
            prophecy = ZVal.assign(zpairResult968.getValue());
            try {
                env.callMethod(prophecy, "checkProphecyMethodsPredictions", Prophet.class);
            } catch (ConvertedException convertedException122) {
                if (convertedException122.instanceOf(
                        PredictionException.class,
                        "Prophecy\\Exception\\Prediction\\PredictionException")) {
                    e = convertedException122.getObject();
                    env.callMethod(exception, "append", Prophet.class, e);
                } else {
                    throw convertedException122;
                }
            }
        }

        if (function_count
                .f
                .env(env)
                .call(env.callMethod(exception, "getExceptions", Prophet.class))
                .getBool()) {
            throw ZVal.getException(env, exception);
        }

        return null;
    }

    public static final Object CONST_class = "Prophecy\\Prophet";

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
                    .setName("Prophecy\\Prophet")
                    .setLookup(
                            Prophet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("doubler", "prophecies", "revealer", "util")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Prophet.php")
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
