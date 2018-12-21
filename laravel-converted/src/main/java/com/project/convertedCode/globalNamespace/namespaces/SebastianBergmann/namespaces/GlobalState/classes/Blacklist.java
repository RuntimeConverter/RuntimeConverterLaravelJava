package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/Blacklist.php

*/

public class Blacklist extends RuntimeClassBase {

    public Object globalVariables = ZVal.newArray();

    public Object classes = ZVal.newArray();

    public Object classNamePrefixes = ZVal.newArray();

    public Object parentClasses = ZVal.newArray();

    public Object interfaces = ZVal.newArray();

    public Object staticAttributes = ZVal.newArray();

    public Blacklist(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Blacklist(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName", typeHint = "string")
    public Object addGlobalVariable(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "globalVariables", env)
                .arrayAccess(env, variableName)
                .set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object addClass(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "classes", env).arrayAppend(env).set(className);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object addSubclassesOf(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "parentClasses", env).arrayAppend(env).set(className);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interfaceName", typeHint = "string")
    public Object addImplementorsOf(RuntimeEnv env, Object... args) {
        Object interfaceName = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "interfaces", env).arrayAppend(env).set(interfaceName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classNamePrefix", typeHint = "string")
    public Object addClassNamePrefix(RuntimeEnv env, Object... args) {
        Object classNamePrefix = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "classNamePrefixes", env)
                .arrayAppend(env)
                .set(classNamePrefix);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
    public Object addStaticAttribute(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object attributeName = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "staticAttributes", env),
                env,
                className)) {
            new ReferenceClassProperty(this, "staticAttributes", env)
                    .arrayAccess(env, className)
                    .set(ZVal.newArray());
        }

        new ReferenceClassProperty(this, "staticAttributes", env)
                .arrayAccess(env, className, attributeName)
                .set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variableName", typeHint = "string")
    public Object isGlobalVariableBlacklisted(RuntimeEnv env, Object... args) {
        Object variableName = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "globalVariables", env),
                        env,
                        variableName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
    public Object isStaticAttributeBlacklisted(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object attributeName = assignParameter(args, 1, false);
        Object prefix = null;
        Object type = null;
        Object _pClass = null;
        if (function_in_array.f.env(env).call(className, this.classes).getBool()) {
            return ZVal.assign(true);
        }

        for (ZPair zpairResult1459 : ZVal.getIterable(this.classNamePrefixes, env, true)) {
            prefix = ZVal.assign(zpairResult1459.getValue());
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(className, prefix).value(), "===", 0)) {
                return ZVal.assign(true);
            }
        }

        _pClass = new ReflectionClass(env, className);
        for (ZPair zpairResult1460 : ZVal.getIterable(this.parentClasses, env, true)) {
            type = ZVal.assign(zpairResult1460.getValue());
            if (ZVal.isTrue(env.callMethod(_pClass, "isSubclassOf", Blacklist.class, type))) {
                return ZVal.assign(true);
            }
        }

        for (ZPair zpairResult1461 : ZVal.getIterable(this.interfaces, env, true)) {
            type = ZVal.assign(zpairResult1461.getValue());
            if (ZVal.isTrue(
                    env.callMethod(_pClass, "implementsInterface", Blacklist.class, type))) {
                return ZVal.assign(true);
            }
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "staticAttributes", env),
                env,
                className,
                attributeName)) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\Blacklist";

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
                    .setName("SebastianBergmann\\GlobalState\\Blacklist")
                    .setLookup(
                            Blacklist.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "classNamePrefixes",
                            "classes",
                            "globalVariables",
                            "interfaces",
                            "parentClasses",
                            "staticAttributes")
                    .setFilename("vendor/sebastian/global-state/src/Blacklist.php")
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
