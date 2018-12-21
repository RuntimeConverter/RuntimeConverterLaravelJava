package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.RemoveBuiltinMethodsThatAreFinalPass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.RemoveUnserializeForInternalSerializableClassesPass;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.RemoveDestructorPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.ClassPass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.InterfacePass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.MagicMethodTypeHintsPass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.ClassNamePass;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.CallTypeHintPass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.ConstantsPass;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.TraitPass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.InstanceMockPass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.MockDefinition;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.MethodDefinitionPass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulationGenerator.php

*/

public class StringManipulationGenerator extends RuntimeClassBase implements Generator {

    public Object passes = ZVal.newArray();

    public StringManipulationGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringManipulationGenerator.class) {
            this.__construct(env, args);
        }
    }

    public StringManipulationGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "passes", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object passes = assignParameter(args, 0, false);
        this.passes = passes;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object code = null;
        Object pass = null;
        Object className = null;
        Object ternaryExpressionTemp = null;
        Object namedConfig = null;
        code =
                function_file_get_contents
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/mockery/mockery/library/Mockery/Generator"),
                                                env)
                                        + "/../Mock.php")
                        .value();
        className =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        config,
                                                        "getName",
                                                        StringManipulationGenerator.class))
                                ? ternaryExpressionTemp
                                : env.callMethod(
                                        config, "generateName", StringManipulationGenerator.class));
        namedConfig =
                env.callMethod(config, "rename", StringManipulationGenerator.class, className);
        for (ZPair zpairResult720 : ZVal.getIterable(this.passes, env, true)) {
            pass = ZVal.assign(zpairResult720.getValue());
            code =
                    env.callMethod(
                            pass, "apply", StringManipulationGenerator.class, code, namedConfig);
        }

        return ZVal.assign(new MockDefinition(env, namedConfig, code));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "pass",
        typeHint = "Mockery\\Generator\\StringManipulation\\Pass\\Pass"
    )
    public Object addPass(RuntimeEnv env, Object... args) {
        Object pass = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "passes", env).arrayAppend(env).set(pass);
        return null;
    }

    public static final Object CONST_class = "Mockery\\Generator\\StringManipulationGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object withDefaultPasses(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            ZVal.newArray(
                                    new ZPair(0, new CallTypeHintPass(env)),
                                    new ZPair(1, new MagicMethodTypeHintsPass(env)),
                                    new ZPair(2, new ClassPass(env)),
                                    new ZPair(3, new TraitPass(env)),
                                    new ZPair(4, new ClassNamePass(env)),
                                    new ZPair(5, new InstanceMockPass(env)),
                                    new ZPair(6, new InterfacePass(env)),
                                    new ZPair(7, new MethodDefinitionPass(env)),
                                    new ZPair(
                                            8,
                                            new RemoveUnserializeForInternalSerializableClassesPass(
                                                    env)),
                                    new ZPair(9, new RemoveBuiltinMethodsThatAreFinalPass(env)),
                                    new ZPair(10, new RemoveDestructorPass(env)),
                                    new ZPair(11, new ConstantsPass(env)))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\StringManipulationGenerator")
                    .setLookup(
                            StringManipulationGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("passes")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulationGenerator.php")
                    .addInterface("Mockery\\Generator\\Generator")
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
