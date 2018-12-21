package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/ClassStub.php

*/

public class ClassStub extends ConstStub {

    public ClassStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassStub.class) {
            this.__construct(env, args);
        }
    }

    public ClassStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object callable = assignParameter(args, 1, true);
        if (null == callable) {
            callable = ZVal.getNull();
        }
        ReferenceContainer r = new BasicReferenceContainer(null);
        Object e = null;
        Object f = null;
        Object i = null;
        Object ternaryExpressionTemp = null;
        toObjectR(this).accessProp(this, env).name("value").set(identifier);
        if (ZVal.isLessThan(
                0, '<', i = NamespaceGlobal.strrpos.env(env).call(identifier, "\\").value())) {
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis")
                    .set(ZVal.subtract(function_strlen.f.env(env).call(identifier).value(), i));
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis-type")
                    .set("class");
            new ReferenceClassProperty(this, "attr", env).arrayAccess(env, "ellipsis-tail").set(1);
        }

        try {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callable)) {
                if (ZVal.isTrue(ZVal.checkInstanceType(callable, Closure.class, "Closure"))) {
                    r.setObject(new ReflectionFunction(env, callable));

                } else if (function_is_object.f.env(env).call(callable).getBool()) {
                    r.setObject(ZVal.newArray(new ZPair(0, callable), new ZPair(1, "__invoke")));

                } else if (function_is_array.f.env(env).call(callable).getBool()) {
                    r.setObject(ZVal.assign(callable));

                } else if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        i = function_strpos.f.env(env).call(callable, "::").value())) {
                    r.setObject(
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(callable, 0, i)
                                                    .value()),
                                    new ZPair(
                                            1,
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(callable, ZVal.add(2, i))
                                                    .value())));

                } else {
                    r.setObject(new ReflectionFunction(env, callable));
                }

            } else if (ZVal.isLessThan(
                    0,
                    '<',
                    i =
                            ZVal.assign(
                                    ZVal.isTrue(
                                                    ternaryExpressionTemp =
                                                            function_strpos
                                                                    .f
                                                                    .env(env)
                                                                    .call(identifier, "::")
                                                                    .value())
                                            ? ternaryExpressionTemp
                                            : function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(identifier, "->")
                                                    .value()))) {
                r.setObject(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        function_substr.f.env(env).call(identifier, 0, i).value()),
                                new ZPair(
                                        1,
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(identifier, ZVal.add(2, i))
                                                .value())));

            } else {
                r.setObject(new ReflectionClass(env, identifier));
            }

            if (function_is_array.f.env(env).call(r.getObject()).getBool()) {
                try {
                    r.setObject(new ReflectionMethod(env, r.arrayGet(env, 0), r.arrayGet(env, 1)));
                } catch (ConvertedException convertedException316) {
                    if (convertedException316.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException316.getObject();
                        r.setObject(new ReflectionClass(env, r.arrayGet(env, 0)));
                    } else {
                        throw convertedException316;
                    }
                }
            }

        } catch (ConvertedException convertedException317) {
            if (convertedException317.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException317.getObject();
                return null;
            } else {
                throw convertedException317;
            }
        }

        if (ZVal.isTrue(f = env.callMethod(r.getObject(), "getFileName", ClassStub.class))) {
            new ReferenceClassProperty(this, "attr", env).arrayAccess(env, "file").set(f);
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "line")
                    .set(env.callMethod(r.getObject(), "getStartLine", ClassStub.class));
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\ClassStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ConstStub.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callable")
        public Object wrapCallable(RuntimeEnv env, Object... args) {
            ReferenceContainer callable =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            if (ZVal.toBool(function_is_object.f.env(env).call(callable.getObject()).value())
                    || ZVal.toBool(
                            !function_is_callable
                                    .f
                                    .env(env)
                                    .call(callable.getObject())
                                    .getBool())) {
                return ZVal.assign(callable.getObject());
            }

            if (!function_is_array.f.env(env).call(callable.getObject()).getBool()) {
                callable.setObject(env.createNewWithLateStaticBindings(this, callable.getObject()));

            } else if (function_is_string.f.env(env).call(callable.arrayGet(env, 0)).getBool()) {
                callable.arrayAccess(env, 0)
                        .set(env.createNewWithLateStaticBindings(this, callable.arrayGet(env, 0)));

            } else {
                callable.arrayAccess(env, 1)
                        .set(
                                env.createNewWithLateStaticBindings(
                                        this, callable.arrayGet(env, 1), callable.getObject()));
            }

            return ZVal.assign(callable.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\ClassStub")
                    .setLookup(
                            ClassStub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "handle",
                            "position",
                            "refCount",
                            "type",
                            "value")
                    .setFilename("vendor/symfony/var-dumper/Caster/ClassStub.php")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Caster\\ConstStub")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\Stub")
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
