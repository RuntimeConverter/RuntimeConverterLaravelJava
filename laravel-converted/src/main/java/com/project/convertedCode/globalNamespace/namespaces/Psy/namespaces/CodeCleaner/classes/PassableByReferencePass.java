package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.MethodCall;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PropertyFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/PassableByReferencePass.php

*/

public class PassableByReferencePass extends CodeCleanerPass {

    public PassableByReferencePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PassableByReferencePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object e = null;
        Object param = null;
        Object arg = null;
        Object name = null;
        Object refl = null;
        Object key = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(node, FuncCall.class, "PhpParser\\Node\\Expr\\FuncCall"))) {
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    toObjectR(node).accessProp(this, env).name("name").value(),
                                    Expr.class,
                                    "PhpParser\\Node\\Expr"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    toObjectR(node).accessProp(this, env).name("name").value(),
                                    Variable.class,
                                    "PhpParser\\Node\\Expr\\Variable"))) {
                return null;
            }

            name =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(node).accessProp(this, env).name("name").value(),
                                    env));
            if (ZVal.strictEqualityCheck(name, "===", "array_multisort")) {
                return ZVal.assign(this.validateArrayMultisort(env, node));
            }

            try {
                refl = new ReflectionFunction(env, name);
            } catch (ConvertedException convertedException175) {
                if (convertedException175.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException175.getObject();
                    return null;
                } else {
                    throw convertedException175;
                }
            }

            for (ZPair zpairResult1344 :
                    ZVal.getIterable(
                            env.callMethod(refl, "getParameters", PassableByReferencePass.class),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult1344.getKey());
                param = ZVal.assign(zpairResult1344.getValue());
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(key, toObjectR(node).accessProp(this, env).name("args").value())
                        .getBool()) {
                    arg =
                            ZVal.assign(
                                    new ReferenceClassProperty(node, "args", env)
                                            .arrayGet(env, key));
                    if (ZVal.toBool(
                                    env.callMethod(
                                            param,
                                            "isPassedByReference",
                                            PassableByReferencePass.class))
                            && ZVal.toBool(!ZVal.isTrue(this.isPassableByReference(env, arg)))) {
                        throw ZVal.getException(
                                env,
                                new FatalErrorException(
                                        env,
                                        CONST_EXCEPTION_MESSAGE,
                                        0,
                                        1,
                                        ZVal.getNull(),
                                        env.callMethod(
                                                node, "getLine", PassableByReferencePass.class)));
                    }
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arg", typeHint = "PhpParser\\Node")
    private Object isPassableByReference(RuntimeEnv env, Object... args) {
        Object arg = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                        .checkInstanceType(
                                                                                                                toObjectR(
                                                                                                                                arg)
                                                                                                                        .accessProp(
                                                                                                                                this,
                                                                                                                                env)
                                                                                                                        .name(
                                                                                                                                "value")
                                                                                                                        .value(),
                                                                                                                ClassConstFetch
                                                                                                                        .class,
                                                                                                                "PhpParser\\Node\\Expr\\ClassConstFetch"))
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .checkInstanceType(
                                                                                                                        toObjectR(
                                                                                                                                        arg)
                                                                                                                                .accessProp(
                                                                                                                                        this,
                                                                                                                                        env)
                                                                                                                                .name(
                                                                                                                                        "value")
                                                                                                                                .value(),
                                                                                                                        PropertyFetch
                                                                                                                                .class,
                                                                                                                        "PhpParser\\Node\\Expr\\PropertyFetch")))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .checkInstanceType(
                                                                                                toObjectR(
                                                                                                                arg)
                                                                                                        .accessProp(
                                                                                                                this,
                                                                                                                env)
                                                                                                        .name(
                                                                                                                "value")
                                                                                                        .value(),
                                                                                                Variable
                                                                                                        .class,
                                                                                                "PhpParser\\Node\\Expr\\Variable")))
                                                        || ZVal.toBool(
                                                                ZVal.checkInstanceType(
                                                                        toObjectR(arg)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("value")
                                                                                .value(),
                                                                        FuncCall.class,
                                                                        "PhpParser\\Node\\Expr\\FuncCall")))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        toObjectR(arg)
                                                                .accessProp(this, env)
                                                                .name("value")
                                                                .value(),
                                                        MethodCall.class,
                                                        "PhpParser\\Node\\Expr\\MethodCall")))
                        || ZVal.toBool(
                                ZVal.checkInstanceType(
                                        toObjectR(arg).accessProp(this, env).name("value").value(),
                                        StaticCall.class,
                                        "PhpParser\\Node\\Expr\\StaticCall")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    private Object validateArrayMultisort(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        ReferenceContainer nonPassable = new BasicReferenceContainer(null);
        Object arg = null;
        nonPassable.setObject(2);
        for (ZPair zpairResult1345 :
                ZVal.getIterable(
                        toObjectR(node).accessProp(this, env).name("args").value(), env, true)) {
            arg = ZVal.assign(zpairResult1345.getValue());
            if (ZVal.isTrue(this.isPassableByReference(env, arg))) {
                nonPassable.setObject(0);

            } else if (ZVal.isGreaterThan(ZVal.preIncrement(nonPassable), '>', 2)) {
                throw ZVal.getException(
                        env,
                        new FatalErrorException(
                                env,
                                CONST_EXCEPTION_MESSAGE,
                                0,
                                1,
                                ZVal.getNull(),
                                env.callMethod(node, "getLine", PassableByReferencePass.class)));
            }
        }

        return null;
    }

    public static final Object CONST_EXCEPTION_MESSAGE =
            "Only variables can be passed by reference";

    public static final Object CONST_class = "Psy\\CodeCleaner\\PassableByReferencePass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CodeCleanerPass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\PassableByReferencePass")
                    .setLookup(
                            PassableByReferencePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/PassableByReferencePass.php")
                    .addInterface("PhpParser\\NodeVisitor")
                    .addExtendsClass("Psy\\CodeCleaner\\CodeCleanerPass")
                    .addExtendsClass("PhpParser\\NodeVisitorAbstract")
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
