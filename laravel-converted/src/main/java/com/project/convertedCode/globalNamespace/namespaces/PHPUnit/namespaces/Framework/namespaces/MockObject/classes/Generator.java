package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.ExceptionInterface;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.Instantiator;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.nativeClasses.soap.SoapClient;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_assoc;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockObject;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Generator.php

*/

public class Generator extends RuntimeClassBase {

    public Generator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Generator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "methods", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "mockClassName")
    @ConvertedParameter(
        index = 4,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "proxyTarget",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 10,
        name = "allowMockingUnknownTypes",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 11,
        name = "returnValueGeneration",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getMock(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject")
                        .setFile("/vendor/phpunit/phpunit/src/Framework/MockObject/Generator.php");
        Object type = assignParameter(args, 0, false);
        Object methods = assignParameter(args, 1, true);
        if (null == methods) {
            methods = ZVal.newArray();
        }
        Object arguments = assignParameter(args, 2, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 3, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 4, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 5, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 6, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object cloneArguments = assignParameter(args, 7, true);
        if (null == cloneArguments) {
            cloneArguments = true;
        }
        Object callOriginalMethods = assignParameter(args, 8, true);
        if (null == callOriginalMethods) {
            callOriginalMethods = false;
        }
        Object proxyTarget = assignParameter(args, 9, true);
        if (null == proxyTarget) {
            proxyTarget = ZVal.getNull();
        }
        Object allowMockingUnknownTypes = assignParameter(args, 10, true);
        if (null == allowMockingUnknownTypes) {
            allowMockingUnknownTypes = true;
        }
        Object returnValueGeneration = assignParameter(args, 11, true);
        if (null == returnValueGeneration) {
            returnValueGeneration = true;
        }
        Object method = null;
        Object _type = null;
        Object reflect = null;
        ReferenceContainer mock = new BasicReferenceContainer(null);
        if (ZVal.toBool(!function_is_array.f.env(env).call(type).getBool())
                && ZVal.toBool(!function_is_string.f.env(env).call(type).getBool())) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "array or string"));
        }

        if (!function_is_string.f.env(env).call(mockClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 4, "string"));
        }

        if (ZVal.toBool(!function_is_array.f.env(env).call(methods).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", methods))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(env, 2, "array", methods));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", "Traversable"))
                || ZVal.toBool(ZVal.strictEqualityCheck(type, "===", "\\Traversable"))) {
            type = "Iterator";
        }

        if (function_is_array.f.env(env).call(type).getBool()) {
            type =
                    function_array_unique
                            .f
                            .env(env)
                            .call(
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "PHPUnit\\Framework\\MockObject",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "type"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object type =
                                                                    assignParameter(args, 0, false);
                                                            if (ZVal.toBool(
                                                                            ZVal.toBool(
                                                                                            ZVal
                                                                                                    .strictEqualityCheck(
                                                                                                            type,
                                                                                                            "===",
                                                                                                            "Traversable"))
                                                                                    || ZVal.toBool(
                                                                                            ZVal
                                                                                                    .strictEqualityCheck(
                                                                                                            type,
                                                                                                            "===",
                                                                                                            "\\Traversable")))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            type,
                                                                                            "===",
                                                                                            "\\Iterator"))) {
                                                                return "Iterator";
                                                            }

                                                            return ZVal.assign(type);
                                                        }
                                                    },
                                                    type)
                                            .value())
                            .value();
        }

        if (!ZVal.isTrue(allowMockingUnknownTypes)) {
            if (function_is_array.f.env(env).call(type).getBool()) {
                for (ZPair zpairResult1141 : ZVal.getIterable(type, env, true)) {
                    _type = ZVal.assign(zpairResult1141.getValue());
                    if (ZVal.toBool(
                                    !function_class_exists
                                            .f
                                            .env(env)
                                            .call(_type, callAutoload)
                                            .getBool())
                            && ZVal.toBool(
                                    !NamespaceGlobal.interface_exists
                                            .env(env)
                                            .call(_type, callAutoload)
                                            .getBool())) {
                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Cannot stub or mock class or interface \"%s\" which does not exist",
                                                        _type)
                                                .value()));
                    }
                }

            } else {
                if (ZVal.toBool(
                                !function_class_exists
                                        .f
                                        .env(env)
                                        .call(type, callAutoload)
                                        .getBool())
                        && ZVal.toBool(
                                !NamespaceGlobal.interface_exists
                                        .env(env)
                                        .call(type, callAutoload)
                                        .getBool())) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Cannot stub or mock class or interface \"%s\" which does not exist",
                                                    type)
                                            .value()));
                }
            }
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", methods)) {
            for (ZPair zpairResult1142 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult1142.getValue());
                if (!function_preg_match
                        .f
                        .env(env)
                        .call("~[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*~", method)
                        .getBool()) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Cannot stub or mock method with invalid name \"%s\"",
                                                    method)
                                            .value()));
                }
            }

            if (ZVal.strictNotEqualityCheck(
                    methods, "!==", function_array_unique.f.env(env).call(methods).value())) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot stub or mock using a method list that contains duplicates: \"%s\" (duplicate: \"%s\")",
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", methods)
                                                        .value(),
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                function_array_unique
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                function_array_diff_assoc
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                methods,
                                                                                                function_array_unique
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                methods)
                                                                                                        .value())
                                                                                        .value())
                                                                        .value())
                                                        .value())
                                        .value()));
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(mockClassName, "!==", ""))
                && ZVal.toBool(
                        function_class_exists.f.env(env).call(mockClassName, false).value())) {
            reflect = new ReflectionClass(env, mockClassName);
            if (!ZVal.isTrue(
                    env.callMethod(
                            reflect,
                            "implementsInterface",
                            Generator.class,
                            MockObject.CONST_class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Class \"%s\" already exists.", mockClassName)
                                        .value()));
            }
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(callOriginalConstructor, "===", false))
                && ZVal.toBool(ZVal.strictEqualityCheck(callOriginalMethods, "===", true))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Proxying to original methods requires invoking the original constructor"));
        }

        mock.setObject(
                this.generate(
                        env,
                        type,
                        methods,
                        mockClassName,
                        callOriginalClone,
                        callAutoload,
                        cloneArguments,
                        callOriginalMethods));
        return ZVal.assign(
                this.getObject(
                        env,
                        mock.arrayGet(env, "code"),
                        mock.arrayGet(env, "mockClassName"),
                        type,
                        callOriginalConstructor,
                        callAutoload,
                        arguments,
                        callOriginalMethods,
                        proxyTarget,
                        returnValueGeneration));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalClassName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getMockForAbstractClass(RuntimeEnv env, Object... args) {
        Object originalClassName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, true);
        if (null == mockedMethods) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, true);
        if (null == cloneArguments) {
            cloneArguments = true;
        }
        Object method = null;
        Object reflector = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        if (!function_is_string.f.env(env).call(originalClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
        }

        if (!function_is_string.f.env(env).call(mockClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 3, "string"));
        }

        if (ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call(originalClassName, callAutoload)
                                .value())
                || ZVal.toBool(
                        NamespaceGlobal.interface_exists
                                .env(env)
                                .call(originalClassName, callAutoload)
                                .value())) {
            reflector = new ReflectionClass(env, originalClassName);
            methods.setObject(ZVal.assign(mockedMethods));
            for (ZPair zpairResult1143 :
                    ZVal.getIterable(
                            env.callMethod(reflector, "getMethods", Generator.class), env, true)) {
                method = ZVal.assign(zpairResult1143.getValue());
                if (ZVal.toBool(env.callMethod(method, "isAbstract", Generator.class))
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(method, "getName", Generator.class),
                                                methods.getObject(),
                                                true)
                                        .getBool())) {
                    methods.arrayAppend(env)
                            .set(env.callMethod(method, "getName", Generator.class));
                }
            }

            if (ZVal.isEmpty(methods.getObject())) {
                methods.setObject(ZVal.getNull());
            }

            return ZVal.assign(
                    this.getMock(
                            env,
                            originalClassName,
                            methods.getObject(),
                            arguments,
                            mockClassName,
                            callOriginalConstructor,
                            callOriginalClone,
                            callAutoload,
                            cloneArguments));
        }

        throw ZVal.getException(
                env,
                new RuntimeException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call("Class \"%s\" does not exist.", originalClassName)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "mockedMethods",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getMockForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object mockClassName = assignParameter(args, 2, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object mockedMethods = assignParameter(args, 6, true);
        if (null == mockedMethods) {
            mockedMethods = ZVal.newArray();
        }
        Object cloneArguments = assignParameter(args, 7, true);
        if (null == cloneArguments) {
            cloneArguments = true;
        }
        Object classTemplate = null;
        ReferenceContainer className = new BasicReferenceContainer(null);
        if (!function_is_string.f.env(env).call(traitName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
        }

        if (!function_is_string.f.env(env).call(mockClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 3, "string"));
        }

        if (!NamespaceGlobal.trait_exists.env(env).call(traitName, callAutoload).getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Trait \"%s\" does not exist.", traitName)
                                    .value()));
        }

        className.setObject(this.generateClassName(env, traitName, "", "Trait_"));
        classTemplate = this.getTemplate(env, "trait_class.tpl");
        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("prologue", "abstract "),
                        new ZPair("class_name", className.arrayGet(env, "className")),
                        new ZPair("trait_name", traitName)));
        this.evalClass(
                env,
                env.callMethod(classTemplate, "render", Generator.class),
                className.arrayGet(env, "className"));
        return ZVal.assign(
                this.getMockForAbstractClass(
                        env,
                        className.arrayGet(env, "className"),
                        arguments,
                        mockClassName,
                        callOriginalConstructor,
                        callOriginalClone,
                        callAutoload,
                        mockedMethods,
                        cloneArguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "traitName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "traitClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getObjectForTrait(RuntimeEnv env, Object... args) {
        Object traitName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object traitClassName = assignParameter(args, 2, true);
        if (null == traitClassName) {
            traitClassName = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = true;
        }
        Object callOriginalClone = assignParameter(args, 4, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 5, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object classTemplate = null;
        ReferenceContainer className = new BasicReferenceContainer(null);
        if (!function_is_string.f.env(env).call(traitName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
        }

        if (!function_is_string.f.env(env).call(traitClassName).getBool()) {
            throw ZVal.getException(
                    env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 3, "string"));
        }

        if (!NamespaceGlobal.trait_exists.env(env).call(traitName, callAutoload).getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Trait \"%s\" does not exist.", traitName)
                                    .value()));
        }

        className.setObject(this.generateClassName(env, traitName, traitClassName, "Trait_"));
        classTemplate = this.getTemplate(env, "trait_class.tpl");
        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("prologue", ""),
                        new ZPair("class_name", className.arrayGet(env, "className")),
                        new ZPair("trait_name", traitName)));
        return ZVal.assign(
                this.getObject(
                        env,
                        env.callMethod(classTemplate, "render", Generator.class),
                        className.arrayGet(env, "className")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "methods",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalClone",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callAutoload",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object methods = assignParameter(args, 1, true);
        if (null == methods) {
            methods = ZVal.getNull();
        }
        Object mockClassName = assignParameter(args, 2, true);
        if (null == mockClassName) {
            mockClassName = "";
        }
        Object callOriginalClone = assignParameter(args, 3, true);
        if (null == callOriginalClone) {
            callOriginalClone = true;
        }
        Object callAutoload = assignParameter(args, 4, true);
        if (null == callAutoload) {
            callAutoload = true;
        }
        Object cloneArguments = assignParameter(args, 5, true);
        if (null == cloneArguments) {
            cloneArguments = true;
        }
        Object callOriginalMethods = assignParameter(args, 6, true);
        if (null == callOriginalMethods) {
            callOriginalMethods = false;
        }
        Object mock = null;
        Object key = null;
        if (function_is_array.f.env(env).call(type).getBool()) {
            function_sort.f.env(env).call(type);
        }

        if (ZVal.strictEqualityCheck(mockClassName, "===", "")) {
            key =
                    NamespaceGlobal.md5
                            .env(env)
                            .call(
                                    function_is_array.f.env(env).call(type).getBool()
                                            ? NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("_", type)
                                                    .value()
                                            : toStringR(type, env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(methods)
                                                                    .value(),
                                                            env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(callOriginalClone)
                                                                    .value(),
                                                            env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(cloneArguments)
                                                                    .value(),
                                                            env)
                                                    + toStringR(
                                                            function_serialize
                                                                    .f
                                                                    .env(env)
                                                                    .call(callOriginalMethods)
                                                                    .value(),
                                                            env))
                            .value();
            if (arrayActionR(
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
                                    .classes
                                    .Generator
                                    .RequestStaticProperties
                                    .class,
                            "cache"),
                    env,
                    key)) {
                return ZVal.assign(
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
                                                .classes
                                                .Generator
                                                .RequestStaticProperties
                                                .class,
                                        "cache")
                                .arrayGet(env, key));
            }
        }

        mock =
                this.generateMock(
                        env,
                        type,
                        methods,
                        mockClassName,
                        callOriginalClone,
                        callAutoload,
                        cloneArguments,
                        callOriginalMethods);
        if (ZVal.isset(key)) {
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
                                    .classes
                                    .Generator
                                    .RequestStaticProperties
                                    .class,
                            "cache")
                    .arrayAccess(env, key)
                    .set(mock);
        }

        return ZVal.assign(mock);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wsdlFile")
    @ConvertedParameter(index = 1, name = "className")
    @ConvertedParameter(
        index = 2,
        name = "methods",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object generateClassFromWsdl(RuntimeEnv env, Object... args) {
        Object wsdlFile = assignParameter(args, 0, false);
        Object className = assignParameter(args, 1, false);
        Object methods = assignParameter(args, 2, true);
        if (null == methods) {
            methods = ZVal.newArray();
        }
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object method = null;
        Object classTemplate = null;
        Object i = null;
        Object methodTemplate = null;
        Object _methods = null;
        ReferenceContainer ___args = new BasicReferenceContainer(null);
        Object nameEnd = null;
        Object nameStart = null;
        Object methodsBuffer = null;
        Object name = null;
        Object namespace = null;
        Object parts = null;
        Object client = null;
        Object optionsBuffer = null;
        Object value = null;
        Object key = null;
        if (!function_extension_loaded.f.env(env).call("soap").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The SOAP extension is required to generate a mock object from WSDL."));
        }

        options =
                function_array_merge
                        .f
                        .env(env)
                        .call(options, ZVal.newArray(new ZPair("cache_wsdl", 0)))
                        .value();
        client = new SoapClient(env, wsdlFile, options);
        _methods =
                function_array_unique
                        .f
                        .env(env)
                        .call(env.callMethod(client, "__getFunctions", Generator.class))
                        .value();
        client = null;
        function_sort.f.env(env).call(_methods);
        methodTemplate = this.getTemplate(env, "wsdl_method.tpl");
        methodsBuffer = "";
        for (ZPair zpairResult1144 : ZVal.getIterable(_methods, env, true)) {
            method = ZVal.assign(zpairResult1144.getValue());
            nameStart = ZVal.add(function_strpos.f.env(env).call(method, " ").value(), 1);
            nameEnd = function_strpos.f.env(env).call(method, "(").value();
            name =
                    function_substr
                            .f
                            .env(env)
                            .call(method, nameStart, ZVal.subtract(nameEnd, nameStart))
                            .value();
            if (ZVal.toBool(ZVal.isEmpty(methods))
                    || ZVal.toBool(
                            function_in_array.f.env(env).call(name, methods, true).value())) {
                ___args.setObject(
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ",",
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        method,
                                                        ZVal.add(nameEnd, 1),
                                                        ZVal.subtract(
                                                                ZVal.subtract(
                                                                        function_strpos
                                                                                .f
                                                                                .env(env)
                                                                                .call(method, ")")
                                                                                .value(),
                                                                        nameEnd),
                                                                1))
                                                .value())
                                .value());
                for (ZPair zpairResult1145 :
                        ZVal.getIterable(
                                function_range
                                        .f
                                        .env(env)
                                        .call(
                                                0,
                                                ZVal.subtract(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(___args.getObject())
                                                                .value(),
                                                        1))
                                        .value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult1145.getValue());
                    ___args.arrayAccess(env, i)
                            .set(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    ___args.arrayGet(env, i),
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(___args.arrayGet(env, i), "$")
                                                            .value())
                                            .value());
                }

                env.callMethod(
                        methodTemplate,
                        "setVar",
                        Generator.class,
                        ZVal.newArray(
                                new ZPair("method_name", name),
                                new ZPair(
                                        "arguments",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(", ", ___args.getObject())
                                                .value())));
                methodsBuffer =
                        toStringR(methodsBuffer, env)
                                + toStringR(
                                        env.callMethod(methodTemplate, "render", Generator.class),
                                        env);
            }
        }

        optionsBuffer = "array(";
        for (ZPair zpairResult1146 : ZVal.getIterable(options, env, false)) {
            key = ZVal.assign(zpairResult1146.getKey());
            value = ZVal.assign(zpairResult1146.getValue());
            optionsBuffer =
                    toStringR(optionsBuffer, env)
                            + toStringR(key, env)
                            + " => "
                            + toStringR(value, env);
        }

        optionsBuffer = toStringR(optionsBuffer, env) + ")";
        classTemplate = this.getTemplate(env, "wsdl_class.tpl");
        namespace = "";
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(className, "\\").value(), "!==", false)) {
            parts = function_explode.f.env(env).call("\\", className).value();
            className = function_array_pop.f.env(env).call(parts).value();
            namespace =
                    "namespace "
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call("\\", parts).value(), env)
                            + ";"
                            + "\n\n";
        }

        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("namespace", namespace),
                        new ZPair("class_name", className),
                        new ZPair("wsdl", wsdlFile),
                        new ZPair("options", optionsBuffer),
                        new ZPair("methods", methodsBuffer)));
        return ZVal.assign(env.callMethod(classTemplate, "render", Generator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object getClassMethods(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object method = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        Object _pClass = null;
        _pClass = new ReflectionClass(env, className);
        methods.setObject(ZVal.newArray());
        for (ZPair zpairResult1147 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", Generator.class), env, true)) {
            method = ZVal.assign(zpairResult1147.getValue());
            if (ZVal.toBool(env.callMethod(method, "isPublic", Generator.class))
                    || ZVal.toBool(env.callMethod(method, "isAbstract", Generator.class))) {
                methods.arrayAppend(env).set(env.callMethod(method, "getName", Generator.class));
            }
        }

        return ZVal.assign(methods.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "className")
    @ConvertedParameter(index = 2, name = "type")
    @ConvertedParameter(
        index = 3,
        name = "callOriginalConstructor",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "callAutoload",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 6,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "proxyTarget",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "returnValueGeneration",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    private Object getObject(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object className = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = "";
        }
        Object callOriginalConstructor = assignParameter(args, 3, true);
        if (null == callOriginalConstructor) {
            callOriginalConstructor = false;
        }
        Object callAutoload = assignParameter(args, 4, true);
        if (null == callAutoload) {
            callAutoload = false;
        }
        Object arguments = assignParameter(args, 5, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object callOriginalMethods = assignParameter(args, 6, true);
        if (null == callOriginalMethods) {
            callOriginalMethods = false;
        }
        Object proxyTarget = assignParameter(args, 7, true);
        if (null == proxyTarget) {
            proxyTarget = ZVal.getNull();
        }
        Object returnValueGeneration = assignParameter(args, 8, true);
        if (null == returnValueGeneration) {
            returnValueGeneration = true;
        }
        Object exception = null;
        Object instantiator = null;
        Object _pClass = null;
        Object _object = null;
        this.evalClass(env, code, className);
        if (ZVal.toBool(
                        ZVal.toBool(callOriginalConstructor)
                                && ZVal.toBool(function_is_string.f.env(env).call(type).value()))
                && ZVal.toBool(
                        !NamespaceGlobal.interface_exists
                                .env(env)
                                .call(type, callAutoload)
                                .getBool())) {
            if (ZVal.strictEqualityCheck(
                    function_count.f.env(env).call(arguments).value(), "===", 0)) {
                _object = env.createNew(className);

            } else {
                _pClass = new ReflectionClass(env, className);
                _object = env.callMethod(_pClass, "newInstanceArgs", Generator.class, arguments);
            }

        } else {
            try {
                instantiator = new Instantiator(env);
                _object = env.callMethod(instantiator, "instantiate", Generator.class, className);
            } catch (ConvertedException convertedException128) {
                if (convertedException128.instanceOf(
                        ExceptionInterface.class,
                        "Doctrine\\Instantiator\\Exception\\ExceptionInterface")) {
                    exception = convertedException128.getObject();
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env, env.callMethod(exception, "getMessage", Generator.class)));
                } else {
                    throw convertedException128;
                }
            }
        }

        if (ZVal.isTrue(callOriginalMethods)) {
            if (!function_is_object.f.env(env).call(proxyTarget).getBool()) {
                if (ZVal.strictEqualityCheck(
                        function_count.f.env(env).call(arguments).value(), "===", 0)) {
                    proxyTarget = env.createNew(type);

                } else {
                    _pClass = new ReflectionClass(env, type);
                    proxyTarget =
                            env.callMethod(_pClass, "newInstanceArgs", Generator.class, arguments);
                }
            }

            env.callMethod(_object, "__phpunit_setOriginalObject", Generator.class, proxyTarget);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        _object, MockObject.class, "PHPUnit\\Framework\\MockObject\\MockObject"))) {
            env.callMethod(
                    _object,
                    "__phpunit_setReturnValueGeneration",
                    Generator.class,
                    returnValueGeneration);
        }

        return ZVal.assign(_object);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "className")
    private Object evalClass(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object className = assignParameter(args, 1, false);
        if (!function_class_exists.f.env(env).call(className, false).getBool()) {
            com.runtimeconverter.runtime.ZVal.notImplemented("Eval Statement is not supported");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "methods")
    @ConvertedParameter(index = 2, name = "mockClassName")
    @ConvertedParameter(index = 3, name = "callOriginalClone")
    @ConvertedParameter(index = 4, name = "callAutoload")
    @ConvertedParameter(index = 5, name = "cloneArguments")
    @ConvertedParameter(index = 6, name = "callOriginalMethods")
    private Object generateMock(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject")
                        .setFile("/vendor/phpunit/phpunit/src/Framework/MockObject/Generator.php");
        Object type = assignParameter(args, 0, false);
        ReferenceContainer methods = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer mockClassName =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object callOriginalClone = assignParameter(args, 3, false);
        Object callAutoload = assignParameter(args, 4, false);
        Object cloneArguments = assignParameter(args, 5, false);
        Object callOriginalMethods = assignParameter(args, 6, false);
        Object cloneMethod = null;
        Object classTemplate = null;
        Object methodTemplate = null;
        ReferenceContainer additionalInterfaces = new BasicReferenceContainer(null);
        Object epilogue = null;
        Object cloneTemplate = null;
        Object isInterface = null;
        Object _pClass = null;
        Object prologue = null;
        Object mockedMethods = null;
        Object isClass = null;
        Object method = null;
        Object e = null;
        Object _type = null;
        Object methodName = null;
        Object ternaryExpressionTemp = null;
        Object isMultipleInterfaces = null;
        ReferenceContainer methodReflections = new BasicReferenceContainer(null);
        Object typeClass = null;
        ReferenceContainer configurable = new BasicReferenceContainer(null);
        methodReflections.setObject(ZVal.newArray());
        classTemplate = this.getTemplate(env, "mocked_class.tpl");
        additionalInterfaces.setObject(ZVal.newArray());
        cloneTemplate = "";
        isClass = false;
        isInterface = false;
        isMultipleInterfaces = false;
        if (function_is_array.f.env(env).call(type).getBool()) {
            for (ZPair zpairResult1148 : ZVal.getIterable(type, env, true)) {
                _type = ZVal.assign(zpairResult1148.getValue());
                if (!NamespaceGlobal.interface_exists
                        .env(env)
                        .call(_type, callAutoload)
                        .getBool()) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Interface \"%s\" does not exist.", _type)
                                            .value()));
                }

                isMultipleInterfaces = true;
                additionalInterfaces.arrayAppend(env).set(_type);
                typeClass =
                        new ReflectionClass(
                                env,
                                handleReturnReference(
                                                this.generateClassName(
                                                        env,
                                                        _type,
                                                        mockClassName.getObject(),
                                                        "Mock_"))
                                        .arrayGet(env, "fullClassName"));
                for (ZPair zpairResult1149 :
                        ZVal.getIterable(this.getClassMethods(env, _type), env, true)) {
                    method = ZVal.assign(zpairResult1149.getValue());
                    if (function_in_array.f.env(env).call(method, methods.getObject()).getBool()) {
                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Duplicate method \"%s\" not allowed.",
                                                        method)
                                                .value()));
                    }

                    methodReflections
                            .arrayAccess(env, method)
                            .set(env.callMethod(typeClass, "getMethod", Generator.class, method));
                    methods.arrayAppend(env).set(method);
                }
            }
        }

        mockClassName.setObject(
                this.generateClassName(env, type, mockClassName.getObject(), "Mock_"));
        if (function_class_exists
                .f
                .env(env)
                .call(mockClassName.arrayGet(env, "fullClassName"), callAutoload)
                .getBool()) {
            isClass = true;

        } else if (NamespaceGlobal.interface_exists
                .env(env)
                .call(mockClassName.arrayGet(env, "fullClassName"), callAutoload)
                .getBool()) {
            isInterface = true;
        }

        if (ZVal.toBool(!ZVal.isTrue(isClass)) && ZVal.toBool(!ZVal.isTrue(isInterface))) {
            prologue =
                    "class "
                            + toStringR(mockClassName.arrayGet(env, "originalClassName"), env)
                            + "\n{\n}\n\n";
            if (!arrayActionR(ArrayAction.EMPTY, mockClassName, env, "namespaceName")) {
                prologue =
                        "namespace "
                                + toStringR(mockClassName.arrayGet(env, "namespaceName"), env)
                                + " {\n\n"
                                + toStringR(prologue, env)
                                + "}\n\n"
                                + "namespace {\n\n";
                epilogue = "\n\n}";
            }

            cloneTemplate = this.getTemplate(env, "mocked_clone.tpl");

        } else {
            _pClass = new ReflectionClass(env, mockClassName.arrayGet(env, "fullClassName"));
            if (ZVal.toBool(isInterface)
                    && ZVal.toBool(
                            env.callMethod(
                                    _pClass,
                                    "implementsInterface",
                                    Generator.class,
                                    "Throwable"))) {
                additionalInterfaces
                        .arrayAppend(env)
                        .set(env.callMethod(_pClass, "getName", Generator.class));
                isInterface = false;
                mockClassName.setObject(this.generateClassName(env, "Exception", "", "Mock_"));
                _pClass = new ReflectionClass(env, mockClassName.arrayGet(env, "fullClassName"));
            }

            if (ZVal.isTrue(env.callMethod(_pClass, "isFinal", Generator.class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Class \"%s\" is declared \"final\" and cannot be mocked.",
                                                mockClassName.arrayGet(env, "fullClassName"))
                                        .value()));
            }

            if (ZVal.isTrue(env.callMethod(_pClass, "hasMethod", Generator.class, "__clone"))) {
                cloneMethod = env.callMethod(_pClass, "getMethod", Generator.class, "__clone");
                if (!ZVal.isTrue(env.callMethod(cloneMethod, "isFinal", Generator.class))) {
                    if (ZVal.toBool(callOriginalClone) && ZVal.toBool(!ZVal.isTrue(isInterface))) {
                        cloneTemplate = this.getTemplate(env, "unmocked_clone.tpl");

                    } else {
                        cloneTemplate = this.getTemplate(env, "mocked_clone.tpl");
                    }
                }

            } else {
                cloneTemplate = this.getTemplate(env, "mocked_clone.tpl");
            }
        }

        if (function_is_object.f.env(env).call(cloneTemplate).getBool()) {
            cloneTemplate = env.callMethod(cloneTemplate, "render", Generator.class);
        }

        if (ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(methods.getObject()).value())
                                && ZVal.toBool(ZVal.isEmpty(methods.getObject())))
                && ZVal.toBool(ZVal.toBool(isClass) || ZVal.toBool(isInterface))) {
            methods.setObject(
                    this.getClassMethods(env, mockClassName.arrayGet(env, "fullClassName")));
        }

        if (!function_is_array.f.env(env).call(methods.getObject()).getBool()) {
            methods.setObject(ZVal.newArray());
        }

        mockedMethods = "";
        configurable.setObject(ZVal.newArray());
        for (ZPair zpairResult1150 : ZVal.getIterable(methods.getObject(), env, true)) {
            methodName = ZVal.assign(zpairResult1150.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(methodName, "!==", "__construct"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(methodName, "!==", "__clone"))) {
                configurable
                        .arrayAppend(env)
                        .set(NamespaceGlobal.strtolower.env(env).call(methodName).value());
            }
        }

        if (ZVal.isset(_pClass)) {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(isInterface)
                                                    && ZVal.toBool(
                                                            env.callMethod(
                                                                    _pClass,
                                                                    "implementsInterface",
                                                                    Generator.class,
                                                                    "Traversable")))
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            _pClass,
                                                            "implementsInterface",
                                                            Generator.class,
                                                            "Iterator"))))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            _pClass,
                                            "implementsInterface",
                                            Generator.class,
                                            "IteratorAggregate")))) {
                additionalInterfaces.arrayAppend(env).set("Iterator");
                methods.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(methods.getObject(), this.getClassMethods(env, "Iterator"))
                                .value());
            }

            for (ZPair zpairResult1151 : ZVal.getIterable(methods.getObject(), env, true)) {
                methodName = ZVal.assign(zpairResult1151.getValue());
                try {
                    method = env.callMethod(_pClass, "getMethod", Generator.class, methodName);
                    if (ZVal.isTrue(this.canMockMethod(env, method))) {
                        mockedMethods =
                                toStringR(mockedMethods, env)
                                        + toStringR(
                                                this.generateMockedMethodDefinitionFromExisting(
                                                        env,
                                                        method,
                                                        cloneArguments,
                                                        callOriginalMethods),
                                                env);
                    }

                } catch (ConvertedException convertedException129) {
                    if (convertedException129.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException129.getObject();
                        mockedMethods =
                                toStringR(mockedMethods, env)
                                        + toStringR(
                                                this.generateMockedMethodDefinition(
                                                        env,
                                                        mockClassName.arrayGet(
                                                                env, "fullClassName"),
                                                        methodName,
                                                        cloneArguments),
                                                env);
                    } else {
                        throw convertedException129;
                    }
                }
            }

        } else if (ZVal.isTrue(isMultipleInterfaces)) {
            for (ZPair zpairResult1152 : ZVal.getIterable(methods.getObject(), env, true)) {
                methodName = ZVal.assign(zpairResult1152.getValue());
                if (ZVal.isTrue(
                        this.canMockMethod(env, methodReflections.arrayGet(env, methodName)))) {
                    mockedMethods =
                            toStringR(mockedMethods, env)
                                    + toStringR(
                                            this.generateMockedMethodDefinitionFromExisting(
                                                    env,
                                                    methodReflections.arrayGet(env, methodName),
                                                    cloneArguments,
                                                    callOriginalMethods),
                                            env);
                }
            }

        } else {
            for (ZPair zpairResult1153 : ZVal.getIterable(methods.getObject(), env, true)) {
                methodName = ZVal.assign(zpairResult1153.getValue());
                mockedMethods =
                        toStringR(mockedMethods, env)
                                + toStringR(
                                        this.generateMockedMethodDefinition(
                                                env,
                                                mockClassName.arrayGet(env, "fullClassName"),
                                                methodName,
                                                cloneArguments),
                                        env);
            }
        }

        method = "";
        if (ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call("method", methods.getObject(), true)
                                .getBool())
                && ZVal.toBool(
                        ZVal.toBool(!ZVal.isset(_pClass))
                                || ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        _pClass,
                                                        "hasMethod",
                                                        Generator.class,
                                                        "method"))))) {
            methodTemplate = this.getTemplate(env, "mocked_class_method.tpl");
            method = env.callMethod(methodTemplate, "render", Generator.class);
        }

        env.callMethod(
                classTemplate,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair(
                                "prologue",
                                ZVal.isDefined(ternaryExpressionTemp = prologue)
                                        ? ternaryExpressionTemp
                                        : ""),
                        new ZPair(
                                "epilogue",
                                ZVal.isDefined(ternaryExpressionTemp = epilogue)
                                        ? ternaryExpressionTemp
                                        : ""),
                        new ZPair(
                                "class_declaration",
                                this.generateMockClassDeclaration(
                                        env,
                                        mockClassName.getObject(),
                                        isInterface,
                                        additionalInterfaces.getObject())),
                        new ZPair("clone", cloneTemplate),
                        new ZPair("mock_class_name", mockClassName.arrayGet(env, "className")),
                        new ZPair("mocked_methods", mockedMethods),
                        new ZPair("method", method),
                        new ZPair(
                                "configurable",
                                "["
                                        + toStringR(
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
                                                                                        "PHPUnit\\Framework\\MockObject",
                                                                                        this) {
                                                                                    @Override
                                                                                    @ConvertedMethod
                                                                                    @ConvertedParameter(
                                                                                        index = 0,
                                                                                        name = "m"
                                                                                    )
                                                                                    public Object
                                                                                            run(
                                                                                                    RuntimeEnv
                                                                                                            env,
                                                                                                    Object
                                                                                                            thisvar,
                                                                                                    PassByReferenceArgs
                                                                                                            runtimePassByReferenceArgs,
                                                                                                    Object...
                                                                                                            args) {
                                                                                        Object m =
                                                                                                assignParameter(
                                                                                                        args,
                                                                                                        0,
                                                                                                        false);
                                                                                        return ZVal
                                                                                                .assign(
                                                                                                        "'"
                                                                                                                + toStringR(
                                                                                                                        m,
                                                                                                                        env)
                                                                                                                + "'");
                                                                                    }
                                                                                },
                                                                                configurable
                                                                                        .getObject())
                                                                        .value())
                                                        .value(),
                                                env)
                                        + "]")));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("code", env.callMethod(classTemplate, "render", Generator.class)),
                        new ZPair("mockClassName", mockClassName.arrayGet(env, "className"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "className")
    @ConvertedParameter(index = 2, name = "prefix")
    private Object generateClassName(RuntimeEnv env, Object... args) {
        ReferenceContainer type = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object className = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, false);
        Object fullClassName = null;
        Object classNameParts = null;
        Object namespaceName = null;
        if (function_is_array.f.env(env).call(type.getObject()).getBool()) {
            type.setObject(NamespaceGlobal.implode.env(env).call("_", type.getObject()).value());
        }

        if (ZVal.strictEqualityCheck(type.arrayGet(env, 0), "===", "\\")) {
            type.setObject(function_substr.f.env(env).call(type.getObject(), 1).value());
        }

        classNameParts = function_explode.f.env(env).call("\\", type.getObject()).value();
        if (ZVal.isGreaterThan(function_count.f.env(env).call(classNameParts).value(), '>', 1)) {
            type.setObject(function_array_pop.f.env(env).call(classNameParts).value());
            namespaceName = NamespaceGlobal.implode.env(env).call("\\", classNameParts).value();
            fullClassName = toStringR(namespaceName, env) + "\\" + toStringR(type.getObject(), env);

        } else {
            namespaceName = "";
            fullClassName = ZVal.assign(type.getObject());
        }

        if (ZVal.strictEqualityCheck(className, "===", "")) {
            do {
                className =
                        toStringR(prefix, env)
                                + toStringR(type.getObject(), env)
                                + "_"
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.md5
                                                                .env(env)
                                                                .call(
                                                                        NamespaceGlobal.mt_rand
                                                                                .env(env)
                                                                                .call()
                                                                                .value())
                                                                .value(),
                                                        0,
                                                        8)
                                                .value(),
                                        env);

            } while (function_class_exists.f.env(env).call(className, false).getBool());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("className", className),
                        new ZPair("originalClassName", type.getObject()),
                        new ZPair("fullClassName", fullClassName),
                        new ZPair("namespaceName", namespaceName)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mockClassName", typeHint = "array")
    @ConvertedParameter(index = 1, name = "isInterface")
    @ConvertedParameter(
        index = 2,
        name = "additionalInterfaces",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object generateMockClassDeclaration(RuntimeEnv env, Object... args) {
        ReferenceContainer mockClassName =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object isInterface = assignParameter(args, 1, false);
        ReferenceContainer additionalInterfaces =
                new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == additionalInterfaces.getObject()) {
            additionalInterfaces.setObject(ZVal.newArray());
        }
        Object interfaces = null;
        Object buffer = null;
        buffer = "class ";
        additionalInterfaces.arrayAppend(env).set(MockObject.CONST_class);
        interfaces =
                NamespaceGlobal.implode
                        .env(env)
                        .call(", ", additionalInterfaces.getObject())
                        .value();
        if (ZVal.isTrue(isInterface)) {
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s implements %s",
                                                    mockClassName.arrayGet(env, "className"),
                                                    interfaces)
                                            .value(),
                                    env);
            if (!function_in_array
                    .f
                    .env(env)
                    .call(
                            mockClassName.arrayGet(env, "originalClassName"),
                            additionalInterfaces.getObject())
                    .getBool()) {
                buffer = toStringR(buffer, env) + ", ";
                if (!arrayActionR(ArrayAction.EMPTY, mockClassName, env, "namespaceName")) {
                    buffer =
                            toStringR(buffer, env)
                                    + toStringR(mockClassName.arrayGet(env, "namespaceName"), env)
                                    + "\\";
                }

                buffer =
                        toStringR(buffer, env)
                                + toStringR(mockClassName.arrayGet(env, "originalClassName"), env);
            }

        } else {
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s extends %s%s implements %s",
                                                    mockClassName.arrayGet(env, "className"),
                                                    !arrayActionR(
                                                                    ArrayAction.EMPTY,
                                                                    mockClassName,
                                                                    env,
                                                                    "namespaceName")
                                                            ? toStringR(
                                                                            mockClassName.arrayGet(
                                                                                    env,
                                                                                    "namespaceName"),
                                                                            env)
                                                                    + "\\"
                                                            : "",
                                                    mockClassName.arrayGet(
                                                            env, "originalClassName"),
                                                    interfaces)
                                            .value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    @ConvertedParameter(index = 1, name = "cloneArguments")
    @ConvertedParameter(index = 2, name = "callOriginalMethods")
    private Object generateMockedMethodDefinitionFromExisting(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object cloneArguments = assignParameter(args, 1, false);
        Object callOriginalMethods = assignParameter(args, 2, false);
        Object reference = null;
        Object modifier = null;
        ReferenceContainer deprecation = new BasicReferenceContainer(null);
        Object returnType = null;
        if (ZVal.isTrue(env.callMethod(method, "isPrivate", Generator.class))) {
            modifier = "private";

        } else if (ZVal.isTrue(env.callMethod(method, "isProtected", Generator.class))) {
            modifier = "protected";

        } else {
            modifier = "public";
        }

        if (ZVal.isTrue(env.callMethod(method, "isStatic", Generator.class))) {
            modifier = toStringR(modifier, env) + " static";
        }

        if (ZVal.isTrue(env.callMethod(method, "returnsReference", Generator.class))) {
            reference = "&";

        } else {
            reference = "";
        }

        if (ZVal.isTrue(env.callMethod(method, "hasReturnType", Generator.class))) {
            returnType =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(method, "getReturnType", Generator.class), env));

        } else {
            returnType = "";
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, deprecation))
                .call(
                        "#\\*[ \\t]*+@deprecated[ \\t]*+(.*?)\\r?+\\n[ \\t]*+\\*(?:[ \\t]*+@|/$)#s",
                        env.callMethod(method, "getDocComment", Generator.class),
                        deprecation.getObject())
                .getBool()) {
            deprecation.setObject(
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "#[ \\t]*\\r?\\n[ \\t]*+\\*[ \\t]*+#",
                                                    " ",
                                                    deprecation.arrayGet(env, 1))
                                            .value())
                            .value());

        } else {
            deprecation.setObject(false);
        }

        return ZVal.assign(
                this.generateMockedMethodDefinition(
                        env,
                        env.callMethod(
                                env.callMethod(method, "getDeclaringClass", Generator.class),
                                "getName",
                                Generator.class),
                        env.callMethod(method, "getName", Generator.class),
                        cloneArguments,
                        modifier,
                        this.getMethodParameters(env, method),
                        this.getMethodParameters(env, method, true),
                        returnType,
                        reference,
                        callOriginalMethods,
                        env.callMethod(method, "isStatic", Generator.class),
                        deprecation.getObject(),
                        ZVal.toBool(env.callMethod(method, "hasReturnType", Generator.class))
                                && ZVal.toBool(
                                        env.callMethod(
                                                env.callMethod(
                                                        method, "getReturnType", Generator.class),
                                                "allowsNull",
                                                Generator.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(
        index = 2,
        name = "cloneArguments",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "modifier")
    @ConvertedParameter(index = 4, name = "argumentsForDeclaration")
    @ConvertedParameter(index = 5, name = "argumentsForCall")
    @ConvertedParameter(index = 6, name = "returnType")
    @ConvertedParameter(index = 7, name = "reference")
    @ConvertedParameter(
        index = 8,
        name = "callOriginalMethods",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "static",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 10,
        name = "deprecation",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 11,
        name = "allowsReturnNull",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object generateMockedMethodDefinition(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object methodName = assignParameter(args, 1, false);
        Object cloneArguments = assignParameter(args, 2, true);
        if (null == cloneArguments) {
            cloneArguments = true;
        }
        Object modifier = assignParameter(args, 3, true);
        if (null == modifier) {
            modifier = "public";
        }
        Object argumentsForDeclaration = assignParameter(args, 4, true);
        if (null == argumentsForDeclaration) {
            argumentsForDeclaration = "";
        }
        Object argumentsForCall = assignParameter(args, 5, true);
        if (null == argumentsForCall) {
            argumentsForCall = "";
        }
        Object returnType = assignParameter(args, 6, true);
        if (null == returnType) {
            returnType = "";
        }
        Object reference = assignParameter(args, 7, true);
        if (null == reference) {
            reference = "";
        }
        Object callOriginalMethods = assignParameter(args, 8, true);
        if (null == callOriginalMethods) {
            callOriginalMethods = false;
        }
        Object _pStatic = assignParameter(args, 9, true);
        if (null == _pStatic) {
            _pStatic = false;
        }
        Object deprecation = assignParameter(args, 10, true);
        if (null == deprecation) {
            deprecation = false;
        }
        Object allowsReturnNull = assignParameter(args, 11, true);
        if (null == allowsReturnNull) {
            allowsReturnNull = false;
        }
        Object template = null;
        Object deprecationTemplate = null;
        Object reflector = null;
        Object parentClass = null;
        Object templateFile = null;
        if (ZVal.isTrue(_pStatic)) {
            templateFile = "mocked_static_method.tpl";

        } else {
            if (ZVal.strictEqualityCheck(returnType, "===", "void")) {
                templateFile =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s_method_void.tpl",
                                        ZVal.isTrue(callOriginalMethods) ? "proxied" : "mocked")
                                .value();

            } else {
                templateFile =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s_method.tpl",
                                        ZVal.isTrue(callOriginalMethods) ? "proxied" : "mocked")
                                .value();
            }
        }

        if (ZVal.strictEqualityCheck(returnType, "===", "self")) {
            returnType = ZVal.assign(className);
        }

        if (ZVal.strictEqualityCheck(returnType, "===", "parent")) {
            reflector = new ReflectionClass(env, className);
            parentClass = env.callMethod(reflector, "getParentClass", Generator.class);
            if (ZVal.strictEqualityCheck(parentClass, "===", ZVal.getNull())) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot mock %s::%s because \"parent\" return type declaration is used but %s does not have a parent class",
                                                className, methodName, className)
                                        .value()));
            }

            returnType = env.callMethod(parentClass, "getName", Generator.class);
        }

        if (ZVal.strictNotEqualityCheck(false, "!==", deprecation)) {
            deprecation =
                    ZVal.assign(
                            "The "
                                    + toStringR(className, env)
                                    + "::"
                                    + toStringR(methodName, env)
                                    + " method is deprecated ("
                                    + toStringR(deprecation, env)
                                    + ").");
            deprecationTemplate = this.getTemplate(env, "deprecation.tpl");
            env.callMethod(
                    deprecationTemplate,
                    "setVar",
                    Generator.class,
                    ZVal.newArray(
                            new ZPair(
                                    "deprecation",
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(deprecation, true)
                                            .value())));
            deprecation = env.callMethod(deprecationTemplate, "render", Generator.class);
        }

        template = this.getTemplate(env, templateFile);
        env.callMethod(
                template,
                "setVar",
                Generator.class,
                ZVal.newArray(
                        new ZPair("arguments_decl", argumentsForDeclaration),
                        new ZPair("arguments_call", argumentsForCall),
                        new ZPair("return_delim", ZVal.isTrue(returnType) ? ": " : ""),
                        new ZPair(
                                "return_type",
                                ZVal.isTrue(allowsReturnNull)
                                        ? "?" + toStringR(returnType, env)
                                        : returnType),
                        new ZPair(
                                "arguments_count",
                                !ZVal.isEmpty(argumentsForCall)
                                        ? ZVal.add(
                                                NamespaceGlobal.substr_count
                                                        .env(env)
                                                        .call(argumentsForCall, ",")
                                                        .value(),
                                                1)
                                        : 0),
                        new ZPair("class_name", className),
                        new ZPair("method_name", methodName),
                        new ZPair("modifier", modifier),
                        new ZPair("reference", reference),
                        new ZPair(
                                "clone_arguments", ZVal.isTrue(cloneArguments) ? "true" : "false"),
                        new ZPair("deprecation", deprecation)));
        return ZVal.assign(env.callMethod(template, "render", Generator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    private Object canMockMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                env.callMethod(
                                                                        method,
                                                                        "isConstructor",
                                                                        Generator.class))
                                                        || ZVal.toBool(
                                                                env.callMethod(
                                                                        method,
                                                                        "isFinal",
                                                                        Generator.class)))
                                        || ZVal.toBool(
                                                env.callMethod(
                                                        method, "isPrivate", Generator.class)))
                        || ZVal.toBool(
                                this.isMethodNameBlacklisted(
                                        env, env.callMethod(method, "getName", Generator.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object isMethodNameBlacklisted(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, CONST_BLACKLISTED_METHOD_NAMES, env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    @ConvertedParameter(
        index = 1,
        name = "forCall",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object getMethodParameters(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object method = assignParameter(args, 0, false);
        Object forCall = assignParameter(args, 1, true);
        if (null == forCall) {
            forCall = false;
        }
        Object nullable = null;
        Object e = null;
        Object i = null;
        Object typeDeclaration = null;
        Object reference = null;
        Object _pDefault = null;
        Object parameter = null;
        Object name = null;
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object value = null;
        parameters.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1154 :
                ZVal.getIterable(
                        env.callMethod(method, "getParameters", Generator.class), env, false)) {
            i = ZVal.assign(zpairResult1154.getKey());
            parameter = ZVal.assign(zpairResult1154.getValue());
            name = "$" + toStringR(env.callMethod(parameter, "getName", Generator.class), env);
            if (ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "$"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "$..."))) {
                name = "$arg" + toStringR(i, env);
            }

            if (ZVal.isTrue(env.callMethod(parameter, "isVariadic", Generator.class))) {
                if (ZVal.isTrue(forCall)) {
                    continue;
                }

                name = "..." + toStringR(name, env);
            }

            nullable = "";
            _pDefault = "";
            reference = "";
            typeDeclaration = "";
            if (!ZVal.isTrue(forCall)) {
                if (ZVal.toBool(env.callMethod(parameter, "hasType", Generator.class))
                        && ZVal.toBool(env.callMethod(parameter, "allowsNull", Generator.class))) {
                    nullable = "?";
                }

                if (ZVal.toBool(env.callMethod(parameter, "hasType", Generator.class))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        toStringR(
                                                env.callMethod(
                                                        parameter, "getType", Generator.class),
                                                env),
                                        "!==",
                                        "self"))) {
                    typeDeclaration =
                            toStringR(
                                            toStringR(
                                                    env.callMethod(
                                                            parameter, "getType", Generator.class),
                                                    env),
                                            env)
                                    + " ";

                } else if (ZVal.isTrue(env.callMethod(parameter, "isArray", Generator.class))) {
                    typeDeclaration = "array ";

                } else if (ZVal.isTrue(env.callMethod(parameter, "isCallable", Generator.class))) {
                    typeDeclaration = "callable ";

                } else {
                    try {
                        _pClass = env.callMethod(parameter, "getClass", Generator.class);
                    } catch (ConvertedException convertedException130) {
                        if (convertedException130.instanceOf(
                                ReflectionException.class, "ReflectionException")) {
                            e = convertedException130.getObject();
                            throw ZVal.getException(
                                    env,
                                    new RuntimeException(
                                            env,
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "Cannot mock %s::%s() because a class or "
                                                                    + "interface used in the signature is not loaded",
                                                            env.callMethod(
                                                                    env.callMethod(
                                                                            method,
                                                                            "getDeclaringClass",
                                                                            Generator.class),
                                                                    "getName",
                                                                    Generator.class),
                                                            env.callMethod(
                                                                    method,
                                                                    "getName",
                                                                    Generator.class))
                                                    .value(),
                                            0,
                                            e));
                        } else {
                            throw convertedException130;
                        }
                    }

                    if (ZVal.strictNotEqualityCheck(_pClass, "!==", ZVal.getNull())) {
                        typeDeclaration =
                                toStringR(env.callMethod(_pClass, "getName", Generator.class), env)
                                        + " ";
                    }
                }

                if (!ZVal.isTrue(env.callMethod(parameter, "isVariadic", Generator.class))) {
                    if (ZVal.isTrue(
                            env.callMethod(
                                    parameter, "isDefaultValueAvailable", Generator.class))) {
                        value =
                                env.callMethod(
                                        parameter, "getDefaultValueConstantName", Generator.class);
                        if (ZVal.strictEqualityCheck(value, "===", ZVal.getNull())) {
                            value =
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            parameter,
                                                            "getDefaultValue",
                                                            Generator.class),
                                                    true)
                                            .value();
                        }

                        _pDefault = " = " + toStringR(value, env);

                    } else if (ZVal.isTrue(
                            env.callMethod(parameter, "isOptional", Generator.class))) {
                        _pDefault = " = null";
                    }
                }
            }

            if (ZVal.isTrue(env.callMethod(parameter, "isPassedByReference", Generator.class))) {
                reference = "&";
            }

            parameters
                    .arrayAppend(env)
                    .set(
                            toStringR(nullable, env)
                                    + toStringR(typeDeclaration, env)
                                    + toStringR(reference, env)
                                    + toStringR(name, env)
                                    + toStringR(_pDefault, env));
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call(", ", parameters.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template")
    private Object getTemplate(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, false);
        Object filename = null;
        filename =
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/phpunit/phpunit/src/Framework/MockObject"),
                                env)
                        + toStringR("/", env)
                        + "Generator"
                        + toStringR("/", env)
                        + toStringR(template, env);
        if (!arrayActionR(
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
                                .classes
                                .Generator
                                .RequestStaticProperties
                                .class,
                        "templates"),
                env,
                filename)) {
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
                                    .classes
                                    .Generator
                                    .RequestStaticProperties
                                    .class,
                            "templates")
                    .arrayAccess(env, filename)
                    .set(new Text_Template(env, filename));
        }

        return ZVal.assign(
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
                                        .classes
                                        .Generator
                                        .RequestStaticProperties
                                        .class,
                                "templates")
                        .arrayGet(env, filename));
    }

    public static final Object CONST_BLACKLISTED_METHOD_NAMES =
            ZVal.newArray(
                    new ZPair("__CLASS__", true),
                    new ZPair("__DIR__", true),
                    new ZPair("__FILE__", true),
                    new ZPair("__FUNCTION__", true),
                    new ZPair("__LINE__", true),
                    new ZPair("__METHOD__", true),
                    new ZPair("__NAMESPACE__", true),
                    new ZPair("__TRAIT__", true),
                    new ZPair("__clone", true),
                    new ZPair("__halt_compiler", true));

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Generator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cache = ZVal.newArray();

        public Object templates = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Generator")
                    .setLookup(
                            Generator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("cache", "templates")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/MockObject/Generator.php")
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
