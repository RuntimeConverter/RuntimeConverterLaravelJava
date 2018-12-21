package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/TestMakeCommand.php

*/

public class TestMakeCommand extends GeneratorCommand {

    public TestMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "make:test {name : The name of the class} {--unit : Create a unit test}";
        this.description = "Create a new test class";
        this.type = "Test";
        if (this.getClass() == TestMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public TestMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "option", TestMakeCommand.class, "unit"))) {
            return ZVal.assign(
                    toStringR(
                                    env.addRootFilesystemPrefix(
                                            "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                    env)
                            + "/stubs/unit-test.stub");
        }

        return ZVal.assign(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                env)
                        + "/stubs/test.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getPath(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        name = Str.runtimeStaticObject.replaceFirst(env, this.rootNamespace(env), "", name);
        return ZVal.assign(
                toStringR(base_path.f.env(env).call("tests").value(), env)
                        + toStringR(
                                function_str_replace.f.env(env).call("\\", "/", name).value(), env)
                        + ".php");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(this, "option", TestMakeCommand.class, "unit"))) {
            return ZVal.assign(toStringR(rootNamespace, env) + "\\Unit");

        } else {
            return ZVal.assign(toStringR(rootNamespace, env) + "\\Feature");
        }
    }

    @ConvertedMethod
    protected Object rootNamespace(RuntimeEnv env, Object... args) {
        return "Tests";
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\TestMakeCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GeneratorCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\TestMakeCommand")
                    .setLookup(
                            TestMakeCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "files",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "type",
                            "type",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/TestMakeCommand.php")
                    .addExtendsClass("Illuminate\\Console\\GeneratorCommand")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
