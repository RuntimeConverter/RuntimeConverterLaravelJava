package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.stream.function_stream_resolve_include_path;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_vars;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/FileLoader.php

*/

public final class FileLoader extends RuntimeClassBase {

    public FileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FileLoader(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\FileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        public Object checkAndLoad(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object includePathFilename = null;
            Object localFile = null;
            Object isReadable = null;
            includePathFilename =
                    function_stream_resolve_include_path.f.env(env).call(filename).value();
            localFile =
                    toStringR(env.addRootFilesystemPrefix("/vendor/phpunit/phpunit/src/Util"), env)
                            + toStringR("/", env)
                            + toStringR(filename, env);
            isReadable =
                    ZVal.strictNotEqualityCheck(
                            function_fopen.f.env(env).call(includePathFilename, "r").value(),
                            "!==",
                            false);
            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(includePathFilename))
                                    || ZVal.toBool(!ZVal.isTrue(isReadable)))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(includePathFilename, "===", localFile))) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Cannot open file \"%s\"." + "\n", filename)
                                        .value()));
            }

            runtimeStaticObject.load(env, includePathFilename);
            return ZVal.assign(includePathFilename);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        public Object load(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope53 scope = new Scope53();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/phpunit/phpunit/src/Util")
                                .setFile("/vendor/phpunit/phpunit/src/Util/FileLoader.php");
                scope.filename = assignParameter(args, 0, false);
                scope.GLOBALS = new GlobalVariableReference(env, "GLOBALS");
                scope.variableName = null;
                scope.oldVariableNames = null;
                scope.newVariableNames = null;
                scope.newVariables = new BasicReferenceContainer(null);
                scope.oldVariableNames =
                        function_array_keys
                                .f
                                .env(env)
                                .call(function_get_defined_vars.f.env(env).call().value())
                                .value();
                env.include(
                        toStringR(scope.filename, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        false,
                        true);
                scope.newVariables.setObject(function_get_defined_vars.f.env(env).call().value());
                scope.newVariableNames =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        function_array_keys
                                                .f
                                                .env(env)
                                                .call(scope.newVariables.getObject())
                                                .value(),
                                        scope.oldVariableNames)
                                .value();
                for (ZPair zpairResult1284 : ZVal.getIterable(scope.newVariableNames, env, true)) {
                    scope.variableName = ZVal.assign(zpairResult1284.getValue());
                    if (ZVal.strictNotEqualityCheck(
                            scope.variableName, "!==", "oldVariableNames")) {
                        scope.GLOBALS
                                .arrayAccess(env, scope.variableName)
                                .set(scope.newVariables.arrayGet(env, scope.variableName));
                    }
                }

                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\FileLoader")
                    .setLookup(
                            FileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/FileLoader.php")
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

    private static class Scope53 implements UpdateRuntimeScopeInterface {

        ReferenceContainer GLOBALS;
        Object filename;
        Object variableName;
        Object oldVariableNames;
        Object _thisVarAlias;
        Object newVariableNames;
        ReferenceContainer newVariables;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("GLOBALS", this.GLOBALS);
            stack.setVariable("filename", this.filename);
            stack.setVariable("variableName", this.variableName);
            stack.setVariable("oldVariableNames", this.oldVariableNames);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("newVariableNames", this.newVariableNames);
            stack.setVariable("newVariables", this.newVariables);
        }

        public void updateScope(RuntimeStack stack) {

            this.GLOBALS = ZVal.getStackReference(stack.getVariable("GLOBALS"));
            this.filename = stack.getVariable("filename");
            this.variableName = stack.getVariable("variableName");
            this.oldVariableNames = stack.getVariable("oldVariableNames");
            this._thisVarAlias = stack.getVariable("this");
            this.newVariableNames = stack.getVariable("newVariableNames");
            this.newVariables = ZVal.getStackReference(stack.getVariable("newVariables"));
        }
    }
}
