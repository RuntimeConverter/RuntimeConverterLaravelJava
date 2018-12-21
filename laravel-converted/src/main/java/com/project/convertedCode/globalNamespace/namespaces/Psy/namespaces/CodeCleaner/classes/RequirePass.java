package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.stream.function_stream_resolve_include_path;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Include_;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Arg;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/RequirePass.php

*/

public class RequirePass extends CodeCleanerPass {

    public RequirePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RequirePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "origNode", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object origNode = assignParameter(args, 0, false);
        Object node = null;
        if (!ZVal.isTrue(this.isRequireNode(env, origNode))) {
            return null;
        }

        node = ZVal.assign(((RuntimeClassInterface) origNode).phpClone(env));
        toObjectR(node)
                .accessProp(this, env)
                .name("expr")
                .set(
                        new StaticCall(
                                env,
                                new FullyQualified(env, "Psy\\CodeCleaner\\RequirePass"),
                                "resolve",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new Arg(
                                                        env,
                                                        toObjectR(origNode)
                                                                .accessProp(this, env)
                                                                .name("expr")
                                                                .value())),
                                        new ZPair(
                                                1,
                                                new Arg(
                                                        env,
                                                        new LNumber(
                                                                env,
                                                                env.callMethod(
                                                                        origNode,
                                                                        "getLine",
                                                                        RequirePass.class))))),
                                env.callMethod(origNode, "getAttributes", RequirePass.class)));
        return ZVal.assign(node);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    private Object isRequireNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.checkInstanceType(
                                        node, Include_.class, "PhpParser\\Node\\Expr\\Include_"))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("type")
                                                        .value(),
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Psy
                                                                        .namespaces
                                                                        .CodeCleaner
                                                                        .classes
                                                                        .RequirePass
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .requireTypes)
                                        .value()));
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\RequirePass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CodeCleanerPass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file")
        @ConvertedParameter(
            index = 1,
            name = "lineNumber",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object resolve(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object lineNumber = assignParameter(args, 1, true);
            if (null == lineNumber) {
                lineNumber = ZVal.getNull();
            }
            Object msg = null;
            file = ZVal.assign(toStringR(file, env));
            if (ZVal.strictEqualityCheck(file, "===", "")) {
                if (ZVal.isTrue(
                        ZVal.toLong(2)
                                & ZVal.toLong(
                                        function_error_reporting.f.env(env).call().value()))) {
                    ErrorException.runtimeStaticObject.throwException(
                            env, 2, "Filename cannot be empty", ZVal.getNull(), lineNumber);

                } else {

                }
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck(file, "===", ""))
                    || ZVal.toBool(
                            !function_stream_resolve_include_path
                                    .f
                                    .env(env)
                                    .call(file)
                                    .getBool())) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call("Failed opening required '%s'", file)
                                .value();
                throw ZVal.getException(
                        env, new FatalErrorException(env, msg, 0, 1, ZVal.getNull(), lineNumber));
            }

            return ZVal.assign(file);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object requireTypes =
                ZVal.newArray(
                        new ZPair(0, Include_.CONST_TYPE_REQUIRE),
                        new ZPair(1, Include_.CONST_TYPE_REQUIRE_ONCE));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\RequirePass")
                    .setLookup(
                            RequirePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("requireTypes")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/RequirePass.php")
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
