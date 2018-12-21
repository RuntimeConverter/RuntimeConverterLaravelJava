package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes.NameGenerator;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.Instantiator;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.ClassMirror;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes.ClassCreator;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Doubler.php

*/

public class Doubler extends RuntimeClassBase {

    public Object mirror = null;

    public Object creator = null;

    public Object namer = null;

    public Object patches = ZVal.newArray();

    public Object instantiator = null;

    public Doubler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Doubler.class) {
            this.__construct(env, args);
        }
    }

    public Doubler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mirror",
        typeHint = "Prophecy\\Doubler\\Generator\\ClassMirror",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "creator",
        typeHint = "Prophecy\\Doubler\\Generator\\ClassCreator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "namer",
        typeHint = "Prophecy\\Doubler\\NameGenerator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mirror = assignParameter(args, 0, true);
        if (null == mirror) {
            mirror = ZVal.getNull();
        }
        Object creator = assignParameter(args, 1, true);
        if (null == creator) {
            creator = ZVal.getNull();
        }
        Object namer = assignParameter(args, 2, true);
        if (null == namer) {
            namer = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.mirror =
                ZVal.isTrue(ternaryExpressionTemp = mirror)
                        ? ternaryExpressionTemp
                        : new ClassMirror(env);
        this.creator =
                ZVal.isTrue(ternaryExpressionTemp = creator)
                        ? ternaryExpressionTemp
                        : new ClassCreator(env);
        this.namer =
                ZVal.isTrue(ternaryExpressionTemp = namer)
                        ? ternaryExpressionTemp
                        : new NameGenerator(env);
        return null;
    }

    @ConvertedMethod
    public Object getClassPatches(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.patches);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "patch",
        typeHint = "Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface"
    )
    public Object registerClassPatch(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler")
                        .setFile("/vendor/phpspec/prophecy/src/Prophecy/Doubler/Doubler.php");
        Object patch = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "patches", env).arrayAppend(env).set(patch);
        function_usort
                .f
                .env(env)
                .call(
                        this.patches,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Prophecy\\Doubler",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "patch1",
                                typeHint = "Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface"
                            )
                            @ConvertedParameter(
                                index = 1,
                                name = "patch2",
                                typeHint = "Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object patch1 = assignParameter(args, 0, false);
                                Object patch2 = assignParameter(args, 1, false);
                                return ZVal.assign(
                                        ZVal.subtract(
                                                env.callMethod(
                                                        patch2, "getPriority", Doubler.class),
                                                env.callMethod(
                                                        patch1, "getPriority", Doubler.class)));
                            }
                        })
                .value();
        return null;
    }

    @ConvertedMethod(name = "double")
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "args",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object _pDouble(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, false);
        Object ___args = assignParameter(args, 2, true);
        if (null == ___args) {
            ___args = ZVal.getNull();
        }
        Object classname = null;
        Object reflection = null;
        Object constructor = null;
        Object _pInterface = null;
        for (ZPair zpairResult954 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult954.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            _pInterface, ReflectionClass.class, "ReflectionClass"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "[ReflectionClass $interface1 [, ReflectionClass $interface2]] array expected as\n"
                                                        + "a second argument to `Doubler::double(...)`, but got %s.",
                                                function_is_object
                                                                .f
                                                                .env(env)
                                                                .call(_pInterface)
                                                                .getBool()
                                                        ? toStringR(
                                                                        function_get_class
                                                                                .f
                                                                                .env(env)
                                                                                .call(_pInterface)
                                                                                .value(),
                                                                        env)
                                                                + " class"
                                                        : NamespaceGlobal.gettype
                                                                .env(env)
                                                                .call(_pInterface)
                                                                .value())
                                        .value()));
            }
        }

        classname = this.createDoubleClass(env, _pClass, interfaces);
        reflection = new ReflectionClass(env, classname);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ___args)) {
            return ZVal.assign(
                    env.callMethod(reflection, "newInstanceArgs", Doubler.class, ___args));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                constructor =
                                        env.callMethod(
                                                reflection, "getConstructor", Doubler.class)))
                || ZVal.toBool(
                        ZVal.toBool(env.callMethod(constructor, "isPublic", Doubler.class))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        constructor, "isFinal", Doubler.class))))) {
            return ZVal.assign(env.callMethod(reflection, "newInstance", Doubler.class));
        }

        if (!ZVal.isTrue(this.instantiator)) {
            this.instantiator = new Instantiator(env);
        }

        return ZVal.assign(
                env.callMethod(this.instantiator, "instantiate", Doubler.class, classname));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    protected Object createDoubleClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, false);
        Object patch = null;
        Object node = null;
        Object name = null;
        name = env.callMethod(this.namer, "name", Doubler.class, _pClass, interfaces);
        node = env.callMethod(this.mirror, "reflect", Doubler.class, _pClass, interfaces);
        for (ZPair zpairResult955 : ZVal.getIterable(this.patches, env, true)) {
            patch = ZVal.assign(zpairResult955.getValue());
            if (ZVal.isTrue(env.callMethod(patch, "supports", Doubler.class, node))) {
                env.callMethod(patch, "apply", Doubler.class, node);
            }
        }

        env.callMethod(this.creator, "create", Doubler.class, name, node);
        return ZVal.assign(name);
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Doubler";

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
                    .setName("Prophecy\\Doubler\\Doubler")
                    .setLookup(
                            Doubler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("creator", "instantiator", "mirror", "namer", "patches")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/Doubler.php")
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
