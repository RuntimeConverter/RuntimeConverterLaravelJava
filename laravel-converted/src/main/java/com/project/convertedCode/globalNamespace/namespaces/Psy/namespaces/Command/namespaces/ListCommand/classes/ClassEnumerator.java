package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_natcasesort;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes.Enumerator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/ClassEnumerator.php

*/

public class ClassEnumerator extends Enumerator {

    public ClassEnumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassEnumerator.class) {
            this.__construct(env, args);
        }
    }

    public ClassEnumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "reflector",
        typeHint = "Reflector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object listItems(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, true);
        if (null == reflector) {
            reflector = ZVal.getNull();
        }
        Object target = assignParameter(args, 2, true);
        if (null == target) {
            target = ZVal.getNull();
        }
        Object ret = null;
        Object internal = null;
        Object user = null;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(reflector, "!==", ZVal.getNull()))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull()))) {
            return null;
        }

        user = env.callMethod(input, "getOption", ClassEnumerator.class, "user");
        internal = env.callMethod(input, "getOption", ClassEnumerator.class, "internal");
        ret = ZVal.newArray();
        if (ZVal.isTrue(env.callMethod(input, "getOption", ClassEnumerator.class, "classes"))) {
            ret =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ret,
                                    this.filterClasses(
                                            env,
                                            "Classes",
                                            function_get_declared_classes.f.env(env).call().value(),
                                            internal,
                                            user))
                            .value();
        }

        if (ZVal.isTrue(env.callMethod(input, "getOption", ClassEnumerator.class, "interfaces"))) {
            ret =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ret,
                                    this.filterClasses(
                                            env,
                                            "Interfaces",
                                            NamespaceGlobal.get_declared_interfaces
                                                    .env(env)
                                                    .call()
                                                    .value(),
                                            internal,
                                            user))
                            .value();
        }

        if (ZVal.isTrue(env.callMethod(input, "getOption", ClassEnumerator.class, "traits"))) {
            ret =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ret,
                                    this.filterClasses(
                                            env,
                                            "Traits",
                                            NamespaceGlobal.get_declared_traits
                                                    .env(env)
                                                    .call()
                                                    .value(),
                                            internal,
                                            user))
                            .value();
        }

        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "prepareClasses")),
                                function_array_filter.f.env(env).call(ret).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "classes")
    @ConvertedParameter(index = 2, name = "internal")
    @ConvertedParameter(index = 3, name = "user")
    protected Object filterClasses(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command/ListCommand")
                        .setFile("/vendor/psy/psysh/src/Command/ListCommand/ClassEnumerator.php");
        Object key = assignParameter(args, 0, false);
        Object classes = assignParameter(args, 1, false);
        Object internal = assignParameter(args, 2, false);
        Object user = assignParameter(args, 3, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        ret.setObject(ZVal.newArray());
        if (ZVal.isTrue(internal)) {
            ret.arrayAccess(env, "Internal " + toStringR(key, env))
                    .set(
                            function_array_filter
                                    .f
                                    .env(env)
                                    .call(
                                            classes,
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Psy\\Command\\ListCommand",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "class")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object _pClass =
                                                            assignParameter(args, 0, false);
                                                    Object refl = null;
                                                    refl = new ReflectionClass(env, _pClass);
                                                    return ZVal.assign(
                                                            env.callMethod(
                                                                    refl,
                                                                    "isInternal",
                                                                    ClassEnumerator.class));
                                                }
                                            })
                                    .value());
        }

        if (ZVal.isTrue(user)) {
            ret.arrayAccess(env, "User " + toStringR(key, env))
                    .set(
                            function_array_filter
                                    .f
                                    .env(env)
                                    .call(
                                            classes,
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Psy\\Command\\ListCommand",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "class")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object _pClass =
                                                            assignParameter(args, 0, false);
                                                    Object refl = null;
                                                    refl = new ReflectionClass(env, _pClass);
                                                    return ZVal.assign(
                                                            !ZVal.isTrue(
                                                                    env.callMethod(
                                                                            refl,
                                                                            "isInternal",
                                                                            ClassEnumerator
                                                                                    .class)));
                                                }
                                            })
                                    .value());
        }

        if (ZVal.toBool(!ZVal.isTrue(user)) && ZVal.toBool(!ZVal.isTrue(internal))) {
            ret.arrayAccess(env, key).set(classes);
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    protected Object prepareClasses(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object name = null;
        function_natcasesort.f.env(env).call(classes);
        ret.setObject(ZVal.newArray());
        for (ZPair zpairResult1371 : ZVal.getIterable(classes, env, true)) {
            name = ZVal.assign(zpairResult1371.getValue());
            if (ZVal.isTrue(env.callMethod(this, "showItem", ClassEnumerator.class, name))) {
                ret.arrayAccess(env, name)
                        .set(
                                ZVal.newArray(
                                        new ZPair("name", name),
                                        new ZPair("style", CONST_IS_CLASS),
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "presentSignature",
                                                        ClassEnumerator.class,
                                                        name))));
            }
        }

        return ZVal.assign(ret.getObject());
    }

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\ClassEnumerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Enumerator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ListCommand\\ClassEnumerator")
                    .setLookup(
                            ClassEnumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/ClassEnumerator.php")
                    .addExtendsClass("Psy\\Command\\ListCommand\\Enumerator")
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
