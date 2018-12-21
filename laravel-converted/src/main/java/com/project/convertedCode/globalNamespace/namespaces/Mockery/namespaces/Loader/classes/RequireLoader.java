package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Loader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Loader.classes.Loader;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Loader/RequireLoader.php

*/

public class RequireLoader extends RuntimeClassBase implements Loader {

    public Object path = null;

    public RequireLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequireLoader.class) {
            this.__construct(env, args);
        }
    }

    public RequireLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.path =
                ZVal.isTrue(ternaryExpressionTemp = function_realpath.f.env(env).call(path).value())
                        ? ternaryExpressionTemp
                        : NamespaceGlobal.sys_get_temp_dir.env(env).call().value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Mockery\\Generator\\MockDefinition"
    )
    public Object load(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope35 scope = new Scope35();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/mockery/mockery/library/Mockery/Loader")
                            .setFile(
                                    "/vendor/mockery/mockery/library/Mockery/Loader/RequireLoader.php");
            scope.definition = assignParameter(args, 0, false);
            scope.tmpfname = null;
            if (function_class_exists
                    .f
                    .env(env)
                    .call(
                            env.callMethod(scope.definition, "getClassName", RequireLoader.class),
                            false)
                    .getBool()) {
                throw new IncludeEventException(null);
            }

            scope.tmpfname =
                    toStringR(this.path, env)
                            + toStringR("/", env)
                            + "Mockery_"
                            + toStringR(NamespaceGlobal.uniqid.env(env).call().value(), env)
                            + ".php";
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            scope.tmpfname,
                            env.callMethod(scope.definition, "getCode", RequireLoader.class));
            env.include(
                    toStringR(scope.tmpfname, env),
                    stack,
                    runtimeConverterFunctionClassConstants,
                    true,
                    false);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public static final Object CONST_class = "Mockery\\Loader\\RequireLoader";

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
                    .setName("Mockery\\Loader\\RequireLoader")
                    .setLookup(
                            RequireLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("path")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Loader/RequireLoader.php")
                    .addInterface("Mockery\\Loader\\Loader")
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

    private static class Scope35 implements UpdateRuntimeScopeInterface {

        Object tmpfname;
        Object _thisVarAlias;
        Object definition;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tmpfname", this.tmpfname);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("definition", this.definition);
        }

        public void updateScope(RuntimeStack stack) {

            this.tmpfname = stack.getVariable("tmpfname");
            this._thisVarAlias = stack.getVariable("this");
            this.definition = stack.getVariable("definition");
        }
    }
}
