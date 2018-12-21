package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeInterfaces.Reflector;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Reflection/ReflectionConstant_.php

*/

public class ReflectionConstant_ extends RuntimeClassBase implements Reflector {

    public Object name = null;

    public Object value = null;

    public ReflectionConstant_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReflectionConstant_.class) {
            this.__construct(env, args);
        }
    }

    public ReflectionConstant_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        if (ZVal.toBool(!function_defined.f.env(env).call(name).getBool())
                && ZVal.toBool(!ZVal.isTrue(runtimeStaticObject.isMagicConstant(env, name)))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Unknown constant: " + toStringR(name, env)));
        }

        if (!ZVal.isTrue(runtimeStaticObject.isMagicConstant(env, name))) {
            this.value = function_constant.f.env(env).call(name).value();
        }

        return null;
    }

    @ConvertedMethod
    public Object getDocComment(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getNamespaceName(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.inNamespace(env))) {
            return "";
        }

        return ZVal.assign(
                function_preg_replace.f.env(env).call("/\\\\[^\\\\]+$/", "", this.name).value());
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object inNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(this.name, "\\").value(), "!==", false));
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

    public static final Object CONST_class = "Psy\\Reflection\\ReflectionConstant_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(
            index = 1,
            name = "return",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object export(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object _pReturn = assignParameter(args, 1, true);
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
                            .ReflectionConstant_(env, name);
            value = env.callMethod(refl, "getValue", ReflectionConstant_.class);
            str =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Constant [ %s %s ] { %s }",
                                    NamespaceGlobal.gettype.env(env).call(value).value(),
                                    env.callMethod(refl, "getName", ReflectionConstant_.class),
                                    value)
                            .value();
            if (ZVal.isTrue(_pReturn)) {
                return ZVal.assign(str);
            }

            env.echo(toStringR(str, env) + "\n");
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object isMagicConstant(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_in_array
                            .f
                            .env(env)
                            .call(
                                    name,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Psy
                                                            .namespaces
                                                            .Reflection
                                                            .classes
                                                            .ReflectionConstant_
                                                            .RequestStaticProperties
                                                            .class)
                                            .magicConstants)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object magicConstants =
                ZVal.arrayFromList(
                        "__LINE__",
                        "__FILE__",
                        "__DIR__",
                        "__FUNCTION__",
                        "__CLASS__",
                        "__TRAIT__",
                        "__METHOD__",
                        "__NAMESPACE__",
                        "__COMPILER_HALT_OFFSET__");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Reflection\\ReflectionConstant_")
                    .setLookup(
                            ReflectionConstant_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("name", "value")
                    .setStaticPropertyNames("magicConstants")
                    .setFilename("vendor/psy/psysh/src/Reflection/ReflectionConstant_.php")
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
