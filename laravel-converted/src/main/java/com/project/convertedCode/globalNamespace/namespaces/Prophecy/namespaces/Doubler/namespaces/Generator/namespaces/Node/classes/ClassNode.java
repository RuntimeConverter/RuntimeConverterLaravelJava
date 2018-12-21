package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.MethodNotExtendableException;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ClassNode.php

*/

public class ClassNode extends RuntimeClassBase {

    public Object parentClass = "stdClass";

    public Object interfaces = ZVal.newArray();

    public Object properties = ZVal.newArray();

    public Object unextendableMethods = ZVal.newArray();

    public Object methods = ZVal.newArray();

    public ClassNode(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getParentClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parentClass);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object setParentClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        this.parentClass =
                ZVal.isTrue(ternaryExpressionTemp = _pClass) ? ternaryExpressionTemp : "stdClass";
        return null;
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.interfaces);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object addInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasInterface(env, _pInterface))) {
            return null;
        }

        function_array_unshift.f.env(env).call(this.interfaces, _pInterface);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object hasInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(_pInterface, this.interfaces).value());
    }

    @ConvertedMethod
    public Object getProperties(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.properties);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object addProperty(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object visibility = assignParameter(args, 1, true);
        if (null == visibility) {
            visibility = "public";
        }
        visibility = NamespaceGlobal.strtolower.env(env).call(visibility).value();
        if (!function_in_array
                .f
                .env(env)
                .call(visibility, ZVal.arrayFromList("public", "private", "protected"))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("`%s` property visibility is not supported.", visibility)
                                    .value()));
        }

        new ReferenceClassProperty(this, "properties", env).arrayAccess(env, name).set(visibility);
        return null;
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methods);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\MethodNode"
    )
    public Object addMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object message = null;
        if (!ZVal.isTrue(
                this.isExtendable(env, env.callMethod(method, "getName", ClassNode.class)))) {
            message =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Method `%s` is not extendable, so can not be added.",
                                    env.callMethod(method, "getName", ClassNode.class))
                            .value();
            throw ZVal.getException(
                    env,
                    new MethodNotExtendableException(
                            env,
                            message,
                            this.getParentClass(env),
                            env.callMethod(method, "getName", ClassNode.class)));
        }

        new ReferenceClassProperty(this, "methods", env)
                .arrayAccess(env, env.callMethod(method, "getName", ClassNode.class))
                .set(method);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object removeMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "methods", env), env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.hasMethod(env, name))
                        ? new ReferenceClassProperty(this, "methods", env).arrayGet(env, name)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "methods", env),
                        env,
                        name));
    }

    @ConvertedMethod
    public Object getUnextendableMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.unextendableMethods);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unextendableMethod")
    public Object addUnextendableMethod(RuntimeEnv env, Object... args) {
        Object unextendableMethod = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.isExtendable(env, unextendableMethod))) {
            return null;
        }

        new ReferenceClassProperty(this, "unextendableMethods", env)
                .arrayAppend(env)
                .set(unextendableMethod);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object isExtendable(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        return ZVal.assign(
                !function_in_array.f.env(env).call(method, this.unextendableMethods).getBool());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\Node\\ClassNode";

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
                    .setName("Prophecy\\Doubler\\Generator\\Node\\ClassNode")
                    .setLookup(
                            ClassNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "interfaces",
                            "methods",
                            "parentClass",
                            "properties",
                            "unextendableMethods")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/Node/ClassNode.php")
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
