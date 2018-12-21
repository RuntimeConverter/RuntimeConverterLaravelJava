package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/Specificity.php

*/

public class Specificity extends RuntimeClassBase {

    public Object a = null;

    public Object b = null;

    public Object c = null;

    public Specificity(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Specificity.class) {
            this.__construct(env, args);
        }
    }

    public Specificity(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "a", typeHint = "int")
    @ConvertedParameter(index = 1, name = "b", typeHint = "int")
    @ConvertedParameter(index = 2, name = "c", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object a = assignParameter(args, 0, false);
        Object b = assignParameter(args, 1, false);
        Object c = assignParameter(args, 2, false);
        this.a = a;
        this.b = b;
        this.c = c;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "specificity", typeHint = "self")
    public Object plus(RuntimeEnv env, Object... args) {
        Object specificity = assignParameter(args, 0, false);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .CssSelector
                        .namespaces
                        .Node
                        .classes
                        .Specificity(
                        env,
                        ZVal.add(
                                this.a,
                                toObjectR(specificity).accessProp(this, env).name("a").value()),
                        ZVal.add(
                                this.b,
                                toObjectR(specificity).accessProp(this, env).name("b").value()),
                        ZVal.add(
                                this.c,
                                toObjectR(specificity).accessProp(this, env).name("c").value())));
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        ZVal.add(
                                ZVal.multiply(this.a, CONST_A_FACTOR),
                                ZVal.multiply(this.b, CONST_B_FACTOR)),
                        ZVal.multiply(this.c, CONST_C_FACTOR)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "specificity", typeHint = "self")
    public Object compareTo(RuntimeEnv env, Object... args) {
        Object specificity = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                this.a, "!==", toObjectR(specificity).accessProp(this, env).name("a").value())) {
            return ZVal.assign(
                    ZVal.isGreaterThan(
                                    this.a,
                                    '>',
                                    toObjectR(specificity).accessProp(this, env).name("a").value())
                            ? 1
                            : -1);
        }

        if (ZVal.strictNotEqualityCheck(
                this.b, "!==", toObjectR(specificity).accessProp(this, env).name("b").value())) {
            return ZVal.assign(
                    ZVal.isGreaterThan(
                                    this.b,
                                    '>',
                                    toObjectR(specificity).accessProp(this, env).name("b").value())
                            ? 1
                            : -1);
        }

        if (ZVal.strictNotEqualityCheck(
                this.c, "!==", toObjectR(specificity).accessProp(this, env).name("c").value())) {
            return ZVal.assign(
                    ZVal.isGreaterThan(
                                    this.c,
                                    '>',
                                    toObjectR(specificity).accessProp(this, env).name("c").value())
                            ? 1
                            : -1);
        }

        return 0;
    }

    public static final Object CONST_A_FACTOR = 100;

    public static final Object CONST_B_FACTOR = 10;

    public static final Object CONST_C_FACTOR = 1;

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\Specificity";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\Specificity")
                    .setLookup(
                            Specificity.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("a", "b", "c")
                    .setFilename("vendor/symfony/css-selector/Node/Specificity.php")
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
