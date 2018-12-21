package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Compilers.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.Factory;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.functions.array_last;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_push;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Compilers.classes.CompilerInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Compilers.classes.Compiler;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php

*/

public class BladeCompiler extends Compiler implements CompilerInterface {

    public Object extensions = ZVal.newArray();

    public Object customDirectives = ZVal.newArray();

    public Object conditions = ZVal.newArray();

    public Object path = null;

    public Object compilers = ZVal.arrayFromList("Comments", "Extensions", "Statements", "Echos");

    public Object rawTags = ZVal.arrayFromList("{!!", "!!}");

    public Object contentTags = ZVal.arrayFromList("{{", "}}");

    public Object escapedTags = ZVal.arrayFromList("{{{", "}}}");

    public Object echoFormat = "e(%s)";

    public Object footer = ZVal.newArray();

    public Object rawBlocks = ZVal.newArray();

    public Object firstCaseInSwitch = true;

    public Object encodingOptions =
            ZVal.toLong(ZVal.toLong(ZVal.toLong(1) | ZVal.toLong(4)) | ZVal.toLong(2))
                    | ZVal.toLong(8);

    public Object lastSection = null;

    public Object forElseCounter = 0;

    public BladeCompiler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BladeCompiler.class) {
            this.__construct(env, args);
        }
    }

    public BladeCompiler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object compile(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object contents = null;
        if (ZVal.isTrue(path)) {
            this.setPath(env, path);
        }

        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("cachePath").value())
                .getBool()) {
            contents =
                    this.compileString(
                            env,
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("files").value(),
                                    "get",
                                    BladeCompiler.class,
                                    this.getPath(env)));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("files").value(),
                    "put",
                    BladeCompiler.class,
                    env.callMethod(this, "getCompiledPath", BladeCompiler.class, this.getPath(env)),
                    contents);
        }

        return null;
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object compileString(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object result = null;
        Object token = null;
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value, "@verbatim").value(), "!==", false)) {
            value = this.storeVerbatimBlocks(env, value);
        }

        this.footer = ZVal.newArray();
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value, "@php").value(), "!==", false)) {
            value = this.storePhpBlocks(env, value);
        }

        result = "";
        for (ZPair zpairResult638 :
                ZVal.getIterable(
                        NamespaceGlobal.token_get_all.env(env).call(value).value(), env, true)) {
            token = ZVal.assign(zpairResult638.getValue());
            result =
                    toStringR(result, env)
                            + toStringR(
                                    function_is_array.f.env(env).call(token).getBool()
                                            ? this.parseToken(env, token)
                                            : token,
                                    env);
        }

        if (!ZVal.isEmpty(this.rawBlocks)) {
            result = this.restoreRawContent(env, result);
        }

        if (ZVal.isGreaterThan(function_count.f.env(env).call(this.footer).value(), '>', 0)) {
            result = this.addFooters(env, result);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object storeVerbatimBlocks(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/(?<!@)@verbatim(.*?)@endverbatim/s",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View\\Compilers",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                BladeCompiler.this.storeRawBlock(
                                                        env, matches.arrayGet(env, 1)));
                                    }
                                },
                                value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object storePhpBlocks(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/(?<!@)@php(.*?)@endphp/s",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View\\Compilers",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                BladeCompiler.this.storeRawBlock(
                                                        env,
                                                        "<?php"
                                                                + toStringR(
                                                                        matches.arrayGet(env, 1),
                                                                        env)
                                                                + "?>"));
                                    }
                                },
                                value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object storeRawBlock(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                this.getRawPlaceholder(
                        env,
                        ZVal.subtract(
                                function_array_push.f.env(env).call(this.rawBlocks, value).value(),
                                1)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    protected Object restoreRawContent(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object result = assignParameter(args, 0, false);
        result =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/" + toStringR(this.getRawPlaceholder(env, "(\\d+)"), env) + "/",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View\\Compilers",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                new ReferenceClassProperty(
                                                                _closureThisVar, "rawBlocks", env)
                                                        .arrayGet(env, matches.arrayGet(env, 1)));
                                    }
                                },
                                result)
                        .value();
        this.rawBlocks = ZVal.newArray();
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replace")
    protected Object getRawPlaceholder(RuntimeEnv env, Object... args) {
        Object replace = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace.f.env(env).call("#", replace, "@__raw_block_#__@").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    protected Object addFooters(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(function_ltrim.f.env(env).call(result, "\n").value(), env)
                        + toStringR("\n", env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "\n",
                                                function_array_reverse
                                                        .f
                                                        .env(env)
                                                        .call(this.footer)
                                                        .value())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    protected Object parseToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object id = null;
        Object type = null;
        ReferenceContainer content = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult99 = null;
        ZVal.list(
                runtimeTempArrayResult99 = token,
                (id = listGet(runtimeTempArrayResult99, 0, env)),
                (content.setObject(listGet(runtimeTempArrayResult99, 1, env))));
        if (ZVal.equalityCheck(id, 321)) {
            for (ZPair zpairResult639 : ZVal.getIterable(this.compilers, env, true)) {
                type = ZVal.assign(zpairResult639.getValue());
                content.setObject(
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, content),
                                toStringR("compile" + toStringR(type, env), env),
                                BladeCompiler.class,
                                content.getObject()));
            }
        }

        return ZVal.assign(content.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileExtensions(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object compiler = null;
        for (ZPair zpairResult640 : ZVal.getIterable(this.extensions, env, true)) {
            compiler = ZVal.assign(zpairResult640.getValue());
            value =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(compiler, value, this)
                            .value();
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileStatements(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/\\B@(@?\\w+(?:::\\w+)?)([ \\t]*)(\\( ( (?>[^()]+) | (?3) )* \\))?/x",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\View\\Compilers",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "match")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object match = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                BladeCompiler.this.compileStatement(env, match));
                                    }
                                },
                                value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "match")
    protected Object compileStatement(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer match = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object method = null;
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, match.arrayGet(env, 1), "@"))) {
            match.arrayAccess(env, 0)
                    .set(
                            arrayActionR(ArrayAction.ISSET, match, env, 3)
                                    ? toStringR(match.arrayGet(env, 1), env)
                                            + toStringR(match.arrayGet(env, 3), env)
                                    : match.arrayGet(env, 1));

        } else if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customDirectives", env),
                env,
                match.arrayGet(env, 1))) {
            match.arrayAccess(env, 0)
                    .set(
                            this.callCustomDirective(
                                    env,
                                    match.arrayGet(env, 1),
                                    Arr.runtimeStaticObject.get(env, match.getObject(), 3)));

        } else if (function_method_exists
                .f
                .env(env)
                .call(
                        this,
                        method =
                                "compile"
                                        + toStringR(
                                                NamespaceGlobal.ucfirst
                                                        .env(env)
                                                        .call(match.arrayGet(env, 1))
                                                        .value(),
                                                env))
                .getBool()) {
            match.arrayAccess(env, 0)
                    .set(
                            env.callMethod(
                                    this,
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            handleReturnReference(
                                                                    Arr.runtimeStaticObject.get(
                                                                            env,
                                                                            match.getObject(),
                                                                            3))),
                                    toStringR(method, env),
                                    BladeCompiler.class,
                                    rLastRefArgs.get(0)));
        }

        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, match, env, 3)
                        ? match.arrayGet(env, 0)
                        : toStringR(match.arrayGet(env, 0), env)
                                + toStringR(match.arrayGet(env, 2), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    protected Object callCustomDirective(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.toBool(Str.runtimeStaticObject.startsWith(env, value, "("))
                && ZVal.toBool(Str.runtimeStaticObject.endsWith(env, value, ")"))) {
            value = Str.runtimeStaticObject.substr(env, value, 1, -1);
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "customDirectives", env)
                                        .arrayGet(env, name),
                                function_trim.f.env(env).call(value).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    public Object stripParentheses(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, expression, "("))) {
            expression = function_substr.f.env(env).call(expression, 1, -1).value();
        }

        return ZVal.assign(expression);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "compiler", typeHint = "callable")
    public Object extend(RuntimeEnv env, Object... args) {
        Object compiler = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "extensions", env).arrayAppend(env).set(compiler);
        return null;
    }

    @ConvertedMethod
    public Object getExtensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.extensions);
    }

    @ConvertedMethod(name = "if")
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object _pIf(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object name = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "conditions", env).arrayAccess(env, name).set(callback);
        this.directive(
                env,
                name,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "expression")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object expression = assignParameter(args, 0, false);
                        Object name = null;
                        name = this.contextReferences.getCapturedValue("name");
                        return ZVal.assign(
                                ZVal.strictNotEqualityCheck(expression, "!==", "")
                                        ? "<?php if (\\Illuminate\\Support\\Facades\\Blade::check('"
                                                + toStringR(name, env)
                                                + "', "
                                                + toStringR(expression, env)
                                                + ")): ?>"
                                        : "<?php if (\\Illuminate\\Support\\Facades\\Blade::check('"
                                                + toStringR(name, env)
                                                + "')): ?>");
                    }
                }.use("name", name));
        this.directive(
                env,
                "else" + toStringR(name, env),
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "expression")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object expression = assignParameter(args, 0, false);
                        Object name = null;
                        name = this.contextReferences.getCapturedValue("name");
                        return ZVal.assign(
                                ZVal.strictNotEqualityCheck(expression, "!==", "")
                                        ? "<?php elseif (\\Illuminate\\Support\\Facades\\Blade::check('"
                                                + toStringR(name, env)
                                                + "', "
                                                + toStringR(expression, env)
                                                + ")): ?>"
                                        : "<?php elseif (\\Illuminate\\Support\\Facades\\Blade::check('"
                                                + toStringR(name, env)
                                                + "')): ?>");
                    }
                }.use("name", name));
        this.directive(
                env,
                "end" + toStringR(name, env),
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return "<?php endif; ?>";
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object check(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parameters = assignParameterVarArgs(args, 1);
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                PackedVaradicArgs.unpack(
                                        new ReferenceClassProperty(this, "conditions", env)
                                                .arrayGet(env, name),
                                        new PackedVaradicArgs(parameters)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "alias",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object component(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object path = assignParameter(args, 0, false);
        Object alias = assignParameter(args, 1, true);
        if (null == alias) {
            alias = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        alias =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = alias)
                                ? ternaryExpressionTemp
                                : array_last
                                        .f
                                        .env(env)
                                        .call(function_explode.f.env(env).call(".", path).value())
                                        .value());
        this.directive(
                env,
                alias,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "expression")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object expression = assignParameter(args, 0, false);
                        Object path = null;
                        path = this.contextReferences.getCapturedValue("path");
                        return ZVal.assign(
                                ZVal.isTrue(expression)
                                        ? "<?php $__env->startComponent('"
                                                + toStringR(path, env)
                                                + "', "
                                                + toStringR(expression, env)
                                                + "); ?>"
                                        : "<?php $__env->startComponent('"
                                                + toStringR(path, env)
                                                + "'); ?>");
                    }
                }.use("path", path));
        this.directive(
                env,
                "end" + toStringR(alias, env),
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "expression")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object expression = assignParameter(args, 0, false);
                        return "<?php echo $__env->renderComponent(); ?>";
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "alias",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object include(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php");
        Object path = assignParameter(args, 0, false);
        Object alias = assignParameter(args, 1, true);
        if (null == alias) {
            alias = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        alias =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = alias)
                                ? ternaryExpressionTemp
                                : array_last
                                        .f
                                        .env(env)
                                        .call(function_explode.f.env(env).call(".", path).value())
                                        .value());
        this.directive(
                env,
                alias,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "expression")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object expression = assignParameter(args, 0, false);
                        Object path = null;
                        Object ternaryExpressionTemp = null;
                        path = this.contextReferences.getCapturedValue("path");
                        expression =
                                ZVal.assign(
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                BladeCompiler.this.stripParentheses(
                                                                        env, expression))
                                                ? ternaryExpressionTemp
                                                : "[]");
                        return ZVal.assign(
                                "<?php echo $__env->make('"
                                        + toStringR(path, env)
                                        + "', "
                                        + toStringR(expression, env)
                                        + ", array_except(get_defined_vars(), array('__data', '__path')))->render(); ?>");
                    }
                }.use("path", path));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "handler", typeHint = "callable")
    public Object directive(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "customDirectives", env)
                .arrayAccess(env, name)
                .set(handler);
        return null;
    }

    @ConvertedMethod
    public Object getCustomDirectives(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.customDirectives);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object setEchoFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        this.echoFormat = format;
        return null;
    }

    @ConvertedMethod
    public Object withDoubleEncoding(RuntimeEnv env, Object... args) {
        this.setEchoFormat(env, "e(%s, true)");
        return null;
    }

    @ConvertedMethod
    public Object withoutDoubleEncoding(RuntimeEnv env, Object... args) {
        this.setEchoFormat(env, "e(%s, false)");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileCan(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php if (app(\\Illuminate\\Contracts\\Auth\\Access\\Gate::class)->check"
                        + toStringR(expression, env)
                        + "): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileCannot(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php if (app(\\Illuminate\\Contracts\\Auth\\Access\\Gate::class)->denies"
                        + toStringR(expression, env)
                        + "): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileCanany(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php if (app(\\Illuminate\\Contracts\\Auth\\Access\\Gate::class)->any"
                        + toStringR(expression, env)
                        + "): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileElsecan(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php elseif (app(\\Illuminate\\Contracts\\Auth\\Access\\Gate::class)->check"
                        + toStringR(expression, env)
                        + "): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileElsecannot(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php elseif (app(\\Illuminate\\Contracts\\Auth\\Access\\Gate::class)->denies"
                        + toStringR(expression, env)
                        + "): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileElsecanany(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php elseif (app(\\Illuminate\\Contracts\\Auth\\Access\\Gate::class)->any"
                        + toStringR(expression, env)
                        + "): ?>");
    }

    @ConvertedMethod
    protected Object compileEndcan(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    protected Object compileEndcannot(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    protected Object compileEndcanany(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileComments(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object pattern = null;
        pattern =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "/%s--(.*?)--%s/s",
                                new ReferenceClassProperty(this, "contentTags", env)
                                        .arrayGet(env, 0),
                                new ReferenceClassProperty(this, "contentTags", env)
                                        .arrayGet(env, 1))
                        .value();
        return ZVal.assign(function_preg_replace.f.env(env).call(pattern, "", value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileComponent(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php $__env->startComponent" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    protected Object compileEndComponent(RuntimeEnv env, Object... args) {
        return "<?php echo $__env->renderComponent(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileSlot(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php $__env->slot" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    protected Object compileEndSlot(RuntimeEnv env, Object... args) {
        return "<?php $__env->endSlot(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object compileAuth(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        guard = ZVal.assign(function_is_null.f.env(env).call(guard).getBool() ? "()" : guard);
        return ZVal.assign("<?php if(auth()->guard" + toStringR(guard, env) + "->check()): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object compileElseAuth(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        guard = ZVal.assign(function_is_null.f.env(env).call(guard).getBool() ? "()" : guard);
        return ZVal.assign("<?php elseif(auth()->guard" + toStringR(guard, env) + "->check()): ?>");
    }

    @ConvertedMethod
    protected Object compileEndAuth(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object compileGuest(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        guard = ZVal.assign(function_is_null.f.env(env).call(guard).getBool() ? "()" : guard);
        return ZVal.assign("<?php if(auth()->guard" + toStringR(guard, env) + "->guest()): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object compileElseGuest(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        guard = ZVal.assign(function_is_null.f.env(env).call(guard).getBool() ? "()" : guard);
        return ZVal.assign("<?php elseif(auth()->guard" + toStringR(guard, env) + "->guest()): ?>");
    }

    @ConvertedMethod
    protected Object compileEndGuest(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileHasSection(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php if (! empty(trim($__env->yieldContent"
                        + toStringR(expression, env)
                        + "))): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileIf(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php if" + toStringR(expression, env) + ": ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileUnless(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php if (! " + toStringR(expression, env) + "): ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileElseif(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php elseif" + toStringR(expression, env) + ": ?>");
    }

    @ConvertedMethod
    protected Object compileElse(RuntimeEnv env, Object... args) {
        return "<?php else: ?>";
    }

    @ConvertedMethod
    protected Object compileEndif(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    protected Object compileEndunless(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileIsset(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php if(isset" + toStringR(expression, env) + "): ?>");
    }

    @ConvertedMethod
    protected Object compileEndIsset(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileSwitch(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        this.firstCaseInSwitch = true;
        return ZVal.assign("<?php switch" + toStringR(expression, env) + ":");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileCase(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.firstCaseInSwitch)) {
            this.firstCaseInSwitch = false;
            return ZVal.assign("case " + toStringR(expression, env) + ": ?>");
        }

        return ZVal.assign("<?php case " + toStringR(expression, env) + ": ?>");
    }

    @ConvertedMethod
    protected Object compileDefault(RuntimeEnv env, Object... args) {
        return "<?php default: ?>";
    }

    @ConvertedMethod
    protected Object compileEndSwitch(RuntimeEnv env, Object... args) {
        return "<?php endswitch; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileEchos(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object method = null;
        for (ZPair zpairResult2378 : ZVal.getIterable(this.getEchoMethods(env), env, true)) {
            method = ZVal.assign(zpairResult2378.getValue());
            value.setObject(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, value),
                            toStringR(method, env),
                            BladeCompiler.class,
                            value.getObject()));
        }

        return ZVal.assign(value.getObject());
    }

    @ConvertedMethod
    protected Object getEchoMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList(
                        "compileRawEchos", "compileEscapedEchos", "compileRegularEchos"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileRawEchos(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesEchos.php");
        Object value = assignParameter(args, 0, false);
        Object pattern = null;
        Object callback = null;
        pattern =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "/(@)?%s\\s*(.+?)\\s*%s(\\r?\\n)?/s",
                                new ReferenceClassProperty(this, "rawTags", env).arrayGet(env, 0),
                                new ReferenceClassProperty(this, "rawTags", env).arrayGet(env, 1))
                        .value();
        callback =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "matches")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer matches =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object whitespace = null;
                        whitespace =
                                ZVal.assign(
                                        arrayActionR(ArrayAction.EMPTY, matches, env, 3)
                                                ? ""
                                                : toStringR(matches.arrayGet(env, 3), env)
                                                        + toStringR(matches.arrayGet(env, 3), env));
                        return ZVal.assign(
                                ZVal.isTrue(matches.arrayGet(env, 1))
                                        ? function_substr
                                                .f
                                                .env(env)
                                                .call(matches.arrayGet(env, 0), 1)
                                                .value()
                                        : "<?php echo "
                                                + toStringR(
                                                        BladeCompiler.this.compileEchoDefaults(
                                                                env, matches.arrayGet(env, 2)),
                                                        env)
                                                + "; ?>"
                                                + toStringR(whitespace, env));
                    }
                };
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(pattern, callback, value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileRegularEchos(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesEchos.php");
        Object value = assignParameter(args, 0, false);
        Object pattern = null;
        Object callback = null;
        pattern =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "/(@)?%s\\s*(.+?)\\s*%s(\\r?\\n)?/s",
                                new ReferenceClassProperty(this, "contentTags", env)
                                        .arrayGet(env, 0),
                                new ReferenceClassProperty(this, "contentTags", env)
                                        .arrayGet(env, 1))
                        .value();
        callback =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "matches")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer matches =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object whitespace = null;
                        Object wrapped = null;
                        whitespace =
                                ZVal.assign(
                                        arrayActionR(ArrayAction.EMPTY, matches, env, 3)
                                                ? ""
                                                : toStringR(matches.arrayGet(env, 3), env)
                                                        + toStringR(matches.arrayGet(env, 3), env));
                        wrapped =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                BladeCompiler.this.echoFormat,
                                                BladeCompiler.this.compileEchoDefaults(
                                                        env, matches.arrayGet(env, 2)))
                                        .value();
                        return ZVal.assign(
                                ZVal.isTrue(matches.arrayGet(env, 1))
                                        ? function_substr
                                                .f
                                                .env(env)
                                                .call(matches.arrayGet(env, 0), 1)
                                                .value()
                                        : "<?php echo "
                                                + toStringR(wrapped, env)
                                                + "; ?>"
                                                + toStringR(whitespace, env));
                    }
                };
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(pattern, callback, value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object compileEscapedEchos(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesEchos.php");
        Object value = assignParameter(args, 0, false);
        Object pattern = null;
        Object callback = null;
        pattern =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "/(@)?%s\\s*(.+?)\\s*%s(\\r?\\n)?/s",
                                new ReferenceClassProperty(this, "escapedTags", env)
                                        .arrayGet(env, 0),
                                new ReferenceClassProperty(this, "escapedTags", env)
                                        .arrayGet(env, 1))
                        .value();
        callback =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\View\\Compilers\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "matches")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer matches =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object whitespace = null;
                        whitespace =
                                ZVal.assign(
                                        arrayActionR(ArrayAction.EMPTY, matches, env, 3)
                                                ? ""
                                                : toStringR(matches.arrayGet(env, 3), env)
                                                        + toStringR(matches.arrayGet(env, 3), env));
                        return ZVal.assign(
                                ZVal.isTrue(matches.arrayGet(env, 1))
                                        ? matches.arrayGet(env, 0)
                                        : "<?php echo e("
                                                + toStringR(
                                                        BladeCompiler.this.compileEchoDefaults(
                                                                env, matches.arrayGet(env, 2)),
                                                        env)
                                                + "); ?>"
                                                + toStringR(whitespace, env));
                    }
                };
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(pattern, callback, value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object compileEchoDefaults(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call("/^(?=\\$)(.+?)(?:\\s+or\\s+)(.+?)$/si", "isset($1) ? $1 : $2", value)
                        .value());
    }

    @ConvertedMethod
    protected Object compileCsrf(RuntimeEnv env, Object... args) {
        return "<?php echo csrf_field(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    protected Object compileDd(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        return ZVal.assign("<?php dd" + toStringR(arguments, env) + "; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    protected Object compileDump(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        return ZVal.assign("<?php dump" + toStringR(arguments, env) + "; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    protected Object compileMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        return ZVal.assign("<?php echo method_field" + toStringR(method, env) + "; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileEach(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php echo $__env->renderEach" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileInclude(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        expression = this.stripParentheses(env, expression);
        return ZVal.assign(
                "<?php echo $__env->make("
                        + toStringR(expression, env)
                        + ", array_except(get_defined_vars(), array('__data', '__path')))->render(); ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileIncludeIf(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        expression = this.stripParentheses(env, expression);
        return ZVal.assign(
                "<?php if ($__env->exists("
                        + toStringR(expression, env)
                        + ")) echo $__env->make("
                        + toStringR(expression, env)
                        + ", array_except(get_defined_vars(), array('__data', '__path')))->render(); ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileIncludeWhen(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        expression = this.stripParentheses(env, expression);
        return ZVal.assign(
                "<?php echo $__env->renderWhen("
                        + toStringR(expression, env)
                        + ", array_except(get_defined_vars(), array('__data', '__path'))); ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileIncludeFirst(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        expression = this.stripParentheses(env, expression);
        return ZVal.assign(
                "<?php echo $__env->first("
                        + toStringR(expression, env)
                        + ", array_except(get_defined_vars(), array('__data', '__path')))->render(); ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileInject(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object service = null;
        Object variable = null;
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(
                                ",",
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call("/[\\(\\)\\\"\\']/", "", expression)
                                        .value())
                        .value());
        variable = function_trim.f.env(env).call(segments.arrayGet(env, 0)).value();
        service = function_trim.f.env(env).call(segments.arrayGet(env, 1)).value();
        return ZVal.assign(
                "<?php $"
                        + toStringR(variable, env)
                        + " = app('"
                        + toStringR(service, env)
                        + "'); ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileJson(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object depth = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object options = null;
        parts.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(",", this.stripParentheses(env, expression))
                        .value());
        options =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, parts, env, 1)
                                ? function_trim.f.env(env).call(parts.arrayGet(env, 1)).value()
                                : this.encodingOptions);
        depth =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, parts, env, 2)
                                ? function_trim.f.env(env).call(parts.arrayGet(env, 2)).value()
                                : 512);
        return ZVal.assign(
                "<?php echo json_encode("
                        + toStringR(parts.arrayGet(env, 0), env)
                        + ", "
                        + toStringR(options, env)
                        + ", "
                        + toStringR(depth, env)
                        + ") ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileExtends(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object echo = null;
        expression = this.stripParentheses(env, expression);
        echo =
                ZVal.assign(
                        "<?php echo $__env->make("
                                + toStringR(expression, env)
                                + ", array_except(get_defined_vars(), array('__data', '__path')))->render(); ?>");
        new ReferenceClassProperty(this, "footer", env).arrayAppend(env).set(echo);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileSection(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        this.lastSection = function_trim.f.env(env).call(expression, "()'\" ").value();
        return ZVal.assign("<?php $__env->startSection" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    protected Object compileParent(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                Factory.runtimeStaticObject.parentPlaceholder(
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = this.lastSection)
                                ? ternaryExpressionTemp
                                : ""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileYield(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php echo $__env->yieldContent" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    protected Object compileShow(RuntimeEnv env, Object... args) {
        return "<?php echo $__env->yieldSection(); ?>";
    }

    @ConvertedMethod
    protected Object compileAppend(RuntimeEnv env, Object... args) {
        return "<?php $__env->appendSection(); ?>";
    }

    @ConvertedMethod
    protected Object compileOverwrite(RuntimeEnv env, Object... args) {
        return "<?php $__env->stopSection(true); ?>";
    }

    @ConvertedMethod
    protected Object compileStop(RuntimeEnv env, Object... args) {
        return "<?php $__env->stopSection(); ?>";
    }

    @ConvertedMethod
    protected Object compileEndsection(RuntimeEnv env, Object... args) {
        return "<?php $__env->stopSection(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileForelse(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object iterateLoop = null;
        Object iteratee = null;
        Object initLoop = null;
        Object iteration = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object empty = null;
        empty =
                "$__empty_"
                        + toStringR(
                                ZVal.preIncrement(
                                        new ReferenceClassProperty(this, "forElseCounter", env)),
                                env);
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/\\( *(.*) +as *(.*)\\)$/is", expression, matches.getObject());
        iteratee = function_trim.f.env(env).call(matches.arrayGet(env, 1)).value();
        iteration = function_trim.f.env(env).call(matches.arrayGet(env, 2)).value();
        initLoop =
                ZVal.assign(
                        "$__currentLoopData = "
                                + toStringR(iteratee, env)
                                + "; $__env->addLoop($__currentLoopData);");
        iterateLoop = "$__env->incrementLoopIndices(); $loop = $__env->getLastLoop();";
        return ZVal.assign(
                "<?php "
                        + toStringR(empty, env)
                        + " = true; "
                        + toStringR(initLoop, env)
                        + " foreach($__currentLoopData as "
                        + toStringR(iteration, env)
                        + "): "
                        + toStringR(iterateLoop, env)
                        + " "
                        + toStringR(empty, env)
                        + " = false; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileEmpty(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object empty = null;
        if (ZVal.isTrue(expression)) {
            return ZVal.assign("<?php if(empty" + toStringR(expression, env) + "): ?>");
        }

        empty =
                "$__empty_"
                        + toStringR(
                                ZVal.postDecrement(
                                        new ReferenceClassProperty(this, "forElseCounter", env)),
                                env);
        return ZVal.assign(
                "<?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); if ("
                        + toStringR(empty, env)
                        + "): ?>");
    }

    @ConvertedMethod
    protected Object compileEndforelse(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    protected Object compileEndEmpty(RuntimeEnv env, Object... args) {
        return "<?php endif; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileFor(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php for" + toStringR(expression, env) + ": ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileForeach(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object iterateLoop = null;
        Object iteratee = null;
        Object initLoop = null;
        Object iteration = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/\\( *(.*) +as *(.*)\\)$/is", expression, matches.getObject());
        iteratee = function_trim.f.env(env).call(matches.arrayGet(env, 1)).value();
        iteration = function_trim.f.env(env).call(matches.arrayGet(env, 2)).value();
        initLoop =
                ZVal.assign(
                        "$__currentLoopData = "
                                + toStringR(iteratee, env)
                                + "; $__env->addLoop($__currentLoopData);");
        iterateLoop = "$__env->incrementLoopIndices(); $loop = $__env->getLastLoop();";
        return ZVal.assign(
                "<?php "
                        + toStringR(initLoop, env)
                        + " foreach($__currentLoopData as "
                        + toStringR(iteration, env)
                        + "): "
                        + toStringR(iterateLoop, env)
                        + " ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileBreak(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.isTrue(expression)) {
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/\\(\\s*(-?\\d+)\\s*\\)$/", expression, matches.getObject());
            return ZVal.assign(
                    ZVal.isTrue(matches.getObject())
                            ? "<?php break "
                                    + toStringR(
                                            NamespaceGlobal.max
                                                    .env(env)
                                                    .call(1, matches.arrayGet(env, 1))
                                                    .value(),
                                            env)
                                    + "; ?>"
                            : "<?php if" + toStringR(expression, env) + " break; ?>");
        }

        return "<?php break; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileContinue(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.isTrue(expression)) {
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/\\(\\s*(-?\\d+)\\s*\\)$/", expression, matches.getObject());
            return ZVal.assign(
                    ZVal.isTrue(matches.getObject())
                            ? "<?php continue "
                                    + toStringR(
                                            NamespaceGlobal.max
                                                    .env(env)
                                                    .call(1, matches.arrayGet(env, 1))
                                                    .value(),
                                            env)
                                    + "; ?>"
                            : "<?php if" + toStringR(expression, env) + " continue; ?>");
        }

        return "<?php continue; ?>";
    }

    @ConvertedMethod
    protected Object compileEndfor(RuntimeEnv env, Object... args) {
        return "<?php endfor; ?>";
    }

    @ConvertedMethod
    protected Object compileEndforeach(RuntimeEnv env, Object... args) {
        return "<?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileWhile(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php while" + toStringR(expression, env) + ": ?>");
    }

    @ConvertedMethod
    protected Object compileEndwhile(RuntimeEnv env, Object... args) {
        return "<?php endwhile; ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compilePhp(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        if (ZVal.isTrue(expression)) {
            return ZVal.assign("<?php " + toStringR(expression, env) + "; ?>");
        }

        return "@php";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileUnset(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php unset" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileStack(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php echo $__env->yieldPushContent" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compilePush(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php $__env->startPush" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    protected Object compileEndpush(RuntimeEnv env, Object... args) {
        return "<?php $__env->stopPush(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compilePrepend(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign("<?php $__env->startPrepend" + toStringR(expression, env) + "; ?>");
    }

    @ConvertedMethod
    protected Object compileEndprepend(RuntimeEnv env, Object... args) {
        return "<?php $__env->stopPrepend(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileLang(RuntimeEnv env, Object... args) {
        ReferenceContainer expression =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        if (function_is_null.f.env(env).call(expression.getObject()).getBool()) {
            return "<?php $__env->startTranslation(); ?>";

        } else if (ZVal.strictEqualityCheck(expression.arrayGet(env, 1), "===", "[")) {
            return ZVal.assign(
                    "<?php $__env->startTranslation"
                            + toStringR(expression.getObject(), env)
                            + "; ?>");
        }

        return ZVal.assign(
                "<?php echo app('translator')->getFromJson"
                        + toStringR(expression.getObject(), env)
                        + "; ?>");
    }

    @ConvertedMethod
    protected Object compileEndlang(RuntimeEnv env, Object... args) {
        return "<?php echo $__env->renderTranslation(); ?>";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    protected Object compileChoice(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(
                "<?php echo app('translator')->choice" + toStringR(expression, env) + "; ?>");
    }

    public static final Object CONST_class = "Illuminate\\View\\Compilers\\BladeCompiler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Compiler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\View\\Compilers\\BladeCompiler")
                    .setLookup(
                            BladeCompiler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cachePath",
                            "compilers",
                            "conditions",
                            "contentTags",
                            "customDirectives",
                            "echoFormat",
                            "encodingOptions",
                            "escapedTags",
                            "extensions",
                            "files",
                            "firstCaseInSwitch",
                            "footer",
                            "forElseCounter",
                            "lastSection",
                            "path",
                            "rawBlocks",
                            "rawTags")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/Compilers/BladeCompiler.php")
                    .addInterface("Illuminate\\View\\Compilers\\CompilerInterface")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesAuthorizations")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesComments")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesComponents")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesConditionals")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesEchos")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesHelpers")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesIncludes")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesInjections")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesJson")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesLayouts")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesLoops")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesRawPhp")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesStacks")
                    .addTrait("Illuminate\\View\\Compilers\\Concerns\\CompilesTranslations")
                    .addExtendsClass("Illuminate\\View\\Compilers\\Compiler")
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
