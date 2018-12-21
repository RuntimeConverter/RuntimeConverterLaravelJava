package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.ArgumentNode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.MethodNode;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.ClassNode;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.ClassMirrorException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassMirror.php

*/

public class ClassMirror extends RuntimeClassBase {

    public ClassMirror(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassMirror(NoConstructor n) {
        super(n);
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
    public Object reflect(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, false);
        Object node = null;
        Object _pInterface = null;
        node = new ClassNode(env);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)) {
            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(_pClass, "isInterface", ClassMirror.class))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Could not reflect %s as a class, because it\n"
                                                        + "is interface - use the second argument instead.",
                                                env.callMethod(
                                                        _pClass, "getName", ClassMirror.class))
                                        .value()));
            }

            this.reflectClassToNode(env, _pClass, node);
        }

        for (ZPair zpairResult958 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult958.getValue());
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
                                                        + "a second argument to `ClassMirror::reflect(...)`, but got %s.",
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

            if (ZVal.strictEqualityCheck(
                    false, "===", env.callMethod(_pInterface, "isInterface", ClassMirror.class))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Could not reflect %s as an interface, because it\n"
                                                        + "is class - use the first argument instead.",
                                                env.callMethod(
                                                        _pInterface, "getName", ClassMirror.class))
                                        .value()));
            }

            this.reflectInterfaceToNode(env, _pInterface, node);
        }

        env.callMethod(
                node,
                "addInterface",
                ClassMirror.class,
                "Prophecy\\Doubler\\Generator\\ReflectionInterface");
        return ZVal.assign(node);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(
        index = 1,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object reflectClassToNode(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object _pClass = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        Object method = null;
        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(_pClass, "isFinal", ClassMirror.class))) {
            throw ZVal.getException(
                    env,
                    new ClassMirrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Could not reflect class %s as it is marked final.",
                                            env.callMethod(_pClass, "getName", ClassMirror.class))
                                    .value(),
                            _pClass));
        }

        env.callMethod(
                node,
                "setParentClass",
                ClassMirror.class,
                env.callMethod(_pClass, "getName", ClassMirror.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult959 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", ClassMirror.class, 2), env, true)) {
            method = ZVal.assign(zpairResult959.getValue());
            if (ZVal.strictEqualityCheck(
                    false, "===", env.callMethod(method, "isProtected", ClassMirror.class))) {
                continue;
            }

            this.reflectMethodToNode(env, method, node);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult960 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", ClassMirror.class, 256), env, true)) {
            method = ZVal.assign(zpairResult960.getValue());
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            method, "getName", ClassMirror.class),
                                                    "_")
                                            .value()))
                    && ZVal.toBool(
                            !function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(method, "getName", ClassMirror.class),
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Prophecy
                                                                    .namespaces
                                                                    .Doubler
                                                                    .namespaces
                                                                    .Generator
                                                                    .classes
                                                                    .ClassMirror
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .reflectableMethods)
                                    .getBool())) {
                continue;
            }

            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(method, "isFinal", ClassMirror.class))) {
                env.callMethod(
                        node,
                        "addUnextendableMethod",
                        ClassMirror.class,
                        env.callMethod(method, "getName", ClassMirror.class));
                continue;
            }

            this.reflectMethodToNode(env, method, node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface", typeHint = "ReflectionClass")
    @ConvertedParameter(
        index = 1,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object reflectInterfaceToNode(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        Object method = null;
        env.callMethod(
                node,
                "addInterface",
                ClassMirror.class,
                env.callMethod(_pInterface, "getName", ClassMirror.class));
        for (ZPair zpairResult961 :
                ZVal.getIterable(
                        env.callMethod(_pInterface, "getMethods", ClassMirror.class), env, true)) {
            method = ZVal.assign(zpairResult961.getValue());
            this.reflectMethodToNode(env, method, node);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    @ConvertedParameter(
        index = 1,
        name = "classNode",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    private Object reflectMethodToNode(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object classNode = assignParameter(args, 1, false);
        Object node = null;
        Object returnTypeLower = null;
        Object param = null;
        Object params = null;
        Object returnType = null;
        node = new MethodNode(env, env.callMethod(method, "getName", ClassMirror.class));
        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(method, "isProtected", ClassMirror.class))) {
            env.callMethod(node, "setVisibility", ClassMirror.class, "protected");
        }

        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(method, "isStatic", ClassMirror.class))) {
            env.callMethod(node, "setStatic", ClassMirror.class);
        }

        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(method, "returnsReference", ClassMirror.class))) {
            env.callMethod(node, "setReturnsReference", ClassMirror.class);
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.2.11-dev", "7.0", ">=")
                                .value())
                && ZVal.toBool(env.callMethod(method, "hasReturnType", ClassMirror.class))) {
            returnType =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(method, "getReturnType", ClassMirror.class),
                                    env));
            returnTypeLower = NamespaceGlobal.strtolower.env(env).call(returnType).value();
            if (ZVal.strictEqualityCheck("self", "===", returnTypeLower)) {
                returnType =
                        env.callMethod(
                                env.callMethod(method, "getDeclaringClass", ClassMirror.class),
                                "getName",
                                ClassMirror.class);
            }

            if (ZVal.strictEqualityCheck("parent", "===", returnTypeLower)) {
                returnType =
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                method, "getDeclaringClass", ClassMirror.class),
                                        "getParentClass",
                                        ClassMirror.class),
                                "getName",
                                ClassMirror.class);
            }

            env.callMethod(node, "setReturnType", ClassMirror.class, returnType);
            if (ZVal.toBool(
                            NamespaceGlobal.version_compare
                                    .env(env)
                                    .call("7.2.11-dev", "7.1", ">=")
                                    .value())
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(method, "getReturnType", ClassMirror.class),
                                    "allowsNull",
                                    ClassMirror.class))) {
                env.callMethod(node, "setNullableReturnType", ClassMirror.class, true);
            }
        }

        if (ZVal.toBool(
                        function_is_array
                                .f
                                .env(env)
                                .call(
                                        params =
                                                env.callMethod(
                                                        method, "getParameters", ClassMirror.class))
                                .value())
                && ZVal.toBool(function_count.f.env(env).call(params).value())) {
            for (ZPair zpairResult962 : ZVal.getIterable(params, env, true)) {
                param = ZVal.assign(zpairResult962.getValue());
                this.reflectArgumentToNode(env, param, node);
            }
        }

        env.callMethod(classNode, "addMethod", ClassMirror.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    @ConvertedParameter(
        index = 1,
        name = "methodNode",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\MethodNode"
    )
    private Object reflectArgumentToNode(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object methodNode = assignParameter(args, 1, false);
        Object node = null;
        Object name = null;
        name =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        env.callMethod(parameter, "getName", ClassMirror.class),
                                        "...")
                                ? "__dot_dot_dot__"
                                : env.callMethod(parameter, "getName", ClassMirror.class));
        node = new ArgumentNode(env, name);
        env.callMethod(node, "setTypeHint", ClassMirror.class, this.getTypeHint(env, parameter));
        if (ZVal.isTrue(this.isVariadic(env, parameter))) {
            env.callMethod(node, "setAsVariadic", ClassMirror.class);
        }

        if (ZVal.isTrue(this.hasDefaultValue(env, parameter))) {
            env.callMethod(
                    node, "setDefault", ClassMirror.class, this.getDefaultValue(env, parameter));
        }

        if (ZVal.isTrue(env.callMethod(parameter, "isPassedByReference", ClassMirror.class))) {
            env.callMethod(node, "setAsPassedByReference", ClassMirror.class);
        }

        env.callMethod(methodNode, "addArgument", ClassMirror.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object hasDefaultValue(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.isVariadic(env, parameter))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(env.callMethod(parameter, "isDefaultValueAvailable", ClassMirror.class))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.toBool(env.callMethod(parameter, "isOptional", ClassMirror.class))
                        || ZVal.toBool(this.isNullable(env, parameter)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object getDefaultValue(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(parameter, "isDefaultValueAvailable", ClassMirror.class))) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(env.callMethod(parameter, "getDefaultValue", ClassMirror.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object getTypeHint(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object className = null;
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(), "!==", className = this.getParameterClassName(env, parameter))) {
            return ZVal.assign(className);
        }

        if (ZVal.strictEqualityCheck(
                true, "===", env.callMethod(parameter, "isArray", ClassMirror.class))) {
            return "array";
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.2.11-dev", "5.4", ">=")
                                .value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(parameter, "isCallable", ClassMirror.class)))) {
            return "callable";
        }

        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.2.11-dev", "7.0", ">=")
                                .value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(parameter, "hasType", ClassMirror.class)))) {
            return ZVal.assign(
                    toStringR(env.callMethod(parameter, "getType", ClassMirror.class), env));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object isVariadic(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70211, ">=", 50600))
                        && ZVal.toBool(env.callMethod(parameter, "isVariadic", ClassMirror.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object isNullable(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(parameter, "allowsNull", ClassMirror.class))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.getNull(), "!==", this.getTypeHint(env, parameter))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    private Object getParameterClassName(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object e = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        try {
            return ZVal.assign(
                    ZVal.isTrue(env.callMethod(parameter, "getClass", ClassMirror.class))
                            ? env.callMethod(
                                    env.callMethod(parameter, "getClass", ClassMirror.class),
                                    "getName",
                                    ClassMirror.class)
                            : ZVal.getNull());
        } catch (ConvertedException convertedException117) {
            if (convertedException117.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException117.getObject();
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/\\[\\s\\<\\w+?>\\s([\\w,\\\\]+)/s", parameter, matches.getObject());
                return ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, matches, env, 1)
                                ? matches.arrayGet(env, 1)
                                : ZVal.getNull());
            } else {
                throw convertedException117;
            }
        }
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\ClassMirror";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object reflectableMethods =
                ZVal.arrayFromList(
                        "__construct",
                        "__destruct",
                        "__sleep",
                        "__wakeup",
                        "__toString",
                        "__call",
                        "__invoke");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\ClassMirror")
                    .setLookup(
                            ClassMirror.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("reflectableMethods")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/ClassMirror.php")
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
