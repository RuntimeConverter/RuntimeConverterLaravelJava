package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.namespaces.TraitUseAdaptation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.TraitUseAdaptation;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/TraitUseAdaptation/Alias.php

*/

public class Alias extends TraitUseAdaptation {

    public Object newModifier = null;

    public Object newName = null;

    public Alias(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Alias.class) {
            this.__construct(env, args);
        }
    }

    public Alias(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trait")
    @ConvertedParameter(index = 1, name = "method")
    @ConvertedParameter(index = 2, name = "newModifier")
    @ConvertedParameter(index = 3, name = "newName")
    @ConvertedParameter(
        index = 4,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object trait = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object newModifier = assignParameter(args, 2, false);
        Object newName = assignParameter(args, 3, false);
        Object attributes = assignParameter(args, 4, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        toObjectR(this).accessProp(this, env).name("trait").set(trait);
        toObjectR(this)
                .accessProp(this, env)
                .name("method")
                .set(
                        function_is_string.f.env(env).call(method).getBool()
                                ? new Identifier(env, method)
                                : method);
        this.newModifier = newModifier;
        this.newName =
                function_is_string.f.env(env).call(newName).getBool()
                        ? new Identifier(env, newName)
                        : newName;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("trait", "method", "newModifier", "newName"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_TraitUseAdaptation_Alias";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\TraitUseAdaptation\\Alias";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TraitUseAdaptation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Stmt\\TraitUseAdaptation\\Alias")
                    .setLookup(
                            Alias.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "method", "newModifier", "newName", "trait")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/TraitUseAdaptation/Alias.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Stmt\\TraitUseAdaptation")
                    .addExtendsClass("PhpParser\\Node\\Stmt")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
