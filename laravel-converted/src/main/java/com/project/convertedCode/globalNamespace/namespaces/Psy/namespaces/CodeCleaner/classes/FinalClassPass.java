package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/FinalClassPass.php

*/

public class FinalClassPass extends CodeCleanerPass {

    public Object finalClasses = null;

    public FinalClassPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FinalClassPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.finalClasses = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object _pExtends = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            if (toObjectR(node).accessProp(this, env).name("extends").getBool()) {
                _pExtends =
                        ZVal.assign(
                                toStringR(
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("extends")
                                                .value(),
                                        env));
                if (ZVal.isTrue(this.isFinalClass(env, _pExtends))) {
                    msg =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Class %s may not inherit from final class (%s)",
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            _pExtends)
                                    .value();
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    msg,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(node, "getLine", FinalClassPass.class)));
                }
            }

            if (ZVal.isTrue(env.callMethod(node, "isFinal", FinalClassPass.class))) {
                new ReferenceClassProperty(this, "finalClasses", env)
                        .arrayAccess(
                                env,
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value())
                                        .value())
                        .set(true);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object isFinalClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object refl = null;
        if (!function_class_exists.f.env(env).call(name).getBool()) {
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "finalClasses", env),
                            env,
                            NamespaceGlobal.strtolower.env(env).call(name).value()));
        }

        refl = new ReflectionClass(env, name);
        return ZVal.assign(env.callMethod(refl, "isFinal", FinalClassPass.class));
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\FinalClassPass";

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
                    .setName("Psy\\CodeCleaner\\FinalClassPass")
                    .setLookup(
                            FinalClassPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("finalClasses")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/FinalClassPass.php")
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
