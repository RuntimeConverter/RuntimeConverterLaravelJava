package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Matcher;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsEqual;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Util.php

*/

public class Util extends RuntimeClassBase {

    public Util(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Util(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Hamcrest\\Util";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object registerGlobalFunctions(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope14 scope = new Scope14();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest")
                                .setFile(
                                        "/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Util.php");
                env.include(
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest"),
                                        env)
                                + "/../Hamcrest.php",
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "item")
        public Object wrapValueWithIsEqual(RuntimeEnv env, Object... args) {
            Object item = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.isTrue(ZVal.checkInstanceType(item, Matcher.class, "Hamcrest\\Matcher"))
                            ? item
                            : IsEqual.runtimeStaticObject.equalTo(env, item));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
        public Object checkAllAreMatchers(RuntimeEnv env, Object... args) {
            Object matchers = assignParameter(args, 0, false);
            Object m = null;
            for (ZPair zpairResult174 : ZVal.getIterable(matchers, env, true)) {
                m = ZVal.assign(zpairResult174.getValue());
                if (!ZVal.isTrue(ZVal.checkInstanceType(m, Matcher.class, "Hamcrest\\Matcher"))) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env, "Each argument or element must be a Hamcrest matcher"));
                }
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "items", typeHint = "array")
        public Object createMatcherArray(RuntimeEnv env, Object... args) {
            ReferenceContainer items = new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer item = new BasicReferenceContainer(null);
            if (ZVal.toBool(
                            ZVal.equalityCheck(
                                    function_count.f.env(env).call(items.getObject()).value(), 1))
                    && ZVal.toBool(
                            function_is_array.f.env(env).call(items.arrayGet(env, 0)).value())) {
                items.setObject(ZVal.assign(items.arrayGet(env, 0)));
            }

            for (ZPair zpairResult175 : ZVal.getIterable(items.getObject(), env, true)) {
                item = zpairResult175;
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                item.getObject(), Matcher.class, "Hamcrest\\Matcher"))) {
                    item.setObject(IsEqual.runtimeStaticObject.equalTo(env, item.getObject()));
                }
            }

            return ZVal.assign(items.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Util")
                    .setLookup(
                            Util.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Util.php")
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

    private static class Scope14 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
