package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ValidConstructorPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.LeavePsyshAlonePass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.MagicConstantsPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ParseErrorException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.UseStatementPass;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.FunctionReturnInWriteContextPass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.InstanceOfPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.FunctionContextPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ValidFunctionNamePass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.LegacyEmptyPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ImplicitReturnPass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ExitPass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.StrictTypesPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.AbstractClassPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.FinalClassPass;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.AssignThisVariablePass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.PrettyPrinter.classes.Standard;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ParserFactory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ValidConstantPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NamespacePass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CallTimePassByReferencePass;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.LoopContextPass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ListPass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeTraverser;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.ValidClassNamePass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.RequirePass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.PassableByReferencePass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CalledClassPass;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner.php

*/

public class CodeCleaner extends RuntimeClassBase {

    public Object parser = null;

    public Object printer = null;

    public Object traverser = null;

    public Object namespace = null;

    public CodeCleaner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CodeCleaner.class) {
            this.__construct(env, args);
        }
    }

    public CodeCleaner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parser",
        typeHint = "PhpParser\\Parser",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "printer",
        typeHint = "PhpParser\\PrettyPrinter\\Standard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "traverser",
        typeHint = "PhpParser\\NodeTraverser",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parser = assignParameter(args, 0, true);
        if (null == parser) {
            parser = ZVal.getNull();
        }
        Object printer = assignParameter(args, 1, true);
        if (null == printer) {
            printer = ZVal.getNull();
        }
        Object traverser = assignParameter(args, 2, true);
        if (null == traverser) {
            traverser = ZVal.getNull();
        }
        Object pass = null;
        Object parserFactory = null;
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(parser, "===", ZVal.getNull())) {
            parserFactory = new ParserFactory(env);
            parser = env.callMethod(parserFactory, "createParser", CodeCleaner.class);
        }

        this.parser = parser;
        this.printer =
                ZVal.isTrue(ternaryExpressionTemp = printer)
                        ? ternaryExpressionTemp
                        : new Standard(env);
        this.traverser =
                ZVal.isTrue(ternaryExpressionTemp = traverser)
                        ? ternaryExpressionTemp
                        : new NodeTraverser(env);
        for (ZPair zpairResult1335 : ZVal.getIterable(this.getDefaultPasses(env), env, true)) {
            pass = ZVal.assign(zpairResult1335.getValue());
            env.callMethod(this.traverser, "addVisitor", CodeCleaner.class, pass);
        }

        return null;
    }

    @ConvertedMethod
    private Object getDefaultPasses(RuntimeEnv env, Object... args) {
        Object namespacePass = null;
        Object useStatementPass = null;
        useStatementPass = new UseStatementPass(env);
        namespacePass = new NamespacePass(env, this);
        this.addImplicitDebugContext(
                env, ZVal.newArray(new ZPair(0, useStatementPass), new ZPair(1, namespacePass)));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, new AbstractClassPass(env)),
                        new ZPair(1, new AssignThisVariablePass(env)),
                        new ZPair(2, new CalledClassPass(env)),
                        new ZPair(3, new CallTimePassByReferencePass(env)),
                        new ZPair(4, new FinalClassPass(env)),
                        new ZPair(5, new FunctionContextPass(env)),
                        new ZPair(6, new FunctionReturnInWriteContextPass(env)),
                        new ZPair(7, new InstanceOfPass(env)),
                        new ZPair(8, new LeavePsyshAlonePass(env)),
                        new ZPair(9, new LegacyEmptyPass(env)),
                        new ZPair(10, new ListPass(env)),
                        new ZPair(11, new LoopContextPass(env)),
                        new ZPair(12, new PassableByReferencePass(env)),
                        new ZPair(13, new ValidConstructorPass(env)),
                        new ZPair(14, useStatementPass),
                        new ZPair(15, new ExitPass(env)),
                        new ZPair(16, new ImplicitReturnPass(env)),
                        new ZPair(17, new MagicConstantsPass(env)),
                        new ZPair(18, namespacePass),
                        new ZPair(19, new RequirePass(env)),
                        new ZPair(20, new StrictTypesPass(env)),
                        new ZPair(21, new ValidClassNamePass(env)),
                        new ZPair(22, new ValidConstantPass(env)),
                        new ZPair(23, new ValidFunctionNamePass(env))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "passes", typeHint = "array")
    private Object addImplicitDebugContext(RuntimeEnv env, Object... args) {
        Object passes = assignParameter(args, 0, false);
        Object stmts = null;
        Object file = null;
        Object code = null;
        Object e = null;
        Object traverser = null;
        Object pass = null;
        file = env.callMethod(this, "getDebugFile", CodeCleaner.class);
        if (ZVal.strictEqualityCheck(file, "===", ZVal.getNull())) {
            return null;
        }

        try {
            code = function_file_get_contents.f.env(env).call(file).value();
            if (!ZVal.isTrue(code)) {
                return null;
            }

            stmts = this.parse(env, code, true);
            if (ZVal.strictEqualityCheck(stmts, "===", false)) {
                return null;
            }

            traverser = new NodeTraverser(env);
            for (ZPair zpairResult1336 : ZVal.getIterable(passes, env, true)) {
                pass = ZVal.assign(zpairResult1336.getValue());
                env.callMethod(traverser, "addVisitor", CodeCleaner.class, pass);
            }

            env.callMethod(traverser, "traverse", CodeCleaner.class, stmts);
        } catch (ConvertedException convertedException171) {
            if (convertedException171.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException171.getObject();
            } else if (convertedException171.instanceOf(PHPException.class, "Exception")) {
                e = convertedException171.getObject();
            } else {
                throw convertedException171;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "codeLines", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "requireSemicolons",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object clean(RuntimeEnv env, Object... args) {
        Object codeLines = assignParameter(args, 0, false);
        Object requireSemicolons = assignParameter(args, 1, true);
        if (null == requireSemicolons) {
            requireSemicolons = false;
        }
        Object stmts = null;
        Object code = null;
        Object oldLocale = null;
        stmts =
                this.parse(
                        env,
                        "<?php "
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call("\n", codeLines)
                                                .value(),
                                        env)
                                + toStringR("\n", env),
                        requireSemicolons);
        if (ZVal.strictEqualityCheck(stmts, "===", false)) {
            return ZVal.assign(false);
        }

        stmts = env.callMethod(this.traverser, "traverse", CodeCleaner.class, stmts);
        oldLocale = NamespaceGlobal.setlocale.env(env).call(1, 0).value();
        NamespaceGlobal.setlocale.env(env).call(1, "C");
        code = env.callMethod(this.printer, "prettyPrint", CodeCleaner.class, stmts);
        NamespaceGlobal.setlocale.env(env).call(1, oldLocale);
        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "namespace",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        this.namespace = namespace;
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.namespace);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "requireSemicolons",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object parse(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object requireSemicolons = assignParameter(args, 1, true);
        if (null == requireSemicolons) {
            requireSemicolons = false;
        }
        Object e = null;
        try {
            return ZVal.assign(env.callMethod(this.parser, "parse", CodeCleaner.class, code));
        } catch (ConvertedException convertedException172) {
            if (convertedException172.instanceOf(Error.class, "PhpParser\\Error")) {
                e = convertedException172.getObject();
                if (ZVal.isTrue(this.parseErrorIsUnclosedString(env, e, code))) {
                    return ZVal.assign(false);
                }

                if (ZVal.isTrue(this.parseErrorIsUnterminatedComment(env, e, code))) {
                    return ZVal.assign(false);
                }

                if (ZVal.isTrue(this.parseErrorIsTrailingComma(env, e, code))) {
                    return ZVal.assign(false);
                }

                if (!ZVal.isTrue(this.parseErrorIsEOF(env, e))) {
                    throw ZVal.getException(
                            env, ParseErrorException.runtimeStaticObject.fromParseError(env, e));
                }

                if (ZVal.isTrue(requireSemicolons)) {
                    return ZVal.assign(false);
                }

                try {
                    return ZVal.assign(
                            env.callMethod(
                                    this.parser,
                                    "parse",
                                    CodeCleaner.class,
                                    toStringR(code, env) + ";"));
                } catch (ConvertedException convertedException173) {
                    if (convertedException173.instanceOf(Error.class, "PhpParser\\Error")) {
                        e = convertedException173.getObject();
                        return ZVal.assign(false);
                    } else {
                        throw convertedException173;
                    }
                }

            } else {
                throw convertedException172;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "PhpParser\\Error")
    private Object parseErrorIsEOF(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object msg = null;
        msg = env.callMethod(e, "getRawMessage", CodeCleaner.class);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(msg, "===", "Unexpected token EOF"))
                        || ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(msg, "Syntax error, unexpected EOF")
                                                .value(),
                                        "!==",
                                        false)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "PhpParser\\Error")
    @ConvertedParameter(index = 1, name = "code")
    private Object parseErrorIsUnclosedString(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        if (ZVal.strictNotEqualityCheck(
                env.callMethod(e, "getRawMessage", CodeCleaner.class),
                "!==",
                "Syntax error, unexpected T_ENCAPSED_AND_WHITESPACE")) {
            return ZVal.assign(false);
        }

        try {
            env.callMethod(this.parser, "parse", CodeCleaner.class, toStringR(code, env) + "';");
        } catch (ConvertedException convertedException174) {
            if (convertedException174.instanceOf(PHPException.class, "Exception")) {
                e = convertedException174.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException174;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "PhpParser\\Error")
    @ConvertedParameter(index = 1, name = "code")
    private Object parseErrorIsUnterminatedComment(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(e, "getRawMessage", CodeCleaner.class),
                        "===",
                        "Unterminated comment"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "PhpParser\\Error")
    @ConvertedParameter(index = 1, name = "code")
    private Object parseErrorIsTrailingComma(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(e, "getRawMessage", CodeCleaner.class),
                                        "===",
                                        "A trailing comma is not allowed here"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        function_rtrim
                                                                .f
                                                                .env(env)
                                                                .call(code)
                                                                .value(),
                                                        -1)
                                                .value(),
                                        "===",
                                        ",")));
    }

    public static final Object CONST_class = "Psy\\CodeCleaner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        private Object getDebugFile(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object trace = null;
            ReferenceContainer stackFrame = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            trace = NamespaceGlobal.debug_backtrace.env(env).call(2).value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1337 :
                    ZVal.getIterable(
                            function_array_reverse.f.env(env).call(trace).value(), env, true)) {
                stackFrame.setObject(ZVal.assign(zpairResult1337.getValue()));
                if (!ZVal.isTrue(runtimeStaticObject.isDebugCall(env, stackFrame.getObject()))) {
                    continue;
                }

                if (function_preg_match
                        .f
                        .env(env)
                        .call("/eval\\(/", stackFrame.arrayGet(env, "file"))
                        .getBool()) {
                    function_preg_match_all
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                            .call(
                                    "/([^\\(]+)\\((\\d+)/",
                                    stackFrame.arrayGet(env, "file"),
                                    matches.getObject());
                    return ZVal.assign(matches.arrayGet(env, 1, 0));
                }

                return ZVal.assign(stackFrame.arrayGet(env, "file"));
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "stackFrame", typeHint = "array")
        private Object isDebugCall(RuntimeEnv env, Object... args) {
            ReferenceContainer stackFrame =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object function = null;
            Object _pClass = null;
            _pClass =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, stackFrame, env, "class")
                                    ? stackFrame.arrayGet(env, "class")
                                    : ZVal.getNull());
            function =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, stackFrame, env, "function")
                                    ? stackFrame.arrayGet(env, "function")
                                    : ZVal.getNull());
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            _pClass, "===", ZVal.getNull()))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            function, "===", "Psy\\debug")))
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            _pClass, "===", "Psy\\Shell"))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            function, "===", "debug"))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner")
                    .setLookup(
                            CodeCleaner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("namespace", "parser", "printer", "traverser")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner.php")
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
