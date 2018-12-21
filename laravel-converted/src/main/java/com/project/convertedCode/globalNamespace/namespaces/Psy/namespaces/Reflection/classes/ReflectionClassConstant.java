package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeInterfaces.Reflector;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Reflection/ReflectionClassConstant.php

*/

public class ReflectionClassConstant extends RuntimeClassBase implements Reflector {

    public Object _pClass = null;

    public Object name = null;

    public Object value = null;

    public ReflectionClassConstant(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReflectionClassConstant.class) {
            this.__construct(env, args);
        }
    }

    public ReflectionClassConstant(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        ReferenceContainer constants = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(_pClass, ReflectionClass.class, "ReflectionClass"))) {
            _pClass = new ReflectionClass(env, _pClass);
        }

        this._pClass = _pClass;
        this.name = name;
        constants.setObject(env.callMethod(_pClass, "getConstants", ReflectionClassConstant.class));
        if (!function_array_key_exists.f.env(env).call(name, constants.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Unknown constant: " + toStringR(name, env)));
        }

        this.value = constants.arrayGet(env, name);
        return null;
    }

    @ConvertedMethod
    public Object getDeclaringClass(RuntimeEnv env, Object... args) {
        Object parent = null;
        Object _pClass = null;
        parent = ZVal.assign(this._pClass);
        do {
            _pClass = ZVal.assign(parent);
            parent = env.callMethod(_pClass, "getParentClass", ReflectionClassConstant.class);

        } while (ZVal.toBool(
                        ZVal.toBool(parent)
                                && ZVal.toBool(
                                        env.callMethod(
                                                parent,
                                                "hasConstant",
                                                ReflectionClassConstant.class,
                                                this.name)))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.callMethod(
                                        parent,
                                        "getConstant",
                                        ReflectionClassConstant.class,
                                        this.name),
                                "===",
                                this.value)));

        return ZVal.assign(_pClass);
    }

    @ConvertedMethod
    public Object getDocComment(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getModifiers(RuntimeEnv env, Object... args) {
        return ZVal.assign(256);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object isPrivate(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isProtected(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isPublic(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getName(env));
    }

    @ConvertedMethod
    public Object getFileName(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object getStartLine(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "Not yet implemented because it's unclear what I should do here :)"));
    }

    @ConvertedMethod
    public Object getEndLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getStartLine(env));
    }

    public static final Object CONST_class = "Psy\\Reflection\\ReflectionClassConstant";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "name")
        @ConvertedParameter(
            index = 2,
            name = "return",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object export(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, false);
            Object _pReturn = assignParameter(args, 2, true);
            if (null == _pReturn) {
                _pReturn = false;
            }
            Object str = null;
            Object refl = null;
            Object value = null;
            refl =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Psy
                            .namespaces
                            .Reflection
                            .classes
                            .ReflectionClassConstant(env, _pClass, name);
            value = env.callMethod(refl, "getValue", ReflectionClassConstant.class);
            str =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Constant [ public %s %s ] { %s }",
                                    NamespaceGlobal.gettype.env(env).call(value).value(),
                                    env.callMethod(refl, "getName", ReflectionClassConstant.class),
                                    value)
                            .value();
            if (ZVal.isTrue(_pReturn)) {
                return ZVal.assign(str);
            }

            env.echo(toStringR(str, env) + "\n");
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "name")
        public Object create(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, false);
            if (function_class_exists.f.env(env).call("\\ReflectionClassConstant").getBool()) {
                return ZVal.assign(
                        new com.runtimeconverter
                                .runtime
                                .reflection
                                .phpClasses
                                .ReflectionClassConstant(env, _pClass, name));
            }

            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Psy
                            .namespaces
                            .Reflection
                            .classes
                            .ReflectionClassConstant(env, _pClass, name));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Reflection\\ReflectionClassConstant")
                    .setLookup(
                            ReflectionClassConstant.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "name", "value")
                    .setFilename("vendor/psy/psysh/src/Reflection/ReflectionClassConstant.php")
                    .addInterface("Reflector")
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
