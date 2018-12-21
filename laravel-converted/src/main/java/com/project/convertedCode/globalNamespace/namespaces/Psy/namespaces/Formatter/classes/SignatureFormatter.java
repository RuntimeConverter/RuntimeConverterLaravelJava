package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.Formatter;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionLanguageConstruct;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionConstant_;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.Reflection;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes.Json;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Formatter/SignatureFormatter.php

*/

public class SignatureFormatter extends RuntimeClassBase implements Formatter {

    public SignatureFormatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SignatureFormatter(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Psy\\Formatter\\SignatureFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
        public Object format(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            SwitchEnumType78 switchVariable78 =
                    ZVal.getEnum(
                            true,
                            SwitchEnumType78.DEFAULT_CASE,
                            SwitchEnumType78.DYNAMIC_TYPE_281,
                            ZVal.checkInstanceType(
                                    reflector, ReflectionFunction.class, "ReflectionFunction"),
                            SwitchEnumType78.DYNAMIC_TYPE_282,
                            ZVal.checkInstanceType(
                                    reflector,
                                    ReflectionLanguageConstruct.class,
                                    "Psy\\Reflection\\ReflectionLanguageConstruct"),
                            SwitchEnumType78.DYNAMIC_TYPE_283,
                            ZVal.checkInstanceType(
                                    reflector, ReflectionClass.class, "ReflectionClass"),
                            SwitchEnumType78.DYNAMIC_TYPE_284,
                            ZVal.checkInstanceType(
                                    reflector,
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Psy
                                            .namespaces
                                            .Reflection
                                            .classes
                                            .ReflectionClassConstant
                                            .class,
                                    "Psy\\Reflection\\ReflectionClassConstant"),
                            SwitchEnumType78.DYNAMIC_TYPE_285,
                            ZVal.checkInstanceType(
                                    reflector,
                                    com.runtimeconverter
                                            .runtime
                                            .reflection
                                            .phpClasses
                                            .ReflectionClassConstant
                                            .class,
                                    "ReflectionClassConstant"),
                            SwitchEnumType78.DYNAMIC_TYPE_286,
                            ZVal.checkInstanceType(
                                    reflector, ReflectionMethod.class, "ReflectionMethod"),
                            SwitchEnumType78.DYNAMIC_TYPE_287,
                            ZVal.checkInstanceType(
                                    reflector, ReflectionProperty.class, "ReflectionProperty"),
                            SwitchEnumType78.DYNAMIC_TYPE_288,
                            ZVal.checkInstanceType(
                                    reflector,
                                    ReflectionConstant_.class,
                                    "Psy\\Reflection\\ReflectionConstant_"));
            switch (switchVariable78) {
                case DYNAMIC_TYPE_281:
                case DYNAMIC_TYPE_282:
                    return ZVal.assign(runtimeStaticObject.formatFunction(env, reflector));
                case DYNAMIC_TYPE_283:
                    return ZVal.assign(runtimeStaticObject.formatClass(env, reflector));
                case DYNAMIC_TYPE_284:
                case DYNAMIC_TYPE_285:
                    return ZVal.assign(runtimeStaticObject.formatClassConstant(env, reflector));
                case DYNAMIC_TYPE_286:
                    return ZVal.assign(runtimeStaticObject.formatMethod(env, reflector));
                case DYNAMIC_TYPE_287:
                    return ZVal.assign(runtimeStaticObject.formatProperty(env, reflector));
                case DYNAMIC_TYPE_288:
                    return ZVal.assign(runtimeStaticObject.formatConstant(env, reflector));
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    "Unexpected Reflector class: "
                                            + toStringR(
                                                    function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(reflector)
                                                            .value(),
                                                    env)));
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
        public Object formatName(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            return ZVal.assign(env.callMethod(reflector, "getName", SignatureFormatter.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
        private Object formatModifiers(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src/Formatter")
                            .setFile("/vendor/psy/psysh/src/Formatter/SignatureFormatter.php");
            Object reflector = assignParameter(args, 0, false);
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    reflector, ReflectionClass.class, "ReflectionClass"))
                    && ZVal.toBool(
                            env.callMethod(reflector, "isTrait", SignatureFormatter.class))) {
                if (NamespaceGlobal.version_compare
                        .env(env)
                        .call("7.2.11-dev", "7.0.0", "<")
                        .getBool()) {
                    return ZVal.assign(ZVal.newArray());
                }
            }

            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    " ",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Psy\\Formatter",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "modifier"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object modifier =
                                                                    assignParameter(args, 0, false);
                                                            return ZVal.assign(
                                                                    function_sprintf
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "<keyword>%s</keyword>",
                                                                                    modifier)
                                                                            .value());
                                                        }
                                                    },
                                                    Reflection.runtimeStaticObject.getModifierNames(
                                                            env,
                                                            env.callMethod(
                                                                    reflector,
                                                                    "getModifiers",
                                                                    SignatureFormatter.class)))
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionClass")
        private Object formatClass(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src/Formatter")
                            .setFile("/vendor/psy/psysh/src/Formatter/SignatureFormatter.php");
            Object reflector = assignParameter(args, 0, false);
            Object parent = null;
            Object interfaces = null;
            ReferenceContainer chunks = new BasicReferenceContainer(null);
            Object modifiers = null;
            chunks.setObject(ZVal.newArray());
            if (ZVal.isTrue(modifiers = runtimeStaticObject.formatModifiers(env, reflector))) {
                chunks.arrayAppend(env).set(modifiers);
            }

            if (ZVal.isTrue(env.callMethod(reflector, "isTrait", SignatureFormatter.class))) {
                chunks.arrayAppend(env).set("trait");

            } else {
                chunks.arrayAppend(env)
                        .set(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        reflector,
                                                        "isInterface",
                                                        SignatureFormatter.class))
                                        ? "interface"
                                        : "class");
            }

            chunks.arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "<class>%s</class>",
                                            runtimeStaticObject.formatName(env, reflector))
                                    .value());
            if (ZVal.isTrue(
                    parent =
                            env.callMethod(
                                    reflector, "getParentClass", SignatureFormatter.class))) {
                chunks.arrayAppend(env).set("extends");
                chunks.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<class>%s</class>",
                                                env.callMethod(
                                                        parent,
                                                        "getName",
                                                        SignatureFormatter.class))
                                        .value());
            }

            interfaces = env.callMethod(reflector, "getInterfaceNames", SignatureFormatter.class);
            if (!ZVal.isEmpty(interfaces)) {
                function_sort.f.env(env).call(interfaces);
                chunks.arrayAppend(env).set("implements");
                chunks.arrayAppend(env)
                        .set(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "Psy\\Formatter",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "name"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object name =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        return ZVal.assign(
                                                                                function_sprintf
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                "<class>%s</class>",
                                                                                                name)
                                                                                        .value());
                                                                    }
                                                                },
                                                                interfaces)
                                                        .value())
                                        .value());
            }

            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call(" ", chunks.getObject()).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector")
        private Object formatClassConstant(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            Object style = null;
            Object value = null;
            value = env.callMethod(reflector, "getValue", SignatureFormatter.class);
            style = runtimeStaticObject.getTypeStyle(env, value);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<keyword>const</keyword> <const>%s</const> = <%s>%s</%s>",
                                    runtimeStaticObject.formatName(env, reflector),
                                    style,
                                    OutputFormatter.runtimeStaticObject.escape(
                                            env, Json.runtimeStaticObject.encode(env, value)),
                                    style)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector")
        private Object formatConstant(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            Object style = null;
            Object value = null;
            value = env.callMethod(reflector, "getValue", SignatureFormatter.class);
            style = runtimeStaticObject.getTypeStyle(env, value);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<keyword>define</keyword>(<string>%s</string>, <%s>%s</%s>)",
                                    OutputFormatter.runtimeStaticObject.escape(
                                            env,
                                            Json.runtimeStaticObject.encode(
                                                    env,
                                                    env.callMethod(
                                                            reflector,
                                                            "getName",
                                                            SignatureFormatter.class))),
                                    style,
                                    OutputFormatter.runtimeStaticObject.escape(
                                            env, Json.runtimeStaticObject.encode(env, value)),
                                    style)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        private Object getTypeStyle(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            if (ZVal.toBool(function_is_int.f.env(env).call(value).value())
                    || ZVal.toBool(function_is_float.f.env(env).call(value).value())) {
                return "number";

            } else if (function_is_string.f.env(env).call(value).getBool()) {
                return "string";

            } else if (ZVal.toBool(function_is_bool.f.env(env).call(value).value())
                    || ZVal.toBool(function_is_null.f.env(env).call(value).value())) {
                return "bool";

            } else {
                return "strong";
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionProperty")
        private Object formatProperty(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s <strong>$%s</strong>",
                                    runtimeStaticObject.formatModifiers(env, reflector),
                                    env.callMethod(reflector, "getName", SignatureFormatter.class))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionFunctionAbstract")
        private Object formatFunction(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<keyword>function</keyword> %s<function>%s</function>(%s)",
                                    ZVal.isTrue(
                                                    env.callMethod(
                                                            reflector,
                                                            "returnsReference",
                                                            SignatureFormatter.class))
                                            ? "&"
                                            : "",
                                    runtimeStaticObject.formatName(env, reflector),
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ", ",
                                                    runtimeStaticObject.formatFunctionParams(
                                                            env, reflector))
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionMethod")
        private Object formatMethod(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s %s",
                                    runtimeStaticObject.formatModifiers(env, reflector),
                                    runtimeStaticObject.formatFunction(env, reflector))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "ReflectionFunctionAbstract")
        private Object formatFunctionParams(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            Object _pDefault = null;
            Object param = null;
            Object guess = null;
            Object e = null;
            ReferenceContainer chunks = new BasicReferenceContainer(null);
            Object hint = null;
            Object typeStyle = null;
            ReferenceContainer params = new BasicReferenceContainer(null);
            Object _pClass = null;
            Object value = null;
            params.setObject(ZVal.newArray());
            for (ZPair zpairResult1403 :
                    ZVal.getIterable(
                            env.callMethod(reflector, "getParameters", SignatureFormatter.class),
                            env,
                            true)) {
                param = ZVal.assign(zpairResult1403.getValue());
                hint = "";
                try {
                    if (ZVal.isTrue(env.callMethod(param, "isArray", SignatureFormatter.class))) {
                        hint = "<keyword>array</keyword> ";

                    } else if (ZVal.isTrue(
                            _pClass =
                                    env.callMethod(param, "getClass", SignatureFormatter.class))) {
                        hint =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<class>%s</class> ",
                                                env.callMethod(
                                                        _pClass,
                                                        "getName",
                                                        SignatureFormatter.class))
                                        .value();
                    }

                } catch (ConvertedException convertedException193) {
                    if (convertedException193.instanceOf(PHPException.class, "Exception")) {
                        e = convertedException193.getObject();
                        chunks.setObject(
                                function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                "$"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        param,
                                                                        "getName",
                                                                        SignatureFormatter.class),
                                                                env),
                                                toStringR(param, env))
                                        .value());
                        chunks.setObject(
                                function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                " ",
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(chunks.arrayGet(env, 0))
                                                        .value())
                                        .value());
                        guess = function_end.f.env(env).call(chunks.getObject()).value();
                        hint =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("<urgent>%s</urgent> ", guess)
                                        .value();
                    } else {
                        throw convertedException193;
                    }
                }

                if (ZVal.isTrue(env.callMethod(param, "isOptional", SignatureFormatter.class))) {
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    param, "isDefaultValueAvailable", SignatureFormatter.class))) {
                        value = "unknown";
                        typeStyle = "urgent";

                    } else {
                        value = env.callMethod(param, "getDefaultValue", SignatureFormatter.class);
                        typeStyle = runtimeStaticObject.getTypeStyle(env, value);
                        value =
                                ZVal.assign(
                                        ZVal.isTrue(
                                                        function_is_array
                                                                        .f
                                                                        .env(env)
                                                                        .call(value)
                                                                        .getBool()
                                                                ? "array()"
                                                                : function_is_null
                                                                        .f
                                                                        .env(env)
                                                                        .call(value)
                                                                        .value())
                                                ? "null"
                                                : NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(value, true)
                                                        .value());
                    }

                    _pDefault =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            " = <%s>%s</%s>",
                                            typeStyle,
                                            OutputFormatter.runtimeStaticObject.escape(env, value),
                                            typeStyle)
                                    .value();

                } else {
                    _pDefault = "";
                }

                params.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s%s<strong>$%s</strong>%s",
                                                ZVal.isTrue(
                                                                env.callMethod(
                                                                        param,
                                                                        "isPassedByReference",
                                                                        SignatureFormatter.class))
                                                        ? "&"
                                                        : "",
                                                hint,
                                                env.callMethod(
                                                        param, "getName", SignatureFormatter.class),
                                                _pDefault)
                                        .value());
            }

            return ZVal.assign(params.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Formatter\\SignatureFormatter")
                    .setLookup(
                            SignatureFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Formatter/SignatureFormatter.php")
                    .addInterface("Psy\\Formatter\\Formatter")
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

    private enum SwitchEnumType78 {
        DYNAMIC_TYPE_281,
        DYNAMIC_TYPE_282,
        DYNAMIC_TYPE_283,
        DYNAMIC_TYPE_284,
        DYNAMIC_TYPE_285,
        DYNAMIC_TYPE_286,
        DYNAMIC_TYPE_287,
        DYNAMIC_TYPE_288,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
