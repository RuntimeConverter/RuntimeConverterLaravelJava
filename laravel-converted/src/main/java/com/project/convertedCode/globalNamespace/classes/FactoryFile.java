package com.project.convertedCode.globalNamespace.classes;

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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/FactoryFile.php

*/

public abstract class FactoryFile extends RuntimeClassBase {

    public Object indent = null;

    public Object file = null;

    public Object code = null;

    public FactoryFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FactoryFile.class) {
            this.__construct(env, args);
        }
    }

    public FactoryFile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "indent")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object indent = assignParameter(args, 1, false);
        this.file = file;
        this.indent = indent;
        return null;
    }

    @ConvertedMethod
    public Object addFileHeader(RuntimeEnv env, Object... args) {
        this.code = "";
        this.addPart(env, "file_header");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object addPart(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.addCode(env, this.readPart(env, name));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object addCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        this.code = toStringR(this.code, env) + toStringR(code, env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object readPart(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_file_get_contents
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/hamcrest/hamcrest-php/generator"),
                                                env)
                                        + toStringR("/parts/" + toStringR(name, env) + ".txt", env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "call", typeHint = "FactoryCall")
    public Object generateFactoryCall(RuntimeEnv env, Object... args) {
        Object call = assignParameter(args, 0, false);
        Object code = null;
        Object method = null;
        method = env.callMethod(call, "getMethod", FactoryFile.class);
        code =
                toStringR(env.callMethod(method, "getComment", FactoryFile.class, this.indent), env)
                        + toStringR("\n", env);
        code =
                toStringR(code, env)
                        + toStringR(
                                this.generateDeclaration(
                                        env,
                                        env.callMethod(call, "getName", FactoryFile.class),
                                        method),
                                env);
        code = toStringR(code, env) + toStringR(this.generateCall(env, method), env);
        code = toStringR(code, env) + toStringR(this.generateClosing(env), env);
        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "method", typeHint = "FactoryMethod")
    public Object generateDeclaration(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object code = null;
        code =
                toStringR(this.indent, env)
                        + toStringR(this.getDeclarationModifiers(env), env)
                        + "function "
                        + toStringR(name, env)
                        + "("
                        + toStringR(this.generateDeclarationArguments(env, method), env)
                        + ")"
                        + toStringR("\n", env)
                        + toStringR(this.indent, env)
                        + "{"
                        + toStringR("\n", env);
        return ZVal.assign(code);
    }

    @ConvertedMethod
    public Object getDeclarationModifiers(RuntimeEnv env, Object... args) {
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "FactoryMethod")
    public Object generateDeclarationArguments(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(method, "acceptsVariableArguments", FactoryFile.class))) {
            return "/* args... */";

        } else {
            return ZVal.assign(
                    env.callMethod(method, "getParameterDeclarations", FactoryFile.class));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "FactoryMethod")
    public Object generateImport(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(this.indent, env)
                        + toStringR(CONST_INDENT, env)
                        + "require_once '"
                        + toStringR(
                                env.callMethod(
                                        env.callMethod(method, "getClass", FactoryFile.class),
                                        "getFile",
                                        FactoryFile.class),
                                env)
                        + "';"
                        + toStringR("\n", env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "FactoryMethod")
    public Object generateCall(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object code = null;
        code = "";
        if (ZVal.isTrue(env.callMethod(method, "acceptsVariableArguments", FactoryFile.class))) {
            code =
                    toStringR(code, env)
                            + toStringR(this.indent, env)
                            + toStringR(CONST_INDENT, env)
                            + "$args = func_get_args();"
                            + toStringR("\n", env);
        }

        code =
                toStringR(code, env)
                        + toStringR(this.indent, env)
                        + toStringR(CONST_INDENT, env)
                        + "return ";
        if (ZVal.isTrue(env.callMethod(method, "acceptsVariableArguments", FactoryFile.class))) {
            code =
                    toStringR(code, env)
                            + "call_user_func_array(array('"
                            + "\\"
                            + toStringR(
                                    env.callMethod(method, "getClassName", FactoryFile.class), env)
                            + "', '"
                            + toStringR(env.callMethod(method, "getName", FactoryFile.class), env)
                            + "'), $args);"
                            + toStringR("\n", env);

        } else {
            code =
                    toStringR(code, env)
                            + "\\"
                            + toStringR(
                                    env.callMethod(method, "getClassName", FactoryFile.class), env)
                            + "::"
                            + toStringR(env.callMethod(method, "getName", FactoryFile.class), env)
                            + "("
                            + toStringR(
                                    env.callMethod(
                                            method, "getParameterInvocations", FactoryFile.class),
                                    env)
                            + ");"
                            + toStringR("\n", env);
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    public Object generateClosing(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.indent, env) + "}" + toStringR("\n", env));
    }

    @ConvertedMethod
    public Object write(RuntimeEnv env, Object... args) {
        NamespaceGlobal.file_put_contents.env(env).call(this.file, this.code);
        return null;
    }

    public static final Object CONST_INDENT = "    ";

    public static final Object CONST_class = "FactoryFile";

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
                    .setName("FactoryFile")
                    .setLookup(
                            FactoryFile.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("code", "file", "indent")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/FactoryFile.php")
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
