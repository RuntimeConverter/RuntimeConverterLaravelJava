package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Invocation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Invocation;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/StaticInvocation.php

*/

public class StaticInvocation extends RuntimeClassBase implements Invocation, SelfDescribing {

    public Object className = null;

    public Object methodName = null;

    public Object parameters = null;

    public Object returnType = null;

    public Object isReturnTypeNullable = false;

    public StaticInvocation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StaticInvocation.class) {
            this.__construct(env, args);
        }
    }

    public StaticInvocation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 3, name = "returnType")
    @ConvertedParameter(
        index = 4,
        name = "cloneObjects",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object methodName = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        Object returnType = assignParameter(args, 3, false);
        Object cloneObjects = assignParameter(args, 4, true);
        if (null == cloneObjects) {
            cloneObjects = false;
        }
        Object value = null;
        Object key = null;
        this.className = className;
        this.methodName = methodName;
        this.parameters = parameters;
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(methodName).value(),
                "===",
                "__tostring")) {
            returnType = "string";
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(returnType, "?").value(), "===", 0)) {
            returnType = function_substr.f.env(env).call(returnType, 1).value();
            this.isReturnTypeNullable = true;
        }

        this.returnType = returnType;
        if (!ZVal.isTrue(cloneObjects)) {
            return null;
        }

        for (ZPair zpairResult1155 : ZVal.getIterable(this.parameters, env, false)) {
            key = ZVal.assign(zpairResult1155.getKey());
            value = ZVal.assign(zpairResult1155.getValue());
            if (function_is_object.f.env(env).call(value).getBool()) {
                new ReferenceClassProperty(this, "parameters", env)
                        .arrayAccess(env, key)
                        .set(this.cloneObject(env, value));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.className);
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methodName);
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parameters);
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnType);
    }

    @ConvertedMethod
    public Object isReturnTypeNullable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isReturnTypeNullable);
    }

    @ConvertedMethod
    public Object generateReturnValue(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject/Invocation")
                        .setFile(
                                "/vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/StaticInvocation.php");
        Object generator = null;
        if (ZVal.isTrue(this.isReturnTypeNullable)) {
            return null;
        }

        SwitchEnumType63 switchVariable63 =
                ZVal.getEnum(
                        NamespaceGlobal.strtolower.env(env).call(this.returnType).value(),
                        SwitchEnumType63.DEFAULT_CASE,
                        SwitchEnumType63.STRING_,
                        "",
                        SwitchEnumType63.STRING_void,
                        "void",
                        SwitchEnumType63.STRING_string,
                        "string",
                        SwitchEnumType63.STRING_float,
                        "float",
                        SwitchEnumType63.STRING_int,
                        "int",
                        SwitchEnumType63.STRING_bool,
                        "bool",
                        SwitchEnumType63.STRING_array,
                        "array",
                        SwitchEnumType63.STRING_object,
                        "object",
                        SwitchEnumType63.STRING_callable,
                        "callable",
                        SwitchEnumType63.STRING_closure,
                        "closure",
                        SwitchEnumType63.STRING_traversable,
                        "traversable",
                        SwitchEnumType63.STRING_generator,
                        "generator",
                        SwitchEnumType63.STRING_iterable,
                        "iterable");
        switch (switchVariable63) {
            case STRING_:
            case STRING_void:
                return null;
            case STRING_string:
                return "";
            case STRING_float:
                return 0.0;
            case STRING_int:
                return 0;
            case STRING_bool:
                return ZVal.assign(false);
            case STRING_array:
                return ZVal.assign(ZVal.newArray());
            case STRING_object:
                return ZVal.assign(new stdClass(env));
            case STRING_callable:
            case STRING_closure:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "PHPUnit\\Framework\\MockObject\\Invocation",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
            case STRING_traversable:
            case STRING_generator:
            case STRING_iterable:
                generator =
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "PHPUnit\\Framework\\MockObject\\Invocation",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                RuntimeIterable runtimeConverterYieldVariable =
                                        new RuntimeIterable(env);
                                runtimeConverterYieldVariable.add(null);
                                return runtimeConverterYieldVariable;
                            }
                        };
                return ZVal.assign(
                        env.callFunctionDynamic(generator, new RuntimeArgsWithReferences())
                                .value());
            case DEFAULT_CASE:
                generator = new Generator(env);
                return ZVal.assign(
                        env.callMethod(
                                generator,
                                "getMock",
                                StaticInvocation.class,
                                this.returnType,
                                ZVal.newArray(),
                                ZVal.newArray(),
                                "",
                                false));
        }
        ;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object exporter = null;
        exporter = new Exporter(env);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s::%s(%s)%s",
                                this.className,
                                this.methodName,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(0, exporter),
                                                                        new ZPair(
                                                                                1,
                                                                                "shortenedExport")),
                                                                this.parameters)
                                                        .value())
                                        .value(),
                                ZVal.isTrue(this.returnType)
                                        ? function_sprintf
                                                .f
                                                .env(env)
                                                .call(": %s", this.returnType)
                                                .value()
                                        : "")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "original")
    private Object cloneObject(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object original = assignParameter(args, 0, false);
        Object method = null;
        Object e = null;
        Object cloneable = null;
        Object _pClass = null;
        Object _object = null;
        cloneable = ZVal.getNull();
        _object = new ReflectionObject(env, original);
        if (ZVal.toBool(env.callMethod(_object, "isInternal", StaticInvocation.class))
                && ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Framework
                                                .namespaces
                                                .MockObject
                                                .namespaces
                                                .Invocation
                                                .classes
                                                .StaticInvocation
                                                .RequestStaticProperties
                                                .class,
                                        "uncloneableExtensions"),
                                env,
                                env.callMethod(
                                        _object, "getExtensionName", StaticInvocation.class)))) {
            cloneable = false;
        }

        if (ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull())) {
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1156 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Framework
                                                    .namespaces
                                                    .MockObject
                                                    .namespaces
                                                    .Invocation
                                                    .classes
                                                    .StaticInvocation
                                                    .RequestStaticProperties
                                                    .class)
                                    .uncloneableClasses,
                            env,
                            true)) {
                _pClass = ZVal.assign(zpairResult1156.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(original, _pClass))) {
                    cloneable = false;
                    break;
                }
            }
        }

        if (ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull())) {
            cloneable = env.callMethod(_object, "isCloneable", StaticInvocation.class);
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull()))
                && ZVal.toBool(
                        env.callMethod(_object, "hasMethod", StaticInvocation.class, "__clone"))) {
            method = env.callMethod(_object, "getMethod", StaticInvocation.class, "__clone");
            cloneable = env.callMethod(method, "isPublic", StaticInvocation.class);
        }

        if (ZVal.strictEqualityCheck(cloneable, "===", ZVal.getNull())) {
            cloneable = true;
        }

        if (ZVal.isTrue(cloneable)) {
            try {
                return ZVal.assign(((RuntimeClassInterface) original).phpClone(env));
            } catch (ConvertedException convertedException131) {
                if (convertedException131.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException131.getObject();
                    return ZVal.assign(original);
                } else {
                    throw convertedException131;
                }
            }

        } else {
            return ZVal.assign(original);
        }
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object uncloneableExtensions =
                ZVal.newArray(
                        new ZPair("mysqli", true),
                        new ZPair("SQLite", true),
                        new ZPair("sqlite3", true),
                        new ZPair("tidy", true),
                        new ZPair("xmlwriter", true),
                        new ZPair("xsl", true));

        public Object uncloneableClasses =
                ZVal.arrayFromList(
                        "Closure",
                        "COMPersistHelper",
                        "IteratorIterator",
                        "RecursiveIteratorIterator",
                        "SplFileObject",
                        "PDORow",
                        "ZipArchive");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation")
                    .setLookup(
                            StaticInvocation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "className",
                            "isReturnTypeNullable",
                            "methodName",
                            "parameters",
                            "returnType")
                    .setStaticPropertyNames("uncloneableClasses", "uncloneableExtensions")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/StaticInvocation.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Invocation")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
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

    private enum SwitchEnumType63 {
        STRING_,
        STRING_void,
        STRING_string,
        STRING_float,
        STRING_int,
        STRING_bool,
        STRING_array,
        STRING_object,
        STRING_callable,
        STRING_closure,
        STRING_traversable,
        STRING_generator,
        STRING_iterable,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
