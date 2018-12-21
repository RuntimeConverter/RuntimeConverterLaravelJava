package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Declare_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.DeclareDeclare;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/StrictTypesPass.php

*/

public class StrictTypesPass extends CodeCleanerPass {

    public Object strictTypes = false;

    public Object atLeastPhp7 = null;

    public StrictTypesPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StrictTypesPass.class) {
            this.__construct(env, args);
        }
    }

    public StrictTypesPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.atLeastPhp7 =
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "7.0", ">=").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object node = null;
        Object declare = null;
        Object declareKey = null;
        Object prependStrictTypes = null;
        Object value = null;
        Object key = null;
        Object first = null;
        if (!ZVal.isTrue(this.atLeastPhp7)) {
            return null;
        }

        prependStrictTypes = ZVal.assign(this.strictTypes);
        for (ZPair zpairResult1346 : ZVal.getIterable(nodes, env, false)) {
            key = ZVal.assign(zpairResult1346.getKey());
            node = ZVal.assign(zpairResult1346.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            node, Declare_.class, "PhpParser\\Node\\Stmt\\Declare_"))) {
                for (ZPair zpairResult1347 :
                        ZVal.getIterable(
                                toObjectR(node).accessProp(this, env).name("declares").value(),
                                env,
                                true)) {
                    declare = ZVal.assign(zpairResult1347.getValue());
                    declareKey =
                            ZVal.assign(
                                    ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            toObjectR(declare)
                                                                    .accessProp(this, env)
                                                                    .name("key")
                                                                    .value(),
                                                            Identifier.class,
                                                            "PhpParser\\Node\\Identifier"))
                                            ? env.callMethod(
                                                    toObjectR(declare)
                                                            .accessProp(this, env)
                                                            .name("key")
                                                            .value(),
                                                    "toString",
                                                    StrictTypesPass.class)
                                            : toObjectR(declare)
                                                    .accessProp(this, env)
                                                    .name("key")
                                                    .value());
                    if (ZVal.strictEqualityCheck(declareKey, "===", "strict_types")) {
                        value =
                                ZVal.assign(
                                        toObjectR(declare)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value());
                        if (ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        value,
                                                        LNumber.class,
                                                        "PhpParser\\Node\\Scalar\\LNumber")))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                toObjectR(value)
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .value(),
                                                                "!==",
                                                                0))
                                                && ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                toObjectR(value)
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .value(),
                                                                "!==",
                                                                1)))) {
                            throw ZVal.getException(
                                    env,
                                    new FatalErrorException(
                                            env,
                                            CONST_EXCEPTION_MESSAGE,
                                            0,
                                            1,
                                            ZVal.getNull(),
                                            env.callMethod(
                                                    node, "getLine", StrictTypesPass.class)));
                        }

                        this.strictTypes =
                                ZVal.strictEqualityCheck(
                                        toObjectR(value)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value(),
                                        "===",
                                        1);
                    }
                }
            }
        }

        if (ZVal.isTrue(prependStrictTypes)) {
            first = function_reset.f.env(env).call(nodes).value();
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            first, Declare_.class, "PhpParser\\Node\\Stmt\\Declare_"))) {
                declare =
                        new Declare_(
                                env,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new DeclareDeclare(
                                                        env,
                                                        "strict_types",
                                                        new LNumber(env, 1)))));
                function_array_unshift.f.env(env).call(nodes, declare);
            }
        }

        return ZVal.assign(nodes);
    }

    public static final Object CONST_EXCEPTION_MESSAGE =
            "strict_types declaration must have 0 or 1 as its value";

    public static final Object CONST_class = "Psy\\CodeCleaner\\StrictTypesPass";

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
                    .setName("Psy\\CodeCleaner\\StrictTypesPass")
                    .setLookup(
                            StrictTypesPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("atLeastPhp7", "strictTypes")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/StrictTypesPass.php")
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
