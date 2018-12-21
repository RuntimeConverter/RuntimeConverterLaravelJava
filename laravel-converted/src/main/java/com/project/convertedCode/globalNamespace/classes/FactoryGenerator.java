package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.FactoryClass;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/FactoryGenerator.php

*/

public class FactoryGenerator extends RuntimeClassBase {

    public Object path = null;

    public Object factoryFiles = null;

    public FactoryGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FactoryGenerator.class) {
            this.__construct(env, args);
        }
    }

    public FactoryGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        this.factoryFiles = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factoryFile", typeHint = "FactoryFile")
    public Object addFactoryFile(RuntimeEnv env, Object... args) {
        Object factoryFile = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "factoryFiles", env).arrayAppend(env).set(factoryFile);
        return null;
    }

    @ConvertedMethod
    public Object generate(RuntimeEnv env, Object... args) {
        Object call = null;
        Object file = null;
        Object method = null;
        Object classes = null;
        Object _pClass = null;
        classes = this.getClassesWithFactoryMethods(env);
        for (ZPair zpairResult140 : ZVal.getIterable(classes, env, true)) {
            _pClass = ZVal.assign(zpairResult140.getValue());
            for (ZPair zpairResult141 :
                    ZVal.getIterable(
                            env.callMethod(_pClass, "getMethods", FactoryGenerator.class),
                            env,
                            true)) {
                method = ZVal.assign(zpairResult141.getValue());
                for (ZPair zpairResult142 :
                        ZVal.getIterable(
                                env.callMethod(method, "getCalls", FactoryGenerator.class),
                                env,
                                true)) {
                    call = ZVal.assign(zpairResult142.getValue());
                    for (ZPair zpairResult143 : ZVal.getIterable(this.factoryFiles, env, true)) {
                        file = ZVal.assign(zpairResult143.getValue());
                        env.callMethod(file, "addCall", FactoryGenerator.class, call);
                    }
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object write(RuntimeEnv env, Object... args) {
        Object file = null;
        for (ZPair zpairResult144 : ZVal.getIterable(this.factoryFiles, env, true)) {
            file = ZVal.assign(zpairResult144.getValue());
            env.callMethod(file, "build", FactoryGenerator.class);
            env.callMethod(file, "write", FactoryGenerator.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object getClassesWithFactoryMethods(RuntimeEnv env, Object... args) {
        Object file = null;
        ReferenceContainer classes = new BasicReferenceContainer(null);
        Object files = null;
        Object _pClass = null;
        classes.setObject(ZVal.newArray());
        files = this.getSortedFiles(env);
        for (ZPair zpairResult145 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult145.getValue());
            _pClass = this.getFactoryClass(env, file);
            if (ZVal.strictNotEqualityCheck(_pClass, "!==", ZVal.getNull())) {
                classes.arrayAppend(env).set(_pClass);
            }
        }

        return ZVal.assign(classes.getObject());
    }

    @ConvertedMethod
    public Object getSortedFiles(RuntimeEnv env, Object... args) {
        Object file = null;
        Object iter = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        iter =
                StaticMethodUtils.getStaticBaseClass(
                                ZVal.resolveClassAlias(env, "File_Iterator_Factory"), env)
                        .callUnknownStaticMethod(
                                env,
                                "getFileIterator",
                                new RuntimeArgsWithReferences(),
                                this.path,
                                ".php");
        files.setObject(ZVal.newArray());
        for (ZPair zpairResult146 : ZVal.getIterable(iter, env, true)) {
            file = ZVal.assign(zpairResult146.getValue());
            files.arrayAppend(env).set(file);
        }

        function_sort.f.env(env).call(files.getObject(), 2);
        return ZVal.assign(files.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object getFactoryClass(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope13 scope = new Scope13();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/hamcrest/hamcrest-php/generator")
                            .setFile(
                                    "/vendor/hamcrest/hamcrest-php/generator/FactoryGenerator.php");
            scope.file = assignParameter(args, 0, false);
            scope.name = null;
            scope._pClass = null;
            scope.name = this.getFactoryClassName(env, scope.file);
            if (ZVal.strictNotEqualityCheck(scope.name, "!==", ZVal.getNull())) {
                env.include(
                        toStringR(scope.file, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
                if (function_class_exists.f.env(env).call(scope.name).getBool()) {
                    scope._pClass =
                            new FactoryClass(
                                    env,
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    scope.file,
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(scope.file, "Hamcrest/")
                                                            .value())
                                            .value(),
                                    new ReflectionClass(env, scope.name));
                    if (ZVal.isTrue(
                            env.callMethod(scope._pClass, "isFactory", FactoryGenerator.class))) {
                        throw new IncludeEventException(ZVal.assign(scope._pClass));
                    }
                }
            }

            throw new IncludeEventException(ZVal.assign(ZVal.getNull()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object getFactoryClassName(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        ReferenceContainer namespace = new BasicReferenceContainer(null);
        ReferenceContainer className = new BasicReferenceContainer(null);
        Object content = null;
        content = function_file_get_contents.f.env(env).call(file).value();
        if (ZVal.toBool(
                        ZVal.toBool(
                                        function_preg_match
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithReferences()
                                                                .add(2, namespace))
                                                .call(
                                                        "/namespace\\s+(.+);/",
                                                        content,
                                                        namespace.getObject())
                                                .value())
                                && ZVal.toBool(
                                        function_preg_match
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithReferences()
                                                                .add(2, className))
                                                .call(
                                                        "/\\n\\s*class\\s+(\\w+)\\s+extends\\b/",
                                                        content,
                                                        className.getObject())
                                                .value()))
                && ZVal.toBool(
                        function_preg_match.f.env(env).call("/@factory\\b/", content).value())) {
            return ZVal.assign(
                    toStringR(namespace.arrayGet(env, 1), env)
                            + "\\"
                            + toStringR(className.arrayGet(env, 1), env));
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "FactoryGenerator";

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
                    .setName("FactoryGenerator")
                    .setLookup(
                            FactoryGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("factoryFiles", "path")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/FactoryGenerator.php")
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

    private static class Scope13 implements UpdateRuntimeScopeInterface {

        Object file;
        Object name;
        Object _thisVarAlias;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("name", this.name);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this.name = stack.getVariable("name");
            this._thisVarAlias = stack.getVariable("this");
            this._pClass = stack.getVariable("class");
        }
    }
}
